package main.java.org.banjalive.DesignPatterns.SingletonPattern;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();


        SingleObject object = SingleObject.getInstance();
        System.out.println(object.getGreetingsMessage());
    }
}
