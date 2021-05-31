/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.Produto;

/**
 *
 * @author jwict
 */
public class TabelaProduto extends AbstractTableModel{
    //Lista de Produtos
    private List<Produto> produto = new ArrayList<>();
    
    //Vetor com os nomes da colunas da tabela
    private String[] colunas = {"Código", "Descrição", "Valor Unit."};

    @Override
    public int getRowCount() {
        return produto.size();
        
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
        
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return produto.get(rowIndex).getCodProduto();
            case 1: 
                return produto.get(rowIndex).getDescricao();
            case 2: 
                return produto.get(rowIndex).getValorUnitario();    
        }
        return null;
    
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0:
               produto.get(rowIndex).setCodProduto(Integer.parseInt((String)o));
                break;
            case 1:
               produto.get(rowIndex).setDescricao((String)o);
                break;
            case 2:
               produto.get(rowIndex).setValorUnitario(Double.parseDouble((String)o));
               break;
        }
        //Atualizando a tabela
        this.fireTableCellUpdated(rowIndex, rowIndex);
    }
    
    
    public void addRow(Produto p) {
        this.produto.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex) {
        this.produto.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    
    
}
