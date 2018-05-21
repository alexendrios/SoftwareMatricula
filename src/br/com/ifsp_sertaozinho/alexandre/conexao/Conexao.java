//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************

package br.com.ifsp_sertaozinho.alexandre.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    /**
     *  Método para realizar uma conexão com o Banco de Dados
     *  Esse método irá retornar um Connection
     **/
    public static Connection getConnection(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/disciplinas","root","");
            System.out.println("conectado ao Banco");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar\n"+ ex);
        }
        return con;
    }
}
