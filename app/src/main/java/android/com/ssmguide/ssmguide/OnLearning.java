package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnLearning extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> dept;
    Map<String, List<String>> sem;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent =getIntent();

        setContentView(R.layout.activity_on_learning);

        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView1);


        if (intent.getStringExtra("a").equals("Civil")) {
            dept = new ArrayList<>();
            sem = new HashMap<>();

            dept.add("3rd Sem");
            dept.add("4th Sem");
            dept.add("5Th Sem");
            dept.add("6th Sem");
            dept.add("7th Sem");
            dept.add("8th Sem");


            List<String> ThirdSem = new ArrayList<>();


            //List<String> QuestionPapers = new ArrayList<>();

            ThirdSem.add("Structure Analysis I" +"$"+"https://firebasestorage.googleapis.com/v0/b/ssmguide-f06a4.appspot.com/o/You%20Are%20a%20Badass_%20How%20to%20Stop%20Doubting%20Your%20Greatness%20and%20Start%20Living%20an%20Awesome%20Life%20(%20PDFDrive.com%20).pdf?alt=media&token=370cecf9-c282-48e0-9048-32369d2fb941");
            ThirdSem.add("Fluid Mechanics I"+"$"+"");
            ThirdSem.add("Surveying I"+"$"+"");
            ThirdSem.add("Mathematics I"+"$"+"");
            ThirdSem.add("Basic Electrical Engineering"+"$"+"");
            ThirdSem.add("Humanities and Social Science"+"$"+"");
            ThirdSem.add("Professional Development Activities"+"$"+"");

            sem.put(dept.get(0),ThirdSem);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

            List<String> Civil_fourth = new ArrayList<>();



            Civil_fourth.add("Structural Analysis II"+"$"+"");
            Civil_fourth.add("Fluid Mechanics II"+"$"+"");
            Civil_fourth.add("Surveying II"+"$"+"");
            Civil_fourth.add("Mathematics II"+"$"+"");
            Civil_fourth.add("Building Drawing and Construction"+"$"+"");
            Civil_fourth.add("Engineering Geology and Materials"+"$"+"");
            Civil_fourth.add("Professional Development Activities"+"$"+"");

            sem.put(dept.get(1),Civil_fourth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Civil_fifth = new ArrayList<>();



            Civil_fifth.add("Design of Concrete Structure I"+"$"+"");
            Civil_fifth.add("Concrete Technology"+"$"+"");
            Civil_fifth.add("Highway Engineering and PMS"+"$"+"");
            Civil_fifth.add("Geotechnical Engineering I"+"$"+"");
            Civil_fifth.add("Water Resource Engineering"+"$"+"");
            Civil_fifth.add("Quantity Surveying and Cost Evaluation"+"$"+"");
            Civil_fifth.add("Professional Development Activities"+"$"+"");

            sem.put(dept.get(2),Civil_fifth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Civil_sixth = new ArrayList<>();


            Civil_sixth.add("Design of  Concrete Structure II"+"$"+"");
            Civil_sixth.add("Geo Technical Engineering II"+"$"+"");
            Civil_sixth.add("Graphic Engineering and Road Facilities"+"$"+"");
            Civil_sixth.add("Hydropower Engineering"+"$"+"");
            Civil_sixth.add("Water Supply and Sanitary Engineering"+"$"+"");
            Civil_sixth.add("Architecture and Town Planning"+"$"+"");
            Civil_sixth.add("Professional Development Activities"+"$"+"");


            sem.put(dept.get(3),Civil_sixth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Civil_seventh = new ArrayList<>();



            Civil_seventh.add("Design of Steel Structure"+"$"+"");
            Civil_seventh.add("Construction Technology Management"+"$"+"");
            Civil_seventh.add("Environmental Engineering"+"$"+"");
            Civil_seventh.add("Advanced Structure Analysis"+"$"+"");
            Civil_seventh.add("Computer Aided Design"+"$"+"");
            Civil_seventh.add("Advance Geotech Engineering"+"$"+"");
            Civil_seventh.add("Green Buildings"+"$"+"");
            Civil_seventh.add("Professional Development Activities"+"$"+"");


            sem.put(dept.get(4),Civil_seventh);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Civil_eight = new ArrayList<>();



            Civil_eight.add("Irrigation and Flood Control"+"$"+"");
            Civil_eight.add("Bridge Engineering"+"$"+"");
            Civil_eight.add("Tunneling Technology"+"$"+"");
            Civil_eight.add("Numerical Methods in Civil Engineering"+"$"+"");
            Civil_eight.add("Railways and Airport Engineering"+"$"+"");
            Civil_eight.add("Advanced  Environment Engineering "+"$"+"");
            Civil_eight.add("Advanced Construction Technology"+"$"+"");
            Civil_eight.add("Structural Dynamics"+"$"+"");
            Civil_eight.add("Professional Development Activities"+"$"+"");


            sem.put(dept.get(5),Civil_eight);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

        }
        if (intent.getStringExtra("a").equals("Mechanical")) {
            dept = new ArrayList<>();
            sem = new HashMap<>();

            dept.add("3rd Sem");
            dept.add("4th Sem");
            dept.add("5Th Sem");
            dept.add("6th Sem");
            dept.add("7th Sem");
            dept.add("8th Sem");


            List<String> Mechanical_third = new ArrayList<>();


            // List<String> QuestionPapers = new ArrayList<>();

            Mechanical_third.add("Structure Analysis I");
            Mechanical_third.add("Fluid Mechanics I");
            Mechanical_third.add("Surveying I");
            Mechanical_third.add("Mathematics I");
            Mechanical_third.add("Basic Electrical Engineering");
            Mechanical_third.add("Humanities and Social Science");
            Mechanical_third.add("Professional Development Activities");

            sem.put(dept.get(0),Mechanical_third);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

            List<String> Mechanical_fourth = new ArrayList<>();



            Mechanical_fourth.add("Structural Analysis II");
            Mechanical_fourth.add("Fluid Mechanics II");
            Mechanical_fourth.add("Surveying II");
            Mechanical_fourth.add("Mathematics II");
            Mechanical_fourth.add("Building Drawing and Construction");
            Mechanical_fourth.add("Engineering Geology and Materials");
            Mechanical_fourth.add("Professional Development Activities");


            sem.put(dept.get(1),Mechanical_fourth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_fifth = new ArrayList<>();



            Mechanical_fifth.add("Design of Concrete Structure I");
            Mechanical_fifth.add("Concrete Technology");
            Mechanical_fifth.add("Highway Engineering and PMS");
            Mechanical_fifth.add("Geotechnical Engineering I");
            Mechanical_fifth.add("Water Resource Engineering");
            Mechanical_fifth.add("Quantity Surveying and Cost Evaluation");
            Mechanical_fifth.add("Professional Development Activities");


            sem.put(dept.get(2),Mechanical_fifth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_sixth = new ArrayList<>();


            Mechanical_sixth.add("Design of  Concrete Structure II");
            Mechanical_sixth.add("Geo Technical Engineering II");
            Mechanical_sixth.add("Graphic Engineering and Road Facilities");
            Mechanical_sixth.add("Hydropower Engineering");
            Mechanical_sixth.add("Water Supply and Sanitary Engineering");
            Mechanical_sixth.add("Architecture and Town Planning");
            Mechanical_sixth.add("Professional Development Activities");


            sem.put(dept.get(3),Mechanical_sixth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_seventh = new ArrayList<>();



            Mechanical_seventh.add("Design of Steel Structure");
            Mechanical_seventh.add("Construction Technology Management");
            Mechanical_seventh.add("Environmental Engineering");
            Mechanical_seventh.add("Advanced Structure Analysis");
            Mechanical_seventh.add("Computer Aided Design");
            Mechanical_seventh.add("Advance Geotech Engineering");
            Mechanical_seventh.add("Green Buildings");
            Mechanical_seventh.add("Professional Development Activities");


            sem.put(dept.get(4),Mechanical_seventh);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_eight = new ArrayList<>();



            Mechanical_eight.add("Irrigation and Flood Control");
            Mechanical_eight.add("Bridge Engineering");
            Mechanical_eight.add("Tunneling Technology");
            Mechanical_eight.add("Numerical Methods in Civil Engineering");
            Mechanical_eight.add("Railways and Airport Engineering");
            Mechanical_eight.add("Advanced  Environment Engineering ");
            Mechanical_eight.add("Advanced Construction Technology");
            Mechanical_eight.add("Structural Dynamics");
            Mechanical_eight.add("Professional Development Activities");


            sem.put(dept.get(5),Mechanical_eight);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

        }

        if (intent.getStringExtra("a").equals("Electrical")) {
            dept = new ArrayList<>();
            sem = new HashMap<>();

            dept.add("3rd Sem");
            dept.add("4th Sem");
            dept.add("5Th Sem");
            dept.add("6th Sem");
            dept.add("7th Sem");
            dept.add("8th Sem");


            List<String> Electrical_third = new ArrayList<>();

            Electrical_third.add("Engineering Mathematics III");
            Electrical_third.add("Electrical Machines I");
            Electrical_third.add("Network Analysis and Synthesis");
            Electrical_third.add("Signals and Systems");
            Electrical_third.add("Electrical Measurement and Measuring Instruments");
            Electrical_third.add("Thermal Engineering");

            sem.put(dept.get(0),Electrical_third);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

            List<String> Electrical_fourth = new ArrayList<>();



            Electrical_fourth.add("Engineering Mathematics IV");
            Electrical_fourth.add("Electrical Machines II");
            Electrical_fourth.add("Control Systems I");
            Electrical_fourth.add("Analog Electronic Circuits");
            Electrical_fourth.add("Digital Electronics and Logic Design");
            Electrical_fourth.add("Fluid Dynamics and Hydraulic Machines");

            sem.put(dept.get(1),Electrical_fourth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Electrical_fifth = new ArrayList<>();



            Electrical_fifth.add("Control Systems II");
            Electrical_fifth.add("Power Systems I");
            Electrical_fifth.add("Electromagnetic Field Theory");
            Electrical_fifth.add("Microprocessors");
            Electrical_fifth.add("Digital Signal Processing");


            sem.put(dept.get(2),Electrical_fifth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Electrical_sixth = new ArrayList<>();


            Electrical_sixth.add("Power Systems II");
            Electrical_sixth.add("Power Electronics");
            Electrical_sixth.add("Non Conventional Energy Sources");
            Electrical_sixth.add("Electronic Measurements and Instrumentation");
            Electrical_sixth.add("Communication Systems");


            sem.put(dept.get(3),Electrical_sixth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Electrical_seventh = new ArrayList<>();



            Electrical_seventh.add("Power System Protection ");
            Electrical_seventh.add("Advanced Power Electronics");
            Electrical_seventh.add("Power System III");
            Electrical_seventh.add("Elective I");
            Electrical_seventh.add("Elective II");


            sem.put(dept.get(4),Electrical_seventh);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Electrical_eight = new ArrayList<>();



            Electrical_eight.add("Industrial Drives and Control");
            Electrical_eight.add("General Management and Economics");
            Electrical_eight.add("Elective III");

            sem.put(dept.get(5),Electrical_eight);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

        }

        if (intent.getStringExtra("a").equals("ECE")) {
            dept = new ArrayList<>();
            sem = new HashMap<>();

            dept.add("3rd Sem");
            dept.add("4th Sem");
            dept.add("5Th Sem");
            dept.add("6th Sem");
            dept.add("7th Sem");
            dept.add("8th Sem");




            List<String> ECE_third = new ArrayList<>();



            ECE_third.add("Engineering Mathematics III");
            ECE_third.add("Network Analysis and Synthesis");
            ECE_third.add("Analog Electronics Circuits I");
            ECE_third.add("Signals and Systems");
            ECE_third.add("Digital Electronics and Logic Design");
            ECE_third.add("Material Science Engineering");

            sem.put(dept.get(0),ECE_third);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

            List<String> ECE_fourth = new ArrayList<>();



            ECE_fourth.add("Engineering Mathematics Iv");
            ECE_fourth.add("Analog Electronics Circuits II");
            ECE_fourth.add("Control Systems");
            ECE_fourth.add("Communication System I");
            ECE_fourth.add("Electromagnetic Fields and waves");
            ECE_fourth.add("Microprocessor");


            sem.put(dept.get(1),ECE_fourth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> ECE_fifth = new ArrayList<>();



            ECE_fifth.add("Digital Signal Processing");
            ECE_fifth.add("Electronic Instrumentation and PLC");
            ECE_fifth.add("MicrroController and Embedded Systems");
            ECE_fifth.add("Solid State Devices");
            ECE_fifth.add("Digital Communication and Information Theory");
            ECE_fifth.add("Electrical Machines");

            sem.put(dept.get(2),ECE_fifth);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> ECE_sixth = new ArrayList<>();


            ECE_sixth.add("Communication System II");
            ECE_sixth.add("Engineering Mathematics V");
            ECE_sixth.add("Computer Organisation and Architecture");
            ECE_sixth.add("VLSI Design");
            ECE_sixth.add("Data Structure ");
            ECE_sixth.add("Power Electronics");


            sem.put(dept.get(3),ECE_sixth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> ECE_seventh = new ArrayList<>();



            ECE_seventh.add("Optical Fibre Communication");
            ECE_seventh.add("Data Communication");
            ECE_seventh.add("Industrial Organization and Management");
            ECE_seventh.add("Microwave and RADAR Engineeing");
            ECE_seventh.add("Power Systems");
            ECE_seventh.add("Elective I");


            sem.put(dept.get(4),ECE_seventh);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> ECE_eight = new ArrayList<>();


            ECE_eight.add("Wireless and Mobile Communication");
            ECE_eight.add("Elective II");
            ECE_eight.add("Elective III");

            sem.put(dept.get(5),ECE_eight);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

        }

        if (intent.getStringExtra("a").equals("CSE")) {

            dept = new ArrayList<>();
            sem = new HashMap<>();

            dept.add("3rd Sem");
            dept.add("4th Sem");
            dept.add("5Th Sem");
            dept.add("6th Sem");
            dept.add("7th Sem");
            dept.add("8th Sem");



            List<String> CSE_third = new ArrayList<>();



            CSE_third.add("Discrete Mathematics");
            CSE_third.add("Object Oriented Programing in C++");
            CSE_third.add("Data Structure  using C");
            CSE_third.add("Network Analysis and Synthesis");
            CSE_third.add("Signal and Systems");


            sem.put(dept.get(0),CSE_third);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

            List<String> CSE_fourth = new ArrayList<>();



            CSE_fourth.add("Probability Statistics and Queuing");
            CSE_fourth.add("Analysis and Design of Algorithms");
            CSE_fourth.add("Digital Electronics");
            CSE_fourth.add("Data Communication");
            CSE_fourth.add("Numerical Methods ");

            sem.put(dept.get(1),CSE_fourth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> CSE_fifth = new ArrayList<>();



            CSE_fifth.add("Operating Systems");
            CSE_fifth.add("Computer Architecture and Organization");
            CSE_fifth.add("Database Management Systems");
            CSE_fifth.add("Internet and Web Technology");
            CSE_fifth.add("Digital Signal Processing");


            sem.put(dept.get(2),CSE_fifth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> CSE_sixth = new ArrayList<>();


            CSE_sixth.add("Theory of Computation");
            CSE_sixth.add("Unix and Shell Programming");
            CSE_sixth.add("Microprocessor");
            CSE_sixth.add("Software Engineering");
            CSE_sixth.add("Computer Networks");


            sem.put(dept.get(3),CSE_sixth);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> CSE_seventh = new ArrayList<>();



            CSE_seventh.add("Cryptography and Network Security");
            CSE_seventh.add("Computer Graphics");
            CSE_seventh.add("Compiler Design");
            CSE_seventh.add("Elective I");
            CSE_seventh.add("Elective II");


            sem.put(dept.get(4),CSE_seventh);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> CSE_eight = new ArrayList<>();


            CSE_eight.add("Entrepreurship Devlopment and Management");
            CSE_eight.add("Artificial Intelligence");
            CSE_eight.add("Elective III");
            CSE_eight.add("Elective IV");


            sem.put(dept.get(5),CSE_eight);


            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

        }
        if (intent.getStringExtra("a").equals("Humanities")) {
            dept = new ArrayList<>();
            sem = new HashMap<>();

            dept.add("1st Sem");
            dept.add("2nd Sem");



            List<String> Humanities_I = new ArrayList<>();



            Humanities_I.add("Engineering Mathematics I");
            Humanities_I.add("Engineering Physics I");
            Humanities_I.add("Engineering Drawing");
            Humanities_I.add("Fundamentals of Computer Programming");
            Humanities_I.add("Communication Skills");
            Humanities_I.add("Basic Electrical Engineering");

            sem.put(dept.get(0),Humanities_I);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

            List<String> Humanities_II = new ArrayList<>();



            Humanities_II.add("Engineering Mathematics II");
            Humanities_II.add("Engineering Chemistry");
            Humanities_II.add("Computer Aided Drawing");
            Humanities_II.add("Fundamentals of Mechanics");
            Humanities_II.add("Basic Electronics Engineering");

            sem.put(dept.get(1),Humanities_II);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


        }
        if (intent.getStringExtra("a").equals("BusinessSchool")) {
            dept = new ArrayList<>();
            sem = new HashMap<>();

            dept.add("3rd Sem");
            dept.add("4th Sem");
            dept.add("5Th Sem");
            dept.add("6th Sem");
            dept.add("7th Sem");
            dept.add("8th Sem");


            List<String> Mechanical_third = new ArrayList<>();



            Mechanical_third.add("Structure Analysis I");
            Mechanical_third.add("Fluid Mechanics I");
            Mechanical_third.add("Surveying I");
            Mechanical_third.add("Mathematics I");
            Mechanical_third.add("Basic Electrical Engineering");
            Mechanical_third.add("Humanities and Social Science");
            Mechanical_third.add("Professional Development Activities");

            sem.put(dept.get(0),Mechanical_third);
            sem.put(dept.get(1),Mechanical_third);
            sem.put(dept.get(2),Mechanical_third);
            sem.put(dept.get(3),Mechanical_third);
            sem.put(dept.get(4),Mechanical_third);
            sem.put(dept.get(5),Mechanical_third);
            sem.put(dept.get(6),Mechanical_third);
            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

            List<String> Mehanical_fourth = new ArrayList<>();



            Mehanical_fourth.add("Structural Analysis II");
            Mehanical_fourth.add("Fluid Mechanics II");
            Mehanical_fourth.add("Surveying II");
            Mehanical_fourth.add("Mathematics II");
            Mehanical_fourth.add("Building Drawing and Construction");
            Mehanical_fourth.add("Engineering Geology and Materials");
            Mehanical_fourth.add("Professional Development Activities");

            sem.put(dept.get(0),Mehanical_fourth);
            sem.put(dept.get(1),Mehanical_fourth);
            sem.put(dept.get(2),Mehanical_fourth);
            sem.put(dept.get(3),Mehanical_fourth);
            sem.put(dept.get(4),Mehanical_fourth);
            sem.put(dept.get(5),Mehanical_fourth);
            sem.put(dept.get(6),Mehanical_fourth);
            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_fifth = new ArrayList<>();



            Mechanical_fifth.add("Design of Concrete Structure I");
            Mechanical_fifth.add("Concrete Technology");
            Mechanical_fifth.add("Highway Engineering and PMS");
            Mechanical_fifth.add("Geotechnical Engineering I");
            Mechanical_fifth.add("Water Resource Engineering");
            Mechanical_fifth.add("Quantity Surveying and Cost Evaluation");
            Mechanical_fifth.add("Professional Development Activities");

            sem.put(dept.get(0),Mechanical_fifth);
            sem.put(dept.get(1),Mechanical_fifth);
            sem.put(dept.get(2),Mechanical_fifth);
            sem.put(dept.get(3),Mechanical_fifth);
            sem.put(dept.get(4),Mechanical_fifth);
            sem.put(dept.get(5),Mechanical_fifth);
            sem.put(dept.get(6),Mechanical_fifth);
            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_sixth = new ArrayList<>();


            Mechanical_sixth.add("Design of  Concrete Structure II");
            Mechanical_sixth.add("Geo Technical Engineering II");
            Mechanical_sixth.add("Graphic Engineering and Road Facilities");
            Mechanical_sixth.add("Hydropower Engineering");
            Mechanical_sixth.add("Water Supply and Sanitary Engineering");
            Mechanical_sixth.add("Architecture and Town Planning");
            Mechanical_sixth.add("Professional Development Activities");

            sem.put(dept.get(0),Mechanical_sixth);
            sem.put(dept.get(1),Mechanical_sixth);
            sem.put(dept.get(2),Mechanical_sixth);
            sem.put(dept.get(3),Mechanical_sixth);
            sem.put(dept.get(4),Mechanical_sixth);
            sem.put(dept.get(5),Mechanical_sixth);
            sem.put(dept.get(6),Mechanical_sixth);
            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_seventh = new ArrayList<>();



            Mechanical_seventh.add("Design of Steel Structure");
            Mechanical_seventh.add("Construction Technology Management");
            Mechanical_seventh.add("Environmental Engineering");
            Mechanical_seventh.add("Advanced Structure Analysis");
            Mechanical_seventh.add("Computer Aided Design");
            Mechanical_seventh.add("Advance Geotech Engineering");
            Mechanical_seventh.add("Green Buildings");
            Mechanical_seventh.add("Professional Development Activities");

            sem.put(dept.get(0),Mechanical_seventh);
            sem.put(dept.get(1),Mechanical_seventh);
            sem.put(dept.get(2),Mechanical_seventh);
            sem.put(dept.get(3),Mechanical_seventh);
            sem.put(dept.get(4),Mechanical_seventh);
            sem.put(dept.get(5),Mechanical_seventh);
            sem.put(dept.get(6),Mechanical_seventh);
            sem.put(dept.get(7),Mechanical_seventh);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);


            List<String> Mechanical_eight = new ArrayList<>();



            Mechanical_eight.add("Irrigation and Flood Control");
            Mechanical_eight.add("Bridge Engineering");
            Mechanical_fifth.add("Tunneling Technology");
            Mechanical_eight.add("Numerical Methods in Civil Engineering");
            Mechanical_fifth.add("Railways and Airport Engineering");
            Mechanical_eight.add("Advanced  Environment Engineering ");
            Mechanical_eight.add("Advanced Construction Technology");
            Mechanical_eight.add("Structural Dynamics");
            Mechanical_eight.add("Professional Development Activities");

            sem.put(dept.get(0),Mechanical_eight);
            sem.put(dept.get(1),Mechanical_eight);
            sem.put(dept.get(2),Mechanical_eight);
            sem.put(dept.get(3),Mechanical_eight);
            sem.put(dept.get(4),Mechanical_eight);
            sem.put(dept.get(5),Mechanical_eight);
            sem.put(dept.get(6),Mechanical_eight);
            sem.put(dept.get(7),Mechanical_eight);
            sem.put(dept.get(8),Mechanical_eight);

            listAdapter = new MyExListAdapter(this,dept,sem);

            expandableListView.setAdapter(listAdapter);

        }

        if (intent.getStringExtra("a").equals("MCA")) {
        }

    }
//    public void download()
//    {
//        storageReference=firebaseStorage.getInstance().getReference();
//        ref= storageReference.child("FRONT PAGE SYNOPSIS.docx");
//        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//            @Override
//            public void onSuccess(Uri uri) {
//                String url=uri.toString();
//                downloadfiles(OnLearningActivity.this,"FRONT PAGE SYNOPSIS.docx",".docx",DIRECTORY_DOWNLOADS,url);
//
//
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//
//            }
//        });


//    }
//    public void downloadfiles(Context context,String fileName, String fileExtension,String destinationDirectory,String url)
//    {
//        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
//        Uri uri = Uri.parse(url);
//        DownloadManager.Request request= new DownloadManager.Request(uri);
//        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//
//        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);
//
//        downloadManager.enqueue(request);
//    }
}
