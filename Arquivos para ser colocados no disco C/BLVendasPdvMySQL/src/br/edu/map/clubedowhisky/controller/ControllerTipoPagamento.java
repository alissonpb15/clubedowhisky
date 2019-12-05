package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.TipoPagamento;
import br.edu.map.clubedowhisky.dao.DAOTipoPagamento;
import java.util.ArrayList;

public class ControllerTipoPagamento {

    private DAOTipoPagamento daoTipoPagamento = new DAOTipoPagamento();

    /**
    * grava TipoPagamento
    * @param pModelTipoPagamento
    * return int
    */
    public int salvarTipoPagamentoController(TipoPagamento pModelTipoPagamento){
        return this.daoTipoPagamento.salvarTipoPagamentoDAO(pModelTipoPagamento);
    }

    /**
    * recupera TipoPagamento
    * @param pCodigo
    * return TipoPagamento
    */
    public TipoPagamento getTipoPagamentoController(int pCodigo){
        return this.daoTipoPagamento.getTipoPagamentoDAO(pCodigo);
    }
    
    /**
    * recupera TipoPagamento
    * @param pNome
    * return TipoPagamento
    */
    public TipoPagamento getTipoPagamentoController(String pNome){
        return this.daoTipoPagamento.getTipoPagamentoDAO(pNome);
    }

    /**
    * recupera uma lista deTipoPagamento
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<TipoPagamento> getListaTipoPagamentoController(){
        return this.daoTipoPagamento.getListaTipoPagamentoDAO();
    }

    /**
    * atualiza TipoPagamento
    * @param pModelTipoPagamento
    * return boolean
    */
    public boolean atualizarTipoPagamentoController(TipoPagamento pModelTipoPagamento){
        return this.daoTipoPagamento.atualizarTipoPagamentoDAO(pModelTipoPagamento);
    }

    /**
    * exclui TipoPagamento
    * @param pCodigo
    * return boolean
    */
    public boolean excluirTipoPagamentoController(int pCodigo){
        return this.daoTipoPagamento.excluirTipoPagamentoDAO(pCodigo);
    }
}