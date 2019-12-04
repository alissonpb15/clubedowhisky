

package br.edu.map.clubedowhisky.view;

import br.edu.map.clubedowhisky.controller.ControllerCliente;
import br.edu.map.clubedowhisky.controller.ControllerVendas;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.edu.map.clubedowhisky.model.Cliente;
import br.edu.map.clubedowhisky.model.Datas;

public class TelaRelatorioVendas extends javax.swing.JFrame {

    ArrayList<Cliente> listaModelClientes = new ArrayList<>();
    ControllerCliente controllerCliente = new ControllerCliente();
    
  
    public TelaRelatorioVendas() {
        initComponents();
        listarClientes();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jbCancelar = new javax.swing.JButton();
        jbGerarRelatorio = new javax.swing.JButton();
        jrbData = new javax.swing.JRadioButton();
        jrbCliente = new javax.swing.JRadioButton();
        jcbCliente = new componentes.UJComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de vendas");

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbGerarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Report.png"))); // NOI18N
        jbGerarRelatorio.setText("Gerar relatório");
        jbGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarRelatorioActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbData);
        jrbData.setSelected(true);
        jrbData.setText("Por data:");
        jrbData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDataActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbCliente);
        jrbCliente.setText("Por cliente:");

        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                        .addComponent(jbGerarRelatorio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbData)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jrbCliente)
                        .addGap(29, 29, 29)
                        .addComponent(jcbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jrbData)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCliente)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbGerarRelatorio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarRelatorioActionPerformed
        ControllerVendas controllerVendas = new ControllerVendas();
        Datas cw = new Datas();
        if (jrbData.isSelected()) {
            Date data = null;
            try {
                data = cw.converterDataParaDateUS(cw.converterDataParaDateUS(jdData.getDate()));
            } catch (Exception ex) {
                Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
            controllerVendas.gerarRelatorioVendaData(data);
        }else {
            controllerVendas.gerarRelatorioVendaCliente(jcbCliente.getSelectedItem().toString());
        }
            
    }//GEN-LAST:event_jbGerarRelatorioActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbClienteActionPerformed

    private void jrbDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbDataActionPerformed

    private void listarClientes(){
        listaModelClientes = controllerCliente.getListaClienteController();
        jcbCliente.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++){
            jcbCliente.addItem(listaModelClientes.get(i).getNome());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGerarRelatorio;
    private componentes.UJComboBox jcbCliente;
    private javax.swing.JRadioButton jrbCliente;
    private javax.swing.JRadioButton jrbData;
    // End of variables declaration//GEN-END:variables
}
