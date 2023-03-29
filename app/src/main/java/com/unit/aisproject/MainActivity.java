package com.unit.aisproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        CardView details = findViewById(R.id.details);
        CardView course = findViewById(R.id.course);
        CardView faculty = findViewById(R.id.faculty);
        CardView feedback = findViewById(R.id.feedback);
        CardView result = findViewById(R.id.result);
        CardView question = findViewById(R.id.question);
        //CardView moredetail = findViewById(R.id.moredetails);
        CardView support = findViewById(R.id.support);

        CardView logout = findViewById(R.id.logout);


        details.setOnClickListener(this);
        course.setOnClickListener(this);
        faculty.setOnClickListener(this);
        feedback.setOnClickListener(this);
        result.setOnClickListener(this);
        question.setOnClickListener(this);
        //moredetail.setOnClickListener(this);
        support.setOnClickListener(this);

        logout.setOnClickListener(this);

        /*@Override
        public void onClick(View vcourse) {
        switch (vcourse.getId()) {
            case.R.id.course:
            ImageView courseimag = (ImageView) findViewById(R.id.courseimage);
            courseimag.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent Intent = new Intent(MainActivity.this, courseAdapter.class);
                    startActivity(Intent);
                }
            });
        }*/





        CardView aboutcollege;
        aboutcollege = findViewById(R.id.aboutcollege);

        aboutcollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.xim.edu.in"));
                startActivity(browserIntent);
            }
        });
    }


    /*ImageView courseimag = (ImageView)findViewById(R.id.courseimage);
                courseimag.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {*/
    //  }

    //});

    //Intent in = new Intent(MainActivity.this, courselist.class);
    //startActivity(in);
    //Intent i = new Intent(MainActivity.this,courselist.class);
    //startActivity(i);

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.details:
                Toast.makeText(this,"Loading Your Details...",Toast.LENGTH_SHORT).show();
                Intent details = new Intent(MainActivity.this,CheckYourdetails.class);
                startActivity(details);
                break;
            case R.id.course:
                Toast.makeText(this,"Viewing Your Course",Toast.LENGTH_SHORT).show();
                Intent courses = new Intent(MainActivity.this,courselist.class);
                startActivity(courses);
                break;
            case R.id.faculty:
                Toast.makeText(this,"Faculty Details",Toast.LENGTH_SHORT).show();
                Intent faculty = new Intent(MainActivity.this,facultylist.class);
                startActivity(faculty);
                break;
            case R.id.aboutcollege:
                Toast.makeText(this,"Opening College Website...",Toast.LENGTH_LONG).show();
                //Intent details = new Intent(MainActivity.this,details.class);
                //startActivity(details);
                break;
            case R.id.feedback:
                Toast.makeText(this,"Loading Feedback",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                String UriText = "mailto:" +      Uri.encode("rohansrivastava3125@gmail.com") +"?subject="+
                        Uri.encode("Feedback") +"\t-Rate Our App="+ Uri.encode("");
                Uri uri = Uri.parse(UriText);
                intent.setData(uri);
                startActivity(Intent.createChooser(intent,"send email"));
                //Intent details = new Intent(MainActivity.this,details.class);
                //startActivity(details);
                break;
            case R.id.result:
                Toast.makeText(this,"Loading Result...",Toast.LENGTH_SHORT).show();
                //Intent details = new Intent(MainActivity.this,details.class);
                //startActivity(details);
                break;
            case R.id.question:
                Toast.makeText(this,"Ask Question...",Toast.LENGTH_SHORT).show();
                Intent ques = new Intent(Intent.ACTION_SENDTO);
                String UriTextq = "mailto:" +      Uri.encode("rohansrivastava3125@gmail.com") +"?subject="+
                        Uri.encode("Feedback") +"\t-Rate Our App="+ Uri.encode("");
                Uri uriq = Uri.parse(UriTextq);
                ques.setData(uriq);
                startActivity(Intent.createChooser(ques,"send email"));
                //Intent details = new Intent(MainActivity.this,details.class);
                //startActivity(details);
                break;
            /*case R.id.moredetails:
                Toast.makeText(this,"Loading More Info...",Toast.LENGTH_LONG).show();
                //Intent details = new Intent(MainActivity.this,details.class);
                //startActivity(details);
                break;*/
            case R.id.support:
                Toast.makeText(this,"Developers Team is here...",Toast.LENGTH_LONG).show();
                Intent develop = new Intent(MainActivity.this,developers.class);
                startActivity(develop);
                break;

            case R.id.logout:
                Toast.makeText(this,"Logged Out...",Toast.LENGTH_LONG).show();
                Intent logout = new Intent(MainActivity.this,aislogin.class);
                startActivity(logout);
                break;
        }

    }
}