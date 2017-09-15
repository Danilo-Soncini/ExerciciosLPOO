/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.ArrayList;

/**
 *
 * @author dell-soncini
 */
public class DesvioPadrao {
    private ArrayList<Double> lista;
    private ArrayList<Double> listaDif;
    public void setLista(ArrayList<Double> lista){
        this.lista = lista;
    }
    
    public Double calcular(){
        Double resposta = 0.0;
        Double media = Media.calcular(lista);
        Double variancia = 0.0;
        
        for(Double f : this.lista){
            variancia += (f-media) * (f-media);
        }
        return Math.sqrt(variancia / (this.lista.size() -1));

    }
    
       
}
