
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chiiiii
 */



public class Foods {
    public void FoodList(MainSystem mainSystem, String selectedItem, float grams) {
        // Macronutrient information for different food items
        float proteinPer100g = 0f, fatPer100g = 0f, carbsPer100g = 0f;

        // Calories per gram of macronutrients
        float caloriesPerGramProtein = 4.0f; // calories
        float caloriesPerGramFat = 9.0f; // calories
        float caloriesPerGramCarbs = 4.0f; // calories (carbs have 4 calories per gram)

        // Assign macronutrient values based on the selected food item
        switch (selectedItem) {
            case "1. Chicken breast":
                proteinPer100g = 31.0f;
                fatPer100g = 3.6f;
                carbsPer100g = 0.0f;
                break;
            case "2. Tuna":
                proteinPer100g = 29.0f;
                fatPer100g = 1.0f;
                carbsPer100g = 0.0f;
                break;
            case "3. Eggs":
                proteinPer100g = 13.0f;
                fatPer100g = 11.0f;
                carbsPer100g = 1.1f;
                break;
            // Add cases for other food items...
            default:
                System.out.println("Invalid choice.");
                return; // Exit method if the selected item is invalid
        }

        // Calculate total calories
        float totalCalories = (proteinPer100g * caloriesPerGramProtein +
                fatPer100g * caloriesPerGramFat +
                carbsPer100g * caloriesPerGramCarbs) * (grams / 100);

        // Calculate macros
        float protein = proteinPer100g * (grams / 100);
        float fat = fatPer100g * (grams / 100);
        float carbs = carbsPer100g * (grams / 100);

        // Pass the calculated values back to the MainSystem class
        
        mainSystem.displayResults(protein, fat, carbs, totalCalories);
    }

}