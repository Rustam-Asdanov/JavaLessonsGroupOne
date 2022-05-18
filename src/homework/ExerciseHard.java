package homework;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseHard {
    public static void main(String[] args) {
//        numberCheck();

        passwordEncoder();
    }

    /**
     * There you can generate password randomly
     * idea from Rasul
     */
    public static void passwordEncoder(){
        // random number
        // random char
        // random symbol

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};

        Scanner input = new Scanner(System.in);

        System.out.println("How many letters? ");
        int num_letters = input.nextInt();
        System.out.println("How many numbers? ");
        int num_numbers = input.nextInt();
        System.out.println("How many symbols? ");
        int num_symbols = input.nextInt();

        int password_length = num_letters + num_numbers + num_symbols;
        String password = "";

        int step_counter = 0;

        // first method
        /*

        Rafig: 3 - L, 5 - N, 2 - S: steps: 10
        Rasim: 4 - L, 10 - N, 8 - S: steps: 22
        Omar: 12 - L, 3 - N, 19 - S: steps: 34
        Rasul: 7 - L, 14 - N, 23 - S: steps: 44

         */
//        for (int i = 0; i < password_length; i++) {
//            step_counter++;
//            int choice = (int) (Math.random()*3);
//            // if 0 - letter , 1 - number and 2 - symbol
//
//
//            // generation of letter --- 0
//            if(num_letters!=0 && choice == 0) {
//                int random_num = (int) (Math.random() * letters.length);
//                password += letters[random_num];
//                num_letters--;
//                continue;
//            } else {
//                choice = 1;
//            }
//
//            // generation of letter --- 1
//            if(num_numbers != 0 && choice == 1){
//                int random_num = (int) (Math.random()*numbers.length);
//                password += numbers[random_num];
//                num_numbers--;
//                continue;
//            } else {
//                choice = 2;
//            }
//
//            // generation of letter --- 2
//            if(num_symbols != 0 && choice == 2){
//                int random_num = (int) (Math.random()*symbols.length);
//                password += symbols[random_num];
//                num_symbols--;
//            }
//            else if(num_letters!=0) {
//                int random_num = (int) (Math.random() * letters.length);
//                password += letters[random_num];
//                num_letters--;
//            } else {
//                int random_num = (int) (Math.random()*numbers.length);
//                password += numbers[random_num];
//                num_numbers--;
//            }
//
//        }

        /*

        Rafig: 3 - L, 5 - N, 2 - S: steps: 12, 23
        Rasim: 4 - L, 10 - N, 8 - S: steps: 45, 32
        Omar: 12 - L, 3 - N, 19 - S: steps: 50, 47
        Rasul: 7 - L, 14 - N, 23 - S: steps: 78, 75, 67, 100

         */
        while (true){
            step_counter++;
            int choice = (int) (Math.random()*3);
            // if 0 - letter , 1 - number and 2 - symbol
            System.out.println("choice: "+choice);

            // generation of letter --- 0
            if(num_letters!=0 && choice == 0) {
                int random_num = (int) (Math.random() * letters.length);
                password += letters[random_num];
                num_letters--;
                continue;
            }

            // generation of letter --- 1
            if(num_numbers != 0 && choice == 1){
                int random_num = (int) (Math.random()*numbers.length);
                password += numbers[random_num];
                num_numbers--;
                continue;
            }

            // generation of letter --- 2
            if(num_symbols != 0 && choice == 2){
                int random_num = (int) (Math.random()*symbols.length);
                password += symbols[random_num];
                num_symbols--;
                continue;
            }

            if(num_letters == 0 && num_numbers == 0 && num_symbols == 0){
                break;
            }
        }

        System.out.println(password);
        System.out.println("Steps: " + step_counter);
    }

    public static void numberCheck(){
        Scanner input = new Scanner(System.in);

        System.out.println("Type number: ");
        String number = input.next();
        String[] numberArray = number.split("");

        for(int i = 100; i<=999; i++){
            int counter = 0;
            String firstNum = ("" + i).split("")[0];
            String secondNum = ("" + i).split("")[1];
            String thirdNum = ("" + i).split("")[2];

            if(include(numberArray, firstNum)){
                counter++;
            }

            if(include(numberArray, secondNum)){
                counter++;
            }

            if(include(numberArray, thirdNum)){
                counter++;
            }

            if(counter == 3){
                System.out.print(i+"  ");
            }
        }
    }

    public static boolean include(String[] array, String num){
        for(String elem : array){
            if(elem.equals(num)) {
                return true;
            }
        }
        return false;
    }

    // 235
    // 253
}
