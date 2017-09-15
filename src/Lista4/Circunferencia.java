/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

/**
 *
 * @author George
 */
public class Circunferencia {
    double raio;

    public Circunferencia() {
    }

    public double getRaio() {
        
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public static double calcComprimento(double raio) {
        double c;
        c = 2 * Math.PI * raio;
        return c;
    }
    
    public static double calcArea(double raio) {
        double a;
        a = Math.PI * (raio * raio);
        return a;
    }
}