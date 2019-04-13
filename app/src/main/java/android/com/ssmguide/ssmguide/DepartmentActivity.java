package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Departments");
        setContentView(R.layout.activity_department);


        final TextView tv1=(TextView)findViewById(R.id.civil);
        final TextView tv2=(TextView)findViewById(R.id.enc);
        final TextView tv3=(TextView)findViewById(R.id.ele);
        final TextView tv4=(TextView)findViewById(R.id.mechanical);
        final TextView tv5=(TextView)findViewById(R.id.cse);
        final TextView tv6=(TextView)findViewById(R.id.humanities);
        final TextView tv7=(TextView)findViewById(R.id.mba);
        final TextView tv8=(TextView)findViewById(R.id.mca);




        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","civil");
                startActivity(i);

            }



        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","enc");
                startActivity(i);
            }



        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","ele");
                startActivity(i);
            }



        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","mechanical");
                startActivity(i);
            }



        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","cse");
                startActivity(i);
            }



        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","humanities");
                startActivity(i);
            }



        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","mba");
                startActivity(i);

            }



        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DepartmentActivity.this,OnDepartmentActivity.class);
                i.putExtra("a","mca");
                startActivity(i);

            }



        });




    }
}

