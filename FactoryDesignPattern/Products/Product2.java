package FactoryDesignPattern.Products;

import FactoryDesignPattern.Products.ProductInterface;

public class Product2 implements ProductInterface {

    @Override
    public void renderProduct(){
        System.out.println("Rendering Product 2");
    }
}
