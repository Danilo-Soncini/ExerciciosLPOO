/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

/**
 *
 * @author George
 */
public class Quadrado implements Superficie{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        double r;
        r = lado * lado;
        return r;
    }
   
    
}
