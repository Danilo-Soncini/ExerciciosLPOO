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
abstract class Navio {

    protected static int i;
    private int j;
    abstract void f();
    final void q() {};
    //final void h() {};//LINHA 6 
}
    
    final class Fragata extends Navio {

        int m;
        void f() {}
        void h() {}
        // void k() {i++;} //LINHA 12 
        // void l() {j++;} //LINHA 13 
        // Fragata(int n) {m=n;} //LINHA 14
        public static void main(String args[]){ 
            Navio mc = new Fragata();
        }
    }
