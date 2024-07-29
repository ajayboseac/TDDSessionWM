package com.walmart.gct.cricket;

public class CricketScore {

    int toatalNumberOfBallsBowled = 0;

    public void ballBowled(com.walmart.gct.cricket.CricketBallStatus cricketBallStatus) {
        if(cricketBallStatus == CricketBallStatus.LGEAL_DELIVERY){
            toatalNumberOfBallsBowled += 1;
        }
    }

    public int getNumberOfBallsBowled() {
        return toatalNumberOfBallsBowled  ;
    }
}
