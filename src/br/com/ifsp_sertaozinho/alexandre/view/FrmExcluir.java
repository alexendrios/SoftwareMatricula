//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************
package br.com.ifsp_sertaozinho.alexandre.view;

import br.com.ifsp_sertaozinho.alexandre.model.Disciplina;
import br.com.ifsp_sertaozinho.alexandre.model.DisciplinaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmExcluir extends javax.swing.JInternalFrame {

    public static String x;
    Disciplina disciplina = new Disciplina();
    DisciplinaDAO conexaoDisciplina = new DisciplinaDAO();

    public FrmExcluir() {
        initComponents();
        x = "x";
        carregarCbx();
        desabilitarCaixa();

    }

// método para carrear as informações no comboBox
    public void carregarCbx() {
        ArrayList<Disciplina> lista = conexaoDisciplina.LoadDados();
        cbxDiciplinas.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            cbxDiciplinas.addItem(lista.get(i).getNomeDisciplina());
        }
    }
    //método desabilitar as caixas de textos
    private void desabilitarCaixa(){
        txtDisciplina.setEnabled(false);
        txtCurso.setEnabled(false);
        txtCh.setEnabled(false);
        txtPeriodo.setEnabled(false);
        txtVagas.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDisciplina = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCh = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        txtVagas = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        txtCurso = new java.awt.TextField();
        btnExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPeriodo = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        cbxDiciplinas = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.gray);
        setTitle("Excluir Disciplinas");
        setToolTipText("");
        setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Disciplina");

        jLabel2.setText("C.Horária");

        jLabel3.setText("Vagas");

        jLabel4.setText("Período");

        jLabel5.setText("Curso");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifsp_sertaozinho/alexandre/imagem/livro_logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel6.setText("<html>Excluir<font color=\"Silver\"> <sup>Disciplinas</sup></font></html>");

        jLabel8.setText("ID");

        cbxDiciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiciplinasActionPerformed(evt);
            }
        });
        cbxDiciplinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxDiciplinasKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel3))
                                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(txtVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblID)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel1)
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxDiciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addComponent(cbxDiciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblID))
                .addGap(36, 36, 36)
                .addComponent(btnExcluir))
        );

        setBounds(0, 0, 600, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente Excluir os Dados?", "Excluir Dados",
                JOptionPane.OK_OPTION, JOptionPane.YES_NO_OPTION);
        if (resp != 0) {
            JOptionPane.showMessageDialog(this, "Operação Cancelada", "Excluir Dados",
                    JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            x = null;
        } else {
            disciplina.setNomeDisciplina(txtDisciplina.getText());
            disciplina.setCurso(txtCurso.getText());
            disciplina.setCargaHoraria(Integer.parseInt(txtCh.getText()));
            disciplina.setVagas(Integer.parseInt(txtVagas.getText()));
            disciplina.setPeriodo(txtPeriodo.getText());
            disciplina.setId(Integer.parseInt(lblID.getText()));
            conexaoDisciplina.excluir(disciplina);
            this.dispose();
            x = null;
        }

    }//GEN-LAST:event_btnExcluirActionPerformed
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        x = null;
    }//GEN-LAST:event_formInternalFrameClosing

    private void cbxDiciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiciplinasActionPerformed

        preencherCadastro();
    }//GEN-LAST:event_cbxDiciplinasActionPerformed

    private void cbxDiciplinasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxDiciplinasKeyPressed
        preencherCadastro();
    }//GEN-LAST:event_cbxDiciplinasKeyPressed
//Médodo para preencher os campos de textos
    public void preencherCadastro() {
        String pesquisadisciplina = (String) cbxDiciplinas.getSelectedItem();
        disciplina.setNomeDisciplina(pesquisadisciplina);
        Disciplina dados = conexaoDisciplina.buscarDisciplina(disciplina);
        lblID.setText(Integer.toString(dados.getId()));
        txtDisciplina.setText(dados.getNomeDisciplina());
        txtCurso.setText(dados.getCurso());
        txtPeriodo.setText(dados.getPeriodo());
        txtCh.setText(Integer.toString(dados.getCargaHoraria()));
        txtVagas.setText(Integer.toString(dados.getVagas()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cbxDiciplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblID;
    private java.awt.TextField txtCh;
    private java.awt.TextField txtCurso;
    private java.awt.TextField txtDisciplina;
    private java.awt.TextField txtPeriodo;
    private java.awt.TextField txtVagas;
    // End of variables declaration//GEN-END:variables
}
