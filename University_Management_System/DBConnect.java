import java.sql.*;

public class DBConnect {
    public Connection connection;
    public Statement s;

    public DBConnect() {

    String url = "jdbc:mysql://localhost:3306/university";
    String user = "university";
    String password = "admin";

     try{
            // Load the MySQL JDBC driver (Optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, user, password);

            // Creating Statement for executing mysql queries
            s = connection.createStatement();
     }
    catch(Exception e){
          e.printStackTrace();
        }

}
    public static void main(String[] args) {

    }
}

// TO Check JDBC Connectivity Program

//public class DBConnect {
//    public static void main(String[] args) {
//        // JDBC URL format: jdbc:mysql://hostname:port/databaseName
//        String url = "jdbc:mysql://localhost:3306/university";
//        String user = "university";
//        String password = "admin";
//
//        try {
//            // Load the MySQL JDBC driver (Optional for newer versions)
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Establish the connection
//            Connection connection = DriverManager.getConnection(url, user, password);
//
//            if (connection != null) {
//                System.out.println("JDBC Connection Successful!");
//            } else {
//                System.out.println("JDBC Connection Failed!");
//            }
//
//            // Close connection
//            connection.close();
//        } catch (ClassNotFoundException e) {
//            System.out.println("JDBC Driver Not Found!");
//            e.printStackTrace();
//        } catch (SQLException e) {
//            System.out.println("SQL Exception: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
