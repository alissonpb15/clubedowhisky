
package br.edu.map.clubedowhisky.view;

import br.edu.map.clubedowhisky.controller.ControllerCaixa;
import br.edu.map.clubedowhisky.controller.ControllerCliente;
import br.edu.map.clubedowhisky.controller.ControllerProdutos;
import br.edu.map.clubedowhisky.controller.ControllerTipoPagamento;
import br.edu.map.clubedowhisky.controller.ControllerVendas;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import br.edu.map.clubedowhisky.model.Caixa;
import br.edu.map.clubedowhisky.model.Cliente;
import br.edu.map.clubedowhisky.model.Produto;
import br.edu.map.clubedowhisky.model.TipoPagamento;
import br.edu.map.clubedowhisky.model.Venda;
import br.edu.map.clubedowhisky.util.Datas;


public class TelaVenda extends javax.swing.JFrame {
    
    ControllerVendas controllerVendas = new ControllerVendas();
    Venda modelVendas = new Venda();
    Produto modelProdutos = new Produto();
    ArrayList<Venda> listaModelVendas = new ArrayList<>();
    ArrayList<Produto> listaProdutoses = new ArrayList<>();
    ArrayList<Cliente> listaModelClientes = new ArrayList<>();
    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    Caixa modelCaixa = new Caixa();
    ControllerCaixa controllerCaixa = new ControllerCaixa();
    ControllerTipoPagamento controllerTipoPagamento = new ControllerTipoPagamento();
    ArrayList<TipoPagamento> listaModelTipoPagamentos = new ArrayList<>();
    float valorCartao, valorCheque, valorDinheiro, valorVale;
    
    /** Creates new form RegistrarVenda */
    public TelaVenda() {
        initComponents();
        listarClientes();
        listarProdutos();
        listarTipoPagamento();
        this.carregarVendas();
        setLocationRelativeTo(null);
        this.desabilitarCampos();
    }
    
    private void listarProdutos(){
        listaProdutoses = controllerProdutos.getListaProdutosController();
        jcbProdutos.removeAllItems();
        for (int i = 0; i < listaProdutoses.size(); i++){
            jcbProdutos.addItem(listaProdutoses.get(i).getNome());
        }
    }
    
