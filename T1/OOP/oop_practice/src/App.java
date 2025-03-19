import packageJava.packageImage;
import A.engine;
import B.*;

public class App {
    public static void main(String[] args) throws Exception {

        //App class method call
        printTulipInfo();

 

    }

    //method
    static void printTulipInfo(){
        
        FlowerInfo tulip = new FlowerInfo();


        System.out.println(tulip.name);
        System.out.println(tulip.numberOfPetals);
        System.out.println(tulip.color);

        //class method call
        tulip.deadFlower();


        
    }
}
