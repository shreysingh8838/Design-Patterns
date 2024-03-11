package AbstractFactoryDesignPattern.Products;

import AbstractFactoryDesignPattern.Products.Computer;

public class OfficeComputer implements Computer {
    public void render(){
        System.out.println("Office Computer here");
    }
}
