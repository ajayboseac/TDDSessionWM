package com.walmart;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CricketScoreTrackerTest {

    @Test
    public void ScoreShouldBeZeroWhenTheGameStarts(){
        Game game = CricketScoreTracker.createNewGame();
        assertEquals("When the game starts the score should be zero ",0,game.getScore());
    }

    public void ShoulBeAbletoTrackScores(){
        Game game = CricketScoreTracker.createNewGame();
    }
}
