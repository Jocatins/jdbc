import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/sphinx"; // 连接
        String username = "root";
        String password = "root";
        String query = "insert into students values(null, 'Tom', 21);";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        // For executing any SELECT statement use executeQuery() method

        // ResultSet resultSet = statement.executeQuery(query);

        // while (resultSet.next()) {

        // String userData = resultSet.getInt(1) + " : " + resultSet.getString(2);

        // System.out.println(userData);
        // }

        // For inserting data

        int count = statement.executeUpdate(query);

        System.out.println(count + " record inserted!");

        // **** Always close the statement and connections

        statement.close();
        connection.close();
    }
}
