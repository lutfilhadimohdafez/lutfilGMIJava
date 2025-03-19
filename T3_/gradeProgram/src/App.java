import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a single Scanner instance

        while (true) {
            int menuChoice;

            System.out.println("Menu:");
            System.out.println("1. +\n2. -\n3. *\n4. /");

            System.out.print("Choose Arithmetic Operator (eg. 1): ");
            menuChoice = in.nextInt();

            int number1 = 0;
            int number2 = 0;
            int total;

            switch (menuChoice) {
                case 1:
                    System.out.println("Addition is chosen");
                    System.out.print("Insert first number: ");
                    number1 = in.nextInt();
                    System.out.print("Insert second number: ");
                    number2 = in.nextInt();
                    total = number1 + number2;
                    System.out.println("Total is " + total);
                    break;
                case 2:
                    System.out.println("Subtraction is chosen");
                    System.out.print("Insert first number: ");
                    number1 = in.nextInt();
                    System.out.print("Insert second number: ");
                    number2 = in.nextInt();
                    total = number1 - number2;
                    System.out.println("Total is " + total);
                    break;
                case 3:
                    System.out.println("Multiplication is chosen");
                    System.out.print("Insert first number: ");
                    number1 = in.nextInt();
                    System.out.print("Insert second number: ");
                    number2 = in.nextInt();
                    total = number1 * number2;
                    System.out.println("Total is " + total);
                    break;
                case 4:
                    System.out.println("Division is chosen");
                    System.out.print("Insert first number: ");
                    number1 = in.nextInt();
                    System.out.print("Insert second number: ");
                    number2 = in.nextInt();
                    if (number2 != 0) {
                        total = number1 / number2;
                        System.out.println("Total is " + total);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operator.");
                    continue; // Skip to the next iteration of the loop
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to continue? (y/n): ");
            String cont = in.next(); // Use next() to read a single word
            if (cont.equalsIgnoreCase("n")) {
                break; // Exit the loop
            }
        }

        in.close(); // Close the Scanner outside the loop
        System.out.println("Goodbye!");
    }
}