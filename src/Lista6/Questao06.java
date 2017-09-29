/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista6;

/**
 *
 * @author Felipe Moreno
 */
public class Questao06 {

    private Integer l, a;

    public Questao06() throws Exception {
        this(0, 1);
    }

    public Questao06(int pl, int pa) throws Exception {
        System.out.print("A");
        this.setValores(pl, pa);
    }

    public void setValores(int pl, int pa) throws Exception {
        if (pl >= 0 && pa >= 0) {
            l = pl;
            a = pa;
        } else {
            throw new Exception("C");
        }
        System.out.print("T");
    }

    public static void main(String args[]) {
        try {
            Questao06 obj = new Questao06();
            Questao06 obj2 = new Questao06(-1, 3);
            Questao06 obj3 = new Questao06(2, 6);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.out.print("A");
        } finally {
            System.out.print("R");
        }
    }
}
