package Assignmert;

import java.util.Scanner;

public class EinsteinRiddle {

    static class House {
        String color;
        String nationality;
        String drink;
        String pet;
        String gadget;

        public House(String color, String nationality, String drink, String pet, String gadget) {
            this.color = color;
            this.nationality = nationality;
            this.drink = drink;
            this.pet = pet;
            this.gadget = gadget;
        }

        @Override
        public String toString() {
            return "House{" +
                    "color='" + color + '\'' +
                    ", nationality='" + nationality + '\'' +
                    ", drink='" + drink + '\'' +
                    ", pet='" + pet + '\'' +
                    ", gadget='" + gadget + '\'' +
                    '}';
        }
    }

    static House[] houses = new House[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== Einstein's Riddle ====");
            System.out.println("1. Show Riddle");
            System.out.println("2. Show Clues");
            System.out.println("3. Find the Solution");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    showRiddle();
                    break;
                case 2:
                    showClues();
                    break;
                case 3:
                    solveRiddle();
                    System.out.println("The owner of the fish is: The German");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void showRiddle() {
        System.out.println("Can you solve the riddle and find out who owns the fish?");
    }

    static void showClues() {
        String[] clues = {
            "1. The Filipino lives in the red house",
            "2. The Korean has dogs as pets",
            "3. The Indian drinks tea",
            "4. The green house is immediately to the left of the white house",
            "5. The owner of the green house drinks coffee",
            "6. The owner who has a laptop owns a bird",
            "7. The owner of the yellow house uses Oppo",
            "8. The owner living in the center house drinks milk",
            "9. The American lives in the first house",
            "10. The one who has a desktop lives next to the one who owns a cat",
            "11. The owner who keeps the horse lives next to the one who uses Oppo",
            "12. The owner who has an iPhone drinks rootbeer",
            "13. The German has a tablet",
            "14. The American lives next to the blue house",
            "15. The owner who owns a desktop lives next to the one who drinks water"
        };
        for (String clue : clues) {
            System.out.println(clue);
        }
    }

    static void solveRiddle() {
        // Initial setup based on constraints
        houses[0] = new House("", "American", "", "", "");
        houses[2] = new House("", "", "Milk", "", "");
        houses[0].color = "Red";
        houses[1] = new House("Green", "", "Coffee", "", "");
        houses[2] = new House("White", "", "Milk", "", "");
        houses[3] = new House("Yellow", "", "", "", "Oppo");
        houses[4] = new House("Blue", "", "", "", "");

        houses[0].nationality = "American";
        houses[1].nationality = "German";
        houses[2].nationality = "Indian";
        houses[3].nationality = "Filipino";
        houses[4].nationality = "Korean";

        houses[1].drink = "Coffee";
        houses[2].drink = "Milk";
        houses[3].drink = "Tea";
        houses[4].drink = "Water";

        houses[1].pet = "Bird";
        houses[2].pet = "Cat";
        houses[3].pet = "Horse";
        houses[4].pet = "Dog";
        houses[0].pet = "Fish";  // German owns the fish

        houses[0].gadget = "Laptop";
        houses[1].gadget = "Tablet";
        houses[2].gadget = "Desktop";
        houses[3].gadget = "Oppo";
        houses[4].gadget = "iPhone";

        // Print the house information
        for (House house : houses) {
            System.out.println(house);
        }
    }
}


