//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************
package br.com.ifsp_sertaozinho.alexandre.view;

import br.com.ifsp_sertaozinho.alexandre.model.Disciplina;
import br.com.ifsp_sertaozinho.alexandre.model.DisciplinaDAO;
import javax.swing.JOptionPane;

public class FrmCadastrar extends javax.swing.JInternalFrame {

    /**
     * Observe que este form criou um atributo público estático Esse atributo
     * será responsável para garantir que somente um forme De cada categoria
     * seja aberto Nesta classe também foram criados dois objetos 1) Objeto
     * Disciplina 2) Objeto DisciplinaDAO
     */
    public static String x;
    Disciplina disciplina = new Disciplina();
    DisciplinaDAO conexaoDisciplina = new DisciplinaDAO();

    public FrmCadastrar() {
        initComponents();
        x = "x";
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
        btnCadstrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxPeriodo = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.gray);
        setTitle("Cadastro de Disciplinas");
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

        btnCadstrar.setText("Cadastrar");
        btnCadstrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadstrarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifsp_sertaozinho/alexandre/imagem/livro_logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("High Tower Text", 1, 36)); // NOI18N
        jLabel6.setText("<html>Cadastrar<font color=\"Silver\"> <sup>Disciplinas</sup></font></html>");

        cbxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespetino", "Noturno", "Integral" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(btnCadstrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addComponent(cbxPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(txtVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(90, 90, 90)
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnCadstrar))
        );

        setBounds(0, 0, 600, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadstrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadstrarActionPerformed
        /**
         * ifs responsáveis para validar as informações a serem colocadas nos
         * JTextfilds
         */
        if (txtDisciplina.getText().equals("") || txtCurso.getText().equals("")
                || txtVagas.getText().equals("") || txtCh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Existem Campos Vazios!!\nO cadastro somente será realizado"
                    + " se todos os campos forem preenchidos!");
        } else {
            if (verificacaoNumero(txtCh.getText())) {
                if (verificacaoNumero(txtVagas.getText())) {
                    disciplina.setNomeDisciplina(txtDisciplina.getText());
                    disciplina.setCurso(txtCurso.getText());
                    disciplina.setCargaHoraria(Integer.parseInt(txtCh.getText()));
                    disciplina.setVagas(Integer.parseInt(txtVagas.getText()));
                    disciplina.setPeriodo(String.valueOf(cbxPeriodo.getSelectedItem()));
                    /**
                     * apatir desse momento as informações serão slava no Banco
                     * Pois meu Objeto conexaoDisciplina da classe DisciplinaDAO
                     * Existe um método Cadastrar - em suma Esse método irá
                     * comunicar com Banco e executar um Sql
                     *
                     */
                    conexaoDisciplina.cadastrar(disciplina);
                    //atributos que irão controlar o comportamento da janela
                    x = null;
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "Somente é permitido números\n no campo Carga Vagas");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Somente é permitido números\n no campo Carga Horária");
            }
        }
    }//GEN-LAST:event_btnCadstrarActionPerformed
    /**
     * Método que verificará se foi digitado letras no campo dedicado a números 
     */
    private boolean verificacaoNumero(String campo) {
        String validacao = campo;
        for (int i = 0; i < validacao.length(); i++) {
            if (Character.isDigit(validacao.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // A fechar a InternalFrame a mesma receberá null
        x = null;
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadstrar;
    private javax.swing.JComboBox<String> cbxPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private java.awt.TextField txtCh;
    private java.awt.TextField txtCurso;
    private java.awt.TextField txtDisciplina;
    private java.awt.TextField txtVagas;
    // End of variables declaration//GEN-END:variables
}
