package org.factoriaf5.rockpaperscissor.aplications;

import org.factoriaf5.rockpaperscissor.models.Paper;
import org.factoriaf5.rockpaperscissor.models.Rock;
import org.factoriaf5.rockpaperscissor.models.Scissor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTest {

    private Game game;
    private ByteArrayOutputStream outputStream;
    @BeforeEach
    public void setUp() {
        game = new Game();
        
        // Capture the output printed to System.out
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testStartWithRockChoice() {
        // Simulate user input (Rock)
        simulateUserInput("rock\n");

        // Run the game
        game.start();

        // Capture the output and check that "Rock" appears
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Rock"));
    }

    @Test
    public void testStartWithPaperChoice() {
        // Simulate user input (Paper)
        simulateUserInput("paper\n");

        // Run the game
        game.start();

        // Capture the output and check that "Paper" appears
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Paper"));
    }

    @Test
    public void testStartWithScissorsChoice() {
        // Simulate user input (Scissors)
        simulateUserInput("scissors\n");

        // Run the game
        game.start();

        // Capture the output and check that "Scissors" appears
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Scissors"));
    }

    @Test
    public void testStartWithInvalidChoice() {
        // Simulate invalid user input
        simulateUserInput("invalid\n");

        // Run the game
        game.start();

        // Capture the output and check for the invalid message
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Invalid choice!"));
    }

    @Test
    public void testGameLogicWithRockVsScissors() {
        // We will mock the computer's choice as Scissors
        Rock rock = new Rock();
        Scissor scissor = new Scissor();

        String result = rock.whoWins(scissor);
        assertEquals("Rock crushes Scissors. You win!", result);
    }

    @Test
    public void testGameLogicWithPaperVsRock() {
        // We will mock the computer's choice as Rock
        Paper paper = new Paper();
        Rock rock = new Rock();

        String result = paper.whoWins(rock);
        assertEquals("Paper covers Rock. You win!", result);
    }

    @Test
    public void testGameLogicWithScissorsVsPaper() {
        // We will mock the computer's choice as Paper
        Scissor scissor = new Scissor();
        Paper paper = new Paper();

        String result = scissor.whoWins(paper);
        assertEquals("Scissor cut Paper. You win!", result);
    }

    // Helper method to simulate user input
    private void simulateUserInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    
}
