package com.cs407.calculatorapp;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        double result = getIntent().getDoubleExtra("RESULT", 0);
        TextView textViewResult = findViewById(R.id.textViewResult);
        textViewResult.setText("Result: " + result);
    }
}
