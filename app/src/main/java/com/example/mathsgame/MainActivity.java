package com.example.mathsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button ADD;
    Button SUBSTRACT;
    Button MULTIPLY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ADD=findViewById(R.id.Add);
        SUBSTRACT=findViewById(R.id.Substract);
        MULTIPLY=findViewById(R.id.Multiply);

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Game.class);
                startActivity(intent);
            }
        });
    }
}