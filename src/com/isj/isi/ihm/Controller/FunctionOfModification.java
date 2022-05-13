package com.isj.isi.ihm.Controller;

import com.isj.isi.ihm.Model.Product;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

//Il s'agit ici de l'ensemble des donnees sur les produits
public class FunctionOfModification extends AbstractTableModel {
    private Object[][] donnees;
    private final List<Product> products = new ArrayList<Product>();
    private final String[] entetes = {"Id", "Name", "Category", "Quantity", "Price"};

    public FunctionOfModification() {
        super();
        products.add(new Product("J01", "produit1","eau", 2, 2390));
        products.add(new Product("J01", "produit1","eau", 2, 2390));
//        products.add(new Product("J01", "produit1","eau", 2, 2390));
//        products.add(new Product("J01", "produit1","eau", 2, 2390));
//        products.add(new Product("J01", "produit1","eau", 2, 2390));
//        products.add(new Product("J01", "produit1","eau", 2, 2390));
//
//            donnees = new Object[][]{
//                    {"J01", "produit1","eau", 2, 2390},
//                    {"J01", "produit1","eau", 2, 2300},
//                    {"J01", "produit1","eau", 2, 2300},
//                    {"J01", "produit1","eau", 2, 2300},
//                    {"J01", "produit1","eau", 2, 2300},
//                    {"J01", "produit1","eau", 2, 2300},
//            };
    }

    public int getRowCount() {
        return products.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return products.get(rowIndex).getId();
            case 1:
                return products.get(rowIndex).getName();
            case 2:
                return products.get(rowIndex).getCategory();
            case 3:
                return products.get(rowIndex).getQty();
            case 4:
                return products.get(rowIndex).getPrice();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
    public void addProduct(Product product){
        products.add(product);
        fireTableRowsInserted(products.size() -1,products.size() -1);
    }
//    public void removeProduct(int rowIndex) {
//        products.remove(rowIndex);
//        fireTableRowsDeleted(rowIndex, rowIndex);
//    }
    public void removeProduct(String idOfProduct) {
        Product prod = new Product();
        for (Product product : products) {
             if (product.getId().equals(idOfProduct)) {
                 prod = product;
             }
        }
        products.remove(prod);
        fireTableRowsDeleted(products.size(),products.size());
    }
    public void editProduct(Product product){

    }
}


