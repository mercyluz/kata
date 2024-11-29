package org.factoriaf5.tablademultiplicar;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TablademultiplicarTest {
    
    private Tablademultiplicar Loops;

    @BeforeEach

    public void init() {
        this.Loops = new Tablademultiplicar();
    }
    @Test
    public void testTablademultiplicar() {
        //given - Teniendo
        int num = 5;

        // When - Cuando
        List<String> result = Tablademultiplicar.generarTablademultiplicar(num);

        // Then - Entonces
        assertEquals("5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 56\n5 x 9 = 45\n5 x 10 = 50", result);
        
    }
}