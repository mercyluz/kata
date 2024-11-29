package org.factoriaf5.rockpaperscissor.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScissorTest {

    private Scissor scissor;
    private Paper paper;
    private Rock rock;

    @BeforeEach
    public void setUp() {
        // Initialize the objects before each test
        scissor = new Scissor();
        paper = new Paper();  // Assuming you have a Paper class
        rock = new Rock();    // Assuming you have a Rock class
    }

    @Test
    public void testGetName() {
        // Test the name of the Scissor object
        assertEquals("Scissor", scissor.getName());
    }

    @Test
    public void testWhoWinsAgainstRock() {
        // Test the result when Scissors faces Rock
        String result = scissor.whoWins(rock);
        assertEquals("Rock crushes Scissors. You lose!", result);
    }

    @Test
    public void testWhoWinsAgainstPaper() {
        // Test the result when Scissors faces Paper
        String result = scissor.whoWins(paper);
        assertEquals("Scissor cut Paper. You win!", result);
    }

    @Test
    public void testWhoWinsAgainstScissor() {
        // Test the result when Scissors faces another Scissors
        String result = scissor.whoWins(scissor);
        assertEquals("It's a tie!", result);
    }
}
