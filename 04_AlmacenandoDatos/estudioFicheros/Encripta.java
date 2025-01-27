package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Encripta {
    public Encripta() {
        File f;
        FileReader fr;
        BufferedReader br;

        try {
            f = new File("Encripta.txt");
            if (!f.exists()) {
                System.out.println("Fichero no encontrado");
                f.createNewFile();

            } else {
                System.out.println("Fichero enlazado con exito");
            }
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            // VARIABLES--------------
            String frase = "";
            frase = br.readLine();
            String palabra = "";
            String numPalabras = "";
            String palabraEncriptada = "";
            String abecedario = "abcdefghijklmnopqrstuvwxyz";
            String abecedarioReverso = "zyxwvutsrqponmlkjihgfedcba";
            String codigoSecreto = "";
            // PASAR DE STRING A ARRAY-------------------
            String[] palabras = frase.split(" ");
            // System.out.println(Arrays.toString(palabras));
            numPalabras = Integer.toString(palabras.length);
            codigoSecreto += numPalabras + ",";
            for (int i = 0; i < palabras.length; i++) {
                palabra = palabras[i];
                palabraEncriptada = metodoEncriptar(palabra, abecedario, abecedarioReverso);
                codigoSecreto += palabraEncriptada;
                System.out.println(codigoSecreto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String metodoEncriptar(String palabra, String abecedario, String abecedarioReverso) {
        String letra = "";
        String palabraEncriptada = "";
        int numLetras = palabra.length();
        String primerDigito = Integer.toString(numLetras);
        palabraEncriptada += primerDigito + ",";

        int[] arraydeAleatorios = new int[palabra.length()];
        arraydeAleatorios = generaAleSinRep(palabra);
        // System.out.println(Arrays.toString(arraydeAleatorios));

        for (int i = 0; i < numLetras; i++) {
            if (arraydeAleatorios[i] % 2 == 0) {
                letra = String.valueOf(palabra.charAt(i));
                System.out.println(letra);
                palabraEncriptada += Integer.toString(abecedario.indexOf(letra) + 1) + ",";
                palabraEncriptada += Integer.toString(arraydeAleatorios[i]) + ",";

            } else {
                letra = String.valueOf(palabra.charAt(i));
                System.out.println(letra);
                palabraEncriptada += Integer.toString(abecedarioReverso.indexOf(letra) + 1) + ",";
                palabraEncriptada += Integer.toString(arraydeAleatorios[i]) + ",";

            }
        }
        System.out.println(palabraEncriptada);
        return palabraEncriptada;
    }

    private int[] generaAleSinRep(String palabra) {
        int ale = 0;
        int[] arrayale = new int[palabra.length()];
        Arrays.fill(arrayale, 999);
        boolean repe = false;
        int min = -100;
        int max = 300;
        for (int i = 0; i < arrayale.length; i++) {
            do {
                ale = (int) Math.floor(Math.random() * (max - min + 1) + min);
                repe = false;
                for (int j = 0; j < arrayale.length; j++) {
                    if (ale == arrayale[j]) {
                        repe = true;
                        break;
                    }

                }
            } while (repe);

            arrayale[i] = ale;
        }

        return arrayale;

    }
}
