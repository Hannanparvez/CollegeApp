package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FacilitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);


        final TextView tv1=(TextView)findViewById(R.id.library);
        final TextView tv2=(TextView)findViewById(R.id.hostel);
        final TextView tv3=(TextView)findViewById(R.id.bank);
        final TextView tv4=(TextView)findViewById(R.id.canteen);
        final TextView tv5=(TextView)findViewById(R.id.dispensary);
        final TextView tv6=(TextView)findViewById(R.id.atm);
        final TextView tv7=(TextView)findViewById(R.id.transport);




        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FacilitiesActivity.this,OnFacilities.class);
                i.putExtra("a","library");
                startActivity(i);

            }



        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FacilitiesActivity.this,OnFacilities.class);
                i.putExtra("a","hostel");
                startActivity(i);
            }



        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FacilitiesActivity.this,OnFacilities.class);
                i.putExtra("a","bank");
                startActivity(i);
            }



        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FacilitiesActivity.this,OnFacilities.class);
                i.putExtra("a","canteen");
                startActivity(i);
            }



        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FacilitiesActivity.this,OnFacilities.class);
                i.putExtra("a","dispensary");
                startActivity(i);
            }



        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FacilitiesActivity.this,OnFacilities.class);
                i.putExtra("a","atm");
                startActivity(i);
            }



        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(FacilitiesActivity.this,OnFacilities.class);
                i.putExtra("a","transport");
                startActivity(i);

            }



        });







    }
}
