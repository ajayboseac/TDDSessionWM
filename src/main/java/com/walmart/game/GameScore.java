package com.walmart.game;

public class GameScore {


    private int totalRuns;

    public GameScore(EventHandler eventHandler) {

    }

    public GameScore() {

    }

    public void hitBoundary(com.walmart.game.Boundaries boundaries) {

        this.totalRuns += boundaries.runs;
    }

    int getTotalRuns(){
        return totalRuns;
    }
}
