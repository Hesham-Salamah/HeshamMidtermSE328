package com.example.hesham_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(splash.this, MainActivity.class));

            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 6000); //schedule the clock to run the "task"
        //so after 5 sec we will run the task
    }
}