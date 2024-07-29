package com.walmart.gct.cricket;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class CricketScoreTest {

    @Test
    public void testWhenABallIsBowledNumberOfBallsBowledShouldIncreaseByOne(){

        CricketScore score = new CricketScore();
        score.ballBowled(CricketBallStatus.LGEAL_DELIVERY);
        int numBallBowled = score.getNumberOfBallsBowled();
        assertEquals("When a legal delivery is bowled, Number of balls bowled should increase by one",1,numBallBowled);
    }

    @Test
    public void testWhenABallIsNoBallNumberofBallsBowledShouldntIncrease(){

        CricketScore score = new CricketScore();
        score.ballBowled(CricketBallStatus.NO_BALL);
        int numBallBowled = score.getNumberOfBallsBowled();
        assertEquals("When a legal delivery is bowled, Number of balls bowled should increase by one",0,numBallBowled);
    }
}
