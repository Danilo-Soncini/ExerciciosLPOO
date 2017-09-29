/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

/**
 *
 * @author dell-soncini
 */
public class Professor extends Pessoa {
    private String titulo;

    public Professor(String Nome, int idade, String titulo) {
        super.setNome(Nome);
        super.setIdade(idade);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String imprime(){
         return "Profesor : " + this.titulo + " "+this.nome+" ("+this.idade + "anos)";
    }
}
