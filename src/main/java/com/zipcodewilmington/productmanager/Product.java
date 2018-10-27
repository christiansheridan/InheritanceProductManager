package com.zipcodewilmington.productmanager;

/**
 * Created by leon on 1/10/18.
 */
public class Product extends Inventory {

    private String name;
    private int price;
    private int id;
    private int quantity;

    Product(){}

    Product(int _price, int _id, int _quantity, String _name){
        this.price = _price;
        this.id = _id;
        this.quantity = _quantity;
        this.name = _name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
