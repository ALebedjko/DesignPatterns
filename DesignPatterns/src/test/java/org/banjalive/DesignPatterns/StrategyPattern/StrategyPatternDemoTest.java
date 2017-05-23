package test.java.org.banjalive.DesignPatterns.StrategyPattern;

import main.java.org.banjalive.DesignPatterns.StrategyPattern.Context.Context;
import main.java.org.banjalive.DesignPatterns.StrategyPattern.Operations.OperationAdd;
import main.java.org.banjalive.DesignPatterns.StrategyPattern.Operations.OperationMultiply;
import main.java.org.banjalive.DesignPatterns.StrategyPattern.Operations.OperationSubtract;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class StrategyPatternDemoTest {

    @Test
    public void testStrategyPatternOperationAdd(){
        Context context = new Context(new OperationAdd());
        assertEquals(15, context.executeStrategy(10,5));
    }

    @Test
    public void testStrategyPatternOperationSubtract(){
        Context context = new Context(new OperationSubtract());
        assertEquals(5, context.executeStrategy(10,5));
    }

    @Test
    public void testStrategyPatternOperationMultiply(){
        Context context = new Context(new OperationMultiply());
        assertEquals(50, context.executeStrategy(10,5));
    }
}