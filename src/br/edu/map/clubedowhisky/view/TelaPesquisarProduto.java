/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.map.clubedowhisky.view;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import br.edu.map.clubedowhisky.controller.ControllerFornecedor;
import br.edu.map.clubedowhisky.controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.edu.map.clubedowhisky.model.Fornecedor;
import br.edu.map.clubedowhisky.model.Produto;


public class TelaPesquisarProduto extends javax.swing.JFrame {

    Produto modelProdutos = new Produto();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ArrayList<Produto> listamModelProdutos = new ArrayList<Produto>();
    ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
    String tipoCadastro;
    
    /**
     * Creates new form ViewProduto
     */
    public TelaPesquisarProduto() {
        initComponents();
        setLocationRelativeTo(null);
        this.carregarProdutos();
        this.listarFornecedor();
        this.desabilitarCampos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btPesquisaProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btSalvar = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfValor = new javax.swing.JFormattedTextField();
        tfEstoque = new javax.swing.JFormattedTextField();
        jtfNome = new javax.swing.JTextField();
        tfPesquisaProduto = new javax.swing.JTextField();
        cbFornecedores = new componentes.UJComboBox();
        tfCodigoBarras = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("Pesquisar Produtos");

        btPesquisaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Iccone pesqusar 16 x 16.png"))); // NOI18N
        btPesquisaProduto.setText("Pesquisar");
        btPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Valor:");

        jLabel3.setText("Fornecedor:");

        jLabel4.setText("Quant. Estoque:");

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Editar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        tbProdutos.setAutoCreateRowSorter(true);
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(1).setPreferredWidth(350);
        }

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);

        jLabel5.setText("Código:");

        tfCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCodigoBarrasKeyReleased(evt);
            }
        });

        jLabel6.setText("Código de barras:");

        jLabel9.setText("Pesquisa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(241, 241, 241)
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btPesquisaProduto))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btCancelar)
                        .addGap(3, 3, 3)
                        .addComponent(btExcluir)
                        .addGap(105, 105, 105)
                        .addComponent(btAlterar)
                        .addGap(7, 7, 7)
                        .addComponent(btSalvar)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisaProduto))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelar)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)
                    .addComponent(btSalvar)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaProdutoActionPerformed
//                listarProdutos();
    }//GEN-LAST:event_btPesquisaProdutoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        novoProduto();
        habilitarCampos();
        recuperarProduto();
        tipoCadastro = "alteracao";
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        //excluir produto
        this.excluirProduto();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.desabilitarCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tipoCadastro.equals("novo")){
            salvarProduto();
        } else if(tipoCadastro.equals("alteracao")){
            alterarProduto();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfCodigoBarrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoBarrasKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cbFornecedores.grabFocus();
        }
    }//GEN-LAST:event_tfCodigoBarrasKeyReleased

    private void listarFornecedor(){
        listaFornecedor = controllerFornecedor.getListaFornecedorController();
        cbFornecedores.removeAllItems();
        for (int i = 0; i < listaFornecedor.size(); i++){
            cbFornecedores.addItem(listaFornecedor.get(i).getNome());
        }
    }
    
    private void excluirProduto(){
        int linha = tbProdutos.getSelectedRow();
        String nome = (String) tbProdutos.getValueAt(linha, 1);
        int codigo = (Integer) tbProdutos.getValueAt(linha, 0);
        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro \nNome: "
                + nome + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerProdutos.excluirProdutosController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarProdutos();
            }else{
            JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private boolean recuperarProduto() {
        //recebe a linha selecionada
        int linha = this.tbProdutos.getSelectedRow();
        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) tbProdutos.getValueAt(linha, 0);
        try {
            //recupera os dados do banco
            modelProdutos = controllerProdutos.getProdutosController(codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelProdutos.getCodigo()));
            this.jtfNome.setText(modelProdutos.getNome());
            this.tfValor.setText(modelProdutos.getValor().toString());
            this.tfEstoque.setText(String.valueOf(modelProdutos.getEstoque()));
            this.cbFornecedores.setSelectedItem(controllerFornecedor.getFornecedorController(modelProdutos.getFornecedoresCodigo()).getNome());
            this.tfCodigoBarras.setText(String.valueOf(modelProdutos.getCodigoBarras()));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    private boolean alterarProduto(){
        modelProdutos.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelProdutos.setNome(this.jtfNome.getText());
        modelProdutos.setValor(Double.parseDouble(this.tfValor.getText()));
        modelProdutos.setFornecedoresCodigo(controllerFornecedor.getFornecedorController(this.cbFornecedores.getSelectedItem().toString()).getCodigo());
        modelProdutos.setEstoque(Integer.parseInt(this.tfEstoque.getText()));
        modelProdutos.setCodigoBarras(this.tfCodigoBarras.getText());
        //salvar 
        if (controllerProdutos.atualizarProdutosController(modelProdutos)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregarProdutos();
            limparDados();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
     private void carregarProdutos() {
        listamModelProdutos = controllerProdutos.getListaProdutosController();
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listamModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listamModelProdutos.get(i).getCodigo(),
                listamModelProdutos.get(i).getNome(),
                listamModelProdutos.get(i).getValor(),
                listamModelProdutos.get(i).getEstoque()
            });
        }
    }
     
     private void limparDados(){
        jtfNome.setText("");
        tfValor.setText("");
        tfEstoque.setText("");
        tfPesquisaProduto.setText("");
        tfCodigoBarras.setText("");
     }
    
    protected void desabilitarCampos(){
        tfCodigoBarras.setEditable(false);
        tfCodigo.setEditable(false);
        jtfNome.setEditable(false);
        tfValor.setEditable(false);
        tfEstoque.setEditable(false);
        tfPesquisaProduto.setEditable(false);
         btSalvar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
        cbFornecedores.setEnabled(false);
        btPesquisaProduto.setEnabled(false);
        
        carregarProdutos();
    }
    
    private void novoProduto(){
        habilitarCampos();
        tfCodigo.setText("Novo");
        jtfNome.setText("");
        tfValor.setText("");
        tfEstoque.setText("");
        tfCodigoBarras.setText("");
        cbFornecedores.setSelectedItem("");
        tipoCadastro = "novo";
    }
    
    private void habilitarCampos(){
        tfPesquisaProduto.setEditable(true);
        jtfNome.setEditable(true);
        tfValor.setEditable(true);
        tfEstoque.setEditable(true);
        cbFornecedores.setEnabled(true);
        btSalvar.setEnabled(true);
        tfCodigoBarras.setEditable(true);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(true);
        btAlterar.setEnabled(true);
        btPesquisaProduto.setEnabled(true);
    }
    
    private boolean salvarProduto(){
        modelProdutos.setNome(this.jtfNome.getText());
        modelProdutos.setValor(Double.parseDouble(this.tfValor.getText()));
        modelProdutos.setFornecedoresCodigo(controllerFornecedor.getFornecedorController(this.cbFornecedores.getSelectedItem().toString()).getCodigo());
        modelProdutos.setEstoque(Integer.parseInt(this.tfEstoque.getText()));
        modelProdutos.setCodigoBarras(this.tfCodigoBarras.getText());
        //salvar 
        if (controllerProdutos.salvarProdutosController(modelProdutos)>0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.desabilitarCampos();
            this.carregarProdutos();
            limparDados();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisaProduto;
    private javax.swing.JButton btSalvar;
    private componentes.UJComboBox cbFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCodigoBarras;
    private javax.swing.JFormattedTextField tfEstoque;
    private javax.swing.JTextField tfPesquisaProduto;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
