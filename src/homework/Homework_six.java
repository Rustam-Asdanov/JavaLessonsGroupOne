package homework;

import java.util.Scanner;

public class Homework_six {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("num_1: ");
//        int num_1 = input.nextInt();
//        System.out.print("num_2: ");
//        int num_2 = input.nextInt();
//        System.out.print("num_3: ");
//        int num_3 = input.nextInt();
//        System.out.println("result: " + myFormula(num_1,num_2,num_3));
//        sumOfNumbers();

//        for(int i=0;i<300;i++){
//            System.out.print("2+");
//        }
//        System.out.println();
//        exerciseMethod();

        exerciseMethod(15);
    }



    public static int myFormula(int a,int b, int c){
        int sum = (int) (Math.pow((a+b),2) * c);
        return sum;
    }

    public static void sumOfNumbers(){
        int sum = 0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void exerciseMethod(int num){
        for(int i=0;i<num;i++){
            System.out.print("xxy");
            if(i!=num-1) System.out.print("-");
            if((i+1)%3 == 0 && i!=num-1) System.out.print("i-");
        }
    }


}

//(a+b)^2 * (c-d)^3 – e

// xxy-xxy-xxy-xxy

// xxy-xxy-xxy-i-
