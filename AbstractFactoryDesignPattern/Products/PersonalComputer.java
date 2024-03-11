package AbstractFactoryDesignPattern.Products;

import AbstractFactoryDesignPattern.Products.Computer;

public class PersonalComputer implements Computer {
    @Override
    public void render(){
        System.out.println("Personal Computer Here");
    }
}
