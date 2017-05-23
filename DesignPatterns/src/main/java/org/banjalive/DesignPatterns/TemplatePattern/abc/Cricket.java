package main.java.org.banjalive.DesignPatterns.TemplatePattern.abc;


import main.java.org.banjalive.DesignPatterns.TemplatePattern.Template.Game;

/**
 * Created by a.lebedjko on 2017.01.02..
 */
public class Cricket extends Game {

    @Override
    public String endPlay() {
        return "Cricket Game Finished!";
    }

    @Override
    public String initialize() {
        return "Cricket Game Initialized! Start playing.";
    }

    @Override
    public String startPlay() {
        return "Cricket Game Started. Enjoy the game!";
    }
}
