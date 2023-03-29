package com.unit.aisproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class facultylist extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facultylist);

        listView = findViewById(R.id.facultylistview);
        List<String> title=new ArrayList<>();
        List<Integer> image=new ArrayList<>();

        title.add("Android Programming\nProf. Goutam Mali\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("C/C++ Programming\nProf. Chandan Mishra\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("JAVA\nProf. Chandan Mishra\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("DSA\nProf. Monalisa Mandal\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("Discrete Mathematics\nProf. Rudra Mohan\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com ");
        title.add("Software Engineering\nProf. Sourav Mandal\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("FLAT\nProf. Rudra Mohan\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("PYTHON\nProf. Chandan Mishra\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("Web Developement\nProf. Sourav Mandal\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("Cyber Security\nProf. Arif Ahmed\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("Artificial Intelligence\nProf. Goutam Mali\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");
        title.add("Machine Learning\nProf. Arif Ahmed\n\nContact: xxxxxxxx\nEmail ID : xx@gmail.com");


        image.add(R.drawable.android);
        image.add(R.drawable.cprogram);
        image.add(R.drawable.java);
        image.add(R.drawable.dsa);
        image.add(R.drawable.discrete);
        image.add(R.drawable.software);
        image.add(R.drawable.flat);
        image.add(R.drawable.python);
        image.add(R.drawable.web);
        image.add(R.drawable.cyber);
        image.add(R.drawable.ai);
        image.add(R.drawable.ml);



        facultyAdapter FacultyAdapter = new facultyAdapter(this,title,image);
        listView.setAdapter(FacultyAdapter);

    }
}