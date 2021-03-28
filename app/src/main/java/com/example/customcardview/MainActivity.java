package com.example.customcardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter myAdapter;
    String title[] = {"Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"};
    String title1[] = {"Title 11", "Title 22", "Title 33", "Title 44", "Title 55", "Title 66", "Title 77", "Title 88", "Title 99"};
    int images[] = {R.drawable.img1, R.drawable.img2, R.drawable.img4, R.drawable.img5, R.drawable.img6,
            R.drawable.img7, R.drawable.img8, R.drawable.img2, R.drawable.img1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list1);
        myAdapter = new MyAdapter(MainActivity.this, images, title, title1);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                intent.putExtra("image_key", images[i]);
                intent.putExtra("title_key", title[i]);
                intent.putExtra("title1_key", title1[i]);
                startActivity(intent);
            }
        });
    }
}