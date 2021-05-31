/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Produto;

/**
 *
 * @author jwict
 */
public class TesteProduto {
    public static void main(String[] args) {
        //Criação e instância do objeto da classe Produto
        Produto produto = new Produto();
        
        //Construção do objeto
        produto. setCodProduto(1);
        produto.setDescricao("Batata");
        produto.setValorUnitario(1.75);
        
        //Imprimindo o produto
        System.out.println("\n\t\t\t -- Produto 1 --");
        produto.imprimirProduto();
        
        //Teste de construtor
        Produto produtoDois = new Produto(2, "Banana", 2.5);
        
        //Imprimindo o outro produto
        System.out.println("\n\t\t\t -- Outro Produto -- \n");
        produto.imprimirProduto();
        
    }
            
    
}
