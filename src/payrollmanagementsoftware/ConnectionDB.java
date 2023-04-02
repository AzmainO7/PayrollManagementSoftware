package payrollmanagementsoftware;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

    Connection connection = null;

    public static Connection conDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PayrollManagementStudio;selectMethod=cursor", "sa", "123456");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-83JQO3M\\SQLEXPRESS;databaseName=PayrollManagementStudio;integratedSecurity=true");

//            System.out.println("DATABASE NAME IS: " + con.getMetaData().getDatabaseProductName());
//            System.out.println("DATABASE NAME IS: " + con.getMetaData().getDatabaseProductVersion());
//            System.out.println("DATABASE NAME IS: " + con.getMetaData().getDriverName());
            return con;
        } catch (Exception ex) {
            System.err.println("ConnectionDB : "+ex.getMessage());
            return null;
        }
    }
     
}