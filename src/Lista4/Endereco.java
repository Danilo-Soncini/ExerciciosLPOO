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
public class Endereco {
    String CEP;
    String logradouro;
    String complemento;
    String bairro;
    String cidade;
    String estado;
    String pais;
    int numero;

    public Endereco(String CEP, String logradouro, String complemento, String bairro, String cidade, String estado, String pais, int numero) {
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numero = numero;
    }
    
    public String getEndereco(){
        return this.logradouro + " " + this.numero + ", " + this.complemento + 
                ", " + this.bairro + ", " + this.cidade + " - " + this.estado + 
                " / " + this.pais + " (" + this.CEP + ").";
    }
}
