package pyramid;

public class pyramid1 {
    public void pyramidbuild1(){
        for(int axisY=1;axisY<6;axisY++){
            for(int axisX=0;axisX<axisY;axisX++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pyramidbuild2(){
        for(int axisY=1;axisY<6;axisY++){
            for(int axisX=0;axisX<axisY;axisX++){
                System.out.print(axisX+1);
            }
            System.out.println();
        }

    }
    
}


