package main.java.org.banjalive.DesignPatterns.FactoryPattern.Factory;

import main.java.org.banjalive.DesignPatterns.FactoryPattern.ConcreteClasses.Circle;
import main.java.org.banjalive.DesignPatterns.FactoryPattern.ConcreteClasses.Rectangle;
import main.java.org.banjalive.DesignPatterns.FactoryPattern.ConcreteClasses.Square;
import main.java.org.banjalive.DesignPatterns.FactoryPattern.Interface.Shape;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.trim().length() == 0) {
            throw new RuntimeException("shapeType can't be null or empty");
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
