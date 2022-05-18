package classwork.other;

public class ExampleSeven {
    public static void main(String[] args) {
//        Singer person_one =
//                new Singer("Lana del Rey","Born to die", "USA",36);
//        System.out.println(person_one);
//
//        Singer person_five = new Singer();
//
//        Singer person_six = new Singer("Lana del Rey");

        System.out.println(sumOfNum(3,6,9));
    }

    public static int sumOfNum(int a, int b, int c){
        return a+b+c;
    }
}

class Singer{
    String name;
    String famous_music;
    String country;
    int age;

    public Singer(){}

    public Singer(String name){
        this.name = name;
    }

    public Singer(String name, String famous_music, String country, int age) {
        this.name = name;
        this.famous_music = famous_music;
        this.country = country;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getLeapYearCount(int year){
        return (2020 - year)/4 + " високосных годов встретил актёр високосных годов встретил актёр";
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", famous_music='" + famous_music + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    // Class

//    public static void methodOne(){
//
//    }
//
//    // int, double, float, short, byte, long
//    public static int method_one_with_return_int(){
//        return 0;
//    }
//
//    public static String method_one_with_return_string(){
//        return "text";
//    }
//
//
//    // Object
//
//    public void methodTwo(){
//
//    }
//
//
//    // int, double, float, short, byte, long
//    public int methodTwoWithReturn(){
//        return 0;
//    }
//
//    public String method_two_with_return_string(){
//        return "text";
//    }

//    public static void methodThree(int a, int b, int c){
//
//    }
//
//    public static void methodThree(int a, int b){
//
//    }
//
//    public static void methodThree(int a, int b, String text){
//
//    }


}