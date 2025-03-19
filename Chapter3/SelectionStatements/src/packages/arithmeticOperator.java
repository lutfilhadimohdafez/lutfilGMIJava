package packages;

import java.util.Scanner;

public class arithmeticOperator {
    public void arithmeticOperatorfunc() {
        Scanner in = new Scanner(System.in);

        while (true) {
            // case-functions

            // menu print
            System.out.println("\nMenu:\n");
            System.out.println("1. +\n2. -\n3. *\n4. /");

            // establish scanner
            System.out.println("\nEnter operation (e.g: 4):");
            int menuChoice = in.nextInt();

            // establish case switch variables, must be inside while loop so that it will
            // reset
            int firstVar = 0;
            int secnVar = 0;
            int result = 0;
            String operator;

            switch (menuChoice) {
                case 1:
                    //declare operator as +
                    operator = "+";
                    System.out.println("Addition chosen");
                    System.out.println("Enter first number");
                    firstVar = in.nextInt();
                    System.out.println("Enter second number");
                    secnVar = in.nextInt();
                    //pass arguments to function operator
                    result = arthOps(firstVar, secnVar, operator);
                    System.out.println("Result:" + result);

                    break;

                case 2:
                    operator = "-";
                    System.out.println("Substraction chosen");
                    System.out.println("Enter first number");
                    firstVar = in.nextInt();
                    System.out.println("Enter second number");
                    secnVar = in.nextInt();
                    result = arthOps(firstVar, secnVar, operator);
                    System.out.println("Result:" + result);

                    break;
                case 3:
                    operator = "*";
                    System.out.println("Multiplication chosen");
                    System.out.println("Enter first number");
                    firstVar = in.nextInt();
                    System.out.println("Enter second number");
                    secnVar = in.nextInt();
                    result = arthOps(firstVar, secnVar, operator);
                    System.out.println("Result:" + result);

                    break;

                case 4:
                    operator = "/";
                    System.out.println("Division chosen");
                    System.out.println("Enter first number");
                    firstVar = in.nextInt();
                    System.out.println("Enter second number");
                    secnVar = in.nextInt();
                    result = arthOps(firstVar, secnVar, operator);
                    System.out.println("Result:" + result);

                    break;

                default:
                    break;
            }

            // below input to ask if user want to continue or not.
            System.out.println("Loop?(Yes/No)");
            String cont = in.next();
            if (cont.equals("No")) {
                break;
            }

        }

        in.close();
        System.out.println("Bye");

    }

    //function to operate based on the operator chosen
    public int arthOps(int a, int b, String x) {
        int y = 0;
        // String iX= "+";
        if (x.equals("+")) {
            y = a + b;
            return y;
        } else if (x.equals("-")) {
            y = a - b;
            return y;
        } else if (x.equals("*")) {
            y = a * b;
            return y;
        } else if (x.equals("/")) {
            y = a / b;
            return y;
        } else {
            return 0;
        }
    }

}
