
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect{


     Connection conn=null; 
   
   public static Connection connecrDb()
   {
      try{
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:G:\\NetBeansProjects\\Banking_Management_System\\bank.sqlite");
         return conn;
      } 
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,e);
      }
      return null;
   } 

}