package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.Usuario;
import br.edu.map.clubedowhisky.dao.UsuarioDAO;
import java.util.ArrayList;

public class ControllerUsuario {

    private UsuarioDAO daoUsuario = new UsuarioDAO();

    /**
    * grava Usuario
    * @param pModelUsuario
    * return int
    */
    public int salvarUsuarioController(Usuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pCodigo
    * return Usuario
    */
    public Usuario getUsuarioController(int pCodigo){
        return this.daoUsuario.getUsuarioDAO(pCodigo);
    }
    
    /**
    * recupera Usuario
    * @param pLogin
    * return Usuario
    */
    public Usuario getUsuarioController(String pLogin){
        return this.daoUsuario.getUsuarioDAO(pLogin);
    }
    
    /**
    * recupera Usuario
    * @param pModelUsuario
    * return Usuario
    */
    public boolean getUsuarioController(Usuario pModelUsuario){
        return this.daoUsuario.getUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera uma lista deUsuario
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<Usuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * return boolean
    */
    public boolean atualizarUsuarioController(Usuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pCodigo
    * return boolean
    */
    public boolean excluirUsuarioController(int pCodigo){
        return this.daoUsuario.excluirUsuarioDAO(pCodigo);
    }
}