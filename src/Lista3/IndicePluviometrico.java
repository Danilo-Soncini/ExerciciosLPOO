/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import static java.util.Arrays.sort;

/**
 *
 * @author Felipe Moreno
 */
public class IndicePluviometrico {
    float media;
    float maxima;
    float minima;
    float[] sortedIndex;
    float[] index;
    String[] semana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
    "Quinta-feira", "Sexta-feira", "Sábado"};
    
    public IndicePluviometrico(float[] indice) {
        this.index = indice;
        this.sortedIndex = indice.clone();
        sort(sortedIndex);
    }
    
    public float getMedia(){
        this.media = 0.0f;
        for (int i = 0; i<7; i++){
            media = media + this.index[i];
        }
        media = (media / 7);
        return media;
    }
    
    public float getMaxima(){
        return this.sortedIndex[6];
    }
    
    public float getMinima(){
        return this.sortedIndex[0];
    }

    public String getDiaMinima(){
        int dia = 0;
        for (int i = 0; i < this.index.length; i++){
            if (this.index[i] == this.getMinima()){
                dia = i;
                break;
            }
        }
        return semana[dia];
    }
    
    public String getDiaMaxima(){
        int dia = 0;
        for (int i = 0; i < this.index.length; i++){
            if (this.index[i] == this.getMaxima()){
                dia = i;
                break;
            }
        }
        return semana[dia];
    }
}
