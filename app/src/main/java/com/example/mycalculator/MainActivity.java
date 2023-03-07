package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button basicCalcButton, gradeCalcButton, graphCalcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basicCalcButton = findViewById(R.id.basicCalcButton);
        gradeCalcButton = findViewById(R.id.gradeCalcButton);
        graphCalcButton = findViewById(R.id.graphCalcButton);

        basicCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities(BasicCalculator.class);
            }
        });

        gradeCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities(GradeCalculator.class);
            }
        });

        graphCalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities(GraphCalculator.class);
            }
        });
    }

    //class to switch between activities as needed passing class activity on button click
    public void switchActivities(Class c) {
        Intent switchActivityIntent = new Intent(this, c);
        startActivity(switchActivityIntent);
    }
}