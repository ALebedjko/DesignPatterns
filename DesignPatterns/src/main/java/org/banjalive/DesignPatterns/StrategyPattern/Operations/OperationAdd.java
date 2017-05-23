package main.java.org.banjalive.DesignPatterns.StrategyPattern.Operations;

import main.java.org.banjalive.DesignPatterns.StrategyPattern.Interface.Strategy;

/**
 * Created by a.lebedjko on 2017.01.02..
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperations(int number1, int number2) {
        return number1 + number2;
    }
}
