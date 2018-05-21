//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************

package br.com.ifsp_sertaozinho.alexandre.teste;

import br.com.ifsp_sertaozinho.alexandre.model.Disciplina;


public class TestDisciplina {
    
    public static void main(String[] args) {
        
        testandoDisciplina();
      
    }

//método para teste de criação de Disciplina    
    public static void testandoDisciplina(){
        Disciplina d = new Disciplina();
        
        d.setId(1);
        d.setNomeDisciplina("Desenvolvimento Java");
        d.setCargaHoraria(150);
        d.setCurso("Análise e Desenvolvimento de Sistemas");
        d.setVagas(25);
        d.setPeriodo("Noturno");
        
        System.out.println("ID\tDisciplina\t\tC.H\tCurso\t\t\t\t\tVagas\tPeríodo");
        System.out.printf("%d\t%s\t%d\t%s\t%d\t%s\n",
                d.getId(), d.getNomeDisciplina(), d.getCargaHoraria(),
                d.getCurso(), d.getVagas(), d.getPeriodo());
}
    
}
