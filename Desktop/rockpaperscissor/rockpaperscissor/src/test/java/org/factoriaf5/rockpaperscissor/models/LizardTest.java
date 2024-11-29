package org.factoriaf5.rockpaperscissor.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LizardTest {

    @Test
    public void testGetName() {
        Lizard lizard = new Lizard();
        assertEquals("Lizard", lizard.getName(), "The name of the Lizard should be 'Lizard'");
    }

    
    @Test
    public void testWhoWinsAgainstRock() {
        Lizard lizard = new Lizard();
        Rock rock = new Rock();

 
        assertEquals("Rock crushes Lizard. You lose!", lizard.whoWins(rock), "Lizard should lose to Rock");
    }

   
    @Test
    public void testWhoWinsAgainstPaper() {
        Lizard lizard = new Lizard();
        Paper paper = new Paper();

     
        assertEquals("Lizard eats Paper. You win!", lizard.whoWins(paper), "Lizard should win against Paper");
    }

    // Test para la interacción entre Lizard y Scissor
    @Test
    public void testWhoWinsAgainstScissor() {
        Lizard lizard = new Lizard();
        Scissor scissor = new Scissor();

        // Lizard vs Scissor
        assertEquals("Scissors decapitate Lizard. You lose!", lizard.whoWins(scissor), "Lizard should lose to Scissor");
    }

    // Test para la interacción entre Lizard y otro Lizard
    @Test
    public void testWhoWinsAgainstLizard() {
        Lizard lizard1 = new Lizard();
        Lizard lizard2 = new Lizard();

        // Lizard vs Lizard
        assertEquals("It's a tie!", lizard1.whoWins(lizard2), "Lizard vs Lizard should be a tie");
    }

    // Test para la interacción entre Lizard y Spock
    @Test
    public void testWhoWinsAgainstSpock() {
        Lizard lizard = new Lizard();
        Spock spock = new Spock();

        // Lizard vs Spock
        assertEquals("Lizard poisons Spock. You win!", lizard.whoWins(spock), "Lizard should win against Spock");
    }
}

