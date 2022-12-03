package week3;

import java.sql.*;

public class ConnectionTest {

    public static void main(String[] args) throws SQLException {

        String dbUrl = "jdbc:oracle:thin:@54.234.104.66:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from Employees");

        resultSet.next();  // this line will move my pointer to next line, which is 1st line of my table

        System.out.println(resultSet.getString("first_name"));
        System.out.println(resultSet.getString("last_name"));
        System.out.println(resultSet.getString(4));

    }




}
