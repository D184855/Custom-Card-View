package com.example.customcardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        imageView = findViewById(R.id.rec_image);
        textView = findViewById(R.id.rec_title);
        textView1 = findViewById(R.id.rec_title1);

        Intent intent = getIntent();

        int IMG = intent.getIntExtra("image_key", R.drawable.img1);
        String TITLE = intent.getStringExtra("title_key");
        String TITLE1 = intent.getStringExtra("title1_key");

        imageView.setImageResource(IMG);
        textView.setText(TITLE);
        textView1.setText(TITLE1);


    }
}