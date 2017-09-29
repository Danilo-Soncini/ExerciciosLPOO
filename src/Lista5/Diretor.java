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
public class Diretor extends Funcionario{
    private String[] departamentos;

    public Diretor(String[] departamentos, String nome, String cpf, String sexo,
            String telefone, double salario, String cargo) {
        super(nome, cpf, sexo, telefone, salario, cargo);
        this.departamentos = departamentos;
    }
    
    @Override
    public double getBonus(){
        double salario = this.getSalario();
        double bonus = (salario * 4) + (departamentos.length * 3000);
        return bonus;
    }

    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String[] departamentos) {
        this.departamentos = departamentos;
    }
        
}
