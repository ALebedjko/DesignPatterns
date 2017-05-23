package main.java.org.banjalive.DesignPatterns.SingletonPattern;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class SingleObject {
    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be
    // instantiated
    private SingleObject(){};

    // get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public String getGreetingsMessage(){
        return "Hello world";
    }

}
