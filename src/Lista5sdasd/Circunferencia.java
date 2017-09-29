/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5sdasd;

/**
 *
 * @author George
 */
public class Circunferencia implements Superficie{
    double raio;
    
    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        double r;
        r = Math.PI * (raio * raio);
        return r;
    }
    
}

