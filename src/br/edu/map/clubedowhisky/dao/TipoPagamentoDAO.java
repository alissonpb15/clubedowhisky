package br.edu.map.clubedowhisky.dao;

import br.edu.map.clubedowhisky.model.TipoPagamento;
import br.edu.map.clubedowhisky.util.ConexaoPostgres;
import java.util.ArrayList;

public class TipoPagamentoDAO extends ConexaoPostgres {

    /**
    * grava TipoPagamento
    * @param pModelTipoPagamento
    * return int
    */
    public int salvarTipoPagamentoDAO(TipoPagamento pModelTipoPagamento){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tipo_pagamento ("
                    + "descricao"
                + ") VALUES ("
                    + "'" + pModelTipoPagamento.getDescricao() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera TipoPagamento
    * @param pCodigo
    * return TipoPagamento
    */
    public TipoPagamento getTipoPagamentoDAO(int pCodigo){
        TipoPagamento modelTipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "descricao"
                 + " FROM"
                     + " tipo_pagamento"
                 + " WHERE"
                     + " pk_codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelTipoPagamento.setCodigo(this.getResultSet().getInt(1));
                modelTipoPagamento.setDescricao(this.getResultSet().getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelTipoPagamento;
    }
    
    /**
    * recupera TipoPagamento
    * @param pNome
    * return TipoPagamento
    */
    public TipoPagamento getTipoPagamentoDAO(String pNome){
        TipoPagamento modelTipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "descricao"
                 + " FROM"
                     + " tipo_pagamento"
                 + " WHERE"
                     + " descricao = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelTipoPagamento.setCodigo(this.getResultSet().getInt(1));
                modelTipoPagamento.setDescricao(this.getResultSet().getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelTipoPagamento;
    }

    /**
    * recupera uma lista de TipoPagamento
        * return ArrayList
    */
    public ArrayList<TipoPagamento> getListaTipoPagamentoDAO(){
        ArrayList<TipoPagamento> listamodelTipoPagamento = new ArrayList();
        TipoPagamento modelTipoPagamento = new TipoPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_codigo,"
                    + "descricao"
                 + " FROM"
                     + " tipo_pagamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelTipoPagamento = new TipoPagamento();
                modelTipoPagamento.setCodigo(this.getResultSet().getInt(1));
                modelTipoPagamento.setDescricao(this.getResultSet().getString(2));
                listamodelTipoPagamento.add(modelTipoPagamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelTipoPagamento;
    }

    /**
    * atualiza TipoPagamento
    * @param pModelTipoPagamento
    * return boolean
    */
    public boolean atualizarTipoPagamentoDAO(TipoPagamento pModelTipoPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tipo_pagamento SET "
                    + "pk_codigo = '" + pModelTipoPagamento.getCodigo() + "',"
                    + "descricao = '" + pModelTipoPagamento.getDescricao() + "'"
                + " WHERE "
                    + "pk_codigo = '" + pModelTipoPagamento.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui TipoPagamento
    * @param pCodigo
    * return boolean
    */
    public boolean excluirTipoPagamentoDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tipo_pagamento "
                + " WHERE "
                    + "pk_codigo = '" + pCodigo + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}