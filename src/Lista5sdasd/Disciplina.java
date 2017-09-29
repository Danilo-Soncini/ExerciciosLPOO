/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5sdasd;

import java.util.ArrayList;

/**
 *
 * @author dell-soncini
 */
public class Disciplina {
    private static ArrayList<Disciplina> diciplinas;
    
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private String nome;
    public Disciplina (String nome){
        this.nome = nome;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor prof) {
        this.professor = prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void addAluno(Aluno anluno){
        alunos.add(anluno);
    }
    public String imprime() {
        String retorno =  "Disciplina : " + this.getNome()+ "\n";
        if(this.getProfessor() != null){
            retorno +=  this.getProfessor().imprime() + "\n";
        }
        else {
            retorno +=  "professor : TBD \n";
        }
        retorno +=  "Alunos : ";
        String separator = "";
        for(int i=0; i< alunos.size(); i++ ){
            retorno +=   separator +alunos.get(i).getNome() ;
            separator = ", ";
        }
         retorno += "\n";
        return retorno;
    }
}
