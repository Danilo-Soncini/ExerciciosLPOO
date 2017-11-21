/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Moreno
 */
public class ExecutaMatrixThread {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        List<MatrixThread> mtlista = new ArrayList<MatrixThread>();
        int tamanho = 2000;
        int totalThreads = 10;
        int linhas = tamanho / totalThreads;
        int resto = tamanho % totalThreads;
        Matrix m1 = new Matrix(tamanho, tamanho);
        Matrix m2 = new Matrix(tamanho, tamanho);
        Matrix mresultado = new Matrix(tamanho, tamanho);
        for (int i = 0; i < totalThreads; i++) {
            int linhaFinal = ((i + 1) * linhas);
            int linhaInicial = (i * linhas);
            if (i == 0){
                linhaFinal += resto;
            } else {
                linhaFinal += resto;
                linhaInicial += resto;
            }
            System.out.println(linhaInicial);
            System.out.println(linhaFinal);
            MatrixThread mt = new MatrixThread(m1, m2, mresultado, linhaInicial, linhaFinal);
            mtlista.add(mt);
            mt.start();
        }
        for (int i = 0; i < totalThreads; i++) {
            try {
                mtlista.get(i).join();
            } catch (Exception e) {
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
