package ejercicios;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

public class CuadradoMagico {
    int sumaRef = 0;

    public CuadradoMagico() {
        int[][] tabla = { { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };

        boolean sumaFilaIgual = false, sumaColIgual = false, sumaDiaIgual = false;

        sumaFilaIgual = sumaFilas(tabla);
        sumaColIgual = sumaCol(tabla);
        sumaDiaIgual = ((sumaDia(tabla) == sumaRef) && (sumaDiaInv(tabla) == sumaRef));

        if (sumaColIgual == sumaFilaIgual == sumaDiaIgual)
            System.out.println("Es un cuadrado mágico.");
        else {
            System.out.println("No es un cuadrado mágico.");
        }

        // GENERAR CUADRADO MÁGICO

        System.out.println("-----GENERAR CUADRADO MÁGICO----");

        int[][] cuadradoMagico = new int[5][5];
        int f = 0, c = 2;
        for (int x = 1; x < 26; x++) {
            cuadradoMagico[f][c] = x;
            if (x % 5 == 0) {
                f++;
                if (f > 4)
                    f = 0;

            } else {
                f--;
                if (f < 0)
                    f = 4;
                c++;
                if (c > 4)
                    c = 0;
            }

        }
        for (int fila = 0; f < cuadradoMagico.length; f++) {
            System.out.println(Arrays.toString(cuadradoMagico[fila]));
        }

    }

    private int sumaDiaInv(int[][] tabla) {
        int sumadiainv = 0;
        int c = tabla.length - 1;
        for (int f = 0; f < tabla.length; f++) {
            sumadiainv += tabla[f][c--];

        }
        return sumadiainv;
    }

    private int sumaDia(int[][] tabla) {
        int sumadia = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i == j)
                    sumadia += tabla[i][j];
            }
        }
        return sumadia;
    }

    private boolean sumaCol(int[][] tabla) {
        int sumacol = 0;
        for (int j = 0; j < tabla[0].length; j++) {
            sumacol = 0;
            for (int i = 0; i < tabla.length; i++) {
                sumacol += tabla[i][j];
            }
            if (sumacol != sumaRef)
                return false;

        }
        return true;
    }

    private boolean sumaFilas(int[][] tabla) {
        int sumafila = 0;
        for (int i = 0; i < tabla[0].length; i++) {
            sumaRef += tabla[0][i];
        }
        for (int f = 1; f < tabla.length; f++) {
            sumafila = 0;
            for (int c = 0; c < tabla[f].length; c++) {
                sumafila += tabla[f][c];
            }
            if (sumafila != sumaRef) {
                return false;
            }
        }
        return true;
    }

}
