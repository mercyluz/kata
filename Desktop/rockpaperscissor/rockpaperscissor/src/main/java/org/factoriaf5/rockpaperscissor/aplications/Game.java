package org.factoriaf5.rockpaperscissor.aplications;


import java.util.Scanner;

import org.factoriaf5.rockpaperscissor.models.Paper;
import org.factoriaf5.rockpaperscissor.models.Rock;
import org.factoriaf5.rockpaperscissor.models.Scissor;

public class Game {
    public void start() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your move: Rock, Paper, or Scissors");
        String userChoice = scanner.nextLine().toLowerCase();

        Rock rock = new Rock();
        Paper paper = new Paper();
        Scissor scissors = new Scissor();

        String result = "";

        switch (userChoice) {
            case "rock":
                result = play(rock);
                break;
            case "paper":
                result = play(paper);
                break;
            case "scissors":
                result = play(scissors);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println(result);
               
    }
 
        
    private String play(Object playerChoice) {
       
        int randomChoice = (int) (Math.random() * 3);
        Object computerChoice = null;

        switch (randomChoice) {
            case 0:
                computerChoice = new Rock();
                break;
            case 1:
                computerChoice = new Paper();
                break;
            case 2:
                computerChoice = new Scissor();
                break;
        }

        if (playerChoice instanceof Rock) {
            return ((Rock) playerChoice).whoWins((Rock) computerChoice);
        } else if (playerChoice instanceof Paper) {
            return ((Paper) playerChoice).whoWins((Paper) computerChoice);
        } else {
            return ((Scissor) playerChoice).whoWins((Scissor) computerChoice);
            
        }
    }

    public static void main(String[] args) {
        new Game().start();
       
             
    }
}
