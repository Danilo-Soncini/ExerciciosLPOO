/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista10;

/**
 *
 * @author George
 */
public class ExecutarContar {
    public static void main(String[] args) {
        Contar c = new Contar(10);
        Contar c2 = new Contar(20);
        c.start();
        c2.start();
    }
}
