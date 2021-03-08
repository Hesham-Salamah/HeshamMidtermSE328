package com.example.hesham_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    MediaPlayer mp1;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ImageView i1 = (ImageView) findViewById(R.id.imageView2);
        mp1 = MediaPlayer.create(this, R.raw.track1);
        mp1.start();
        i1.setOnClickListener(new View.OnClickListener() {
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

    }
}