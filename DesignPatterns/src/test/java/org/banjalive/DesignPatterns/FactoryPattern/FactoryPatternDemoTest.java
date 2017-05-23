package test.java.org.banjalive.DesignPatterns.FactoryPattern;

import main.java.org.banjalive.DesignPatterns.FactoryPattern.Factory.ShapeFactory;
import main.java.org.banjalive.DesignPatterns.FactoryPattern.Interface.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class FactoryPatternDemoTest {
    @Test
    public void testDrawCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        assertEquals("Inside Circle::draw() method.", shape1.draw());
    }

    @Test
    public void testDrawRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        assertEquals("Inside Rectangle::draw() method.", shape1.draw());
    }

    @Test
    public void testDrawSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("SQUARE");
        assertEquals("Inside Square::draw() method.", shape1.draw());
    }

    @Test
    public void testEmptyShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        try {
            Shape shape1 = shapeFactory.getShape("");
        } catch (Exception exception) {
            assertEquals("shapeType can't be null or empty", exception.getMessage());
        }

    }
}