package com.scurrae.chris.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


class MyAdapter extends ArrayAdapter<String>{

    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2,values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout2,
                parent, false);

        String tvShow = getItem(position);

        TextView theTextview = (TextView) theView.findViewById(R.id.textView1);

        theTextview.setText(tvShow);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageview1);

        theImageView.setImageResource(R.drawable.film);

        return theView;
    }
}