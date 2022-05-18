package classwork.other;

public class Example {
    public static void main(String[] args) {

        MathOperation operation_one = (a,b,c) ->(a+b+c);
        System.out.println(operation_one.formula(5,6,7));

        MathOperation operation_two = (a,b,c) -> (a+b-c);
        System.out.println(operation_two.formula(5,6,7));

        Operation operation = n -> System.out.println("My name is " + n);

        operation.printName("Rasim");
    }


}


interface Operation {
    void printName(String name);
}

interface MathOperation{
    int formula(int a, int b, int c);   // a + b + c
}