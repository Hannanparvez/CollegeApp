package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudenthomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("HOME");
        setContentView(R.layout.activity_studenthome);
    }
    public void gotofacilities(View view) {
        Intent intent = new Intent(this, FacilitiesActivity.class);
        startActivity(intent);
    }

    public void gotolearning(View view) {
        Intent intent = new Intent(this, LearningWindow.class);
        startActivity(intent);
    }

    public void gotodepartments(View view) {
        Intent intent = new Intent(this, DepartmentActivity.class);
        startActivity(intent);
    }

    public void gotonotifications(View view) {
        Intent intent = new Intent(this, NotificationsActivity.class);
        startActivity(intent);
    }

    public void gotoresults(View view) {
        Intent intent = new Intent(this, ResultsActivity.class);
        startActivity(intent);
    }

    public void gotomaps(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void gotoadmissions(View view){
        Intent intent = new Intent(this,AdmissionActivity.class);
        startActivity(intent);

    }

}

