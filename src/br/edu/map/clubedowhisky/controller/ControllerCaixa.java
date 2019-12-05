package br.edu.map.clubedowhisky.controller;

import br.edu.map.clubedowhisky.model.Caixa;
import br.edu.map.clubedowhisky.dao.CaixaDAO;
import java.util.ArrayList;


public class ControllerCaixa {

    private CaixaDAO daoCaixa = new CaixaDAO();

    public int salvarCaixaController(Caixa pModelCaixa){
        return this.daoCaixa.salvarCaixaDAO(pModelCaixa);
    }

    /**
    * recupera Caixa
    * @param pCodigo
    * return Caixa
    */
    public Caixa getCaixaController(int pCodigo){
        return this.daoCaixa.getCaixaDAO(pCodigo);
    }

    /**
    * recupera uma lista deCaixa
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<Caixa> getListaCaixaController(){
        return this.daoCaixa.getListaCaixaDAO();
    }

    /**
    * atualiza Caixa
    * @param pModelCaixa
    * return boolean
    */
    public boolean atualizarCaixaController(Caixa pModelCaixa){
        return this.daoCaixa.atualizarCaixaDAO(pModelCaixa);
    }

    /**
    * exclui Caixa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirCaixaController(int pCodigo){
        return this.daoCaixa.excluirCaixaDAO(pCodigo);
    }
}