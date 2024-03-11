package FactoryDesignPattern;

import FactoryDesignPattern.Factories.Creator1;
import FactoryDesignPattern.Factories.Creator2;
import FactoryDesignPattern.Factories.CreatorInterface;

public class Client {
    public static void main(String[] args) {
        CreatorInterface c = new Creator1();
        c.createProduct().renderProduct();

        CreatorInterface c2 = new Creator2();
        c2.createProduct().renderProduct();
    }
}
