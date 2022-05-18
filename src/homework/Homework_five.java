package homework;

public class Homework_five {
    public static void main(String[] args) {
        Singer person_one = new Singer();
        person_one.name = "Lana del Rey";
        person_one.famous_music = "Born to die";
        person_one.country = "USA";
        person_one.age = 36;

//        person_one.showAllData();
//        System.out.println(person_one.getAge());
        System.out.println(person_one.getLeapYearCount(2022- person_one.age));
    }
}

class Singer{
    String name;
    String famous_music;
    String country;
    int age;

    public void showAllData(){
        System.out.println(name);
        System.out.println(famous_music);
        System.out.println(country);
        System.out.println(age);
    }

    public int getAge(){
        return age;
    }

    public String getLeapYearCount(int year){
        return (2020 - year)/4 + " високосных годов встретил актёр високосных годов встретил актёр";
    }
}
