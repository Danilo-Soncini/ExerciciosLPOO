/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell-soncini
 */
public class DesvioPadraoLista {
       public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        boolean cont = true; 
        ArrayList<Double> numeros = new ArrayList<>();
        String entrada;
        while(cont){
            try {
                System.out.println("Informe um valor ou S para Sair:");
                entrada = scan.nextLine();
                if("S".equals(entrada)){
                   cont = false;
                }
                else{
                    numeros.add(Double.parseDouble(entrada));
                }
            }
            catch(Exception e){
                System.out.println("Valor invalido");
            }
        }
        DesvioPadrao desv = new DesvioPadrao();
        desv.setLista(numeros);
        System.out.println("O Desvio Padrão é : " + desv.calcular());
    }
}
