/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista10;

/**
 *
 * @author dell-soncini
 */
public class Pilha<T> {
    private Elemento Topo = null;
    
    private class Elemento {
        private T valor;
        private Elemento next;

        public Elemento(T valor) {
            this.valor = valor;
        } 

        public T getValor() {
            return valor;
        }

        public void setNext(Elemento next) {
            this.next = next;
        }

        public Elemento getNext() {
            return next;
        }
    }
    
    public void empilha(T novo){
        if(Topo == null){
            Topo = new Elemento(novo);
        }
        else{
           Elemento novoE = new Elemento(novo);
           novoE.setNext(Topo);
           Topo = novoE;
        }
    }
    
    public Elemento desempilha(){
        Elemento e = null;
        if(Topo != null){
            e = Topo;
            Topo = e.getNext();
        }
        return e;
    }
    
    @Override
    public String toString(){
        Elemento e = Topo;
        String s = "[";
        String virgula = "";
        while(true){
            s += virgula + " " + e.getValor().toString() + " ";
            if(e.getNext() == null){
                break;
            }
            else {
                e = e.getNext();
            }
            virgula = ",";
        }
        s += "]";
        return s;  
    }
}
