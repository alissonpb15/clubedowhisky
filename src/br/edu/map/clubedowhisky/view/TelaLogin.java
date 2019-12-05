/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.map.clubedowhisky.view;

import br.edu.map.clubedowhisky.controller.ControllerUsuario;
import javax.swing.JOptionPane;
import br.edu.map.clubedowhisky.util.SessaoUsuario;
import br.edu.map.clubedowhisky.model.Usuario;



public class TelaLogin extends javax.swing.JFrame {

    private SessaoUsuario modelSessaoUsuario = new SessaoUsuario();
    public TelaLogin() {
        initComponents(); 
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_login = new javax.swing.JPanel();
        campo_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        logo_login = new javax.swing.JLabel();
        campo_Senha = new javax.swing.JPasswordField();
        planodeFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clube do Whisky V1.0");
        setResizable(false);
        getContentPane().setLayout(null);

        painel_login.setBackground(new java.awt.Color(255, 255, 255));
        painel_login.setToolTipText("Tela de Login");
        painel_login.setLayout(null);
        painel_login.add(campo_usuario);
        campo_usuario.setBounds(30, 170, 260, 20);

        jLabel1.setText("Usuario:");
        painel_login.add(jLabel1);
        jLabel1.setBounds(30, 150, 40, 14);

        jLabel2.setText("Senha:");
        painel_login.add(jLabel2);
        jLabel2.setBounds(30, 210, 34, 14);

        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        painel_login.add(btn_entrar);
        btn_entrar.setBounds(70, 270, 63, 23);

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        painel_login.add(btn_sair);
        btn_sair.setBounds(200, 270, 65, 23);

        logo_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo sistema_2.png"))); // NOI18N
        painel_login.add(logo_login);
        logo_login.setBounds(70, 20, 193, 120);

        campo_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_SenhaActionPerformed(evt);
            }
        });
        painel_login.add(campo_Senha);
        campo_Senha.setBounds(30, 230, 260, 20);

        getContentPane().add(painel_login);
        painel_login.setBounds(220, 110, 320, 320);

        planodeFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Plano de Fundo Login Final.jpg"))); // NOI18N
        planodeFundoLogin.setToolTipText("Tela de Login");
        getContentPane().add(planodeFundoLogin);
        planodeFundoLogin.setBounds(0, 0, 770, 590);

        setSize(new java.awt.Dimension(793, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
     autenticar();
    }//GEN-LAST:event_btn_entrarActionPerformed
    private void autenticar() {

        Usuario modelUsuario = new Usuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setLogin(this.campo_usuario.getText());
        modelUsuario.setSenha(new String(this.campo_Senha.getPassword()));

       
        if (controllerUsuario.getUsuarioController(modelUsuario)) {
            modelSessaoUsuario.nome = controllerUsuario.getUsuarioController(modelUsuario.getLogin()).getNome();
            TelaPrincipal telaPrincipal = new TelaPrincipal();
             telaPrincipal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }
    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void campo_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_SenhaActionPerformed
       autenticar();
    }//GEN-LAST:event_campo_SenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JPasswordField campo_Senha;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo_login;
    private javax.swing.JPanel painel_login;
    private javax.swing.JLabel planodeFundoLogin;
    // End of variables declaration//GEN-END:variables
}
