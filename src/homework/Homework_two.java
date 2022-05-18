package homework;

import java.util.HashMap;

public class Homework_two {
    public static void main(String[] args) {
        HashMap<String, Integer> staffAndSalary = new HashMap<>();

        staffAndSalary.put("Tomas",3000);
        staffAndSalary.put("James",1500);
        staffAndSalary.put("Ann",1500);

        int sum=0;
        for (Integer salary : staffAndSalary.values()){
            sum+= salary;
        }

        int averageSalary = sum/staffAndSalary.size();
        String resultText = String.format("Our average salary is %d", averageSalary);
        System.out.println(resultText);
    }
}
