package classwork.other;


import java.util.Locale;
import java.util.Scanner;

public class ExampleString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type text: ");
        String text = input.nextLine();
        String[] letters = text.split("");
        int counter = 0;
        for(int i=0;i< letters.length;i++){
            if(letters[i].toLowerCase(Locale.ROOT).equals("a")){
                counter++;
            }
        }

        System.out.println(counter);
    }
}

// Exercise 1: "a"
// Capitan America - 4 - ""
// 10

