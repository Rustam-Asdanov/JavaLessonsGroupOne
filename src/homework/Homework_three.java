package homework;

import java.util.Scanner;

public class Homework_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Длина: ");
        int num_1 = input.nextInt();
        System.out.print("\nШирина: ");
        int num_2 = input.nextInt();
        drawRectangle(num_1,num_2);
    }

    public static void drawRectangle(int a,int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("*");  // *****
            }
            System.out.println();
        }
    }
}
