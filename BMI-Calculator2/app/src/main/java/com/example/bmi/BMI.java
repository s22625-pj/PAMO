package com.example.bmi;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BMI extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private TextView resultBmi;
    private TextView resultWeightStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        weight = findViewById(R.id.editTextNumber2);
        height = findViewById(R.id.editTextNumber);
        resultBmi = findViewById(R.id.textView2);
        resultWeightStatus = findViewById(R.id.textView4);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> calcBMI());
    }

    private void calcBMI() {
        String weightValue = weight.getText().toString();
        String heightValue = height.getText().toString();

        if (TextUtils.isEmpty(weightValue) || TextUtils.isEmpty(heightValue)) {
            Toast.makeText(this, "Please enter values", Toast.LENGTH_SHORT).show();
            return;
        }

        float weight = Float.parseFloat(weightValue);
        float height = Float.parseFloat(heightValue) / 100;

        double bmi = weight / Math.pow(height, 2);

        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi < 25) {
            weightStatus = "Healthy Weight";
        } else if (bmi < 30) {
            weightStatus = "Overweight";
        } else if (bmi >= 30) {
            weightStatus = "Obese";
        }else {
            weightStatus = "";
        }
        this.resultBmi.setText("BMI: " + String.format("%.2f", bmi));
        this.resultWeightStatus.setText("Weight Status: " + weightStatus);
    }

}