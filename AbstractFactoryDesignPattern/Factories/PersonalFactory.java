package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Factories.AllFactory;
import AbstractFactoryDesignPattern.Products.Computer;
import AbstractFactoryDesignPattern.Products.PersonalComputer;

public class PersonalFactory implements AllFactory {
    @Override
    public Computer createComputer(){
        return new PersonalComputer();
    }
}
