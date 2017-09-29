/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

/**
 *
 * @author dell-soncini
 */
public class Aluno extends Pessoa {
    
    private String matricula;
    private int periodo;
    private int qtdDisciplinas;
    private String[] disciplinas;
    private int disciplinasMatriculadas = 0;
    private String curso;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(int disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Aluno (String nome, String matricula, String curso, int periodo, int idade, int qtdDisciplinas) {
        super.setNome(nome);
        super.setIdade(idade);
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.qtdDisciplinas = qtdDisciplinas;
        if(this.qtdDisciplinas == 0){
            this.disciplinas = new String[qtdDisciplinas];
        }
    }
     public void setQtdDisciplinas(int qtdDisciplinas){
        if(this.qtdDisciplinas == 0)
        {
            this.qtdDisciplinas = qtdDisciplinas;
            this.disciplinas = new String[qtdDisciplinas];
        }
    }
    
    public int getQtdDisciplinas(){
        return this.qtdDisciplinas;
    }
    
    public String fazMatricula(String disciplina){
        boolean jamatriculado = false;
        
        if(qtdDisciplinas == 0){
            return "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria";
        }
        else if(disciplinasMatriculadas == qtdDisciplinas ){
            return "Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de "+qtdDisciplinas+" disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.";
        }
        
        for(String matricula : disciplinas){
            if(disciplina.equals(matricula)){
                return "Aluno já Matriculado em "+disciplina;
            }
        }
        
        for(int i = 0; i< disciplinas.length; i++){
            if(disciplinas[i] == null){
                disciplinas[i] = disciplina;
                disciplinasMatriculadas++;
                break;
            }
        }
        
        return "Matrícula na disciplina “"+disciplina+"” executada.";
    }
    
    public String cancelaMatricula(String disciplina){
        for(int i = 0; i< disciplinas.length; i++){
            if(disciplina.equals(disciplinas[i])){
                disciplinas[i] = null;
                disciplinasMatriculadas--;
                return "Cancelamento da matrícula da disciplina "+disciplina+" executado com sucesso.";
            }
        }
        return "Aluno não está matriculado na disciplina "+disciplina+", portanto não é possível cancelar esta matrícula";
    }
    public String imprime(){
       return "Nome do Aluno: "+this.nome+
            " \r\n Matricula: "+this.matricula+
            " \r\n Curso: "+this.curso+ " \r\n Periodo: "+ this.periodo+ " \n\r Disciplinas Matriculadas: " + String.join(", ", disciplinas);
    }
    
}
