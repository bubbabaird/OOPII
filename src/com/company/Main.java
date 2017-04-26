package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Add an ArrayList that tracks all items of type InventoryItem, called "inventory."
        List<InventoryItem> inventory = new ArrayList<>();

        Apple gala = new Apple("gala", 12);
        Potato russet = new Potato("russet", 80);
        Plum red = new Plum("red", 67);
        Lettuce green = new Lettuce("green", 77);
        Berry redGrape = new Berry("redGrape", 45);

        inventory.add(gala);
        inventory.add(russet);
        inventory.add(red);
        inventory.add(green);
        inventory.add(redGrape);

        for (InventoryItem item : inventory) {
            System.out.println(item);
        }
    }
}

        //Create at least five classes that extend the InventoryItem class, each one representing a product category.
        // DONE



        // Each category class should have a constructor that sets the "category" field to the appropriate name.
        // DONE



        // Add one instance of each class to the "inventory" ArrayList
        // DONE



        // List each Inventory Item in the inventory Array List.
            // For each item, display the category
        // DONE



        // Use String.format or System.out.printf anywhere you are manually concatenating strings with +.
