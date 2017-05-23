package main.java.org.banjalive.DesignPatterns.FactoryPattern.Demo;

import main.java.org.banjalive.DesignPatterns.FactoryPattern.Factory.ShapeFactory;
import main.java.org.banjalive.DesignPatterns.FactoryPattern.Interface.Shape;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("");
        shape4.draw();
    }
}