    private void listarClientes(){
        listaModelClientes = controllerCliente.getListaClienteController();
        jcbClientes.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++){
            jcbClientes.addItem(listaModelClientes.get(i).getNome());
        }
    }
    
    private void listarTipoPagamento(){
        listaModelTipoPagamentos = controllerTipoPagamento.getListaTipoPagamentoController();
        jcbTipoPagamento.removeAllItems();
        for (int i = 0; i < listaModelTipoPagamentos.size(); i++){
            jcbTipoPagamento.addItem(listaModelTipoPagamentos.get(i).getDescricao());
        }
    }
    
    public void setViewConsultarVendas(){
        this.jTabbedPane1.setSelectedIndex(1);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfQuantidade = new JFormattedTextField(NumberFormat.getNumberInstance());
        jLabel3 = new javax.swing.JLabel();
        btFinalizar = new javax.swing.JButton();
        btIncluirProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        tfValorTotal = new JFormattedTextField(NumberFormat.getNumberInstance());
        btRetirar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        tfNumeroVenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbClientes = new javax.swing.JComboBox();
        jcbProdutos = new javax.swing.JComboBox();
        tfDesconto = new javax.swing.JTextField();
        jcbTipoPagamento = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        btCancelar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbConsultasVendas = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar Vendas");
        setAlwaysOnTop(true);
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(520, 405));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel1.add(tfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 58, -1));

        jLabel3.setText("Quant.:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btFinalizar.setText("Salvar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        btIncluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Create.png"))); // NOI18N
        btIncluirProduto.setText("Incluir");
        btIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btIncluirProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel1.setText("Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Produto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setText("Total:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jLabel4.setText("Desconto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        tfValorTotal.setEditable(false);
        tfValorTotal.setBackground(new java.awt.Color(255, 153, 153));
        tfValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jPanel1.add(tfValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 120, -1));

        btRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        btRetirar.setText("Retirar");
        btRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(btRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        tbProdutos.setAutoCreateRowSorter(true);
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor unit.", "Quantidade", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane3.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 530, 190));

        tfNumeroVenda.setEditable(false);
        tfNumeroVenda.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.add(tfNumeroVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 30, 140, -1));

        jLabel6.setText("Nº de venda:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jPanel1.add(jcbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, -1));

        jPanel1.add(jcbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, -1));

        tfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDescontoFocusLost(evt);
            }
        });
        tfDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDescontoKeyReleased(evt);
            }
        });
        jPanel1.add(tfDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 330, 100, -1));

        jPanel1.add(jcbTipoPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 270, -1));

        jLabel7.setText("Tipo de pagamento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Search.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        btCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Pesquisa:");

        tbConsultasVendas.setAutoCreateRowSorter(true);
        tbConsultasVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Venda", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsultasVendas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbConsultasVendas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbConsultasVendas);
        if (tbConsultasVendas.getColumnModel().getColumnCount() > 0) {
            tbConsultasVendas.getColumnModel().getColumn(1).setMinWidth(400);
            tbConsultasVendas.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btCancelar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                        .addComponent(jbAlterar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(306, 306, 306)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(btCancelar1)
                    .addComponent(jbAlterar))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    protected void desabilitarCampos(){
        jcbClientes.setSelectedIndex(0);
        jcbProdutos.setSelectedIndex(0);
        tfNumeroVenda.setText("");
        tfQuantidade.setText("");
        tfDesconto.setText("");
        tfValorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);      
        jcbClientes.setEnabled(false);
        jcbProdutos.setEnabled(false);
        tfQuantidade.setEditable(false);
        tfDesconto.setEditable(false);
        btCancelar.setEnabled(false);
        btFinalizar.setEnabled(false);
        btRetirar.setEnabled(false);
        btIncluirProduto.setEnabled(false);
    }
    
    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        zerarValoresCaixa();
        cadastrarVenda();
    }//GEN-LAST:event_btFinalizarActionPerformed

    private boolean cadastrarVenda() {
        if (tfDesconto.getText().equals("") || tfValorTotal.getText().equals("") || tbProdutos.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!", "ATENÇÂO", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            listaModelVendas = new ArrayList<>();
            listaProdutoses = new ArrayList<>();
            int codigoProduto, quantidade;
            Datas bl = new Datas();

            for (int i = 0; i < tbProdutos.getRowCount(); i++) {
                modelVendas = new Venda();
                modelProdutos = new Produto();
                modelVendas.setClientesCodigo(controllerCliente.getClienteController(jcbClientes.getSelectedItem().toString()).getCodigo());
                modelVendas.setDesconto(Float.parseFloat(this.tfDesconto.getText()));
                modelVendas.setValorTotal(Float.parseFloat(this.tfValorTotal.getText()));
                try {
                    modelVendas.setDataVenda(bl.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
                } catch (Exception ex) {
                    Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
                }
                codigoProduto = controllerProdutos.getProdutosController(tbProdutos.getValueAt(i,0).toString()).getCodigo();
                modelVendas.setProdutosCodigo(codigoProduto);
                modelVendas.setQuantidade(Integer.parseInt(tbProdutos.getValueAt(i, 2).toString()));
                modelVendas.setTipoPagamento(controllerTipoPagamento.getTipoPagamentoController(this.jcbTipoPagamento.getSelectedItem().toString()).getCodigo());
                modelProdutos.setCodigo(codigoProduto);
                quantidade = controllerProdutos.getProdutosController(codigoProduto).getEstoque() - Integer.parseInt(tbProdutos.getValueAt(i, 2).toString());
                modelProdutos.setEstoque(quantidade);
                listaModelVendas.add(modelVendas);
                listaProdutoses.add(modelProdutos);
            }
            modelVendas.setListamModelVendases(listaModelVendas);
            modelProdutos.setListaModelProdutoses(listaProdutoses);
            
            //salvar venda
            int codigoVenda = controllerVendas.salvarVendasController(modelVendas);
            if (codigoVenda > 0) {
                modelVendas.setCodigo(codigoVenda);
                //da baixa no estoque
                controllerProdutos.atualizarProdutosQuantidadeController(modelProdutos);
                //salvar lista de produtos
                controllerVendas.salvarVendasProdutosController(modelVendas);
                JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
                adicionarValorCaixa();
                this.habilitarCampos();
                this.carregarVendas();
                //avançar para aba 2
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() + 1);
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    private void btIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirProdutoActionPerformed
        this.incluirProduto();
        this.tfValorTotal.setText(String.valueOf(this.somaEAtualizaValorTotal()));
    }//GEN-LAST:event_btIncluirProdutoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tbConsultasVendas.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbConsultasVendas.setRowSorter(sorter);
        String text = jtfPesquisa.getText();
        sorter.setRowFilter(RowFilter.regexFilter(text, 1));
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = tbConsultasVendas.getSelectedRow();
        String nome = (String) tbConsultasVendas.getValueAt(linha, 1);
        int codigo = (int) tbConsultasVendas.getValueAt(linha, 0);

        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerVendas.excluirVendasController(codigo)) {
                if (controllerVendas.excluirVendasController(codigo)) {     
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao excluir os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarVendas();
            }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        this.novoProduto();
    }//GEN-LAST:event_btNovoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        recuperarVenda();
        //voltar para aba 1
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() - 1 );
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void btRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetirarActionPerformed
        // para excluir a linha
        int linhaSelecionada = tbProdutos.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            return;
        } else {
            // Obtem o modelo da JTable
            DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
            // Remove a linha
            modelo.removeRow(linhaSelecionada);
        }
    }//GEN-LAST:event_btRetirarActionPerformed

    private void tfDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescontoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescontoKeyReleased

    private void tfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDescontoFocusLost
        try{
            float desconto = Float.parseFloat(this.tfDesconto.getText());
            float valorFinal = somaEAtualizaValorTotal() - desconto;
            
            this.tfValorTotal.setText(String.valueOf(valorFinal));
        }catch(NumberFormatException e){
            this.tfDesconto.setText("0");
            JOptionPane.showMessageDialog(this, "Campo numérico!");
        }
    }//GEN-LAST:event_tfDescontoFocusLost
    
    private void adicionarValorCaixa() {
        modelCaixa = new Caixa();
        modelCaixa = controllerCaixa.getCaixaController(1);
        if (modelVendas.getTipoPagamento() == 1) {
            valorDinheiro = modelVendas.getValorTotal();
            modelCaixa.setDinheiro(modelCaixa.getDinheiro() + valorDinheiro);
        } else if (modelVendas.getTipoPagamento() == 2) {
            valorCartao = modelVendas.getValorTotal();
            modelCaixa.setCartao(modelCaixa.getCartao() + valorCartao);
        } else if (modelVendas.getTipoPagamento() == 3) {
            valorCheque = modelVendas.getValorTotal();
            modelCaixa.setCheque(modelCaixa.getCheque() + valorCheque);
        } else if (modelVendas.getTipoPagamento() == 4) {
            valorVale = modelVendas.getValorTotal();
            modelCaixa.setVale(modelCaixa.getVale() + valorVale);
        }
        controllerCaixa.atualizarCaixaController(modelCaixa);
    }
    
    private void zerarValoresCaixa() {
        valorCartao = 0;
        valorCheque = 0;
        valorDinheiro = 0;
        valorVale = 0;
    }
    
    private boolean recuperarVenda() {
        try {
            //recebe a linha selecionada
            int linha = this.tbConsultasVendas.getSelectedRow();
            //pega o codigo do cliente na linha selecionada
            int codigo = (Integer) tbConsultasVendas.getValueAt(linha, 0);
            int codigoProduto;
            modelVendas.setCodigo(codigo);
            //recupera os dados do banco
            modelVendas = controllerVendas.getVendasController(codigo);
            //seta os dados na interface
            this.jcbClientes.setSelectedItem(controllerCliente.getClienteController(modelVendas.getCodigo()).getNome());
            this.tfNumeroVenda.setText(String.valueOf(modelVendas.getCodigo()));
            this.tfDesconto.setText(String.valueOf(modelVendas.getDesconto()));
            this.tfValorTotal.setText(String.valueOf(modelVendas.getValorTotal()));
            this.jcbTipoPagamento.setSelectedItem(controllerTipoPagamento.getTipoPagamentoController(modelVendas.getTipoPagamento()).getDescricao());
            //recupera os dados do banco
            listaModelVendas = controllerVendas.getListaVendasController(codigo);
            //carregar lista de produtos da venda
            DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
            modelo.setNumRows(0);
            
            int cont = listaModelVendas.size();
            for (int i = 0; i < cont; i++) {
                codigoProduto = listaModelVendas.get(i).getProdutosCodigo();
                modelProdutos = controllerProdutos.getProdutosController(codigoProduto);
                modelo.addRow(new Object[]{
                    modelProdutos.getNome(),
                    modelProdutos.getValor(),
                    listaModelVendas.get(i).getQuantidade(),
                    listaModelVendas.get(i).getQuantidade() * modelProdutos.getValor()                  
                });
            }
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
   
    private void novoProduto(){
        tfNumeroVenda.setText("Novo");
        tfQuantidade.setText("");
        listarClientes();
        listarProdutos();
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);
        this.tfDesconto.setText("0");
        habilitarCampos();
    }
    
    private void habilitarCampos(){
        btCancelar.setEnabled(true);
        btFinalizar.setEnabled(true);
        btIncluirProduto.setEnabled(true);
        btRetirar.setEnabled(true);
        jcbClientes.setEnabled(true);
        jcbProdutos.setEnabled(true);
        tfQuantidade.setEditable(true);
        tfDesconto.setEditable(true);
        btNovo.setEnabled(true);
        
    }
    
    private void incluirProduto(){
       // TODO add your handling code here:
        if(tfQuantidade.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Você deve informar a quantidade para adicionar!");
        }else{
            //Adiciona linhas na tabela
            DefaultTableModel modelo = (DefaultTableModel)tbProdutos.getModel();
            int cont = 0;
            for(int i = 0; i < cont; i++){
                modelo.setNumRows(0);
            }

            Double valor = controllerProdutos.getProdutosController(this.jcbProdutos.getSelectedItem().toString()).getValor();
            //pega a quantidade de linhas e joga na variavel
            modelo.addRow(new Object [] {
            this.jcbProdutos.getSelectedItem().toString(),
            valor,
            this.tfQuantidade.getText(),
            valor * Float.parseFloat(this.tfQuantidade.getText())
            });
        } 
    }
    
    /**
     * Soma e atualiza os valores total
     * @return 
     */
    private float somaEAtualizaValorTotal() {
        float soma = 0;
        float valor = 0;
        int cont = tbProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Float.parseFloat(String.valueOf(tbProdutos.getValueAt(i, 3)));
            soma = valor+soma;
        }
        return soma;
    }
    
    
     private void carregarVendas() {
        listaModelVendas = controllerVendas.getListaVendasController();
        DefaultTableModel modelo = (DefaultTableModel) tbConsultasVendas.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaModelVendas.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVendas.get(i).getCodigo(),
                controllerCliente.getClienteController(listaModelVendas.get(i).getClientesCodigo()).getNome()
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btIncluirProduto;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JComboBox jcbClientes;
    private javax.swing.JComboBox jcbProdutos;
    private javax.swing.JComboBox jcbTipoPagamento;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTable tbConsultasVendas;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfDesconto;
    private javax.swing.JTextField tfNumeroVenda;
    private javax.swing.JFormattedTextField tfQuantidade;
    private javax.swing.JFormattedTextField tfValorTotal;
    // End of variables declaration//GEN-END:variables
    
}
