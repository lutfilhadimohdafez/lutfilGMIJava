import bmiCalculator.bmiCalculator;


public class App {
    public static void main(String[] args) throws Exception {

        double bmiResult;

        //call class function
        bmiCalculator bmiCalculatorProgram =  new bmiCalculator();
        //execute
        bmiResult=bmiCalculatorProgram.bmiCalculatorfunc();
        if (bmiResult > 0  && bmiResult < 18.5) {
            System.out.println("BMI is " + bmiResult +".\nYou are underweight");
        }
        else if (bmiResult >= 18.5  && bmiResult <=24.9) {
            System.out.println("BMI is " + bmiResult +".\nYou are healthy");

            
        }
        else if (bmiResult >= 25.0  && bmiResult <=29.9) {
            System.out.println("BMI is " + bmiResult +".\nYou are ovreweight");

            
        }
        else if (bmiResult >= 30.0) {
            System.out.println("BMI is " + bmiResult +".\nYou are obese");

            
        }
        
    }
}
