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

}
