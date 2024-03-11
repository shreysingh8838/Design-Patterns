package FactoryDesignPattern.Factories;

import FactoryDesignPattern.Products.Product1;
import FactoryDesignPattern.Products.ProductInterface;

public class Creator1 implements CreatorInterface {
    @Override
    public ProductInterface createProduct(){
        return new Product1();
    }
}
