package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.Produto;
import br.edu.map.clubedowhisky.dao.DAOProduto;
import java.util.ArrayList;
import br.edu.map.clubedowhisky.dao.DAORelatorios;

public class ControllerProdutos {

    private DAOProduto daoProdutos = new DAOProduto();
    private DAORelatorios dAORelatorios = new DAORelatorios();
    /**
    * grava Produtos
    * @param pModelProdutos
    * return int
    */
    public int salvarProdutosController(Produto pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    /**
    * recupera Produtos
    * @param pCodigo
    * return Produto
    */
    public Produto getProdutosController(int pCodigo){
        return this.daoProdutos.getProdutosDAO(pCodigo);
    }
    
    /**
    * recupera Produtos
    * @param pNome
    * return Produto
    */
    public Produto getProdutosController(String pNome){
        return this.daoProdutos.getProdutosDAO(pNome);
    }

    /**
    * recupera uma lista deProdutos
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<Produto> getListaProdutosController(){
        return this.daoProdutos.getListaProdutosDAO();
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * return boolean
    */
    public boolean atualizarProdutosController(Produto pModelProdutos){
        return this.daoProdutos.atualizarProdutosDAO(pModelProdutos);
    }

    /**
    * exclui Produtos
    * @param pCodigo
    * return boolean
    */
    public boolean excluirProdutosController(int pCodigo){
        return this.daoProdutos.excluirProdutosDAO(pCodigo);
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * return boolean
    */
    public boolean atualizarProdutosQuantidadeController(Produto pModelProdutos){
        return this.daoProdutos.atualizarProdutosQuantidadeDAO(pModelProdutos);
    }

    public boolean gerarRelatorioProdutos() {
        return this.dAORelatorios.gerarRelatorioProdutos();
    }

    public Produto getProdutosCodigoBarrasController(String pCodigoBarras) {
        return this.daoProdutos.getProdutosCodigoBarrasDAO(pCodigoBarras);
    }
    
}