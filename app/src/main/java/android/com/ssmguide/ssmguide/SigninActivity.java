package android.com.ssmguide.ssmguide;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class SigninActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private DatabaseReference myRef;
    private ProgressBar progressBar;
    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Sign In");
        FirebaseApp.initializeApp(getApplicationContext());
        sharedPref=this.getSharedPreferences("type", Context.MODE_PRIVATE);
        mAuth = FirebaseAuth.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Users");
        setContentView(R.layout.activity_signin);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        final EditText email=(EditText) findViewById(R.id.input_usrn);
        final EditText password=(EditText) findViewById(R.id.input_pass);
        final Button go=(Button)findViewById(R.id.btn_login);
        go.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                signin(email.getText().toString(),password.getText().toString());
            }
        });
//        progressBar.setVisibility(View.VISIBLE);

    }
    public void signin(String email,String password){
        Log.d("hi",password);
        Log.d("hi",email);
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    final FirebaseUser user = mAuth.getCurrentUser();
                    myRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            // This method is called once with the initial value and again
                            // whenever data at this location is updated.
                            String value = dataSnapshot.child(user.getUid()).child("type").getValue(String.class);
                            Log.d("hi",value);
                            SharedPreferences.Editor save = sharedPref.edit();
                            save.putString("type", value);
                            Log.d("hh",value);
                            save.apply();
                            updateUI(user);
                        }

                        @Override
                        public void onCancelled(DatabaseError error) {
                            // Failed to read value
                            Log.d("TAG", "Failed to read value.", error.toException());

                        }
                    });

                    Log.d("in", "signInWithEmail:success");


                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("in", "signInWithEmail:failure", task.getException());
                    Toast.makeText(getApplicationContext(), "Authentication failed.",
                            Toast.LENGTH_SHORT).show();
                    updateUI(null);
                }

                // ...
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);

    }

    private void updateUI(final FirebaseUser user) {
        if(user != null){
            String stype = sharedPref.getString("type", "");

            if (stype.equals("Student")){
                Intent intent = new Intent(getApplicationContext(),StudenthomeActivity.class);

                startActivity(intent);
                this.finish();

            }
            if (stype.equals("Staff")){
                Intent intent = new Intent(getApplicationContext(),StaffhomeActivity.class);

                startActivity(intent);
                this.finish();

            }


        }

    }

    public void gotoregister(View view){
        Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
        startActivity(intent);
        finish();
    }
}

