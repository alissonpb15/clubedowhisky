package br.edu.map.clubedowhisky.model;

public class TipoPagamento {

    private int codigo;
    private String descricao;

    /**
    * Construtor
    */
    public TipoPagamento(){}

    /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return pk_codigo
    */
    public int getCodigo(){
        return this.codigo;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public String toString(){
        return "ModelTipoPagamento {" + "::codigo = " + this.codigo + "::descricao = " + this.descricao +  "}";
    }
}