package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class meditate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditate);

        Button back = findViewById(R.id.back);
        Button b = findViewById(R.id.basics);
        Button r = findViewById(R.id.breathe);
        Button s = findViewById(R.id.stress);
        Button u = findViewById(R.id.unwind);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(meditate.this,mental.class);
                startActivity (i);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(meditate.this,basics.class);
                startActivity (f);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(meditate.this,breathe.class);
                startActivity (j);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(meditate.this,stress.class);
                startActivity (v);
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(meditate.this,unwind.class);
                startActivity (v);
            }
        });
    }
}