package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.Venda;
import br.edu.map.clubedowhisky.dao.DAOVenda;
import java.sql.Date;
import java.util.ArrayList;
import br.edu.map.clubedowhisky.dao.DAORelatorios;


public class ControllerVendas {

    private DAOVenda daoVendas = new DAOVenda();
    private DAORelatorios dAORelatorios = new DAORelatorios();

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
    */
    public int salvarVendasController(Venda pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pCodigo
    * return Venda
    */
    public Venda getVendasController(int pCodigo){
        return this.daoVendas.getVendasDAO(pCodigo);
    }

    /**
    * recupera uma lista deVendas
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<Venda> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /* recupera uma lista deVendas
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<Venda> getListaVendasController(int pCodigo){
        return this.daoVendas.getListaVendasDAO(pCodigo);
    }
    
    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasController(Venda pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pCodigo
    * return boolean
    */
    public boolean excluirVendasController(int pCodigo){
        return this.daoVendas.excluirVendasDAO(pCodigo);
    }

    public boolean salvarVendasProdutosController(Venda modelVendas) {
        return this.daoVendas.salvarProdutosVendasDAO(modelVendas);
    }

    public boolean gerarRelatorioVenda(int pCodigo) {
        return this.dAORelatorios.gerarRelatorioVenda(pCodigo);
    }

    public boolean gerarRelatorioPDV(int pCodigo) {
        return this.dAORelatorios.gerarRelatorioPDV(pCodigo);
    }

    public boolean gerarRelatorioVendaData(Date pData) {
        return this.dAORelatorios.gerarRelatorioVendaData(pData);
    }
    
    public boolean gerarRelatorioVendaCliente(String pCliente) {
        return this.dAORelatorios.gerarRelatorioVendaCliente(pCliente);
    }
}