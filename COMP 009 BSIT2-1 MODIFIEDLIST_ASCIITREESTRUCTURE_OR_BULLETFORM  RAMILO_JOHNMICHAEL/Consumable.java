package Assignmert;

import java.util.HashMap;
import java.util.Map;

public class Consumable {
    // Moved printFoodTree method to the Food class as it's related to food items in general
    public static void printFoodTree(Map<String, String[]> consumables) {
        System.out.print("Food");
        for (Map.Entry<String, String[]> entry : consumables.entrySet()) {
            System.out.println("|");
            System.out.println("|------ " + entry.getKey());
            for (String item : entry.getValue()) {
                System.out.println("|        • " + item);
            }
        }
    }
    
    public static void printBullet(Map<String, String[]> consumables) {
    	 System.out.print("Food");
         for (Map.Entry<String, String[]> entry : consumables.entrySet()) {
             System.out.println(" ");
             System.out.println("[]" + entry.getKey());
             for (String item : entry.getValue()) {
                 System.out.println("   •" + item);
             }
         }
    }




}	



