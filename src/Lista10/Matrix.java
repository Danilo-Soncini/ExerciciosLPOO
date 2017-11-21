/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista10;

/**
 *
 * @author George
 */
public class Matrix {

    int num;
    int linha;
    int coluna;
    int matrix[][];

    public Matrix(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        matrix = new int[linha][coluna];
        preencher();
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void preencher() {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrix[i][j] = 2;//(int) (Math.random() * 1000);
            }
        }
    }

    public int[][] multiplicar(Matrix m) {
        int matrix2[][] = m.getMatrix();
        int lin = getLinha();
        int col = m.getColuna();
        int resultado[][] = new int[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                int num = 0;
                for (int k = 0; k < getColuna(); k++) {
                    num += matrix[i][k] * matrix2[k][j];
                }
                resultado[i][j] = num;
                        
            }
        }
        return resultado;
    }
}
