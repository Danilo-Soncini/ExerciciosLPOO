/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

/**
 *
 * @author Felipe Moreno
 */
public class Ponto3D {
    double x;
    double y;
    double z;
    String cor;
    String intensidade;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double calculaDistacia(Ponto3D p){
        double distancia = Math.sqrt(((this.x - p.x)*(this.x - p.x))
                + ((this.y - p.y)*(this.y - p.y))
                + ((this.z - p.z)*(this.z - p.z)));
        return distancia;
    }
    
    public double calculaDistancia2(double x, double y, double z){
        double distancia = Math.sqrt(((this.x - x)*(this.x - x))
                + ((this.y - y)*(this.y - y))
                + ((this.z - z)*(this.z - z)));
        return distancia;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }
    
    
}
