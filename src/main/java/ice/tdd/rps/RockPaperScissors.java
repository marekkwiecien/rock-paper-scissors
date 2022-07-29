package ice.tdd.rps;

public class RockPaperScissors {

    public Result eval(Choice playerOneChoice, Choice playerTwoChoice) {
        if(playerOneChoice == Choice.ROCK && playerTwoChoice == Choice.SCISSORS)
            return Result.PLAYER_ONE;
        if(playerOneChoice == Choice.SCISSORS && playerTwoChoice == Choice.ROCK)
            return Result.PLAYER_TWO;


        return null;
    }
}
