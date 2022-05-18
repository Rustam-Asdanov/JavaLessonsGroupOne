package classwork.other;

import java.util.Scanner;

public class ExampleFive {
    public static void main(String[] args) {
       int[] array_one = {45,13,23,90};
       maxNumFromArray(array_one);

       int[] array_two = {34,89,10,25};
       maxNumFromArray(array_two);

       exOne();
       exTwo();

    }

    public static void myLovelyFunction() {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name + (int) (Math.random()*40+10));
    }

    public static void mySpecialFormula(int a,int b){
        int result = a*3 + b*2;
        System.out.println(result);
    }

    public static void maxNumFromArray(int[] some_array){
        int max = some_array[0];
        for(int elem : some_array){
            if(elem>max){
                max = elem;
            }
        }

        System.out.println("max num is " + max);
    }

    public static void exOne(){
        // ex1
    }

    public static void exTwo(){
//        ex2
    }
}
