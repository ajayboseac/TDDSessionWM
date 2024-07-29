package com.walmart.game;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class GameScoreTest {

    @Test
    public void scoreShouldIncreaseBy4RunsWhenHittingFour(){
        GameScore gameScore = new GameScore();
        gameScore.hitBoundary(Boundaries.FOUR);
        assertEquals("Hitting a boundary should increase the run by 4 runs.",gameScore.getTotalRuns(),4);
    }


    @Test
    public void shouldPublishACelebrationEventWhenBoundaryIsHit(){

        GameScore gameScore = new GameScore(new EventHandler());
        gameScore.hitBoundary(Boundaries.FOUR);
    }
}
