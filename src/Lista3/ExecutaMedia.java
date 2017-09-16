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
public class ExecutaMedia {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        boolean cont = true; 
        ArrayList<Double> numeros = new ArrayList<>();
        String entrada;
        while(cont){
            try {
                System.out.println("Informe um valor:");
                entrada = scan.nextLine();
                if("S".equals(entrada)){
                   cont = false;
                }
                else{
                    numeros.add(Double.parseDouble(entrada));
                    if(numeros.size() == 20){
                        cont = false; 
                    }
                }
            }
            catch(Exception e){
                System.out.println("Valor invalido");
            }
        }
        
        System.out.println("A média é : " + Media.calcular(numeros));
    }
}
