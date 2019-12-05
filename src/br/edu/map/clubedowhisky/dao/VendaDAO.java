package br.edu.map.clubedowhisky.dao;

import br.edu.map.clubedowhisky.util.ConexaoPostgres;
import br.edu.map.clubedowhisky.model.Venda;
import java.util.ArrayList;

public class VendaDAO extends ConexaoPostgres {
    /**
     * grava Vendas
     *
     * @param pModelVendas return int
     */
    public int salvarVendasDAO(Venda pModelVendas) {
        try {
            this.conectar();
                return this.insertSQL(
                    "INSERT INTO vendas ("
                    + "clientes_codigo,"
                    + "data_venda,"
                    + "valor_total,"
                    + "desconto, "
                    + "tipo_pagamento "
                    + ") VALUES ("
                    + "'" + pModelVendas.getClientesCodigo() + "',"
                    + "'" + pModelVendas.getDataVenda() + "',"
                    + "'" + pModelVendas.getValorTotal() + "',"
                    + "'" + pModelVendas.getDesconto() + "',"
                    + "'" + pModelVendas.getTipoPagamento()+ "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    
   /**
     * grava Vendas
     *
     * @param pModelVendas return int
     */
    public boolean salvarProdutosVendasDAO(Venda pModelVendas) {
        try {
            this.conectar();
            int sizeLista = pModelVendas.getListamModelVendases().size();
            for (int i = 0; i < sizeLista; i++) {
                this.insertSQL(
                        "insert into VENDAS_PRODUTO "
                        + "( "
                        + "CODIGO_PRODUTO,"
                        + "CODIGO_VENDA,"
                        + "QUANTIDADE) "
                        + " VALUES ("
                        + "'" + pModelVendas.getListamModelVendases().get(i).getProdutosCodigo() + "',"
                        + "'" + pModelVendas.getCodigo()+ "',"
                        + "'" + pModelVendas.getListamModelVendases().get(i).getQuantidade() + "'"
                        + ");"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
    * recupera Vendas
    * @param pCodigo
    * return Venda
    */
    public Venda getVendasDAO(int pCodigo){
        Venda modelVendas = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "valor_total,"
                    + "clientes_codigo,"
                    + "data_venda,"
                    + "desconto, "
                    + "tipo_pagamento "
                 + " FROM"
                     + " vendas"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setCodigo(this.getResultSet().getInt(1));
                modelVendas.setValorTotal(this.getResultSet().getFloat(2));
                modelVendas.setClientesCodigo(this.getResultSet().getInt(3));
                modelVendas.setDataVenda(this.getResultSet().getDate(4));
                modelVendas.setDesconto(this.getResultSet().getFloat(5));
                modelVendas.setTipoPagamento(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * return ArrayList
    */
    public ArrayList<Venda> getListaVendasDAO(){
        ArrayList<Venda> listamodelVendas = new ArrayList();
        Venda modelVendas = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "clientes_codigo,"
                    + "data_venda "
                 + " FROM"
                     + " vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new Venda();
                modelVendas.setCodigo(this.getResultSet().getInt(1));
                modelVendas.setClientesCodigo(this.getResultSet().getInt(2));
                modelVendas.setDataVenda(this.getResultSet().getDate(3));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }
    
    /**
    * recupera uma lista de Vendas
        * return ArrayList
    */
    public ArrayList<Venda> getListaVendasDAO(int pCodigo){
        ArrayList<Venda> listamodelVendas = new ArrayList();
        Venda modelVendas = new Venda();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo_produto,"
                    + "codigo_venda,"
                    + "quantidade "
                    + " FROM"
                    + " vendas_produto WHERE codigo_venda = '" + pCodigo + "'"
                    + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new Venda();
                modelVendas.setProdutosCodigo(this.getResultSet().getInt(1));
                modelVendas.setCodigo(this.getResultSet().getInt(2));
                modelVendas.setQuantidade(this.getResultSet().getInt(3));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasDAO(Venda pModelVendas){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE vendas SET "
                    + "codigo = '" + pModelVendas.getCodigo() + "',"
                    + "valor_total = '" + pModelVendas.getValorTotal()+ "',"
                    + "clientes_codigo = '" + pModelVendas.getClientesCodigo() + "',"
                    + "data_venda = '" + pModelVendas.getDataVenda() + "',"
                    + "desconto = '" + pModelVendas.getDesconto()+ "',"
                    + "tipo_pagamento = '" + pModelVendas.getTipoPagamento()+ "'"
                + " WHERE "
                    + "codigo = '" + pModelVendas.getCodigo() + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Vendas
    * @param pCodigo
    * return boolean
    */
    public boolean excluirVendasDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "DELETE FROM vendas "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}