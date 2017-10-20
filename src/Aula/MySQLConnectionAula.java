/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dell-soncini
 */
public class MySQLConnectionAula {
    
    
    public static void main (String args[]){
        ResultSet rs;
        PreparedStatement stmt;
        Connection con;
        try{
            con = new ConnectionFactory().getConnection();
            stmt = con.prepareStatement("select * FROM user WHERE SHcode=?");
            stmt.setString(1, "SH-967062");
            rs = stmt.executeQuery();
            rs.next();
            int id = rs.getInt("Id");
            System.out.println(id );
            
        }
        catch (Exception e) {
            System.out.println("erro: " + e);
        }
        
    }
    
}
