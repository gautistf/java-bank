/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management.system;

import java.sql.*;



public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///project6","root","");
            
         
            s =c.createStatement();
        
        
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
