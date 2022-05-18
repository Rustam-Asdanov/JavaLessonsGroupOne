package homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;

public class Homework_one {
    public static void main(String[] args) {

        // human_1 - name, Birthday

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Human> humanHashMap = new HashMap<>();

        Human human_one = new Human("James", "20-03-1995");

        humanHashMap.put("human_1", human_one);

        Human human_two = new Human("Smith", "29-02-2020");

        humanHashMap.put("human_2", human_two);

//        System.out.println(humanHashMap.keySet());

        System.out.println(humanHashMap.get("human_2"));

        boolean is_on = true;
        while (is_on) {

            System.out.print("Read, write, find or exit:\t");
            String user_choice = "";
            try {
                user_choice = reader.readLine();
                user_choice = user_choice.toLowerCase(Locale.ROOT);
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (user_choice.equals("exit")) {
                is_on = false;
            }

            if (user_choice.equals("read")) {
                int counter = 1;
                for (Human human : humanHashMap.values()) {
                    System.out.println(counter + " : " + human);
                    counter++;
                }
            }

            if (user_choice.equals("write")) {
                try {
                    System.out.print("Human name: ");

                    String name = reader.readLine();

                    System.out.print("Human birthday: ");
                    String birthday = reader.readLine();

                    Human human = new Human(name, birthday);
                    int i = humanHashMap.size() + 1;
                    String key = "human_" + i;
                    humanHashMap.put(key, human);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (user_choice.equals("find")) {
                System.out.print("Which human (input id): ");
                try {
                    int id = Integer.parseInt(reader.readLine());
                    String key = "human_" + id;
                    System.out.println(humanHashMap.get(key));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.println(humanHashMap);

    }
}

class Human {
    private String name;
    private String birthday;

    public Human(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name= " + name +
                ", birthday= " + birthday;
    }
}

// human_1 = .....
// human_2 = ....
// human