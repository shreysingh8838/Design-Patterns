package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Factories.AllFactory;
import AbstractFactoryDesignPattern.Factories.OfficeFactory;
import AbstractFactoryDesignPattern.Factories.PersonalFactory;

public class Client {
    public static void main(String ... args){
        AllFactory funcPers = new PersonalFactory();
        funcPers.createComputer().render();

        AllFactory funcOffc = new OfficeFactory();
        funcOffc.createComputer().render();
    }
}
