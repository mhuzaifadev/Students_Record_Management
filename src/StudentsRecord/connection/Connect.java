package StudentsRecord.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {

    public static Connection con;
 
    public static void connects() {
        try {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String URL = "jdbc:mysql://localhost:3306/db_student_rec";

            //  Database credentials
            String USER = "root";
            String PASSWORD = "";
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Established");

        } catch (Exception ex) {
              Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 

//    public static void main(String[] args) {
//        connects();
//    }
}
