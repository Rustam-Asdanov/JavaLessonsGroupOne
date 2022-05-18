package classwork.other;

import java.util.*;

public class ExampleNine {
    public static void main(String[] args) {

        // List
//        List<Integer> numList = new ArrayList<>();
//        List<String> nameList = new ArrayList<>();
//        List<Animal> animalList = new ArrayList<>();
//
//        nameList.add("james");
//        numList.add(10);
//        Animal animal_one = new Animal();
//        animalList.add(animal_one);
//
//
//        System.out.println(nameList.get(0));
//
//        // Set
//        Set<String> nameSet = new HashSet<>();
//        nameSet.add("Ted");
//        System.out.println(nameSet.contains("John"));

//        Map<String, String> city_country = new HashMap<>();
//        city_country.put("Baku", "Azerbaijan");
//        city_country.put("London", "UK");
//
//        String city = "Baku";
//
//        if(city_country.containsKey(city)){
//            city += "_"+1;
//        }
//
//        city_country.put(city, "Hello");
//
//        System.out.println(city_country);

//        for(String s : city_country.keySet()){
//            if (s.startsWith("Baku")){
//                System.out.println(city_country.get(s));
//            }
//        }

//        Map<String, String> name_number = new HashMap<>();
//        int counter = 0;
//        name_number.put("John", "1234");
//
//        String name = "John";
//
//        if(name_number.containsKey(name)){
//            counter++;
//            name += "_"+counter;
//        }
//
//        name_number.put(name, "345");
//
//
//        name = "John";
//
//        if(name_number.containsKey(name)){
//            counter++;
//            name += "_"+counter;
//        }
//
//        name_number.put(name, "345678");
//
//        name = "Smith";
//
//        if(name_number.containsKey(name)){
//            counter++;
//            name += "_"+counter;
//        }
//
//        name_number.put(name, "345678");
//
//        name = "Smith";
//
//        if(name_number.containsKey(name)){
//            counter++;
//            name += "_"+counter;
//        }
//
//        name_number.put(name, "345678");
//
//        System.out.println(name_number);
//
//        System.out.println("Searching ......");
//
//        String search = "Smith";
//
//        for(String names : name_number.keySet()){
//            if(names.startsWith(search)){
//                System.out.println(names + " : " + name_number.get(names));
//            }
//        }

        int[] number = {56,32,1,-1,33,11};


        for(int i=0; i<number.length;i++){

        }

    }

    public static void swap(int[] array, int a, int b){
        if(a==b){
            return;
        }

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
