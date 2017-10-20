/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author dell-soncini
 */
public class ConnectionFactory {
    public Connection getConnection () throws Exception{
        
        Connection con;
        try{
            Properties prop = new Properties();
            prop.load(getClass().getResourceAsStream("/Aula/db.properties"));
            String url = "jdbc:mysql://localhost/aula";
            String user = prop.getProperty("db.user");
            String senha = prop.getProperty("db.senha");
            
           con = DriverManager.getConnection(url,user,senha);
           return con;
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        /*catch(Exception e) {
            throw new RuntimeException("Não foi possivel conectar ao Banco de dados"); 
        }*/
    }
}
