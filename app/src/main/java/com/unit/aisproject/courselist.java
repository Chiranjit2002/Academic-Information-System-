package com.unit.aisproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class courselist extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courselist);

        listView = findViewById(R.id.courseListV);
        List<String> title = new ArrayList<>();
        List<Integer> image = new ArrayList<>();

        title.add("C/C++ Programming\n SEM 1");
        title.add("JAVA\nSEM 2");
        title.add("DSA\nSEM 2");
        title.add("Discrete Mathematics\nSEM 2");
        title.add("Software Engineering\nSEM 5");
        title.add("FLAT\nSEM 5");
        title.add("Android Programming\nSEM 5");
        title.add("PYTHON\nSEM 2");
        title.add("Web Design\nSEM 1");
        title.add("Cyber Security\nElective");
        title.add("Artificial Intelligence\nElective");
        title.add("Machine Learning\nElective");


        image.add(R.drawable.cprogram);
        image.add(R.drawable.java);
        image.add(R.drawable.dsa);
        image.add(R.drawable.discrete);
        image.add(R.drawable.software);
        image.add(R.drawable.flat);
        image.add(R.drawable.android);
        image.add(R.drawable.python);
        image.add(R.drawable.web);
        image.add(R.drawable.cyber);
        image.add(R.drawable.ai);
        image.add(R.drawable.ml);

        courseAdapter CourseAdapter = new courseAdapter(this,title,image);
        listView.setAdapter(CourseAdapter);

    }
}