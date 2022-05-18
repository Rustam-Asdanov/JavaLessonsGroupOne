package classwork.oop;

public class MainClassOne {
    public String address;

    public static void main(String[] args) {
//        Car carOne = new Nissan();
//        Car carTwo = new AstonMartin();
//
//        carOne.color = "red";
//
//        Level myLevel = Level.HIGH;
//
//        switch (myLevel){
//            case LOW :
//                System.out.println("game started in level LOW");
//                break;
//            case MEDIUM :
//                System.out.println("game started in level MEDIUM");
//                break;
//            case HIGH :
//                System.out.println("game started in level HIGH");
//                break;
//        }

        System.out.println(Level.HIGH);

    }
}

abstract class Car{
    public String color;
    final String minCost = "20.000$";


    public abstract void getGasolineNum();

    public void getName(){
        System.out.println("sedan");

    }
}

class Nissan extends Car{


    @Override
    public void getGasolineNum() {
        System.out.println("95");
    }

    @Override
    public void getName() {
        System.out.println("My lovely sedan");
    }
}

class AstonMartin extends Car{

    @Override
    public void getGasolineNum() {
        System.out.println("diesel");
    }
}


enum Level{
    LOW("1000% health"),
    MEDIUM("100% health"),
    HIGH("10% health");

    private final String describtion;

    Level(String describtion) {
        this.describtion = describtion;
    }

    public String getDescribtion() {
        return describtion;
    }
}