package main.java.org.banjalive.DesignPatterns.TemplatePattern.Demo;

import main.java.org.banjalive.DesignPatterns.TemplatePattern.abc.Cricket;
import main.java.org.banjalive.DesignPatterns.TemplatePattern.Template.Football;
import main.java.org.banjalive.DesignPatterns.TemplatePattern.Template.Game;

/**
 * Created by a.lebedjko on 2017.01.02..
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();

        for (String result : game.play()
                ) {
            System.out.println(result);
        }

        game = new Football();
        for (String result : game.play()
                ) {
            System.out.println(result);
        }
    }
}
