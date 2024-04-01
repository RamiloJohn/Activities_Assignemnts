package Assignmert;

import java.util.HashMap;
import java.util.Map;
	
public class Food extends Consumable { // Inheriting from Food class

    // Method to initialize and print the food tree
    public void printTree() {
        Map<String, String[]> consumables = new HashMap<>();

        // Adding consumables
        consumables.put("Consumables", new String[]{"Rice"});
        consumables.put("Beverage", new String[]{"Orange Juice", "Shake"});
        consumables.put("Dairy Product", new String[]{"Cheese", "Milk", "Butter", "Yoghurt Cream"});
        consumables.put("Meat", new String[]{"Pork", "Beef", "Chicken", "Fish", "Shrimp"});
        consumables.put("Vegetable", new String[]{"Spinach", "Lettuce", "Tomato", "Carrots", "Green Bean"});
        consumables.put("Fruit", new String[]{"Apple", "Banana", "Grapes", "Pineapple", "Orange"});
        consumables.put("Condiments", new String[]{"Soy Sauce", "Fish Sauce", "Shrimp Paste", "Cocoa"});
        consumables.put("Poultry", new String[]{"Egg"});

        // Printing the food tree using the inherited method
        printFoodTree(consumables);
        
    }
    public void PrintBullet() {
    	Map<String, String[]> consumables = new HashMap<>();

        // Adding consumables
        consumables.put("Consumables", new String[]{"Rice"});
        consumables.put("Beverage", new String[]{"Orange Juice", "Shake"});
        consumables.put("Dairy Product", new String[]{"Cheese", "Milk", "Butter", "Yoghurt Cream"});
        consumables.put("Meat", new String[]{"Pork", "Beef", "Chicken", "Fish", "Shrimp"});
        consumables.put("Vegetable", new String[]{"Spinach", "Lettuce", "Tomato", "Carrots", "Green Bean"});
        consumables.put("Fruit", new String[]{"Apple", "Banana", "Grapes", "Pineapple", "Orange"});
        consumables.put("Condiments", new String[]{"Soy Sauce", "Fish Sauce", "Shrimp Paste", "Cocoa"});
        consumables.put("Poultry", new String[]{"Egg"});

   
    	printBullet(consumables);
    }
    
}
