package org.factoriaf5.tablademultiplicar;

import java.util.ArrayList;
import java.util.List;

public class Tablademultiplicar {
    public static List<String> generarTablademultiplicar(int n) {
        List<String> resultado = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            resultado.add(n + " x " + i + " = " + (n * i));
        }
        return resultado;
    }
}

