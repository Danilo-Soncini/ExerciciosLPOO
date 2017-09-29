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
public class AuxiliarDeLimpeza extends Funcionario {

    public AuxiliarDeLimpeza(String nome, String cpf, String sexo, String telefone, double salario, String cargo) {
        super(nome, cpf, sexo, telefone, salario, cargo);
    }
    
    @Override
    public double getBonus(){
        double salario = this.getSalario();
        double bonus = (salario * 0.5);
        return bonus;
    }
    
}
