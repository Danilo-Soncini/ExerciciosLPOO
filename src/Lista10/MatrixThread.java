/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista10;

/**
 *
 * @author Felipe Moreno
 */
public class MatrixThread extends Thread{
    Matrix a1;
    Matrix a2;
    Matrix resultado;
    int linhaInicial;
    int linhaFinal;

    public MatrixThread(Matrix a1, Matrix a2, Matrix resultado, int linhaInicial, int linhaFinal) {
        this.a1 = a1;
        this.a2 = a2;
        this.resultado = resultado;
        this.linhaInicial = linhaInicial;
        this.linhaFinal = linhaFinal;
    }
    
    public void run(){
        for (int i = linhaInicial; i < linhaFinal; i++) {
            for (int j = 0; j < a2.getColuna(); j++) {
                int num = 0;
                for (int k = 0; k < a1.getColuna(); k++) {
                    num += a1.getMatrix()[i][k] * a2.getMatrix()[k][j];
                }
                resultado.getMatrix()[i][j] = num;
            }
        }
    }
    
}
