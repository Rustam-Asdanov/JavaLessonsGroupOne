package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_eight {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] number_array = new int[10];
        String[] sign_array = new String[10];

        for(int i=0;i<number_array.length;i++){
            System.out.print("введите число: ");
            int num = 0;

            while(true){
                try {
//                    num = scanner.nextInt();
                    num = Integer.parseInt(reader.readLine());
                    break;
                }catch (NumberFormatException nfe){
                    System.out.print("введите ещё раз: ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            number_array[i] = num;

            System.out.print("операция(+,-,*,/): ");
            String sign = null;

            while (true){
                try {
                    sign = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/") || sign.equals("=")){
                    break;
                }else{
                    System.out.print("операция(+,-,*,/): ");
                }
            }


            if(sign.equals("=")) {
                break;
            }

            sign_array[i] = sign;

        }

        int sum = number_array[0];
        for(int i=1;i<number_array.length;i++){

            try {
                switch (sign_array[i-1]){
                    case "+":
                        sum += number_array[i];
                        break;
                    case "-":
                        sum -= number_array[i];
                        break;
                    case "*":
                        sum *= number_array[i];
                        break;
                    case "/":
                        sum /= number_array[i];
                        break;
                }
            }catch (NullPointerException npe){
                break;
            }

        }

        System.out.println("result: " + sum);

        // [7,5,20,null...
        // [+,-,....

        // 7+5-20
    }
}


class Steam{

    public String getGame(){
        return "FIFA 22";
    }
}
