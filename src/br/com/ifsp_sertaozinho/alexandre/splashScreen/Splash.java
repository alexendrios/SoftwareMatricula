//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: Alexandre Pereira Santos
//******************************************************

package br.com.ifsp_sertaozinho.alexandre.splashScreen;

import br.com.ifsp_sertaozinho.alexandre.view.FrmCadDiscp;
import java.util.logging.Level;
import java.util.logging.Logger;

//Essa classe está implementando a classe Runnable
public class Splash extends javax.swing.JFrame implements Runnable{
 /**
  * Tela de splash - inicialização da aplicação
  * Nesta mesma será necessário a criação ta tela principal
  * "FrmCadDiscp form = new FrmCadDiscp()" - Este será o forme principal
  * A aplicação irá rodar toda neste forme
  */
    FrmCadDiscp form = new FrmCadDiscp();
    Thread principal;
    public Splash() {
        initComponents();
        // a tela irá ser apresentada no centro da máquina
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        txtStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 300, 20));

        txtStatus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifsp_sertaozinho/alexandre/splashScreen/splash.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables

    //médodo que possibilitar a animação da progress bar
    @Override
    public void run() {
        this.setVisible(true);
        try {
            for(int i = 0; i < 101; i++){
                jProgressBar1.setValue(i);
                principal.sleep(60);
                if(jProgressBar1.getValue() > 15 && jProgressBar1.getValue() <= 50){
                    txtStatus.setText("Preparando Dados");
                }else if(jProgressBar1.getValue() > 50 && jProgressBar1.getValue() <= 70){
                    txtStatus.setText("Carregando Banco de Dados");
                }else if(jProgressBar1.getValue() > 70 && jProgressBar1.getValue() <= 80){
                    txtStatus.setText("Carregando Formulários");
                }else if(jProgressBar1.getValue() > 80 && jProgressBar1.getValue() <= 99){
                   txtStatus.setText("Carregando Sistema");
                }else if(jProgressBar1.getValue() > 99){
                    txtStatus.setText("Carregado");
                }
            }
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
       /**
        * Os atributos com as seguintes propiedas:
        * this.dispose() - irá fechar a janela splash
        * form.setVisible(true) - irá chamar o form principal
        */
        
        this.dispose();
        form.setVisible(true);
    }
}
