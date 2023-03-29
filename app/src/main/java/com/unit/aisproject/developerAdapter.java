package com.unit.aisproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class developerAdapter extends ArrayAdapter {
    List<String> courseTitle;
    List<Integer> imageLl;
    Context context;
    public developerAdapter(@NonNull Context context, List<String> title, List<Integer> image) {
        super(context, R.layout.developerlayout,title);

        this.courseTitle = title;
        this.imageLl = image;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View view = LayoutInflater.from(context).inflate(R.layout.developerlayout, parent,false);
        ImageView imageview = view.findViewById(R.id.developerimg);
        TextView textview = view.findViewById(R.id.developerename);

        textview.setText(courseTitle.get(position));
        imageview.setImageResource(imageLl.get(position));
        return view;


    }


}
