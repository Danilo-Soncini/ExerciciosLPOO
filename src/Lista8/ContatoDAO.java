/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dell-soncini
 */
public class ContatoDAO {
    
    private String SelectBYid = "SELECT * FROM contato WHERE idcontato = ?";
    private String delete = "DELETE FROM contato WHERE idcontato = ?";
    private String upadate = "UPDATE contato set nome = ?, telefone = ? , email = ? WHERE idcontato=?";
    private String insert = "INSERT INTO contato (nome, telefone , email) VALUES (?,?,?)";
    private Connection con = null;
    
    
    public Contato getContatoByID(int contatoID){
        Contato contato = new Contato();
        try{
            con = new Aula.ConnectionFactory().getConnection();
            PreparedStatement stmt = null;
            stmt = con.prepareStatement(SelectBYid);
            stmt.setInt(1,contatoID);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setId(rs.getInt("id"));
            }
        }
        catch(Exception e) {
           e.printStackTrace();
        }
        finally {
            try{
            con.close();
            }catch(Exception e){}
        }
        return contato;
    }
    
    
    public void update(Contato contato){
        
        try{
            con = new Aula.ConnectionFactory().getConnection();
            PreparedStatement stmt = null;
            stmt = con.prepareStatement(upadate);
            stmt.setInt(4,contato.getId());
            stmt.setString(1,contato.getNome());
            stmt.setString(2,contato.getTelefone());
            stmt.setString(3,contato.getEmail());
            stmt.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(Contato contato){
        
        try{
            con = new Aula.ConnectionFactory().getConnection();
            PreparedStatement stmt = null;
            stmt = con.prepareStatement(delete);
            stmt.setInt(1,contato.getId());
            stmt.executeUpdate();
        }
        catch(Exception e) {
        
        }
    }
    public void insert(Contato contato){
        
        try{
            con = new Aula.ConnectionFactory().getConnection();
            PreparedStatement stmt = null;
            stmt = con.prepareStatement(insert, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1,contato.getNome());
            stmt.setString(2,contato.getTelefone());
            stmt.setString(3,contato.getEmail());
            
            stmt.executeUpdate();
            ResultSet rs =stmt.getGeneratedKeys();
            rs.next();
            contato.setId(rs.getInt(1));
        }
        catch(Exception e) {
         e.printStackTrace();
        }
    }
    
}
