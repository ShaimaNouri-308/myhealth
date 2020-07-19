package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Button back = findViewById(R.id.back);
        Button w = findViewById(R.id.warm);
        Button f = findViewById(R.id.full);
        Button u = findViewById(R.id.upper);
        Button c = findViewById(R.id.core);
        Button l = findViewById(R.id.lower);
        Button s = findViewById(R.id.stretch);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(workout.this,physical.class);
                startActivity (i);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(workout.this,warmup.class);
                startActivity (f);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(workout.this,fullbody.class);
                startActivity (j);
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(workout.this,upperbody.class);
                startActivity (v);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(workout.this,core.class);
                startActivity (f);
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(workout.this,lowerbody.class);
                startActivity (j);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(workout.this,stretch.class);
                startActivity (v);
            }
        });


    }
}