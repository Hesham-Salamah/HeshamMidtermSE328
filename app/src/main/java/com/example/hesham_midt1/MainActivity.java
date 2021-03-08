package com.example.hesham_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView cat;
    int i;
    MediaPlayer mp1;
    Button first, second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = (ImageView) findViewById(R.id.cat);
        mp1 = MediaPlayer.create(this, R.raw.track1);
        first = (Button) findViewById(R.id.bttn1);
        second = (Button) findViewById(R.id.bttn2);


        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    i++;
                    mp1.start();
                }

                else{
                    i--;
                    mp1.pause();
                }

            }
        });


        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));

            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));

            }
        });



    }
}