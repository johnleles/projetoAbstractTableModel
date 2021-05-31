/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author jwict
 */
public class Produto {
    
    //Atributos
    private int codProduto;
    private String descricao;
    private double valorUnitario;
    
    
    //Métodos
    public void imprimirProduto() {
        System.out.println("\tCódigo......................"+ getCodProduto());
        System.out.println("\tDescrição..................."+ getDescricao());
        System.out.printf("\tValor Unitário............... R$ %.2f\n", getValorUnitario());
    }

    /**
     * @return the codProduto
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Produto(int codProduto, String descricao, double valorUnitario) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }
    
    public Produto () {
        this.setDescricao("Produto não definido");
    }
    
    
}
