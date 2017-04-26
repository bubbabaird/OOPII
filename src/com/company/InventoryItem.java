package com.company;

/**
 * Created by BUBBABAIRD on 4/9/17.
 */
public class InventoryItem {
    String name;
    int quantity;
    String category;

    @Override
    public String toString() {
        return String.format("%s %s %s", name, quantity, category);
    }
}
