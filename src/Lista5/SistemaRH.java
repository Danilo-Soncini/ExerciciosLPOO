/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

/**
 *
 * @author Felipe Moreno
 */
public class SistemaRH {
    
    public static void main (String args[]){
        Analista analista1 = new Analista("João", "09558475165", "M", "996587474", 1500.00, "Analista");
        Programador programador1 = new Programador("José", "58485214266", "M", "996552338", 1200.00, "Programador");
        AuxiliarDeLimpeza auxiliar1 = new AuxiliarDeLimpeza("Maria", "02554222685", "F", "985554262", 1000.00, "Auxiliar de Limpeza");
        
        Funcionario[] subordinados = new Funcionario[3];
        subordinados[0] = analista1;
        subordinados[1] = programador1;
        subordinados[2] = auxiliar1;
        String[] departamentos = new String[2];
        departamentos[0] = "Marketing";
        departamentos[1] = "Desenvolvimento";
        
        Gerente gerente1 = new Gerente(subordinados, "Marcos", "0855475514", "M", "995465587", 5000.00, "Gerente");
        Diretor diretor1 = new Diretor(departamentos, "Joana", "02505463201", "F", "985574566", 3500.00, "Diretor");
        
        Funcionario[] funcionariosEmpresa = new Funcionario[5];
        funcionariosEmpresa[0] = gerente1;
        funcionariosEmpresa[1] = diretor1;
        funcionariosEmpresa[2] = analista1;
        funcionariosEmpresa[3] = programador1;
        funcionariosEmpresa[4] = auxiliar1;
       
        String relatorio = imprimeRelatorio(funcionariosEmpresa);
        System.out.println(relatorio);
    }
    
    public static String imprimeRelatorio(Funcionario[] listaFuncionarios){
        String relatorio = "Nome;Salário;Cargo;Bonus\n";
        
        for(Funcionario f:listaFuncionarios){
            if(f instanceof Funcionario){
                Funcionario a = (Funcionario)f;
            }
            relatorio += f.toString()+"\n";
        }
        return relatorio;
    }
 
}
