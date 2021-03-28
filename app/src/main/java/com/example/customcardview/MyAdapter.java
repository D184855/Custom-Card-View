package com.example.customcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    int images[];
    String title[];
    String title1[];

    public MyAdapter(Context context, int[] images, String[] title, String[] title1) {
        this.context = context;
        this.images = images;
        this.title = title;
        this.title1 = title1;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.custom_layout, null);

        ImageView imageView = view.findViewById(R.id.txt_img);
        TextView textView = view.findViewById(R.id.txt_title);
        TextView textView1 = view.findViewById(R.id.txt_title1);

        imageView.setImageResource(images[i]);
        textView.setText(title[i]);
        textView1.setText(title1[i]);
        return view;
    }
}
