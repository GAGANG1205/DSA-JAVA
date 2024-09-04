import java.util.Scanner;

public class VendingMachine2 {
    static void displayMenu() {
        System.out.println("Welcome to the my vending machine!");
        System.out.println("If you wish to buy something, please enter the number corresponding to each item:");
        System.out.println("Press 1 for Kurkure");
        System.out.println("Press 2 for Lassi");
        System.out.println("Press 3 for Chocolate");
        System.out.println("Press 4 for Softdrink");
        System.out.println("Press 5 for Cookies");
    }

    static int getUserChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        return choice;
    }

    static void processChoice(int choice) {
        double price = 0;
        String itemName = "";

        switch (choice) {
            case 1:
                System.out.println("You selected Kurkure.");
                itemName = "Kurkure";
                price = 20.00;
                break;
            case 2:
                System.out.println("You selected Lassi.");
                itemName = "Lassi";
                price = 20.00;
                break;
            case 3:
                System.out.println("You selected Chocolate.");
                itemName = "Chocolate";
                price = 50.00;
                break;
            case 4:
                System.out.println("You selected Softdrink.");
                itemName = "Softdrink";
                price = 25.00;
                break;
            case 5:
                System.out.println("You selected Cookies.");
                itemName = "Cookies";
                price = 10.00;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;  
        }

        System.out.println("Price is " + price + " rupees.");
        userResponse(itemName, price);
    }

    static void userResponse(String itemName, double price) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you wish to buy this? (yes/no): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("yes")) {
            paymentProcess(itemName, price);  // Call the payment process method here
        } else {
            System.out.println("No problem! Visit again!");
        }
    }

    static void paymentProcess(String itemName, double price) {
        Scanner scanner = new Scanner(System.in);
        double totalEntered = 0.0;

        while (totalEntered < price) {
            System.out.print("Please enter money: ");
            double enteredAmount = scanner.nextDouble();
            totalEntered += enteredAmount;

            if (totalEntered < price) {
                System.out.printf("Insufficient amount. You still need to pay %.2f rupees\n ", price - totalEntered);
            }
        }

        if (totalEntered > price) {
            double change = totalEntered - price;
            System.out.printf("  Here is your %s. Your change is %.2f rupees\n ", itemName, change);
            System.out.println("Thankyou for your purchase please visit again!");
        } else {
            System.out.println("Thank you for your purchase! Here is your " + itemName + " :)");
        }
    }

    public static void main(String[] args) {
        displayMenu();
        int userChoice = getUserChoice();
        processChoice(userChoice);
    }
}
