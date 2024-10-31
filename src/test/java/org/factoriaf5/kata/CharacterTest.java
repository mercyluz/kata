package org.factoriaf5.kata;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    private Character attacker;
    private Character target;

    @BeforeEach
    public void setUp() {
        attacker = new Character(1L, "Attacker", 20, 2);
        target = new Character(2L, "Target", 15, 2);
    }

    // Iteration One Tests

    @Test
    public void testInitialHealthAndStatus() {
        assertEquals(1000, attacker.getHealth());
        assertTrue(attacker.isAlive());
    }

    @Test
    public void testDealDamage() {
        attacker.dealDamage(target, 1);
        assertEquals(980, target.getHealth());
    }

    @Test
    public void testDamageDepletesHealth() {
        attacker.dealDamage(target, 1);
        attacker.dealDamage(target, 1);
        assertEquals(960, target.getHealth());
    }

    @Test
    public void testCharacterDiesWhenHealthIsZero() {
        Character weakTarget = new Character(3L, "WeakTarget", 1000, 1);
        attacker.dealDamage(weakTarget, 1);
        assertFalse(weakTarget.isAlive());
    }

    @Test
    public void testHeal() {
        attacker.dealDamage(target, 1);
        target.heal(target);
        assertEquals(990, target.getHealth());
    }
}