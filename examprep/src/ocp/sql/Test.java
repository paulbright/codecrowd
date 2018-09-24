/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.sql;

/**
 *
 * @author paulbright
 */
/*
EMPLOYEE (ID integer, FIRSTNAME varchar(100), LASTNAME varchar(100), SALARY real, PRIMARY KEY (ID)) 

101 John Smith 12000
102 Sean Smith 15000
103 Regina Williams 15500
104 Natasha George 14600
*/
import java.sql.*;

public class Test {
    public static void main(String[] args) throws SQLException {
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        String url = "jdbc:mysql://localhost:3306/stb";
        String user = "root";
        String password = "123456";
        String query = "Select * FROM EMPLOYEE ORDER BY ID";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ) {
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(rs);
           
            rs.relative(-3);
            rs.relative(1);
            System.out.println(rs.getInt(1));
        }
    }
}
