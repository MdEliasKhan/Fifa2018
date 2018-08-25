package com.bespokesoftbd.eliaskhan.fifa2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class WelcomeScreen extends AppCompatActivity {
     ProgressBar progressBar;
     int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome_screen);
        progressBar = findViewById(R.id.progressBar);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });
        thread.start();
    }
    public void doWork(){
        for(progress=0;progress<=100;progress+=10){
            try {
                Thread.sleep(100);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void startApp(){
        Intent intent = new Intent(WelcomeScreen.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
    }

