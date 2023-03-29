package com.unit.aisproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class facultyAdapter extends ArrayAdapter {
    List<String> courseTitle;
    List<Integer> imagelist;
    Context context;
    public facultyAdapter(@NonNull Context context, List<String> title, List<Integer> image) {
        super(context, R.layout.facultyname,title);

        this.courseTitle = title;
        this.imagelist = image;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View view = LayoutInflater.from(context).inflate(R.layout.facultyname, parent,false);
        ImageView imageview = view.findViewById(R.id.facultyimg);
        TextView textview = view.findViewById(R.id.facultyename);

        textview.setText(courseTitle.get(position));
        imageview.setImageResource(imagelist.get(position));
        return view;


    }


}
