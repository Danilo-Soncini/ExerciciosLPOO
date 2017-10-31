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
public class ExecutaMatrix {

    public static void main(String[] args) {
        int t = 2000;
        long t1 = System.currentTimeMillis();
        Matrix m = new Matrix(t, t);
        Matrix m2 = new Matrix(t, t);
        int x[][] = m.multiplicar(m2);
        long t2 = System.currentTimeMillis();
//        for (int i = 0; i < 5; i++) {;;
//            for (int j = 0; j < 5; j++) {
//                System.out.print(x[i][j]+"\t");
//            }
//            System.out.println("");
//        }
        
        System.out.println(t2-t1);
    }
}
