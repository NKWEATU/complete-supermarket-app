/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermaket;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class tables {
     public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
     try
     {
         //code to automatically create tables in mysql workbench database
      con=(Connection) ConnectionProvider.getCon();
      st = con.createStatement();
      st.executeUpdate("create table sellers(seller_Id int NOT NULL auto_increment,name varchar(50),password varchar(200),gender varchar(20), primary key(seller_Id))");
      st.executeUpdate("create table product(product_Id int NOT NULL,name varchar(200),category varchar(200),quantity varchar(50),price varchar(20), primary key(product_Id))");
      st.executeUpdate("create table category(cat_Id int NOT NULL,catName varchar(200),catDescription varchar(50),primary key(cat_Id))");
      st.executeUpdate("create table adminTable(admin_Id int NOT NULL,adminName varchar(200),adminPass varchar(50),primary key(admin_Id))");
      
      JOptionPane.showMessageDialog(null, "Table Created Successfully");
     
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
     }
     
         finally
     {
      try
     {
         con.close();
         st.close();
     
     }
     catch(Exception e)
     {}
     }
     
    
    }
    
}
