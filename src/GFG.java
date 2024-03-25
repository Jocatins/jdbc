import com.mysql.jdbc.Driver;
import java.sql.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        // Step1. Load and register the Driver
        Driver driver = new Driver(); // Creating driver object for MySQLDB

        DriverManager.registerDriver(driver);
        // System.out.println("Driver registered successfully");

        // Step2: Establish the connection b/w java and Database
        String url = "jdbc:mysql://localhost:3306/sphinx"; // 连接
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a Statement Object
        Statement statement = connection.createStatement();

        // Sending and execute the Query
        String sqlSelectQuery = "select * from students";
        ResultSet resultSet = statement.executeQuery(sqlSelectQuery);

        // Process the result from ResultSet
        while (resultSet.next()) {

            String userData = resultSet.getInt(1) + " : " + resultSet.getString(2);

            System.out.println(userData);
        }

        // Close the Connection
        statement.close();
        connection.close();

    }

}
