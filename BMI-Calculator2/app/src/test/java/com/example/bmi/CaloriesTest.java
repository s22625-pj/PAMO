package com.example.bmi;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaloriesTest {

    @Test
    public void calculateDailyCalories_female_correctCalculation() {
        Calories calories = new Calories();
        float weight = 55; // in kg
        float height = 165; // in cm
        int age = 25;
        String gender = "FEMALE";
        double expected = 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
        double result = calories.calculateDailyCalories(weight, height, age, gender);
        assertEquals("Calculating daily calories for female", expected, result, 0.1);
    }

    @Test
    public void calculateDailyCalories_male_correctCalculation() {
        Calories calories = new Calories();
        float weight = 80; // in kg
        float height = 175; // in cm
        int age = 30;
        String gender = "MALE";
        double expected = 66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age);
        double result = calories.calculateDailyCalories(weight, height, age, gender);
        assertEquals("Calculating daily calories for male", expected, result, 0.1);
    }

    @Test
    public void calculateDailyCalories_negativeInput_handling() {
        Calories calories = new Calories();
        float weight = -55; // in kg, negative to test error handling
        float height = 165; // in cm
        int age = 25;
        String gender = "FEMALE";
        try {
            calories.calculateDailyCalories(weight, height, age, gender);
            fail("Expected an IllegalArgumentException to be thrown for negative weight");
        } catch (IllegalArgumentException e) {
            assertEquals("Weight, height or age cannot be negative", e.getMessage());
        }
    }
}
