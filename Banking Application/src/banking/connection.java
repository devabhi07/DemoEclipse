package banking;


import java.sql.Connection;
import java.sql.DriverManager;
// Global connection Class
public class connection {
    static Connection con; // Global Connection Object
    public static Connection getConnection()
    {
        try {
            
//            
//            String mysqlJDBCDriver
//                = "com.mysql.cj.jdbc.Driver"; //jdbc driver
//            String url
//                = "jdbc:mysql://localhost:3306/bank"; //mysql url
//            String user = "root";        //mysql username
//            String pass = "root";  //mysql passcode
//             Class.forName(mysqlJDBCDriver);
//            con = DriverManager.getConnection(url, user,
//                                              pass);
//            
            
            
            
          //1. Load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. creating a connection
			String url="jdbc:mysql://localhost:3306/bank";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("suuuuuuuuuuuuu");
        }
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }
 
        return con;
    }
}
