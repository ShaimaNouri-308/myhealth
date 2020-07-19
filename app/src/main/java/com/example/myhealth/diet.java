package com.example.myhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        Button back = findViewById(R.id.back);
        Button n = findViewById(R.id.normal);
        Button v = findViewById(R.id.vegan);
        Button c = findViewById(R.id.carbs);
        Button f = findViewById(R.id.fats);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(diet.this,physical.class);
                startActivity (i);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(diet.this,normal.class);
                startActivity (f);
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(diet.this,vegan.class);
                startActivity (j);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(diet.this,carbs.class);
                startActivity (v);
            }
        });


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(diet.this,fat.class);
                startActivity (j);
            }
        });
    }
}