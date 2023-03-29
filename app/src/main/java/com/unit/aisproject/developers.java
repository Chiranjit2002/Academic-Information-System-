package com.unit.aisproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class developers extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        listView = findViewById(R.id.developerslist);
        List<String> title=new ArrayList<>();
        List<Integer> image=new ArrayList<>();

        title.add("Rohan Srivastava\n\nContact: 7903994736\nEmail ID :\n ucse20020@xim.edu.in");
        title.add("Saksham Kumar Jha\n\nContact: 7044168770\nEmail ID :\n ucse20023@xim.edu.in");
        title.add("Chiranjit Behuria\n\nContact: 9784304595\nEmail ID :\n ucse20011@xim.edu.in");
        title.add("Sribananda Panda\n\nContact: 7847090062\nEmail ID :\n ucse20052@xim.edu.in");
        title.add("Aniket Mishra\n\nContact: 7077033553\nEmail ID : ucse20004@xim.edu.in");
        title.add("Aman Arshad\n\nContact: 7979728802\nEmail ID : ucse20003@xim.edu.in");

        image.add(R.drawable.rohan);
        image.add(R.drawable.saksham);
        image.add(R.drawable.profilecircle);
        image.add(R.drawable.sribanada);
        image.add(R.drawable.aniket);
        image.add(R.drawable.profilecircle);




        facultyAdapter DeveloperAdapter = new facultyAdapter(this,title,image);
        listView.setAdapter(DeveloperAdapter);

    }
}