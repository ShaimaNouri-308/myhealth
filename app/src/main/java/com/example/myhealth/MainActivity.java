package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler h = new Handler(getMainLooper());
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,secondpage.class);
                startActivity(i);
            }
        };

        h.postDelayed(r, 1000);
    }
}