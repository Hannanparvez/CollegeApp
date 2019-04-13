package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class LearningWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_window);

        final CardView tv1=(CardView) findViewById(R.id.Civil);
        final CardView tv2=(CardView) findViewById(R.id.Mechanical);
        final CardView tv3=(CardView) findViewById(R.id.ele);
        final CardView tv4=(CardView) findViewById(R.id.ENC);
        final CardView tv5=(CardView) findViewById(R.id.cse);
        final CardView tv6=(CardView) findViewById(R.id.Humanities);
        final CardView tv7=(CardView) findViewById(R.id.business);
        final CardView tv8=(CardView) findViewById(R.id.mca);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","Civil");
                startActivity(i);

            }



        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","Mechanical");
                startActivity(i);

            }



        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","Electrical");
                startActivity(i);

            }



        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","ECE");
                startActivity(i);

            }



        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","CSE");
                startActivity(i);

            }



        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","Humanities");
                startActivity(i);

            }



        });

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","BusinessSchool");
                startActivity(i);

            }



        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearningWindow.this,OnLearning.class);
                i.putExtra("a","MCA");
                startActivity(i);

            }



        });


    }
}
