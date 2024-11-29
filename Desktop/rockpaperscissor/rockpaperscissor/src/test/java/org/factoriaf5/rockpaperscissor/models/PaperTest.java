package org.factoriaf5.rockpaperscissor.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaperTest {

    private Paper paper;
    private Rock rock;
    private Scissor scissor;

    @BeforeEach
    public void setUp() {
        // Initialize the objects before each test
        paper = new Paper();
        rock = new Rock(); // Assuming you have a Rock class
        scissor = new Scissor(); // Assuming you have a Scissor class
    }

    @Test
    public void testGetName() {
        // Test the name of the Paper object
        assertEquals("Paper", paper.getName());
    }

    @Test
    public void testWhoWinsAgainstRock() {
        // Test the result when Paper faces Rock
        String result = paper.whoWins(rock);
        assertEquals("Paper covers Rock. You win!", result);
    }

    @Test
    public void testWhoWinsAgainstPaper() {
        // Test the result when Paper faces another Paper
        String result = paper.whoWins(paper);
        assertEquals("It's a tie!", result);
    }

    @Test
    public void testWhoWinsAgainstScissors() {
        // Test the result when Paper faces Scissors
        String result = paper.whoWins(scissor);
        assertEquals("Scissors cut Paper. You lose!", result);
    }
}
