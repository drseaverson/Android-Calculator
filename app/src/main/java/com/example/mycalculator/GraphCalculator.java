package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GraphCalculator extends AppCompatActivity {

    Button calcGraphButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_calculator);
        setTitle("Graphing Calculator");

        calcGraphButton = findViewById(R.id.calcGraphButton);
        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        calcGraphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //use input information and equation to draw graph within viewbox or graph (research how to display and do so)
                //calcGraph()
            }
        });
    }

    //method takes user input and creates a graph based on the parameters and equation provided
    public void calcGraph() {
        //display output of graph into viewbox or other resource to visually see the outcome (research)
    }

}