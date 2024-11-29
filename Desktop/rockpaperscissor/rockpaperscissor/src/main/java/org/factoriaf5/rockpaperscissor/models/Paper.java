package org.factoriaf5.rockpaperscissor.models;

public class Paper {
    public String getName() {
        return "Paper";
    }

    public String whoWins(Rock other) {
        return "Paper covers Rock. You win!";
    }

    public String whoWins(Paper other) {
        return "It's a tie!";
    }

    public String whoWins(Scissor other) {
        return "Scissors cut Paper. You lose!";
    }
}

