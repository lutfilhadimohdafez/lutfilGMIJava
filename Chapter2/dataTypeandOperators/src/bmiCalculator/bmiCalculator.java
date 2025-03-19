package bmiCalculator;

import java.util.Scanner;

public class bmiCalculator {

    public double bmiCalculatorfunc(){
        double bmiResult;
        double weightKg;
        double heightcm;

        Scanner readInput = new Scanner(System.in);

        //Enter weight
        System.out.println("Enter your weight in Kg:");
        weightKg=readInput.nextDouble();

        //Enter height
        System.out.println("Enter your height in m:");
        heightcm=readInput.nextDouble();

        bmiResult = weightKg/Math.pow(heightcm, 2);

        readInput.close();

        return bmiResult;
    }
    
}
