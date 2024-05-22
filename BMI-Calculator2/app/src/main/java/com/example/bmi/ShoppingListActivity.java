package com.example.bmi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;
    private List<ShoppingItem> shoppingItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        shoppingItems = new ArrayList<>();
        fillShoppingItems();

        adapter = new ShoppingListAdapter(shoppingItems);
        recyclerView.setAdapter(adapter);
    }

    private void fillShoppingItems() {
        shoppingItems.add(new ShoppingItem("1 pound of beef sirloin"));
        shoppingItems.add(new ShoppingItem("2 tablespoons of butter"));
        shoppingItems.add(new ShoppingItem("1 medium onion"));
        shoppingItems.add(new ShoppingItem("1 clove of garlic"));
        shoppingItems.add(new ShoppingItem("1.5 cups of sliced mushrooms"));
        shoppingItems.add(new ShoppingItem("1 cup of beef broth"));
        shoppingItems.add(new ShoppingItem("3/4 cup of sour cream"));
        shoppingItems.add(new ShoppingItem("Cooked egg noodles"));
    }
}
