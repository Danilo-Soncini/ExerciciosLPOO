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
public class Media {
        public static Double calcular (ArrayList<Double> numeros){
            Double resposta = 0.0;
            
            for(Double f : numeros){
                resposta += f; 
            }
            resposta = resposta / numeros.size();
            return resposta;
        }
}
