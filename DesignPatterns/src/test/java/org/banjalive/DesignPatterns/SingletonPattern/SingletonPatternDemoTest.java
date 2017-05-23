package test.java.org.banjalive.DesignPatterns.SingletonPattern;

import main.java.org.banjalive.DesignPatterns.SingletonPattern.SingleObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class SingletonPatternDemoTest {
    @Test
    public void testGetSingletonInstance() {
        SingleObject singleObject = SingleObject.getInstance();
        assertEquals("Hello world", singleObject.getGreetingsMessage());
    }

}