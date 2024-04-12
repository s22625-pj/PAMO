package com.example.bmi;

import android.content.Intent;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Recipes extends AppCompatActivity {

    TextView recipesText;
    List<String> recipes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fillRecipes();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipesText = findViewById(R.id.displayRecipe);

        Button getRecipesButton = findViewById(R.id.getRecipe);

        getRecipesButton.setOnClickListener(v -> {
            Random rand = new Random();
            int randomIndex = rand.nextInt(recipes.size());
            String randomRecipe = recipes.get(randomIndex);
            recipesText.setText(randomRecipe);
        });

    }
    protected void fillRecipes() {
        recipes.add("Beef Stroganoff:\n" +
                "Start by slicing 1 pound of beef sirloin thinly. In a skillet, melt 2 tablespoons of butter over medium heat and cook the beef until browned. Set the beef aside and in the same skillet, sauté 1 finely diced medium onion and 1 minced clove of garlic until soft. Add 1.5 cups of sliced mushrooms and cook until tender. Reintroduce the beef to the skillet, pour in 1 cup of beef broth and let it simmer. Stir in 3/4 cup of sour cream and season with salt and freshly ground black pepper to taste. Serve this creamy delight over cooked egg noodles.\n");

        recipes.add("Chicken Piccata:\n" +
                "Prepare 4 chicken breast cutlets by pounding them thin. Season with salt and pepper. Dredge the chicken in flour and shake off the excess. In a pan, heat a mix of olive oil and butter, and fry the chicken until golden and cooked through. Remove the chicken and add the juice of 1 lemon, 1/4 cup of capers, and a splash of chicken stock to the pan. Scrape up any brown bits and let the sauce thicken slightly. Return the chicken to the pan, coat with the sauce, and garnish with chopped parsley. Serve this tangy chicken with a side of steamed asparagus.\n");

        recipes.add("Shrimp Scampi:\n" +
                "Begin with 1 pound of peeled and deveined shrimp. In a skillet, heat olive oil and a bit of butter, adding 2 minced garlic cloves to cook until fragrant. Toss the shrimp in the pan until pink and set aside. Deglaze the pan with 1/2 cup of white wine and add the zest and juice of 1 lemon, and a handful of chopped parsley. Return the shrimp to the pan to warm through and serve over a bed of freshly cooked pasta, sprinkled with grated Parmesan.\n");

        recipes.add("Vegetable Curry:\n" +
                "Gather a variety of vegetables such as carrots, bell peppers, and zucchini, all chopped. In a large pot, heat some vegetable oil and sauté 1 chopped onion, 2 minced garlic cloves, and a tablespoon of freshly grated ginger until the onion becomes translucent. Add 2 tablespoons of curry powder and cook for a minute to release its flavors. Add the chopped vegetables, stir well, and then pour in a can of coconut milk and a cup of vegetable broth. Let it simmer until the vegetables are tender. Serve this fragrant curry with basmati rice or warm naan bread.\n");

        recipes.add("Ratatouille:\n" +
                "Slice zucchini, bell peppers, eggplant, and tomatoes into thin rounds. In a baking dish, arrange the slices in an alternating pattern. Drizzle with olive oil and season with salt, pepper, minced garlic, and a sprinkle of thyme. Cover with foil and bake in a preheated oven at 375 degrees Fahrenheit for about 45 minutes. Remove the foil and bake for another 15 minutes until the vegetables are tender and beautifully roasted. Enjoy this classic French dish hot or at room temperature.\n");
    }

}