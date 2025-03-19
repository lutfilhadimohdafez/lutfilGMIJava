package oddeven;
// Write java program to display and sum up the even and odd integers within 1 to 10. Sum up and display the even and odd integers.

public class oe {

    // declare class method/function to run program
    public void oddevenfunc() {

        int counter = 1;// this is the counter for each loop increment
        int totalOdd = 0;// sum variable for Odd
        int totalEven = 0; // sum variable for Even numbers

        // while counter lest than 11, meaning iterate from 1-10
        while (counter < 11) {
            // case for odd numbers,if it does not get remainder of 0 then
            if (counter % 2 != 0) {
                // if counter divided by 2, it will get remainder ,
                // so the counter is and odd number
                // hence add the current counter value to totalOdd
                totalOdd = totalOdd + counter;

            }
            if (counter % 2 == 0) {
                // case for even numbers, where it can be divided by 2
                // hence add the even number to totalEven
                totalEven = totalEven + counter;

            }
            // below to print the current values of the sum for each Odd and Even numbers
            System.out.println("\nOdd Sum \t:\t" + totalOdd);

            System.out.println("\nEven Count is \t:\t" + totalEven);

            //increment by 1
            counter++;
        }
        System.out.println("\n\nTotal for sum of even numbers :" + totalEven);
        System.out.println("Total for sum of even numbers :" + totalOdd + "\n\n");
    }

}
