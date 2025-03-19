public class FlowerInfo {


    String name = "Tulip";
    int numberOfPetals = 5;
    String color = "Red";

    double initialHeight = 1.5;
    double deadHeight = 0;

    void liveFlower(){
        System.out.println("Current Flower Height " + initialHeight);

    }

    void deadFlower(){
        System.out.println("Flower is dead, current flower height is "+ deadHeight);
    }




    //System.out.println(name);
}
