package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

public class BasicCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button backButton, calcButton, basicBtnDelete, basicBtn0, basicBtnDecimal, basicBtnCalc, basicBtn1, basicBtn2, basicBtn3, basicBtnSubtract, basicBtn4, basicBtn5, basicBtn6, basicBtnAdd, basicBtn7, basicBtn8, basicBtn9, basicBtnDiv,basicBtnClear, basicBtnParenthesis, basicBtnPercent, basicBtnMultiply;
        TableRow tableRow5;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        setTitle("Basic Calculator");

        tableRow5 = findViewById(R.id.tableRow5);
        backButton = findViewById(R.id.backButton);
        calcButton = findViewById(R.id.calcButton);
        basicBtn0 = findViewById(R.id.basicBtn0);
        basicBtn1 = findViewById(R.id.basicBtn1);
        basicBtn2 = findViewById(R.id.basicBtn2);
        basicBtn3 = findViewById(R.id.basicBtn3);
        basicBtn4 = findViewById(R.id.basicBtn4);
        basicBtn5 = findViewById(R.id.basicBtn5);
        basicBtn6 = findViewById(R.id.basicBtn6);
        basicBtn7 = findViewById(R.id.basicBtn7);
        basicBtn8 = findViewById(R.id.basicBtn8);
        basicBtn9 = findViewById(R.id.basicBtn9);

        tableRow5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Button Clicked", "A button was clicked in Row 5");
            }
        });
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