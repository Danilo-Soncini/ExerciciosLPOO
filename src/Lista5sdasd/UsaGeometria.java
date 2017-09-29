/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5sdasd;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class UsaGeometria {

    public static void main(String[] args) {
        Superficie circ = new Circunferencia(2) {};
        Superficie quad = new Quadrado(2) {};
        System.out.println("A area da circunferencia é de " + circ.area());
        System.out.println("A area do quadrado é de " + quad.area());
    }
}
