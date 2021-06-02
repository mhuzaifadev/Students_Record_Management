package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect_Main {

    public static Connection con;

    public static int  connects() {

        try {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String URL = "jdbc:mysql://192.168.10.11:3306/bonapapadb";

            //  Database credentials
          String USER = "root";
            String PASSWORD = "root";
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Established");
return 0;
        } catch (Exception ex) {
            

            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            
            return 1;
        }
    }
//    public static void main(String[] args) {
//        connects();
//    }
}
