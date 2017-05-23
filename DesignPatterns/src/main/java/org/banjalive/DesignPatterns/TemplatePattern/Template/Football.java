package main.java.org.banjalive.DesignPatterns.TemplatePattern.Template;

/**
 * Created by a.lebedjko on 2017.01.02..
 */
public class Football extends Game {

    @Override
    String endPlay() {
        return "Football Game Finished!";
    }

    @Override
    public String initialize() {
        return "Football Game Initialized! Start playing.";
    }

    @Override
    public String startPlay() {
        return "Football Game Started. Enjoy the game!";
    }
}