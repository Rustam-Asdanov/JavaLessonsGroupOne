package classwork.jdbc_examples;

import java.sql.*;
import java.util.Scanner;

public class SomeExample {
    public static void main(String[] args) {
        // URL, username, password
        final String URL = "jdbc:mysql://localhost:3310/exercise";
        final String LOGIN = "root";
        final String PASSWORD = "11111";

        try {
            Connection conn = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            Statement statement = conn.createStatement();

            String query;

//            query = "insert into user_login value(null, 'ted', 'ted_222222');";
//            statement.executeUpdate(query);

//            query = "update user_login set username='james', password='123' where id=3;";
//            statement.executeUpdate(query);


            String getAllData = "select * from user_login";
            ResultSet allResult = statement.executeQuery(getAllData);
            while(allResult.next()){
                int column_1 = allResult.getInt("id"); // 4
                String column_2 = allResult.getString("username"); // logan_00
                String column_3 = allResult.getString("password"); // 12abc

                System.out.println(String.format("%d---%s---%s",column_1,column_2,column_3));
            }

//            switch (variable) {
//                case "yes" -> System.out.println(1);
//                case "add" ->{
//                    query = "insert into user_login value(null, 'ted', 'ted_222222');";
//                    statement.executeUpdate(query);
//                }
//                default -> System.out.println(0);
//            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
