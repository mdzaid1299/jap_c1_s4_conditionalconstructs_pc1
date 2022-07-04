package com.jap.cricketscoremanagement;


public class CricketScore {
    /**
     * Function accepts scores of 3 teams as input parameters and identifies the
     * team which is winner of the series.
     */

    public String winnerOfSeriesCalculation(int totalScore1, int totalScore2, int totalScore3) {
        return (totalScore1 > totalScore2) ? ((totalScore1 > totalScore3) ? "Australia is winner" : "New Zealand is winner") : (totalScore2 > totalScore3) ? "England is winner" : "New Zealand is winner";
    }
}
/**
 * if t1>t2 and (&&) t1>t3 aus is win, else
 *     if (t1>t2)
 *     {
 *     if(t1>t3)
 *     {aus is winner}
 *     else
 *     {new z is winner}
 *     }
 *     else if(t2>t1)
 *     {
 *     if (t2>t3)
 *     {eng is winner}
 *     else {new z is winner}
 *
 *     }
 *      else if {
 *
 *      }
 *
 *
 */
