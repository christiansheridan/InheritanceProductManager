package com.zipcodewilmington.productmanager;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by leon on 1/10/18.
 */
public class ProductTest{
    @Test public void hasPrice(){
        Product product = new Product();
        product.setPrice(2);

        //when
        int actualOutput = product.getPrice();
        int expectedOutput = 2;

        //then
        Assert.assertEquals(expectedOutput, actualOutput);

    }

    @Test public void hasId(){
        Product product = new Product();
        product.setId(101);

        //when
        int actualOutput = product.getId();
        int expectedOutput = 101;

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test public void hasQuantity(){
        Product product = new Product();
        product.setQuantity(5);

        //when
        int actualOutput = product.getQuantity();
        int expectedOutput = 5;

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test public void hasName(){
        Product product = new Product();
        product.setName("Tennis ball");

        //when
        String actualOutput = product.getName();
        String expectedOutput = "Tennis ball";

        //then
        Assert.assertEquals(expectedOutput, actualOutput);

    }

    @Test public void inventorySum(){
        Inventory testInv = new Inventory();
        Product hockeyPuck = new Product(10, 102, 10, "Hockey Puck");
        Product cleats = new Product(100, 105, 5, "Cleats");
        testInv.addProduct(hockeyPuck);
        testInv.addProduct(cleats);

        int actualOutput = testInv.getInvValue();
        int expectedOutput = 600;

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test public void inventoryQuantity(){
        Inventory testInv = new Inventory();
        Product hockeyPuck = new Product(10, 102, 10, "Hockey Puck");
        Product cleats = new Product(100, 105, 5, "Cleats");
        testInv.addProduct(hockeyPuck);
        testInv.addProduct(cleats);

        int actualOutput = testInv.getInvQuant();
        int expectedOutput = 15;

        Assert.assertEquals(expectedOutput, actualOutput);
    }


}
