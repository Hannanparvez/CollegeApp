package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class SignupActivity extends AppCompatActivity {

    private Spinner spinner;
    private FirebaseAuth mAuth;
    private  DatabaseReference myRef;
    private SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        sharedPref =getSharedPreferences("type",MODE_PRIVATE);
        mAuth = FirebaseAuth.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Users");
        setTitle("Register");
        setContentView(R.layout.activity_signup);
        spinner=(Spinner) findViewById(R.id.reg_spin);

        final EditText email=(EditText) findViewById(R.id.input_email);
        final EditText password=(EditText) findViewById(R.id.input_password);
        Button go=(Button) findViewById(R.id.btn_signup);
        final Spinner s=(Spinner)findViewById(R.id.reg_spin);
        final EditText name=(EditText) findViewById(R.id.input_fullname);

        go.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final String type  = s.getSelectedItem().toString();


                EditText pw=(EditText)findViewById(R.id.input_password);
                EditText cpw=(EditText)findViewById(R.id.input_passwordr);
                String pass=pw.getText().toString();
                String cpass = cpw.getText().toString();

                if(email.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Enter email address",Toast.LENGTH_SHORT).show();

                }
                else if(password.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Enter password",Toast.LENGTH_SHORT).show();

                }
                else if(!pass.equals(cpass)){
                    Toast.makeText(getApplicationContext(),"Password Not matching",Toast.LENGTH_SHORT).show();
                }
                else{
                    signup(email.getText().toString(),password.getText().toString(),type,name.getText().toString());

                }


            }
        });

        List<String> list= new ArrayList<String>();
        list.add("Student");
        list.add("Staff");
        ArrayAdapter<String> dataadapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        dataadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(dataadapter);

    }
    public void signup(String email, String password, final String type,String name){

        mAuth.createUserWithEmailAndPassword(email, password )
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("sin","createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            myRef.child(user.getUid()).child("name").setValue(user.getDisplayName());
                            myRef.child(user.getUid()).child("email").setValue(user.getEmail());
                            myRef.child(user.getUid()).child("type").setValue(type);
                            SharedPreferences.Editor save = sharedPref.edit();
                            save.putString("type", type);
                            Log.d("hh",type);
                            save.apply();
                            updateUI(user);
//                            Intent intent = new Intent(getApplicationContext(), StudenthomeActivity.class);
//                            startActivity(intent);


//                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.d("sin", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(getApplicationContext(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
//                            updateUI(null);
                        }

                        // ...
                    }
                });
    }
    public void updateUI(final FirebaseUser user){
        if (user!=null){
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
    public void gotosignin(View view){





        Intent intent = new Intent(getApplicationContext(),SigninActivity.class);

        startActivity(intent);
        this.finish();
    }
}

