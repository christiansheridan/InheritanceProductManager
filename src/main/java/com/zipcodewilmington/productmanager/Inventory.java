package com.zipcodewilmington.productmanager;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Inventory {

    ArrayList<Product> invList = new ArrayList<Product>();

    public Inventory() {

    }

    public void addProduct(Product product) {
        invList.add(product);
    }

    public int getInvValue() {
        //declare something to hold the values
        int holdInvValues = 0;

        //loop through the inventory list and get the value of each product
        //add all of those values together
        for (Product p : invList) {
            holdInvValues += p.getPrice() * p.getQuantity();
        }
        return holdInvValues;
    }


    public int getInvQuant() {
        //declare something to hold the quantity
        int holdInvQuant = 0;

        //loop through the inventory list and get the quantity of each product
        //add all of those values together
        for (Product p : invList) {
            holdInvQuant += p.getQuantity();
        }
        return holdInvQuant;
    }

    public void printInventory() {

        System.out.println("--------------Product Inventory------------------");
        for (Product p : invList) {
            System.out.println("Name: " + p.getName() + " ID: " + p.getId() + " Price: " + p.getPrice() + " Quantity: " + p.getQuantity());
        }
        System.out.println("Total cost of inventory: " + getInvValue());
        System.out.println("-------------------------------------------------");
    }
}

