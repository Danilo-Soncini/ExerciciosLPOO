/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Felipe Moreno
 */
public class ExecutaIndicePluviometrico {
    
    public static void main(String args[]){
        float[] teste = new float[7];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite os índices correspondentes a cada dia da semana:");
        System.out.println("Domingo:");
        teste[0] = input.nextFloat();
        System.out.println("Segunda-feira:");
        teste[1] = input.nextFloat();
        System.out.println("Terça-feira:");
        teste[2] = input.nextFloat();
        System.out.println("Quarta-feira:");
        teste[3] = input.nextFloat();
        System.out.println("Quinta-feita:");
        teste[4] = input.nextFloat();
        System.out.println("Sexta-feira:");
        teste[5] = input.nextFloat();
        System.out.println("Sábado:");
        teste[6] = input.nextFloat();
        
        IndicePluviometrico ind = new IndicePluviometrico(teste);
        
        float media = ind.getMedia();
        float maxima = ind.getMaxima();
        float minima = ind.getMinima();
        String diaMaxima = ind.getDiaMaxima();
        String diaMinima = ind.getDiaMinima();
 
        System.out.println("A temperatura media foi: " + media);
        System.out.println("A temperatura máxima foi: " + maxima + " Dia: " + diaMaxima);  
        System.out.println("A temperatura mínima foi: " + minima + " Dia: " + diaMinima);
    }
}

