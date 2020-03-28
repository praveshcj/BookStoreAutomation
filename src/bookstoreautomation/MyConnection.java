/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoreautomation;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author praveshj
 */
public class MyConnection {
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bas","root","");
            if(con!=null)System.out.print("Connection Succesful\n");
            else System.out.println("Connection Failed");
        } catch(Exception ae)
        {
            System.out.printf(ae.getMessage());
        }
        return con;
    }
}
