package android.com.ssmguide.ssmguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AdmissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Admissions");
        setContentView(R.layout.activity_admission);


        TextView Tv1 = (TextView)findViewById(R.id.textView1);
        TextView Tv2 = (TextView)findViewById(R.id.textView2);
        TextView Tv3 = (TextView)findViewById(R.id.textView3);
        final ImageView Iv1=(ImageView)findViewById(R.id.ug);
        final ImageView Iv2=(ImageView)findViewById(R.id.pg);
        final ImageView Iv3=(ImageView)findViewById(R.id.ad);

        Tv1.setOnClickListener(new View.OnClickListener() {
            int j=0;
            @Override
            public void onClick(View view) {
                if(j == 0) {
                    Iv1.setVisibility(View.VISIBLE);
                    j=1;
                }
                else {
                    Iv1.setVisibility(View.GONE);
                    j=0;
                }


            }
        });
        Tv2.setOnClickListener(new View.OnClickListener() {
            int j=0;
            @Override
            public void onClick(View view) {
                if(j == 0) {
                    Iv2.setVisibility(View.VISIBLE);
                    j=1;
                }
                else {
                    Iv2.setVisibility(View.GONE);
                    j=0;
                }


            }
        });

        Tv3.setOnClickListener(new View.OnClickListener() {
            int j=0;
            @Override
            public void onClick(View view) {
                if(j == 0) {
                    Iv3.setVisibility(View.VISIBLE);
                    j=1;
                }
                else {
                    Iv3.setVisibility(View.GONE);
                    j=0;
                }


            }
        });




    }
}
