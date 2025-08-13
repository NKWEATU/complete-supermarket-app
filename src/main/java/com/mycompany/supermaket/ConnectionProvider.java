/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermaket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
  Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //use this line of code for mysql in xamp "jdbc:mysql://127.0.0.1:3306/user_registeration_database","root",""
                                
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","******");//for mysql workbench
            
        }catch (ClassNotFoundException | SQLException e ) {
        System.out.println(e);
        }
        
        return con;
    
  }
    
}
