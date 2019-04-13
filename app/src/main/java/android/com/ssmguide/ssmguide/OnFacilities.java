package android.com.ssmguide.ssmguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class OnFacilities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_facilities);


            Intent intent =getIntent();
            ImageView iv1=(ImageView)findViewById(R.id.facilities);
            TextView ed1=findViewById(R.id.editText);
            if (intent.getStringExtra("a").equals("library")){
                iv1.setImageResource(R.drawable.library);
                ed1.setText(" About Library\n" +
                        "\n" +
                        "SSM College of Engineering library is a resource center for teaching,\n" +
                        " learning & research. Being the heart of  the college, it is home for all the information services. It plays a proactive role in enabling access to information resources of all kind and providing innovative, responsive and effective services to meet the changing needs of the students and faculty. The major objective of the library is to provide latest information/knowledge to the right users at the right time" +
                        "\n"+"  Library Timings\n" +
                        "\n" +
                        "09.00 AM to 05.00 PM\n" +
                        "\n" +
                        "Circulation Hours\n" +
                        "\n" +
                        " 10.00 AM to 04.00 PM\n" +
                        "Study room books issued for overnight, one hour before closing of the library on all days\n" +
                        "24 CCTV cameras are installed in the library premises as security measure.\n" );

            }
            if (intent.getStringExtra("a").equals("hostel")){
                iv1.setImageResource(R.drawable.hostel);
                ed1.setText(" Hostel\n" +
                        "\n" +
                        "Manchester United Hostel Service\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "SSM College of Engineering, Parihaspora Pattan Facilitates boys with hostel Service. The hostel is named after a famous Football Club “Manchester United.” The hostel is present within the college campus. Water facility is available 24*7 & Electricity Generator is available whenever needed. Cleaning staff is assigned to check the cleanness of hostel. Every meal is tested for hygiene & if needed is sent to food laboratory for testimony. Total intake capacity is 175 students. Wi-Fi service is available 24*7. Hostel remains closed for the month of January & February.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Eligibility:\n" +
                        "\n" +
                        "There are no such particular criteria but the students residing in far flung areas are given preferences. Students from places such as Jammu & Uri are given higher preference. Those students are entertained who could not avail bus service.\n" +
                        "\n" +
                        "Procedure:\n" +
                        "\n" +
                        "Students who want to avail hostel facility should first be the students of college & should satisfy the above mentioned eligibility criteria. Then one should meet the hostel Superintendent In charge “Mr. Mohd. Yaseen” to collect the hostel admission form. After filling up all the details, one has to submit the same enclosed with the following documents:\n" +
                        "\n" +
                        "1.     1. Xerox of Admission Record.\n" +
                        "\n" +
                        "2.      2. Xerox of all Academic Records.\n" +
                        "\n" +
                        "3.      3. Proof of Residence.\n" +
                        "\n" +
                        "There is no need of any kind of attestation of the above mentioned documents. After submitting all the above documents, applicant will be provided with a hostel ID card & is now set to avail all the hostel facilities.\n" +
                        "\n" );

            }
            if (intent.getStringExtra("a").equals("bank")){
                iv1.setImageResource(R.drawable.bank);
                ed1.setText(" Banking\n" +
                        "On campus bank, to assist student with banking facilities equipped with an ATM.\n" +
                        "\n" +
                        "IFSC Code\tJAKA0ESINGH \n" +
                        "(used for RTGS and NEFT transactions)\n" +
                        "MICR Code\t193051036\n" +
                        "Bank\tJAMMU AND KASHMIR BANK\n" +
                        "Address\tSSM College of Engineering, Dever, Parihaspora, \n" +
                        "District\tPATTAN\n" +
                        "State\tJAMMU & KASHMIR\n" +
                        "Branch\tSSM ENGG COLLEGE PATTAN\n" +
                        "\n" +
                        "\t\n" +
                        "Branch Code\tESINGH");

            }
            if (intent.getStringExtra("a").equals("canteen")){
                iv1.setImageResource(R.drawable.canteen);
                ed1.setText("LACIMA CAFÉ\n" +
                        "\n" +
                        "Lacima Café was started with the idea to get the best of European Café experience to Kashmir. We worked for Pizza Hut UK in different profiles as chefs, Trainers & Restaurant Managers. We always wanted to replicate those processes in Kashmir to deliver a product that not only is authentic & delicious but of highest quality & greatest value.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "THE DRY DOCK RESTAURANT\n" +
                        "\n" +
                        "The Dry Dock Café Is a true Campus Hang out no matter what you order, we know you will love it! Come have a taste from our wide selection of foods.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        " FOR PLACING ORDERS:\n" +
                        "\n" +
                        "\n" +
                        "PARSA: +91- 9796123440\n" +
                        "\n" +
                        "\n" +
                        "LACIMA :+91-91032222227\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "DRYDOCK: +91-9797070748");

            }
            if (intent.getStringExtra("a").equals("dispensary")){
                iv1.setImageResource(R.drawable.dispensary);
                ed1.setText(" COLLEGE DISPENSARY\n" +
                        "The college is having a dispensary that provides the most basic primary healthcare services.");

            }
            if (intent.getStringExtra("a").equals("atm")){
                iv1.setImageResource(R.drawable.atm);
                ed1.setText("The J and K bank ATM\n"+"College provides easily accessible ATM Facility 24X7");

            }
            if (intent.getStringExtra("a").equals("transport")){
                iv1.setImageResource(R.drawable.transport);
                ed1.setText(" Transport\n" +
                        "\n" +
                        "The transport service of SSM College of Engineering, covers almost every corner of the major cities including Srinagar, Sopore, Budgam, Ganderbal & other parts of the Valley.\n" +
                        "\n" +
                        "Students have to register themselves with their respective routes in the office of Transport Service in charge, for availing bus services.\n" +
                        "\n" +
                        "In case students need to change their routes, they have to write an application to the Transport Officer.\n" +
                        "\n" +
                        "For Queries Contact:\n" +
                        "\n" +
                        "Transport Service In charge: Mr. Niyaz\n" +
                        "\n" +
                        "Ph. No.: +91-9622528182");

            }
        }
    }
