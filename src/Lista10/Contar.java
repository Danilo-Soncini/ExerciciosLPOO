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
public class Contar extends Thread{
    int limite;
    
    public Contar(int limite){
        this.limite = limite;
    }
    
    public void run(){
        for(int i = 0; i <= limite; i++){
            System.out.println(i+" - "+getName());
            try{
                sleep(1000);
            }catch(Exception e){
                
            }
        }
    }
}
