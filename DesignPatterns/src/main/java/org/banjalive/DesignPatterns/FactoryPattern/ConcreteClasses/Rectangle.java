package main.java.org.banjalive.DesignPatterns.FactoryPattern.ConcreteClasses;

import main.java.org.banjalive.DesignPatterns.FactoryPattern.Interface.Shape;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Inside Rectangle::draw() method.";
    }
}
