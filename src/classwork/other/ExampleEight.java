package classwork.other;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleEight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("input num: ");

        try{
            String some_text = input.next();

            char a = some_text.toCharArray()[0];

            int b = input.nextInt();
        }catch (NumberFormatException nfe){
            System.out.println("не числовое значение");
        }catch (InputMismatchException ime){
            System.out.println("в инпут введено текстовое значение");
        }
        finally {
            System.out.println("в любом случая я с вами");
        }



        System.out.println("Success");

    }
}
