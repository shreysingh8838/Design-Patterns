package FactoryDesignPattern.Products;

import FactoryDesignPattern.Products.ProductInterface;

public class Product1 implements ProductInterface {

    @Override
    public void renderProduct(){
        System.out.println("Rendering Product 1");
    }
}
