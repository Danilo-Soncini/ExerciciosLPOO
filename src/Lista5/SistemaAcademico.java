package Lista5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell-soncini
 */
public class SistemaAcademico {
    public static Aluno[] alunos;
    public static Professor[] professores;
    public static Disciplina[] disciplinas;
    private static Scanner scan = new Scanner(System.in);
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos Alunos vamos cadastrar?");
        int totalAlunos = scan.nextInt();
        System.out.println("Quantos Professores vamos cadastrar?");
        int totalProfessores = scan.nextInt();
        System.out.println("Quantas Diciplinas vamos cadastrar?");
        int totalDisciplinas = scan.nextInt();
        
        disciplinas = new Disciplina[totalDisciplinas];
        alunos = new Aluno[totalAlunos];
        professores = new Professor[totalProfessores];
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
        System.out.println("7 – Cadastrar Professor");
        System.out.println("8 – Listar Professores");
        System.out.println("9 – Cadastrar Disciplinas");
        System.out.println("10 – Listar Disciplinas");
        System.out.println("11 – Vincular Professor a Disciplina");
        System.out.println("12 – Vincular Aluno a Disciplina");
        
        String nome;
        int idade;
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
                idade = scan.nextInt();            
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
            case 7:
                System.out.println("Informe o Nome:");
                nome = scan.next();
                System.out.println("Informe a idade:");
                idade = scan.nextInt();
                System.out.println("Informe o titulo:");
                String titulo = scan.next();
                Professor p = new Professor(nome,idade,titulo);       
                cadastrarProfessor(p);
                break;
            case 8:
                imprimeProfessores();
                break;
            case 9:
                System.out.println("Informe o Nome:");
                nome = scan.next();
                Disciplina d = new Disciplina(nome);
                cadastrarDisciplina(d);
                break;
            case 10:
                imprimeDisciplina();
                break;
            case 11: 
                System.out.println("Informe o nome do Professor:");
                nome = scan.next();
                System.out.println("Informe o nome da Disciplina:");
                String dis = scan.next();
                vincularProfessorDisciplina( nome, dis);
                break;
            case 12: 
                System.out.println("Informe o nome do Aluno:");
                nome = scan.next();
                System.out.println("Informe o nome da Disciplina:");
                String dis2 = scan.next();
                vincularAlunoDisciplina( nome, dis2);
            default:
                System.out.println("Ação Inválida");
        }
        scan.next();
        SistemaAcademico.menu();
    }
    
    public static void vincularProfessorDisciplina(String nomeProfessor, String nomeDisiplina){
        Disciplina d = getDisciplinaByNome(nomeDisiplina);
        Professor p = getProfessorByNome(nomeProfessor);
        
        if(d != null && p != null){
            d.setProfessor(p);
            System.out.println("Professor Vinculado a Disciplina");
        }
        else{
            System.out.println("Não foi possivel vincular o Professor a Disciplina");
        }
    }
    public static void vincularAlunoDisciplina(String nomeAluno, String nomeDisiplina){
        Disciplina d = getDisciplinaByNome(nomeDisiplina);
        Aluno a = getAlunoByNome(nomeAluno);
        
        if(d != null && a != null){
            d.addAluno(a);
            System.out.println("Aluno Vinculado a Disciplina");
        }
        else{
            System.out.println("Não foi possivel vincular o Aluno a Disciplina");
        }
    }
    public static Aluno getAlunoByNome(String nomeAluno){
        for(int i = 0; i< alunos.length; i++){
            if(alunos[i] != null){
                if(alunos[i].getNome().equals(nomeAluno))
                {
                    return alunos[i];
                }
            }
        }
        return null;
    }
     public static Professor getProfessorByNome(String nomeProfessor){
        for(int i = 0; i< professores.length; i++){
            if(professores[i] != null){
                if(professores[i].getNome().equals(nomeProfessor))
                {
                    return professores[i];
                }
            }
        }
        return null;
    } 
    
    public static Disciplina getDisciplinaByNome(String nomeDisciplina){
        for(int i = 0; i< disciplinas.length; i++){
            if(disciplinas[i] != null){
                if(disciplinas[i].getNome().equals(nomeDisciplina))
                {
                    return disciplinas[i];
                }
            }
        }
        return null;
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
    
    public static void cadastrarProfessor(Professor professor){
         for(int i = 0; i< professores.length; i++){
            if(professores[i] == null){
                professores[i] = professor;
                break;
            }
        }
        System.out.println("Professor inserido com sucesso");
    }
    public static void cadastrarDisciplina(Disciplina disciplina){
         for(int i = 0; i< disciplinas.length; i++){
            if(disciplinas[i] == null){
                disciplinas[i] = disciplina;
                break;
            }
        }
        System.out.println("Disciplina inserida com sucesso");
    }
    public static void imprimeProfessores(){
        for(int i = 0; i< professores.length; i++){
            if(professores[i] != null){
               System.out.println(professores[i].imprime());
            }
        }
    }
    
    public static void imprimeDisciplina(){
        for(int i = 0; i< disciplinas.length; i++){
            if(disciplinas[i] != null){
               System.out.println(disciplinas[i].imprime());
            }
        }
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
