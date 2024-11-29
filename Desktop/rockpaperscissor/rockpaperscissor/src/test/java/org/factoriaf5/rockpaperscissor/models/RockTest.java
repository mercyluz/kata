package org.factoriaf5.rockpaperscissor.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockTest {

    private Rock rock;
    private Paper paper;
    private Scissor scissor;

    @BeforeEach
    public void setUp() {
        // Initialize the objects before each test
        rock = new Rock();
        paper = new Paper();  // Assuming you already have a Paper class
        scissor = new Scissor();  // Assuming you already have a Scissor class
    }

    @Test
    public void testGetName() {
        // Test the name of the Rock object
        assertEquals("Rock", rock.getName());
    }

    @Test
    public void testWhoWinsAgainstRock() {
        // Test the result when Rock faces another Rock
        String result = rock.whoWins(rock);
        assertEquals("It's a tie!", result);
    }

    @Test
    public void testWhoWinsAgainstPaper() {
        // Test the result when Rock faces Paper
        String result = rock.whoWins(paper);
        assertEquals("Paper covers Rock. You lose!", result);
    }

    @Test
    public void testWhoWinsAgainstScissors() {
        // Test the result when Rock faces Scissors
        String result = rock.whoWins(scissor);
        assertEquals("Rock crushes Scissors. You win!", result);
    }
}
