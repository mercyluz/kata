package org.factoriaf5.rockpaperscissor.models;

public class Scissor {
    public String getName() {
        return "Scissor";
    }

    public String whoWins(Rock other) {
        return "Rock crushes Scissors. You lose!";
    }

    public String whoWins(Paper other) {
        return "Scissor cut Paper. You win!";
    }

    public String whoWins(Scissor other) {
        return "It's a tie!";
    }
}