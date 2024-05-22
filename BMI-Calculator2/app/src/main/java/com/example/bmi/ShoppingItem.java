package com.example.bmi;

public class ShoppingItem {
    private String name;
    private boolean isPurchased;

    public ShoppingItem(String name) {
        this.name = name;
        this.isPurchased = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }
}
