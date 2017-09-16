/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

/**
 *
 * @author Felipe Moreno
 */
public class ExecutaPessoaEPonto {
    public static void main(String args[]){
        // Pessoa
        Endereco endereco1 = new Endereco("83833038", "Rua Bernardo Wosniack", 
                "Sobrado B", "Pioneiros", "Fazenda Rio Grande", "Paraná", "Brasil", 812);
        Pessoa pessoa1 = new Pessoa("Felipe Morenao", 20, endereco1);
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        
        pessoa1.imprime();
        
        // Ponto3D
        Ponto3D ponto = new Ponto3D(0,2,2);
        Ponto3D ponto2 = new Ponto3D(-2,0,1);
        Ponto3D ponto3 = new Ponto3D(4,-8,-9);
        Ponto3D ponto4 = new Ponto3D(2,-3,-5);
        
        double distancia = ponto.calculaDistacia(ponto2);
        double distancia2 = ponto2.calculaDistancia2(5, -10, 4.2);
        
        System.out.println("\nDistancia 1: " + distancia + "\nDistancia 2: " + 
                distancia2 + "\n");
       
    }
}
