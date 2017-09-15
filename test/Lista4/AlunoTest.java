/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell-soncini
 */
public class AlunoTest {
    
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testaFazMatriculaIndisponivel() {
        Aluno aluno = new Aluno("Felipe Moreno","GRR20145421","TADS",7,20,0);
        String retorno = aluno.fazMatricula("LPOO");
        assertEquals("Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria",retorno);
    }
    
    @Test
    public void testaFazMatricula() {
        Aluno aluno = new Aluno("Felipe Moreno","GRR20145421","TADS",7,20,1);
        String retorno = aluno.fazMatricula("LPOO");
        assertEquals("Matrícula na disciplina “LPOO” executada.",retorno);
    }
    
    @Test
    public void testaFazMatriculaJaMatriculado() {
        Aluno aluno = new Aluno("Felipe Moreno","GRR20145421","TADS",7,20,2);
        String retorno = aluno.fazMatricula("LPOO");
        String retorno2 = aluno.fazMatricula("LPOO");
        assertEquals("Matrícula na disciplina “LPOO” executada.",retorno);
        assertEquals("Aluno já Matriculado em LPOO",retorno2);
    }
    
    @Test
    public void testaFazMatriculaDuasVezes() {
        Aluno aluno = new Aluno("Felipe Moreno","GRR20145421","TADS",7,20,2);
        String retorno = aluno.fazMatricula("LPOO");
        String retorno2 = aluno.fazMatricula("MOO");
        assertEquals("Matrícula na disciplina “LPOO” executada.",retorno);
        assertEquals("Matrícula na disciplina “MOO” executada.",retorno2);
    }
    
    @Test
    public void testaFazMatriculaECancela() {
        Aluno aluno = new Aluno("Felipe Moreno","GRR20145421","TADS",7,20,2);
        String retorno = aluno.fazMatricula("LPOO");
        String retorno2 = aluno.cancelaMatricula("LPOO");
        assertEquals("Matrícula na disciplina “LPOO” executada.",retorno);
        assertEquals("Cancelamento da matrícula da disciplina LPOO executado com sucesso.",retorno2);  
    }
    
    @Test
    public void testaCancelaMatriculaNaoMatriculado() {
        Aluno aluno = new Aluno("Felipe Moreno","GRR20145421","TADS",7,20,2);
        String retorno = aluno.cancelaMatricula("MOO");
        assertEquals("Aluno não está matriculado na disciplina MOO, portanto não é possível cancelar esta matrícula",retorno);
    }
    
    @Test
    public void testaImprime() {
        Aluno aluno = new Aluno("Felipe Moreno","GRR20145421","TADS",7,20,2);
        aluno.fazMatricula("MOO");
        aluno.fazMatricula("LPOO");
        assertEquals("Nome do Aluno: Felipe Moreno \r\n Matricula: GRR20145421 \r\n Curso: TADS \r\n Periodo: 7 \n\r Disciplinas Matriculadas: MOO, LPOO", aluno.imprime());
    }
    
    
}
