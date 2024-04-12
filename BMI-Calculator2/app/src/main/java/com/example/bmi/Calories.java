package com.example.bmi;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Calories extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private EditText age;
    private TextView resultBmi;
    private TextView dailyCaloriesText;
    private String gender="MALE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);

        weight = findViewById(R.id.editWeight);
        height = findViewById(R.id.editHeight);
        age = findViewById(R.id.editAge);
        dailyCaloriesText = findViewById(R.id.dailyCaloriesText);

        Button maleButton = findViewById(R.id.male);
        Button femaleButton = findViewById(R.id.female);

        maleButton.setOnClickListener(v -> {
            gender="MALE";
            Toast.makeText(this, "Selected: MALE", Toast.LENGTH_SHORT).show();
        });
        femaleButton.setOnClickListener(v -> {
            gender="FEMALE";
            Toast.makeText(this, "Selected: FEMALE", Toast.LENGTH_SHORT).show();
        });


        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> calcDaily());

    }

    private void calcDaily() {
        String weightValue = weight.getText().toString();
        String heightValue = height.getText().toString();
        String ageValue = age.getText().toString();

        if (TextUtils.isEmpty(weightValue) || TextUtils.isEmpty(heightValue) || TextUtils.isEmpty(ageValue)) {
            Toast.makeText(this, "Please enter values", Toast.LENGTH_SHORT).show();
            return;
        }

        float weight = Float.parseFloat(weightValue);
        float height = Float.parseFloat(heightValue);
        int age = Integer.parseInt(ageValue);

        double dailyCalories = gender.equals("FEMALE") ? 655.1 + (9.563*weight) + (1.85*height) - (4.676*age) : 66.5 + (13.75*weight) + (5.003*height)-(6.775*age);


        this.dailyCaloriesText.setText("Daily calories: " + dailyCalories);
    }
}