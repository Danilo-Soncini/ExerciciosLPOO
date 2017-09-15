/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * @author dell-soncini
 */
public class SistemaAcademico {
    
    public static Aluno[] alunos;
    private static Scanner scan = new Scanner(System.in);
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos Alunos vamos cadastrar?");
        int totalAlunos = scan.nextInt();
        alunos = new Aluno[totalAlunos];
        SistemaAcademico.menu();
    }
    
    public static void menu(){
        
        System.out.println("Selecione uma ação:");
        System.out.println("1 – Cadastrar Aluno");
        System.out.println("2 – Excluir aluno por nome");
        System.out.println("3 – Listar Alunos");
        System.out.println("4 – Matricular Aluno em Disciplina");
        System.out.println("5 – Cancelar Matrícula");
        System.out.println("6 – Imprimir lista Alunos e Disciplinas Matriculadas.");
        String nome;
        int acao = scan.nextInt();
        switch(acao){
            case 1:
                System.out.println("Informe o Nome:");
                nome = scan.next();
                System.out.println("Informe o Matricula:");
                String matricula = scan.next();
                System.out.println("Informe o Curso:");
                String curso = scan.next();
                System.out.println("Informe o Periodo:");
                int periodo = scan.nextInt();
                System.out.println("Informe o idade:");
                int idade = scan.nextInt();            
                Aluno a = new Aluno(nome,matricula,curso,periodo,idade,0);
                SistemaAcademico.cadastrarAluno(a);
                break;
            case 2: 
                System.out.println("informe o nome do Aluno");
                nome = scan.next();
                excluirAlunoPorNome(nome);
                break;
            case 3:
                listarAlunos();
            case 4:  
                System.out.println("Qual Nome do Aluno que você deseja Matricular?");
                nome = scan.next();
                for(int i = 0; i< alunos.length; i++){
                    if(alunos[i] != null){
                        if(alunos[i].getNome().equals(nome))
                        {
                            

                            if(alunos[i].getQtdDisciplinas() == 0){
                               System.out.println("Informe Quantas Materias o " + alunos[i].getNome() + " ira Cursar" );
                               alunos[i].setQtdDisciplinas(scan.nextInt());
                            }
                            System.out.println("Qual a Matéria?");
                            String disciplina = scan.next();
                            System.out.println(matricularAlunoEmDisciplina(alunos[i],disciplina));
                        }
                    }
                }
                break;
            case 5:
                System.out.println("Qual Nome do Aluno que você deseja Cancelar a Matricula?");
                String nomeAlunoExcluir = scan.next();
                for(int i = 0; i< alunos.length; i++){
                    if(alunos[i] != null){
                        if(alunos[i].getNome().equals(nomeAlunoExcluir))
                        {   
                            System.out.println("Qual a Matéria?");
                            String disciplina = scan.next();
                            System.out.println(cancelarMatricula(alunos[i],disciplina));
                        }
                    }
                }
                 break;
            case 6:
                System.out.println(imprimirListaDeAlunoseDisciplinas());
                break;
            default:
                System.out.println("Ação Inválida");
        }
        SistemaAcademico.menu();
    }
    
    
    public static void cadastrarAluno(Aluno aluno){
         for(int i = 0; i< alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }
        System.out.println("Aluno inserido com sucesso");
    }
    
    public static void excluirAlunoPorNome(String nomeAluno){
         for(int i = 0; i< alunos.length; i++){
            if(alunos[i] != null){
                if(alunos[i].getNome().equals(nomeAluno))
                {
                    alunos[i] = null;
                }
            }
        }
    }
    
    public static Aluno[] listarAlunos(){
        for(int i = 0; i< alunos.length; i++){
            if(alunos[i] != null){
                System.out.println(i + " - "+ alunos[i].getNome());
            }
        }
        return alunos;
    }
    
    public static String matricularAlunoEmDisciplina(Aluno aluno, String disciplina){
        return aluno.fazMatricula(disciplina);
    }
    
    public static String cancelarMatricula(Aluno aluno, String disciplina){
        return aluno.cancelaMatricula(disciplina);
    }         
    
    public static String imprimirListaDeAlunoseDisciplinas (){
        String retorno = "";
     
        for(int i = 0; i< alunos.length; i++){
            if(alunos[i] != null){
               retorno += alunos[i].imprime() +"\n\n";
            }
        }
        
        return retorno;
    } 
}
