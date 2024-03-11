package FactoryDesignPattern.Factories;

import FactoryDesignPattern.Products.Product2;
import FactoryDesignPattern.Products.ProductInterface;

public class Creator2 implements CreatorInterface {
    @Override
    public ProductInterface createProduct(){
        return new Product2();
    }
}
