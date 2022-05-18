package classwork.other;

public class ExampleTwo {
    public static void main(String[] args) {
        /*
        String name = "James";
        name = "James Gosling";
        System.out.println(name);

        byte num_1 = 127;     // MIN: -128  MAX: 127    - 1 byte
        short num_2 = 20000; // MIN: -32500 MAX: 32500  - 2 byte
        int num_3 = 100000000;  // MIN: -2.100.000.000 MAX: 2.100.000.000 - 4 byte
        long num_4 = 320000000000000l; // MIN: -2.100.000.100.000.000

        float num_5 = 45.4f;    //  6-7 4byte
        double num_6 = 45.34;   //  15 8 byte

        boolean isActive = true;    // true / false

        char letter = 64;
        System.out.println(letter);
    */


        int a = 16;
        int b = 34;

        if(a>b){
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        String name = "James" + 5;

        double name_num = Integer.parseInt(name);


        System.out.println(name_num);
    }
}
