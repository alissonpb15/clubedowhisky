package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.Cliente;
import br.edu.map.clubedowhisky.dao.DAOCliente;
import java.util.ArrayList;
import br.edu.map.clubedowhisky.dao.DAORelatorios;

public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();
    private DAORelatorios dAORelatorios = new DAORelatorios();

  
    public int salvarClienteController(Cliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pCodigo
    * return Cliente
    */
    public Cliente getClienteController(int pCodigo){
        return this.daoCliente.getClienteDAO(pCodigo);
    }
    
    /**
    * recupera Cliente
    * @param pNome
    * return Cliente
    */
    public Cliente getClienteController(String pNome){
        return this.daoCliente.getClienteDAO(pNome);
    }

    /**
    * recupera uma lista deCliente
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<Cliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteController(Cliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pCodigo
    * return boolean
    */
    public boolean excluirClienteController(int pCodigo){
        return this.daoCliente.excluirClienteDAO(pCodigo);
    }

    public boolean gerarRelatorioCliente() {
        return this.dAORelatorios.gerarRelatorioCliente();
    }
}