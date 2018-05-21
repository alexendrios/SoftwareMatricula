//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************

package br.com.ifsp_sertaozinho.alexandre.teste;

import br.com.ifsp_sertaozinho.alexandre.model.Disciplina;
import br.com.ifsp_sertaozinho.alexandre.model.DisciplinaDAO;
import java.util.ArrayList;

/**
 * Classe de Teste - Verificando a Casse DisciplinaDAO
 **/
public class TesteDisciplinaDAO {

    public static void main(String[] args) {
        //testarCadatrar();
        //testaralterar();
        //testarExcluir();
        testLoadDados();
    }
//Método teste Cadastrar
    public static void testarCadatrar() {
        Disciplina d = new Disciplina();
        d.setNomeDisciplina("Desenvolvimento Java");
        d.setCargaHoraria(150);
        d.setCurso("Análise e Desenvolvimento de Sistemas");
        d.setVagas(25);
        d.setPeriodo("Noturno");
        DisciplinaDAO disciplina = new DisciplinaDAO();
        disciplina.cadastrar(d);
    }

    //Métdo teste Alterar
    public static void testaralterar() {
        Disciplina d = new Disciplina();
        d.setNomeDisciplina("Desenvolvimento JavaSE Básico");
        d.setCurso("Análise e Desenvolvimento de Sistemas");
        d.setCargaHoraria(50);
        d.setVagas(25);
        d.setPeriodo("Noturno");
        d.setId(1);
        DisciplinaDAO disciplina = new DisciplinaDAO();
        disciplina.alterar(d);
    }
    
    //Método teste Excluir
    public static void testarExcluir(){
        Disciplina d = new Disciplina();
        d.setId(1);
        DisciplinaDAO disciplina = new DisciplinaDAO();
        disciplina.excluir(d);
    }
    
    //Teste Carregamento
    public static void testLoadDados(){
        DisciplinaDAO disciplina = new DisciplinaDAO();
        ArrayList<Disciplina> lista = disciplina.LoadDados();
        System.out.println("ID\tDisciplina\t\tC.H\tCurso\t\t\t\t\tVagas\tPeríodo");
        for (Disciplina disciplina1 : lista) {
            System.out.printf("%d\t%s\t%d\t%s\t%d\t%s\n",
                    disciplina1.getId(), disciplina1.getNomeDisciplina(),
                    disciplina1.getCargaHoraria(), disciplina1.getCurso(),
                    disciplina1.getVagas(), disciplina1.getPeriodo());
        }
    }

}
