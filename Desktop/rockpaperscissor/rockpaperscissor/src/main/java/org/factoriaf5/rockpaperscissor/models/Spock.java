package org.factoriaf5.rockpaperscissor.models;



public class Spock {
    public String getName() {
        return "Spock";
    }

    public String whoWins(Rock other) {
        return "Spock vaporizes Rock. You win!";
    }

    public String whoWins(Paper other) {
        return "Paper disproves Spock. You lose!";
    }

    public String whoWins(Scissor other) {
        return "Spock smashes Scissors. You win!";
    }

    public String whoWins(Lizard other) {
        return "Lizard poisons Spock. You lose!";
    }

    public String whoWins(Spock other) {
        return "It's a tie!";
    }
}
