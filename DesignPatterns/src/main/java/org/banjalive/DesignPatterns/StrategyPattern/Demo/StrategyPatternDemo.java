package main.java.org.banjalive.DesignPatterns.StrategyPattern.Demo;

import main.java.org.banjalive.DesignPatterns.StrategyPattern.Context.Context;
import main.java.org.banjalive.DesignPatterns.StrategyPattern.Operations.OperationAdd;
import main.java.org.banjalive.DesignPatterns.StrategyPattern.Operations.OperationMultiply;
import main.java.org.banjalive.DesignPatterns.StrategyPattern.Operations.OperationSubtract;

/**
 * Created by a.lebedjko on 2017.01.02..
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
