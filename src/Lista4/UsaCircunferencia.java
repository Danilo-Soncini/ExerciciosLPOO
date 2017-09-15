/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class UsaCircunferencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circunferencia circ = new Circunferencia();
        System.out.println("Digite o raio da circunferencia:");
        double raio = sc.nextInt();
        circ.setRaio(raio);
        System.out.println("O tamanho do comprimento é de " + circ.calcComprimento(circ.getRaio()));
        System.out.println("A area da circunferencia é de " + circ.calcArea(circ.getRaio()));
    }
}
