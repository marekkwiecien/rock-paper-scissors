package ice.tdd.rps;

import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsTest {

    private RockPaperScissors underTest = new RockPaperScissors();


    @Test
    public void rockWinsOverScissors() {
        // Given I have chosen rock
        var playerOneChoice = Choice.ROCK;
        //When the opponent chooses scissors
        var playerTwoChoice = Choice.SCISSORS;

        //Then I should win
        Assert.assertEquals(Result.PLAYER_ONE, underTest.eval(playerOneChoice, playerTwoChoice));
    }


//    ● Given I have chosen scissors
//    When the opponent chooses paper
//    Then I should win
//
    @Test
    public void scissorsWinsOverPaper() {
        // Given I have chosen scissors
        var playerOneChoice = Choice.SCISSORS;
        //When the opponent chooses paper
        var playerTwoChoice = Choice.PAPER;

        //Then I should win
        Assert.assertEquals(Result.PLAYER_ONE, underTest.eval(playerOneChoice, playerTwoChoice));
    }

}
