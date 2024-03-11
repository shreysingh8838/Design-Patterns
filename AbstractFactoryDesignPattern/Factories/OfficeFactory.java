package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Products.Computer;
import AbstractFactoryDesignPattern.Products.OfficeComputer;

public class OfficeFactory implements AllFactory{
    @Override
    public Computer createComputer(){
        return new OfficeComputer();
    }
}
