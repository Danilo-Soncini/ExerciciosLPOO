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
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String sexo;
    private String telefone;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String cpf, String sexo, String telefone, 
            double salario, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public abstract double getBonus();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }   
    
    public String toString(){
        return getNome() + ";" + getSalario() + ";" + getCargo()+ ";" + getBonus();
    }
    
}
