package SCase;

import java.util.Scanner;

public class SwitchCase {
    public void sCase() {
        Scanner in = new Scanner(System.in);

        while (true) {
            // case-functions

            // menu print
            System.out.println("Menu:");
            System.out.println("1. +\n2. -\n3. *\n4. /");

            // establish case choice input var and scanner
            int menuChoice = in.nextInt();

            // establish case variables, kena dalam while loop so that it will reset
            int firstVar = 0;
            int secnVar = 0;
            int result=0;

            switch (menuChoice) {
                case 1:
                    String x="+";
                    System.out.println("Addition chosen");
                    System.out.println("Enter first number");
                    firstVar=in.nextInt();
                    System.out.println("Enter first number");
                    secnVar=in.nextInt();
                    result = arthOps(firstVar, secnVar, x);
                    System.out.println("Result:"+ result);

                    
                    break;

                case 2:
                    System.out.println("Substraction chosen");

                    break;
                case 3:
                    System.out.println("Multiplication chosen");

                    break;

                case 4:
                    System.out.println("Division chosen");

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

    public int arthOps(int a , int b, String x){
        int y= 0;
        //String iX= "+";
        if (x.equals("+")) {
            y=a+b;
            return y;
        }
        if (x.equals("-")) {
            y=a-b;
            return y;
        }
        if (x.equals("+")) {
            y=a*b;
            return y;
        }
        if (x.equals("-")) {
            y=a/b;
            return y;
        }
        else{
            return 0;
        }
    }

}
