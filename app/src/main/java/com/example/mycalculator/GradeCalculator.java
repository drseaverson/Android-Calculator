package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GradeCalculator extends AppCompatActivity {

    Button calcGradeButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_calculator);
        setTitle("GPA Calculator");

        calcGradeButton = findViewById(R.id.calcGradeButton);
        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        calcGradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //take input of classes grades and numbers of classes to pass to method for calculation
                //calcGrade()
            }
        });

    }

    //method takes input of grades and classes to output GPA of classes
    //method will either return information once complete or print to textview
    public void calcGrade() {

    }
}