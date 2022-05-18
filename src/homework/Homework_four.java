package homework;

public class Homework_four {
    public static void main(String[] args) {

        //System.out.println(player_1.name);    --- from Object -- error
//        System.out.println(FootballPlayer.club);

//        FootballPlayer player_1 = new FootballPlayer();

//        System.out.println(player_1.name);    --- from Object  -- success

//        player_1.name = "Lewandowski";
//        player_1.position = "CF";
//        player_1.age = 30;
//
//        player_1.getData();

//        System.out.println(player_1.name);   --- from Object  --success
//        System.out.println(FootballPlayer.club);

//        FootballPlayer player_2 = new FootballPlayer();
//
//        player_2.name = "Kimmich";
//        player_2.position = "CMF";
//        player_2.age = 26;
//
//        player_2.getData();
//
//        FootballPlayer player_3 = new FootballPlayer();
//
//        player_3.getData();

//        System.out.println(player_1.name);    --- from Object  --success
//        System.out.println(FootballPlayer.club);

        FootballPlayer player_1 = new FootballPlayer();
        player_1.name = "Lewandowski";
        player_1.position = "CF";
        player_1.age = 30;

        int birthday = 2022 - player_1.getAge();
        String beautiful_text = "position: " + player_1.getPosition();

        System.out.println(birthday);
        System.out.println(beautiful_text);
    }
}

class FootballPlayer{
    static String club = "Bayern Munich";
    String name = "Neuer";
    String position;
    int age;

    public void getData(){
        System.out.println("-----  CLUB INFO -----");
        System.out.println(club);
        System.out.println(name);
        System.out.println(position);
        System.out.println(age);

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPosition() {
        return position;
    }
}

/**
 *
 *  int age
 *  String beautiful_text = "name: "
 *
 *  sout "name: " + getName()
 *  age
 *
 *
 *
 *
 *  class Film
 *      name
 *      actor
 *      year
 *
 *      showData()
 *      getActor()
 *
 *
 *
 */











