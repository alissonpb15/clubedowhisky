package br.edu.map.clubedowhisky.dao;

import br.edu.map.clubedowhisky.model.Caixa;
import br.edu.map.clubedowhisky.connection.ConexaoPostgres;
import java.util.ArrayList;

public class DAOCaixa extends ConexaoPostgres {

    /**
    * grava Caixa
    * @param pModelCaixa
    * return int
    */
    public int salvarCaixaDAO(Caixa pModelCaixa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO caixa ("
                    + "codigo,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale"
                + ") VALUES ("
                    + "'" + pModelCaixa.getCodigo() + "',"
                    + "'" + pModelCaixa.getDinheiro() + "',"
                    + "'" + pModelCaixa.getCheque() + "',"
                    + "'" + pModelCaixa.getCartao() + "',"
                    + "'" + pModelCaixa.getVale() + "'"
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
    * recupera Caixa
    * @param pCodigo
    * return ModelCaixa
    */
    public Caixa getCaixaDAO(int pCodigo){
        Caixa modelCaixa = new Caixa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale"
                 + " FROM"
                     + " caixa"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(2));
                modelCaixa.setCheque(this.getResultSet().getFloat(3));
                modelCaixa.setCartao(this.getResultSet().getFloat(4));
                modelCaixa.setVale(this.getResultSet().getFloat(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCaixa;
    }

    /**
    * recupera uma lista de Caixa
        * return ArrayList
    */
    public ArrayList<Caixa> getListaCaixaDAO(){
        ArrayList<Caixa> listamodelCaixa = new ArrayList();
        Caixa modelCaixa = new Caixa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale"
                 + " FROM"
                     + " caixa"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCaixa = new Caixa();
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(2));
                modelCaixa.setCheque(this.getResultSet().getFloat(3));
                modelCaixa.setCartao(this.getResultSet().getFloat(4));
                modelCaixa.setVale(this.getResultSet().getFloat(5));
                listamodelCaixa.add(modelCaixa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCaixa;
    }

    /**
    * atualiza Caixa
    * @param pModelCaixa
    * return boolean
    */
    public boolean atualizarCaixaDAO(Caixa pModelCaixa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE caixa SET "
                    + "codigo = '" + pModelCaixa.getCodigo() + "',"
                    + "dinheiro = '" + pModelCaixa.getDinheiro() + "',"
                    + "cheque = '" + pModelCaixa.getCheque() + "',"
                    + "cartao = '" + pModelCaixa.getCartao() + "',"
                    + "vale = '" + pModelCaixa.getVale() + "'"
                + " WHERE "
                    + "codigo = '" + pModelCaixa.getCodigo() + "'"
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
    * exclui Caixa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirCaixaDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM caixa "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
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