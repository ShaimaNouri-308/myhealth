package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        Button back = findViewById(R.id.back);
        Button b = findViewById(R.id.bikram);
        Button h = findViewById(R.id.hatha);
        Button v = findViewById(R.id.vinyasa);
        Button k = findViewById(R.id.kudalini);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(yoga.this,mental.class);
                startActivity (i);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(yoga.this,bikram.class);
                startActivity (f);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(yoga.this,hatha.class);
                startActivity (j);
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(yoga.this,vinyasa.class);
                startActivity (v);
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(yoga.this,kudalini.class);
                startActivity (v);
            }
        });
    }
}