package com.isj.isi.ihm.Model;
//Il s'agit ici de l'ensemble des donnees contenues dans la bd(requettes sql ...)
public class Product {
    private String id;
    private String name;
    private String Category;
    private int qty;
    private int price;
    public Product() {
    }
    public Product(String id, String name, String category, int qty, int price) {
        this.id = id;
        this.name = name;
        this.Category = category;
        this.qty = qty;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
