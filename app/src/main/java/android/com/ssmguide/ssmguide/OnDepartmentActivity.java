package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OnDepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_department);


        Intent intent = getIntent();

        ImageView img = (ImageView) findViewById(R.id.departments);
        final ImageView image1=(ImageView)findViewById(R.id.onele);
        final ImageView image2=(ImageView)findViewById(R.id.oncivil);
        final ImageView image3=(ImageView)findViewById(R.id.onenc);
        final ImageView image4=(ImageView)findViewById(R.id.onmech);
        final ImageView image5=(ImageView)findViewById(R.id.onhumanities);
        final ImageView image6=(ImageView)findViewById(R.id.oncse);
        final ImageView image7=(ImageView)findViewById(R.id.onbussinessschool);
        final ImageView image8=(ImageView)findViewById(R.id.onmca);



        TextView tx =(TextView)findViewById(R.id.editText);
        TextView tv1=(TextView)findViewById(R.id.txt1);






        if(intent.getStringExtra("a").equals("civil")){
            img.setImageResource(R.drawable.civil);
            tx.setText(" About \n" +
                    "\n" +"The Department of Civil Engineering was established in 1998 for UG engineering course with an intake capacity of 60 students. At present the department has an intake capacity of 180. The Department of Civil Engineering pulls out all stops to create outstanding engineering technocrats with advanced teaching techniques and learning aids for students. Students are not only made experts in technical aspects but also inter personal skills, a vital ingredient to excel in the fast-paced world.\n" +
                    "\n" +
                    "The program imparts students with expertise in various fields of civil engineering: essential requirements for any successful civil engineer. Students gain practical experience and technical exposure from field visits to industries and various construction sites.  Students are equipped with practical know how in the laboratories which are well equipped with state of the art equipment. A well-qualified and experienced faculty members form the back bone of the department. They specialize in structural, geotechnical, environmental, water resources, transportation, surveying, and construction engineering, as well as management, remote sensing and GIS. The faculty members contribute to academic development by publishing books and presenting papers in national and international conferences."

            );
            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image2.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image2.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });
        }
        if(intent.getStringExtra("a").equals("enc")){
            img.setImageResource(R.drawable.electronics);
            tx.setText("");

            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image3.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image3.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });


        }
        if(intent.getStringExtra("a").equals("ele")){
            img.setImageResource(R.drawable.electrical);

            tx.setText("");

            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image1.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image1.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });
        }
        if(intent.getStringExtra("a").equals("mechanical")){
            img.setImageResource(R.drawable.mechanical);
            tx.setText("");


            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image4.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image4.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });
        }
        if(intent.getStringExtra("a").equals("cse")){
            img.setImageResource(R.drawable.cse);
            tx.setText("");

            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image6.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image6.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });

        }
        if(intent.getStringExtra("a").equals("humanities")){
            img.setImageResource(R.drawable.humanities);
            tx.setText("");

            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image5.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image5.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });

        }
        if(intent.getStringExtra("a").equals("business")){
            img.setImageResource(R.drawable.mba );
            tx.setText("");
            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image7.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image7.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });

        }
        if(intent.getStringExtra("a").equals("mca")){
            img.setImageResource(R.drawable.mca);
            tx.setText("");

            tv1.setOnClickListener(new View.OnClickListener() {
                int j=0;
                @Override
                public void onClick(View view) {
                    if(j == 0) {
                        image8.setVisibility(View.VISIBLE);
                        j=1;
                    }
                    else {
                        image8.setVisibility(View.GONE);
                        j=0;
                    }


                }
            });

        }
    }
}
