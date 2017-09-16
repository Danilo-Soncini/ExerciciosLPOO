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
import java.util.Scanner;

/**
 *
 * @author George
 */
public class ExecutaMatrix {

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lines, column, i, j, d = 0, s = 0;

        System.out.println("Digite o tamanho da matriz");

        lines = sc.nextInt();
        column = lines;


        int[][] matrix = new int[lines][column];


        for (i = 0; i < lines; i++) {

            for (j = 0; j < column; j++) {

                System.out.println("Digite um numero para inserir na primeira matriz:");

                int number = sc.nextInt();

                matrix[i][j] = number;

            }

        }
        
        Matrix.setMatrix(matrix);

        System.out.println("A soma da diagonal principal eh " + Matrix.sumPrincipalDiagonal());
        System.out.println("A soma da diagonal secundaria eh " + Matrix.sumSecondaryDiagonal());

    }
}
