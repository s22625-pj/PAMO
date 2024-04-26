package com.example.bmi;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class BMITest {

    @Rule
    public ActivityScenarioRule<BMI> activityRule = new ActivityScenarioRule<>(BMI.class);

    @Test
    public void testBMICalculation() {
        // Input values
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.typeText("70"), ViewActions.closeSoftKeyboard());

        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber))
                .perform(ViewActions.typeText("175"), ViewActions.closeSoftKeyboard());

        // Perform button click
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        // Check the BMI result
        Espresso.onView(ViewMatchers.withId(R.id.textView2))
                .check(ViewAssertions.matches(ViewMatchers.withText("BMI: 22.86")));

        // Check the weight status
        Espresso.onView(ViewMatchers.withId(R.id.textView4))
                .check(ViewAssertions.matches(ViewMatchers.withText("Weight Status: Healthy Weight")));
    }

    @Test
    public void testEmptyInputValidation() {
        // Clear the fields if needed and leave empty
        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber2))
                .perform(ViewActions.clearText(), ViewActions.closeSoftKeyboard());

        Espresso.onView(ViewMatchers.withId(R.id.editTextNumber))
                .perform(ViewActions.clearText(), ViewActions.closeSoftKeyboard());

        // Perform button click
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        // Verifying no result is set if inputs are empty, you might modify this depending on actual handling in app
        Espresso.onView(ViewMatchers.withId(R.id.textView2))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
        Espresso.onView(ViewMatchers.withId(R.id.textView4))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
    }
}
