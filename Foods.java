package ProjectFTS;
import java.util.Scanner;

public class Foods {
	//Calling the Mainmenu after Executing the FoodList
	private MM mainmenu;
	
	public Foods(MM ShowMM) {
		mainmenu = ShowMM;
	}
	
	public void FoodList(){
		
		Scanner scanner = new Scanner(System.in);

        // Macronutrient information for different food items
        float proteinPer100g = 0f, fatPer100g = 0f, carbsPer100g = 0f;

        // Calories per gram of macronutrients
        float caloriesPerGramProtein = 4.0f; // calories
        float caloriesPerGramFat = 9.0f; // calories
        float caloriesPerGramCarbs = 4.0f; // calories (carbs have 4 calories per gram)

        // Prompt user to choose a food item and enter its amount in grams
        System.out.println("Choose a food item:");
        System.out.println("1. Chicken breast");
        System.out.println("2. Tuna");
        System.out.println("3. Eggs");
        System.out.println("4. Egg whites");
        System.out.println("5. Lean beef");
        System.out.println("6. Lean pork");
        System.out.println("7. Tofu");
        System.out.println("8. Monggo Seeds");
        System.out.println("9. Salmon");
        System.out.println("10. Greek yogurt");
        System.out.println("11. Milk");
        System.out.println("12. Cheese");
        System.out.println("13. Almonds");
        System.out.println("14. Oats");
        System.out.println("15. Tilapia");
        System.out.println("16. Apples");
        System.out.println("17. Bananas");
        System.out.println("18. Oranges");
        System.out.println("19. Berries");
        System.out.println("20. Kiwi");
        System.out.println("21. Pineapple");
        System.out.println("22. Papaya");
        System.out.println("23. Grapefruit");
        System.out.println("24. Mango");
        System.out.println("25. Pears");
        System.out.println("26. Broccoli");
        System.out.println("27. Sweet potato");
        System.out.println("28. Peanut butter");
        System.out.println("29. Avocado");
        System.out.println("30. Chickpeas");

        System.out.print("Enter your choice (1-30): ");
        int choice = scanner.nextInt();

        // Switch case to assign macronutrient values based on user's choice
        switch (choice) {
            case 1: // Chicken breast
                proteinPer100g = 31.0f;
                fatPer100g = 3.6f;
                carbsPer100g = 0.0f;
                break;
            case 2: // Tuna
                proteinPer100g = 29.0f;
                fatPer100g = 1.0f;
                carbsPer100g = 0.0f;
                break;
            case 3: // Eggs
                proteinPer100g = 13.0f;
                fatPer100g = 11.0f;
                carbsPer100g = 1.1f;
                break;
            case 4: // Egg whites
                proteinPer100g = 10.9f;
                fatPer100g = 0.1f;
                carbsPer100g = 0.7f;
                break;
            case 5: // Lean beef
                proteinPer100g = 36.0f;
                fatPer100g = 4.3f;
                carbsPer100g = 0.0f;
                break;
            case 6: // Lean pork
                proteinPer100g = 31.1f;
                fatPer100g = 6.0f;
                carbsPer100g = 0.0f;
                break;
            case 7: // Tofu
                proteinPer100g = 8.1f;
                fatPer100g = 4.8f;
                carbsPer100g = 1.9f;
                break;
            case 8: // Monggo Seeds
                proteinPer100g = 23.0f;
                fatPer100g = 1.0f;
                carbsPer100g = 63.0f;
                break;
            case 9: // Salmon
                proteinPer100g = 20.0f;
                fatPer100g = 13.0f;
                carbsPer100g = 0.0f;
                break;
            case 10: // Greek yogurt
                proteinPer100g = 10.0f;
                fatPer100g = 0.4f;
                carbsPer100g = 3.6f;
                break;
            case 11: // Milk
                proteinPer100g = 3.2f;
                fatPer100g = 3.6f;
                carbsPer100g = 4.6f;
                break;
            case 12: // Cheese
                proteinPer100g = 25.0f;
                fatPer100g = 33.0f;
                carbsPer100g = 1.4f;
                break;
            case 13: // Almonds
                proteinPer100g = 21.2f;
                fatPer100g = 49.9f;
                carbsPer100g = 21.6f;
                break;
            case 14: // Oats
                proteinPer100g = 16.9f;
                fatPer100g = 6.9f;
                carbsPer100g = 66.3f;
                break;
            case 15: // Tilapia
                proteinPer100g = 26.0f;
                fatPer100g = 2.3f;
                carbsPer100g = 0.0f;
                break;
            case 16: // Apples
                proteinPer100g = 0.3f;
                fatPer100g = 0.0f;
                carbsPer100g = 14.0f;
                break;
            case 17: // Bananas
                proteinPer100g = 1.3f;
                fatPer100g = 0.4f;
                carbsPer100g = 23.9f;
                break;
            case 18: // Oranges
                proteinPer100g = 1.0f;
                fatPer100g = 0.2f;
                carbsPer100g = 8.3f;
                break;
            case 19: // Berries
                proteinPer100g = 0.7f;
                fatPer100g = 0.3f;
                carbsPer100g = 14.5f;
                break;
            case 20: // Kiwi
                proteinPer100g = 1.1f;
                fatPer100g = 0.5f;
                carbsPer100g = 14.7f;
                break;
            case 21: // Pineapple
                proteinPer100g = 0.5f;
                fatPer100g = 0.1f;
                carbsPer100g = 13.1f;
                break;
            case 22: // Papaya
                proteinPer100g = 0.5f;
                fatPer100g = 0.3f;
                carbsPer100g = 11.9f;
                break;
            case 23: // Grapefruit
                proteinPer100g = 0.6f;
                fatPer100g = 0.1f;
                carbsPer100g = 8.1f;
                break;
            case 24: // Mango
                proteinPer100g = 0.6f;
                fatPer100g = 0.4f;
                carbsPer100g = 14.6f;
                break;
            case 25: // Pears
                proteinPer100g = 0.4f;
                fatPer100g = 0.1f;
                carbsPer100g = 15.2f;
                break;
            case 26: // Broccoli
                proteinPer100g = 2.8f;
                fatPer100g = 0.4f;
                carbsPer100g = 6.6f;
                break;
            case 27: // Sweet potato
                proteinPer100g = 1.6f;
                fatPer100g = 0.1f;
                carbsPer100g = 20.7f;
                break;
            case 28: // Peanut butter
                proteinPer100g = 24.1f;
                fatPer100g = 50.0f;
                carbsPer100g = 20.0f;
                break;
            case 29: // Avocado
                proteinPer100g = 2.0f;
                fatPer100g = 14.7f;
                carbsPer100g = 8.5f;
                break;
            case 30: // Chickpeas
                proteinPer100g = 19.0f;
                fatPer100g = 6.0f;
                carbsPer100g = 27.0f;
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                
        }

        // Prompt user to enter amount of the chosen food item in grams
        System.out.print("Enter the amount of the chosen food item in grams: ");
        float grams = scanner.nextFloat();

        // Calculate total calories
        float totalCalories = (proteinPer100g * caloriesPerGramProtein +
                fatPer100g * caloriesPerGramFat +
                carbsPer100g * caloriesPerGramCarbs) * (grams / 100);

        // Calculate macros
        float protein = proteinPer100g * (grams / 100);
        float fat = fatPer100g * (grams / 100);
        float carbs = carbsPer100g * (grams / 100);

        // Display results
        System.out.println("\nMacronutrient composition of " + grams + " grams of the chosen food item:");
        System.out.println("Protein: " + protein + " grams");
        System.out.println("Fat: " + fat + " grams");
        System.out.println("Carbohydrates: " + carbs + " grams");
        System.out.println("Calories: " + totalCalories + " calories");
        System.out.println();

        mainmenu.ShowMM();
        
        	}
	
	
}
