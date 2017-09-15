/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

/**
 *
 * @author George
 */
public class Matrix {

    static int[][] matrix;

    public static void setMatrix(int[][] matrix) {
        Matrix.matrix = matrix;
    }

    public static int sumPrincipalDiagonal() {
        int size = Matrix.matrix.length;
        int d = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    d += matrix[i][j];
                }
            }
        }
        return d;
    }
    
    public static int sumSecondaryDiagonal() {
        int size = Matrix.matrix.length;
        int s = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if (i + j == size - 1) {
                    s += matrix[i][j];
                }
            }
        }
        return s;
    }
}
