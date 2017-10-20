/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista8;

import java.util.Scanner;

/**
 *
 * @author dell-soncini
 */
public class ContatoExecutavel {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in,"ISO-8859-1");
            
        ContatoDAO cDAO = new ContatoDAO();
        Contato c = new Contato("FELIPE", "4199999999", "morenoSensual@vocemanja.xxx");
        cDAO.insert(c);
        sc.next();
        c.setNome("Felipe Moreno");
        cDAO.update(c);
        sc.next();
        cDAO.delete(c);
        
    }
}
