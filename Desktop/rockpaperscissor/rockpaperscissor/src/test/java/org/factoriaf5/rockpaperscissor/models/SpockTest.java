package org.factoriaf5.rockpaperscissor.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpockTest {

    
    @Test
    public void testGetName() {
        Spock spock = new Spock();
        assertEquals("Spock", spock.getName(), "The name of the object should be 'Spock'");
    }

    @Test
    public void testWhoWinsAgainstRock() {
        Spock spock = new Spock();
        Rock rock = new Rock();

        assertEquals("Spock vaporizes Rock. You win!", spock.whoWins(rock), "Spock should win against Rock");
    }

    // Test para la interacción entre Spock y Paper
    @Test
    public void testWhoWinsAgainstPaper() {
        Spock spock = new Spock();
        Paper paper = new Paper();

        // Spock vs Paper
        assertEquals("Paper disproves Spock. You lose!", spock.whoWins(paper), "Spock should lose to Paper");
    }

    // Test para la interacción entre Spock y Scissor
    @Test
    public void testWhoWinsAgainstScissor() {
        Spock spock = new Spock();
        Scissor scissor = new Scissor();

        // Spock vs Scissor
        assertEquals("Spock smashes Scissors. You win!", spock.whoWins(scissor), "Spock should win against Scissor");
    }

    // Test para la interacción entre Spock y Lizard
    @Test
    public void testWhoWinsAgainstLizard() {
        Spock spock = new Spock();
        Lizard lizard = new Lizard();

        // Spock vs Lizard
        assertEquals("Lizard poisons Spock. You lose!", spock.whoWins(lizard), "Spock should lose to Lizard");
    }

    // Test para la interacción entre Spock y otro Spock
    @Test
    public void testWhoWinsAgainstSpock() {
        Spock spock1 = new Spock();
        Spock spock2 = new Spock();

        // Spock vs Spock
        assertEquals("It's a tie!", spock1.whoWins(spock2), "Spock vs Spock should be a tie");
    }
}
