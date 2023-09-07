package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counter_view;
    Button mybtn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter_view = findViewById(R.id.counter_view);
        mybtn  = findViewById(R.id.mybtn);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_view.setText(""+increaseCounter());
                System.out.println("your counter");

            }
        });
    }
    public int increaseCounter(){
        return ++counter;
    }
}