package main.java.org.banjalive.DesignPatterns.TemplatePattern.Template;

import java.util.ArrayList;

/**
 * Created by a.lebedjko on 2017.01.02..
 */
public abstract class Game {
    public abstract String initialize();

    public abstract String startPlay();

    public abstract String endPlay();

    public final ArrayList<String> play() {
        ArrayList<String> resultsList = new ArrayList<>();
        resultsList.add(initialize());
        resultsList.add(startPlay());
        resultsList.add(endPlay());
        return resultsList;
    }
}
