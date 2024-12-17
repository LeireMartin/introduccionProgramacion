package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros {
    public Ficheros() {

        File fichero;

        fichero = new File("fichero.txt");

        System.out.println("Nobre del fichero: " + fichero.getName());
        // Nombre del fichero.
        System.out.println("La ruta del fichero: " + fichero.getPath());
        // Ruta del fichro, tambin se puede poner: .getAbsolutePath()
        System.out.println("El tamaño del fichero es: " + fichero.length());

        System.out.println("-------------------");

        File f;
        f = new File("Prueba.txt");

        try {
            if (f.exists()) {
                System.out.println("El fichero Existe");
            } else {
                f.createNewFile();
                System.out.println("Fichero creado");

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        FileReader fr;
        BufferedReader br;
        String nombre = "";
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(f.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
