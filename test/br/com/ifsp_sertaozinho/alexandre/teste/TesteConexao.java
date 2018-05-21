//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************

package br.com.ifsp_sertaozinho.alexandre.teste;

import br.com.ifsp_sertaozinho.alexandre.conexao.Conexao;

/**
 * Testando a Conexão com o Banco de Dados
 **/
public class TesteConexao {

    public static void main(String[] args) {
        Conexao.getConnection();
    }
}
