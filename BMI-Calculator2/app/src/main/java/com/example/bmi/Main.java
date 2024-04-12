package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button dailyButton = findViewById(R.id.calories);
        Button bmiButton = findViewById(R.id.bmi_calculator);
        Button recipesButton = findViewById(R.id.recipes);

        dailyButton.setOnClickListener(v -> {
            startActivity(new Intent(Main.this, Calories.class));
        });
        bmiButton.setOnClickListener(v -> {
            startActivity(new Intent(Main.this, BMI.class));
        });
        recipesButton.setOnClickListener(v -> {
            startActivity(new Intent(Main.this, Recipes.class));
        });
    }
}