package main.java.org.banjalive.DesignPatterns.StrategyPattern.Context;

import main.java.org.banjalive.DesignPatterns.StrategyPattern.Interface.Strategy;

/**
 * Created by a.lebedjko on 2017.01.02..
 */
public class Context  {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return strategy.doOperations(num1, num2);
    }
}
