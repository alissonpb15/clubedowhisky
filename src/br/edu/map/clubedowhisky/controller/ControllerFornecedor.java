package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.Fornecedor;
import br.edu.map.clubedowhisky.dao.FornecedorDAO;
import java.util.ArrayList;
import br.edu.map.clubedowhisky.dao.RelatoriosDAO;

public class ControllerFornecedor {

    private FornecedorDAO daoFornecedor = new FornecedorDAO();
    private RelatoriosDAO dAORelatorios = new RelatoriosDAO();

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