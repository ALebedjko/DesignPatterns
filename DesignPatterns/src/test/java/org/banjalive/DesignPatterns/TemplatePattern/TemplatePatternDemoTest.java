package test.java.org.banjalive.DesignPatterns.TemplatePattern;

import main.java.org.banjalive.DesignPatterns.TemplatePattern.abc.Cricket;
import main.java.org.banjalive.DesignPatterns.TemplatePattern.Template.Football;
import main.java.org.banjalive.DesignPatterns.TemplatePattern.Template.Game;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by a.lebedjko on 2017.01.03..
 */
public class TemplatePatternDemoTest {

    @Test
    public void testTemplatePatternGameCricket(){
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Cricket Game Initialized! Start playing.");
        expectedResult.add("Cricket Game Started. Enjoy the game!");
        expectedResult.add("Cricket Game Finished!");

        Game game = new Cricket();
        assertEquals(expectedResult, game.play());
    }

    @Test
    public void testTemplatePatternGameFootball(){
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Football Game Initialized! Start playing.");
        expectedResult.add("Football Game Started. Enjoy the game!");
        expectedResult.add("Football Game Finished!");

        Game game = new Football();
        assertEquals(expectedResult, game.play());
    }
}