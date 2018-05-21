//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************
package br.com.ifsp_sertaozinho.alexandre.model;

/**
 * Para melhor desempenho do Projeto foi criado a Disciplina Essa Classe contém
 * as mesmas informações do Banco de Dados
 *
 */
public class Disciplina {

    private int id;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String curso;
    private int vagas;
    private String periodo;

    /**
     * Observe - se qye as informações do tipo String estão sendo Inseridas na
     * classe através do método toUpperCase() Objetivando a padronização de
     * informações np Banco de Daddos
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina.toUpperCase();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso.toUpperCase();
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo.toUpperCase();
    }
}
