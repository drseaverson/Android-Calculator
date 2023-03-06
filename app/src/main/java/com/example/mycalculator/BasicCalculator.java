package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button backButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        setTitle("Basic Calculator");

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    //method to control and return calculate information to user
    public void calculate() {

    }

}