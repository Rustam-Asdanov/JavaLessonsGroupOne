package classwork.other;

public class ExampleSix {
    public static void main(String[] args) {
        // class elements
//        ToyotaSupra.getData();
//        System.out.println(ToyotaSupra.carName);

        // Object element
//        ToyotaSupra theFirstCar = new ToyotaSupra();
//        ToyotaSupra theSecondCar = new ToyotaSupra();

//        System.out.println(theFirstCar.country);
//        System.out.println(theSecondCar.country);


//        ToyotaSupra car_1 = new ToyotaSupra();
//        ToyotaSupra car_2 = new ToyotaSupra();
//        ToyotaSupra car_3 = new ToyotaSupra();
//
//        car_1.color = "blue";
//        car_2.color = "orange";
//        car_3.color = "red";
//        System.out.println("Default");
//        System.out.println("Car 1 " + car_1.color);
//        System.out.println("Car 2 " + car_2.color);
//        System.out.println("Car 3 " + car_3.color);
//
//        car_1 = car_2;
//        car_3 = car_1;
//
//        System.out.println("\nAfter changes");
//        System.out.println("Car 1 " + car_1.color);
//        System.out.println("Car 2 " + car_2.color);
//        System.out.println("Car 3 " + car_3.color);

//        ToyotaSupra car_extra = new ToyotaSupra();
//
//        car_extra.getMessage();

        Human.number = 5;

        Human h_1 = new Human();
        h_1.name = "John";
        h_1.age = 12;

        Human h_2 = new Human();
        h_2.name = "Ted";
        h_2.age = 14;

        Human h_3 = new Human();
        h_3.name = "Abraham";
        h_3.age = 15;
    }
}

class ToyotaSupra{
    static String carName = "Toyota";
    String country = "Japan";
    String color;
    int cost = 40000;

    public static void getData(){
        System.out.println(carName);
    }

    public void getMessage(){

        System.out.println("Message one");
    }
}

class Human{

    static int number;

    String name;
    int age;
}