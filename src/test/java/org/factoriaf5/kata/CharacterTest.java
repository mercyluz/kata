package org.factoriaf5.kata;
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
    public void testHeal() {
        attacker.dealDamage(target, 1);
        target.heal(target);
        assertEquals(990, target.getHealth());
    }

    @Test
    public void testHealingCannotExceedMaxHealth() {
        attacker.heal(attacker);
        attacker.heal(attacker);
        assertEquals(1000, attacker.getHealth()); // Debería estar en 1000
    }

    @Test
    public void testDeadCharacterCannotBeHealed() {
        attacker.dealDamage(target, 1);
        target.dealDamage(target, 1); // Matar al target
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            target.heal(target);
        });
        assertEquals("Dead characters cannot be healed.", exception.getMessage());
    }

    // Iteration Two Tests

    @Test
    public void testDealDamageToSelf() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            attacker.dealDamage(attacker, 1);
        });
        assertEquals("A Character cannot deal damage to itself.", exception.getMessage());
    }

    // Iteration Three Tests

    @Test
    public void testAttackOutOfRange() {
        Character rangedAttacker = new Character(5L, "RangedAttacker", 20, 20);
        Character target = new Character(6L, "Target", 15, 20);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rangedAttacker.dealDamage(target, 21); // Fuera de rango
        });
        assertEquals("Target is out of range.", exception.getMessage());
    }
}
