package com.zipcodewilmington.productmanager;

import java.util.Arrays;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {
    public static void main(String [] args){

        Product basketballs = new Product(40, 100, 5, "basketball");
        Product footballs = new Product(30, 101, 10, "football");
        Product baseballs = new Product(10, 102, 25, "baseball");
        Inventory sportsStore = new Inventory();
        sportsStore.addProduct(basketballs);
        sportsStore.addProduct(baseballs);
        sportsStore.addProduct(footballs);

        sportsStore.printInventory();
    }

}
