import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBMSExample {
    //z- Why does the class name need to match the file name? 
    //z- If I run this what exactly is the outcome? 
    public static void main(String[] args) {
       //Thank god for auto rendering the public static void main 
       //Database credentials
        //z - what are these credentials connecting to exactly?
       String url = "jdbc:mysql://localhost:3306/my_database";
       String username = "my_username";
       String password = "my_password";

       try{
        //Establish a connection 
        //z - where am I connecting to? 
        Connection connection = DriverManager.getConnection(url, username, password);

        //Perform database operations here
        //z - What are these operations? 


        // Close the connection 
        connection.close();
       } catch (SQLException e) {
        e.printStackTrace();
       }

       //Result: No suitable driver found for jdbc:mysql://localhost3306/my_database
       //z- what exactly does this mean? 

       //z- It means that the JDBC driver for MySQL is not found or not include in the project. 
       //z- I need to create the JDBC driver to the Java Project in VSC

    }


}
