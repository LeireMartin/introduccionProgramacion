package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FicheroSecuencialesdeAcceso {
    public FicheroSecuencialesdeAcceso() {

        // Declaramos todas las variables
        File f;
        FileReader fr;
        BufferedReader br;
        String line = "";
        String[] alumnos;
        String[] asignaturas;
        int[][] notas;

        // enlazamos el fichero

        f = new File("Notas.txt");

        // leemos el fichero

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            //while ((line = br.readLine()) != null) {
            //    System.out.println(line);

           // }
            alumnos = br.readLine().split(",");
            asignaturas = br.readLine().split(",");
            notas = new int[asignaturas.length][];
            for (int i = 0; i < notas.length; i++) {
                notas[i] = lineaArray(br.readLine().split(","));

            }
            System.out.println(Arrays.toString(alumnos));
            System.out.println(Arrays.toString(asignaturas));
             System.out.println(Arrays.deepToString(notas));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private int[] lineaArray(String[] line) {
        String[] fila = line;
        int[] filaInt = new int[fila.length];
        for (int i = 0; i < filaInt.length; i++) {
            filaInt[i] = Integer.parseInt(fila[i]);

        }
        return filaInt;
    }

}
