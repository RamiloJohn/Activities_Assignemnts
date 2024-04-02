package ProjectFTS;

import java.util.Scanner;

public class MM {

    public void ShowMM() {
        Scanner read = new Scanner(System.in);
        Foods fs = new Foods(this); // Pass the instance of MM to Foods
        Reg_Log rg = new Reg_Log();

        int choice;

        do {
            System.out.println("Welcome to Food Tracking System");
            System.out.println("Choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Select Food you want to Track");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = read.nextInt();
            read.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    rg.register();
                    break;
                case 2:
                    rg.login();
                    break;
                case 3:
                    fs.FoodList();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        MM mm = new MM();
        mm.ShowMM();
    }
}
