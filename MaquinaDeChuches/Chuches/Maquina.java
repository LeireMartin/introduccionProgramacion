import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Maquina {
    Scanner leer = new Scanner(System.in);

    public Maquina() {

        // Declarar fichero DONE
        File f;
        FileReader fr;
        BufferedReader br;
        f = new File("MaquinaChuches.txt");
        try {
            if (!f.exists()) {
                // System.out.println("El fichero no se ha enlazado.");
                f.createNewFile();
            } else {
                System.out.println("Fichero enlazado con éxito.");
            }
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            // Arrays de maquina expendedora
            int tamMatriz = Integer.parseInt(br.readLine());
            String[][] chuches = new String[tamMatriz][];
            double[][] precios = new double[tamMatriz][];
            int[][] cantidad = new int[tamMatriz][];
            // int[] contadores = new int[tamMatriz * tamMatriz];
            // Arrays.fill(contadores, 0);
            int[][] ventas = new int[tamMatriz][tamMatriz];
            // int[][]ventas2=new int[tamMatriz][tamMatriz];

            String[] precioString = new String[tamMatriz];
            String[] cantidadeStrings = new String[tamMatriz];

            double precio = 0;
            int cantidades = 0;

            for (int i = 0; i < tamMatriz; i++) {
                chuches[i] = br.readLine().split(",");

            }

            // System.out.println(Arrays.deepToString(chuches));
            for (int i = 0; i < tamMatriz; i++) {
                precioString = br.readLine().split(",");
                precios[i] = convertirADoble(precio, precioString, tamMatriz);
            }
            // System.out.println(Arrays.deepToString(precios));
            for (int i = 0; i < cantidad.length; i++) {
                cantidadeStrings = br.readLine().split(",");
                cantidad[i] = convertirAInt(cantidades, cantidadeStrings, tamMatriz);
            }
            // System.out.println(Arrays.deepToString(cantidad));
            boolean encendido = true;
            do {
                // Variables para interactuar con las chuches

                String pedirGolosina = "";
                String reponerGolosina = "";
                String clave = "";
                String claveCorrecta = "MaquinaExpendedora2017";

                int menu = 0;
                int cantidadReponer = 0;
                int posicion = 0;
                int fila = 0;
                int columna = 0;
                double ventasTotales = 0;
                double totalDia = 0;

                // Menú
                System.out.printf("¿Qué desea hacer hoy?%n");
                System.out.printf("1. Pedir Golosina    %n");
                System.out.printf("2. Mostrar Golosinas %n");
                System.out.printf("3. Rellenar Golosinas%n");
                System.out.printf("4. Apagar máquina    %n");

                menu = leer.nextInt();

                switch (menu) {
                    case 1:
                        pedirGolosina(pedirGolosina, chuches, precios, cantidad, ventas, posicion);
                        break;
                    case 2:
                        muestraGolosinas(tamMatriz, chuches, precios);
                        break;
                    case 3:
                        rellenaChuches(clave, claveCorrecta, reponerGolosina, posicion, fila, columna, cantidadReponer,
                                cantidad, chuches);
                        break;
                    case 4:
                        apagarMaquina(ventas, ventasTotales, precios, totalDia, chuches, encendido);
                        break;
                    default:
                        System.out.println("Número no reconocido, por favor intentelo de nuevo más tarde;");
                        break;
                }

            } while (encendido);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void apagarMaquina(int[][] ventas, double ventasTotales, double[][] precios, double totalDia,
            String[][] chuches, boolean encendido) {
        System.out.println("Aquí te dejo un resumen de las ventas de hoy: ");
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                if (ventas[i][j] > 0) {
                    ventasTotales = ventas[i][j] * precios[i][j];
                    totalDia += ventasTotales;

                    System.out.printf("%d%d %s Total de ventas %d recaudado en total %.2f %n", i, j,
                            chuches[i][j], ventas[i][j], ventasTotales);

                }
            }

        }

        System.out.printf("Las ventas totales de hoy han sido: %.2f euros %n", totalDia);

        System.out.println();
        encendido = false;

    }

    private void rellenaChuches(String clave, String claveCorrecta, String reponerGolosina, int posicion, int fila,
            int columna, int cantidadReponer, int[][] cantidad, String[][] chuches) {
        System.out.println("Introduzca la contraseña");
        clave = leer.next();

        if (compruebaClave(clave, claveCorrecta)) {

            System.out.println("Introduzca la posición de la golosina que desea reponer: ");

            boolean valorIncorrecto;

            do {
                valorIncorrecto = false;
                reponerGolosina = leer.next();
                try {

                    posicion = Integer.parseInt(reponerGolosina);

                    if (posicion < 0 || posicion > 3) {
                        throw new IndexOutOfBoundsException("La posición debe estar entre 0 y 3.");
                    }

                    System.out.println("Posición seleccionada: " + posicion);

                } catch (NumberFormatException e) {
                    System.out.println("Debe ingresar un número válido.");
                    valorIncorrecto = true;

                } catch (IndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                    valorIncorrecto = true;
                }
            } while (valorIncorrecto);

            fila = posicion / 10;
            columna = posicion % 10;
            System.out.println("Ingrese la cantidad que va a reponer:");
            cantidadReponer = leer.nextInt();
            cantidad[fila][columna] += cantidadReponer;
            System.out.printf("Se han ingresado %d de %s.%n", cantidadReponer, chuches[fila][columna]);

        } else {
            System.out.println("Contraseña Incorreta");
        }

    }

    private void pedirGolosina(String pedirGolosina, String[][] chuches, double[][] precios, int[][] cantidad,
            int[][] ventas, int posicion) {

        System.out.println("Indique la posición de la golosina que desea:");
        boolean valorIncorrecto;

        do {
            valorIncorrecto = false;
            pedirGolosina = leer.next(); // Asumimos que leer es un Scanner
            try {

                posicion = Integer.parseInt(pedirGolosina);

                if (posicion < 0 || posicion > 3) {
                    throw new IndexOutOfBoundsException("La posición debe estar entre 0 y 3.");
                }

                System.out.println("Posición seleccionada: " + posicion);

            } catch (NumberFormatException e) {
                // Capturar errores de formato
                System.out.println("Debe ingresar un número válido.");
                valorIncorrecto = true;

            } catch (IndexOutOfBoundsException e) {
                // Capturar errores de rango
                System.out.println(e.getMessage());
                valorIncorrecto = true;
            }
        } while (valorIncorrecto);

        int fila = posicion / 10;
        int columna = posicion % 10;

        if (cantidad[fila][columna] > 0) {
            cantidad[fila][columna]--;
            System.out.printf("Son: %.2f euros %n ", precios[fila][columna]);
            System.out.printf("Disfrute de su %s. Adiós.%n", chuches[fila][columna]);
            ventas[fila][columna]++;
        } else {
            System.out.println("Lo siento, se nos ha agotado el producto.");
        }

    }

    private void muestraGolosinas(int tamMatriz, String[][] chuches, double[][] precios) {
        System.out.printf("%n______________________________________________________%n");
        for (int i = 0; i < tamMatriz; i++) {
            System.out.println();
            for (int j = 0; j < tamMatriz; j++) {
                System.out.printf(" | %d%d       %s    %.2f| ", i, j, chuches[i][j], precios[i][j]);
            }
        }
        System.out.printf("%n______________________________________________________%n");
    }

    private double[] convertirADoble(double precio, String[] precioString, int tamMatriz) {
        double[] precios = new double[tamMatriz];
        for (int i = 0; i < precios.length; i++) {
            precios[i] = Double.parseDouble(precioString[i]);

        }
        return precios;
    }

    private int[] convertirAInt(int cantidades, String[] cantidadeStrings, int tamMatriz) {
        int[] cantidad = new int[tamMatriz];
        for (int i = 0; i < cantidad.length; i++) {
            cantidad[i] = Integer.parseInt(cantidadeStrings[i]);

        }

        return cantidad;
    }

    private boolean compruebaClave(String clave, String claveCorrecta) {
        if (clave.equals(claveCorrecta)) {
            return true;
        } else {
            return false;
        }
    }

}
