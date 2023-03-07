package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button backButton, calcButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        setTitle("Basic Calculator");

        backButton = findViewById(R.id.backButton);
        calcButton = findViewById(R.id.calcButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get information stored from calculator and send to method
                //need to pass numbers, type of calculation and return output or print output in textview
                //calculate()
            }
        });
    }
    //method to control and return/print calculate information to user
    public void calculate() {

    }

}