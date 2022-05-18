package classwork.jdbc_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExampleOne {
    public static void main(String[] args) {

        /**
         * jdbc - package
         * mysql - database language
         * localhost:port_number
         * database_name(use `database_name`)
         */
        final String URL = "jdbc:mysql://localhost:3310/exercise";
        final String LOGIN = "root";
        final String PASSWORD = "11111";

        try {
            Connection connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
            Statement statement = connection.createStatement();

            statement.executeUpdate("insert into `country_city` value(null,'England', 'London');");
            System.out.println("Success");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// создать таблицу машин -- id brand model cost
// добавить 3 данные через java

// JDBC

// J -- Java
// DB -- DataBase
// C -- Connectivity

// SQL
//      MySQL, PostgreSQL, SQLLite

