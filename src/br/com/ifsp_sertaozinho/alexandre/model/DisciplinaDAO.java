//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************
package br.com.ifsp_sertaozinho.alexandre.model;

import br.com.ifsp_sertaozinho.alexandre.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DisciplinaDAO {

    /**
     * Essa classe converserá diretamente com o Banco de Dados Nesta que está
     * inseridos o CRUD
     *
     */

    private Connection con = null;
// Método cadastrar - Insere as informações no Banco de Dados
    public void cadastrar(Disciplina disciplina) {

        con = Conexao.getConnection();
        // O jump the cat está localizada na string sql - linguagem do banco de dados
        String sql = "INSERT INTO tb_disciplina("
                + "nomeDisciplina,cargaHoraria, curso, vagas, periodo)"
                + "VALUES(?,?,?,?,?)";
        try {
            
            PreparedStatement preparar = con.prepareStatement(sql);
            preparar.setString(1, disciplina.getNomeDisciplina());
            preparar.setInt(2, disciplina.getCargaHoraria());
            preparar.setString(3, disciplina.getCurso());
            preparar.setInt(4, disciplina.getVagas());
            preparar.setString(5, disciplina.getPeriodo());
            preparar.execute();
            preparar.close();
            JOptionPane.showMessageDialog(null, "Dados Cadastrados com Sucesso!!");

        } catch (SQLException ex) {
            System.out.println("Erro\n\n");
        }
        System.out.println("Conexão Finalizada");
    }
    // Método que irá alterar os dados no Banco
    public void alterar(Disciplina disciplina) {

        con = Conexao.getConnection();
        String sql = "UPDATE tb_disciplina SET"
                + " nomeDisciplina=?, cargaHoraria=?, curso=?"
                + ", vagas=?, periodo=? WHERE id=?";
        try {
            PreparedStatement preparar = con.prepareStatement(sql);
            preparar.setString(1, disciplina.getNomeDisciplina());
            preparar.setInt(2, disciplina.getCargaHoraria());
            preparar.setString(3, disciplina.getCurso());
            preparar.setInt(4, disciplina.getVagas());
            preparar.setString(5, disciplina.getPeriodo());
            preparar.setInt(6, disciplina.getId());
            preparar.execute();
            preparar.close();
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!!");

        } catch (SQLException ex) {
            System.out.println("Erro\n\n");
            ex.printStackTrace();
        }
        System.out.println("Conexão Finalizada");
    }
// Método que irá excluir o Dados no Banco
    public void excluir(Disciplina disciplina) {

        con = Conexao.getConnection();
        String sql = "DELETE FROM tb_disciplina WHERE id=?";

        try {
            PreparedStatement preparar = con.prepareStatement(sql);
            preparar.setInt(1, disciplina.getId());
            preparar.execute();
            preparar.close();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso!!");

        } catch (SQLException ex) {
            System.out.println("Erro\n\n");
            ex.printStackTrace();
        }
        System.out.println("Conexão Finalizada");
    }
// Médtodo que realiza uma seleção de todos os registros do Banco e retorna uma ArrayList
    public ArrayList LoadDados() {
        con = Conexao.getConnection();
        String sql = "SELECT * FROM tb_disciplina";
        ArrayList<Disciplina> lista = new ArrayList<>();
        try {
            PreparedStatement preparar = con.prepareStatement(sql);
            ResultSet res = preparar.executeQuery();
            while (res.next()) {
                Disciplina d = new Disciplina();
                d.setId(res.getInt("id"));
                d.setNomeDisciplina(res.getString("nomeDisciplina"));
                d.setCargaHoraria(res.getInt("cargaHoraria"));
                d.setCurso(res.getString("curso"));
                d.setVagas(res.getInt("vagas"));
                d.setPeriodo(res.getString("periodo"));
                lista.add(d);
            }
        } catch (SQLException ex) {
            System.out.println("Erro\n\n");
            ex.printStackTrace();
        }
        System.out.println("Conexão Finalizada");
        return lista;
    }

    // método de seleção através de um argumento - esse retorna um Objeto - Disciplina
    public Disciplina buscarDisciplina(Disciplina disciplina) {
        con = Conexao.getConnection();
        String sql = "SELECT * FROM tb_disciplina WHERE nomeDisciplina=?";
        try {
            PreparedStatement preparar = con.prepareStatement(sql);
            preparar.setString(1, disciplina.getNomeDisciplina());
            ResultSet res = preparar.executeQuery();
            if (res.next()) {
                disciplina.setId(res.getInt("id"));
                disciplina.setNomeDisciplina(res.getString("nomeDisciplina"));
                disciplina.setCargaHoraria(res.getInt("cargaHoraria"));
                disciplina.setCurso(res.getString("curso"));
                disciplina.setVagas(res.getInt("vagas"));
                disciplina.setPeriodo(res.getString("periodo"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro\n\n");
            ex.printStackTrace();
        }
        System.out.println("Conexão Finalizada");
        return disciplina;
    }
}
