package sumtoten;

public class sumtoten {
    public void sumtotenfunc() {

        // initialize variable for sum for each loop type example to 0

        int totalSumWhile = 0;
        int totalSumFor = 0;
        int totalSumdoWhile = 0;

        //this "i" variable is for while loop 
        int i = 1;
        //tis "y" variable is for do while loop
        int y = 1;

        // While loop example below 

        System.out.println("While loop below");

        while (i < 11) {
            //add the current increment to totalSumWhile. 
            //If sum has previous value, it will add to the previous value
            totalSumWhile = totalSumWhile + i;
            //increment i by 1
            i++;
            //print each value of the sum from each loop
            System.out.println(totalSumWhile);
        }

        // For Loop example

        System.out.println("For loop below");

        //since for does not need to initiate increment variable outside,
        //it is declared below in the form of "x"
        for (int x = 0; x <= 10; x++) {
            //add the current increment to the Sum
            totalSumFor = totalSumFor + x;
            //below print each value of the sum
            System.out.println(totalSumFor);
        }

        // Do While loop example

        System.out.println("Do while below");
        do {
            //add the current increment for Sum
            totalSumdoWhile = totalSumdoWhile + y;
            System.out.println(totalSumdoWhile);

            //increment by 1
            y++;

        } while (y < 11);//since y is 11, to iterate until 10, it needs to be less 11.

    }

}
