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
public class Gerente extends Funcionario{
    private Funcionario[] subordinados;

    public Gerente(Funcionario[] subordinados, String nome, String cpf, 
            String sexo, String telefone, double salario, String cargo) {
        super(nome, cpf, sexo, telefone, salario, cargo);
        this.subordinados = subordinados;
    }
    
    @Override
    public double getBonus(){
        double salario = this.getSalario();
        double bonus = (salario * 2) + (subordinados.length * 100);
        return bonus;
    }

    public Funcionario[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Funcionario[] subordinados) {
        this.subordinados = subordinados;
    }
       
}
