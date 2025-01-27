package estudioFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class tareaFicheros {
public tareaFicheros(){
    


        String nombreFichero = "arrays_bidimensionales.txt";

        // Leer arrays desde el fichero
        List<int[][]> arrays = leerArraysDesdeFichero(nombreFichero);

        // Crear los tres arrays bidimensionales
        if (arrays.size() >= 3) {
            int[][] array1 = arrays.get(0);
            int[][] array2 = arrays.get(1);
            int[][] array3 = arrays.get(2);

            // Mostrar los arrays creados
            System.out.println("Array 1:");
            mostrarArray(array1);
            System.out.println("Array 2:");
            mostrarArray(array2);
            System.out.println("Array 3:");
            mostrarArray(array3);
        } else {
            System.err.println("El archivo no contiene suficientes arrays bidimensionales.");
        }
    }

    public static List<int[][]> leerArraysDesdeFichero(String nombreFichero) {
        List<int[][]> arrays = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                int filas = Integer.parseInt(linea.trim()); 
                // Número de filas
                int[][] array = new int[filas][];
                for (int i = 0; i < filas; i++) {
                    linea = reader.readLine();
                    String[] elementos = linea.split(",");
                    array[i] = new int[elementos.length];
                    for (int j = 0; j < elementos.length; j++) {
                        array[i][j] = Integer.parseInt(elementos[j].trim());
                    }
                }
                arrays.add(array);
            }
            System.out.println("Datos leídos del fichero correctamente.");
        } catch (IOException e) {
            System.err.println("Error al leer los datos del fichero: " + e.getMessage());
        }
        return arrays;
    }

    public static void mostrarArray(int[][] array) {
        for (int[] fila : array) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}

