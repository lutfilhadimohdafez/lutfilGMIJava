package packages;

import java.util.Scanner;

public class finalMark {

    // establish function for finalmark program

    public void finalMarkfunc() {

        // Variable for user input to exit the program or not
        String loopExit;

        // final mark declared below
        int averageMark = 0;
        // variable for input
        int test1, test2;
        // variable for name
        String userName, userID, subject;

        while (true) {
            // Establish the input scanner
            Scanner readUserInput = new Scanner(System.in);

            // Enter name
            System.out.println("Enter name:");
            // read name
            userName = readUserInput.nextLine();
            // Enter ID
            System.out.println("Enter ID:");
            // read ID
            userID = readUserInput.nextLine();
            // Enter Subject
            System.out.println("Enter Subject:");
            // read Subject
            subject = readUserInput.nextLine();

            // Enter Test1
            System.out.println("Enter Test1 Marks:");
            // read Test1
            test1 = readUserInput.nextInt();
            // Enter Test2
            System.out.println("Enter TeST 2 Marks:");
            // read test2
            test2 = readUserInput.nextInt();

            //calculate averagemark
            averageMark = (test1 + test2) / 2;
            // print all information
            System.out.println("\nName:\t\t" + userName + "\nID :\t\t" + userID + "\nSubject:\t" + subject
                    + "\nAverage Mark :\t" + averageMark+"\n\n");

            //if else statements to determine grade
            if (averageMark > 0 && averageMark <= 40) {
                System.out.println("Final grade:D");

            } else if (averageMark <= 60) {
                System.out.println("Final grade:C");

            } else if (averageMark <= 85) {
                System.out.println("Final grade:B");

            } else if (averageMark <= 100) {
                System.out.println("Final grade:A");

                //error printn for wrong marks
            } else {
                System.out.println("Invalid marks");
            }

            // call user to end the application
            System.out.println("\nExit application?(y/n)");
            // Input to enter to exit or no
            loopExit = readUserInput.next();
            // if string is y
            if (loopExit.equals("y")) {
                // close scanner,
                readUserInput.close();
                // exit program
                break;
            } else {

                //continue using the program
                continue;
            }

        }

       
        System.out.println("Bye");

    }

}
