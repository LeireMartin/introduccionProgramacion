package estudioFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Desencripta {
    public Desencripta() {
        File f;
        BufferedReader br;
        FileReader fr;
        String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] abecedarioReverso = { "z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k",
                "j", "i", "h", "g", "f", "e", "d", "c", "b", "a" };
        String[] mensaje;
        int[] mensajeInt;
        String fraseDesencriptada = "";
        String mensajeFinal = "";
        ;
        f = new File("Mensaje.txt");

        try {
            if (!f.exists()) {
                System.out.println("El fichero no existe, intentelode nuevo");
                f.createNewFile();
            } else {
                System.out.println("Fichero enlazado con exito!");
            }
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            mensaje = br.readLine().split(",");
            mensajeInt = new int[mensaje.length];
            for (int i = 0; i < mensaje.length; i++) {
                mensajeInt[i] = Integer.parseInt(mensaje[i]);
            }
            System.out.println(Arrays.toString(mensajeInt));
            System.out.println(mensajeInt.length);
            int numPalabras = mensajeInt[0];
            int numletras = 0;
            int cont = 0;
            int cont2 = 1;
            int salto = 0;

            for (int i = 0; i < numPalabras; i++) {
                salto += cont;
                numletras = mensajeInt[salto + 1];
                cont = (numletras * 2) + 1;

                int[] array = new int[(numletras * 2) + 1];

                for (int j = 0; j < array.length; j++) {

                    array[j] = mensajeInt[cont2];
                    cont2++;

                }

                // System.out.println(Arrays.toString(array));
                fraseDesencriptada = Desencriptacion(array, alfabeto, abecedarioReverso);
                // System.out.println(fraseDesencriptada);
                mensajeFinal += fraseDesencriptada;
            }
            System.out.println(mensajeFinal);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private String Desencriptacion(int[] array, String[] alfabeto, String[] abecedarioReverso) {
        String frase = "";
        int division = 0;
        int posicion = 0;
        int divPar = 0;
        for (int i = 1; i < array.length; i++) {

            division = i % 2;

            if (division == 0) {
                divPar = array[i] % 2;
                if (divPar == 0) {
                    frase += alfabeto[posicion - 1];
                } else {
                    frase += abecedarioReverso[posicion - 1];
                }

            } else {
                posicion = array[i];
            }

        }
        frase += " ";
        return frase;
    }
}
