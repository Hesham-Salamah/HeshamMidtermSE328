package com.example.hesham_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.example.hesham_midt1.MainActivity2;
import com.example.hesham_midt1.MainActivity4;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button act1F3 = (Button)findViewById(R.id.act1F3);
        Button act2F3 = (Button)findViewById(R.id.act2F3);

        act1F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));
            }
        });
        act2F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            }
        });

        String [] restaurants = {"Alfaisal Website","Picture","google","Facebook","Twitter"};

        GridView grid = (GridView) findViewById(R.id.grid);
        ArrayAdapter adapter = new ArrayAdapter
                (getApplicationContext(),android.R.layout.simple_list_item_1,
                        restaurants);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position, long id) {
                switch (position) {
                    case 1:
                        startActivity(new Intent(MainActivity3.this, MainActivity4.class));
                        break;
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com")));
                        break;
                }
            }
        });
    }
}