
package sms;

import java.sql.DriverManager;


public class Connection {
    
    static final String C_URL = "jdbc:mysql://localhost:3306/sms";
    static final String USER = "root";
    static final String PASS = "rootpass";
    public static java.sql.Connection C()
    {
        java.sql.Connection sm = null;
        try
        {
            //register jdbc driver ,not required for newer versions of jdk
           // Class.forName("com.mysql.jdbc.Driver");
            sm = DriverManager.getConnection(C_URL,USER,PASS);
            return sm;
        }catch(Exception ex)
        {
            System.out.println("There were errors when connecting to db.");
            return null;
        }
    }
}
