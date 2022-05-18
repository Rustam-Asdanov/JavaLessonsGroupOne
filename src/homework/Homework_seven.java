package homework;

import java.util.Objects;
import java.util.Scanner;

public class Homework_seven {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int start = input.nextInt();
//        int end = input.nextInt();
//        System.out.println(sumOfNumBetween(start,end));
        miniCalcOnlySumUpgrade();
    }

    public static int sumOfNumBetween(int a, int b){
        int sum = 0;

        while(a<b-1){
            a++;
            sum+=a;
        }

        return sum;
    }

    public static void miniCalcOnlySum(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        while(true){
            System.out.print("Введите число: ");
            num = input.nextInt();
            if(num==0000)break;
            sum+=num;
        }

        System.out.println("Результат: "+ sum);
    }

    public static void miniCalcOnlySumUpgrade(){
        System.out.println("Welcome to our mini calc. If you want to exit type 'stop'");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String num;

        while(true){
            System.out.print("Введите число: ");
            num = input.next();
            if(num.equals("stop"))break;
            try{
                sum+= Integer.parseInt(num);
            }catch (NumberFormatException nfe){
                System.out.println("не то слово");
            }


        }

        System.out.println("Результат: "+ sum);
    }


}

// 0000 - stop