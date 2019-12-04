package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.Fornecedor;
import br.edu.map.clubedowhisky.dao.DAOFornecedor;
import java.util.ArrayList;
import br.edu.map.clubedowhisky.dao.DAORelatorios;

public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();
    private DAORelatorios dAORelatorios = new DAORelatorios();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorController(Fornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pCodigo
    * return Fornecedor
    */
    public Fornecedor getFornecedorController(int pCodigo){
        return this.daoFornecedor.getFornecedorDAO(pCodigo);
    }
    
    /**
    * recupera Fornecedor
    * @param pNome
    * return Fornecedor
    */
    public Fornecedor getFornecedorController(String pNome){
        return this.daoFornecedor.getFornecedorDAO(pNome);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<Fornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorController(Fornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pCodigo
    * return boolean
    */
    public boolean excluirFornecedorController(int pCodigo){
        return this.daoFornecedor.excluirFornecedorDAO(pCodigo);
    }

    public boolean gerarRelatorioFornecedor() {
        return this.dAORelatorios.gerarRelatorioFornecedores();
    }
}