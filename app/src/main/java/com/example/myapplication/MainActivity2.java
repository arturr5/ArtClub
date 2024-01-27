package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button2 = findViewById(R.id.button1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        button3 = findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
    }

    private void openActivity6() {
        Intent intent = new Intent(this,MainActivity6.class);
        startActivity(intent);
    }

    private void openActivity5() {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

    }
}