package br.edu.map.clubedowhisky.dao;

import br.edu.map.clubedowhisky.connection.ConexaoPostgres;
import br.edu.map.clubedowhisky.model.Produto;
import java.util.ArrayList;

public class DAOProduto extends ConexaoPostgres {

    /**
    * grava Produtos
    * @param pModelProdutos
    * return int
    */
    public int salvarProdutosDAO(Produto pModelProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO produtos ("
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque"
                + ") VALUES ("
                    + "'" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "'" + pModelProdutos.getNome() + "',"
                    + "'" + pModelProdutos.getValor() + "',"
                    + "'" + pModelProdutos.getCodigoBarras() + "',"
                    + "'" + pModelProdutos.getEstoque() + "'"
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
    * recupera Produtos
    * @param pCodigo
    * return Produto
    */
    public Produto getProdutosDAO(int pCodigo){
        Produto modelProdutos = new Produto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }
    
   /**
    * recupera Produtos
    * @param pNome
    * return Produto
    */
    public Produto getProdutosDAO(String pNome){
        Produto modelProdutos = new Produto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " nome = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
    * recupera uma lista de Produtos
        * return ArrayList
    */
    public ArrayList<Produto> getListaProdutosDAO(){
        ArrayList<Produto> listamodelProdutos = new ArrayList();
        Produto modelProdutos = new Produto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque"
                 + " FROM"
                     + " produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos = new Produto();
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getInt(6));
                listamodelProdutos.add(modelProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * return boolean
    */
    public boolean atualizarProdutosDAO(Produto pModelProdutos){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE produtos SET "
                    + "codigo = '" + pModelProdutos.getCodigo() + "',"
                    + "fornecedores_codigo = '" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "nome = '" + pModelProdutos.getNome() + "',"
                    + "valor = '" + pModelProdutos.getValor() + "',"
                    + "codigo_barras = '" + pModelProdutos.getCodigoBarras() + "',"
                    + "estoque = '" + pModelProdutos.getEstoque() + "'"
                + " WHERE "
                    + "codigo = '" + pModelProdutos.getCodigo() + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Produtos
    * @param pCodigo
    * return boolean
    */
    public boolean excluirProdutosDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "DELETE FROM produtos "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * return boolean
    */
    public boolean atualizarProdutosQuantidadeDAO(Produto pModelProdutos){
        try {
            this.conectar();
            System.out.println(pModelProdutos.getListaModelProdutoses().size());
            int sizeLista = pModelProdutos.getListaModelProdutoses().size();
            for (int i = 0; i < sizeLista; i++) {
                this.executarUpdateDeleteSQL(
                "UPDATE produtos SET "
                    + "estoque = '" + pModelProdutos.getListaModelProdutoses().get(i).getEstoque() + "'"
                + " WHERE "
                    + "codigo = '" + pModelProdutos.getListaModelProdutoses().get(i).getCodigo() + "'"
                + ";"
            );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public Produto getProdutosCodigoBarrasDAO(String pCodigoBarras) {
        Produto modelProdutos = new Produto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " codigo_barras = '" + pCodigoBarras + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }
}