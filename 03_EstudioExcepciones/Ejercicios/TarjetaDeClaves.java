import java.util.InputMismatchException;
import java.util.Scanner;

public class TarjetaDeClaves {
    public TarjetaDeClaves() {
        System.out.println("Tarjeta de Claves");
        Scanner leer = new Scanner(System.in);
        // declaramos variables

        int cont = 3;
        String fila = "ABCDE";
        int[] columna = { 1, 2, 3, 4, 5, 6 };

        int[][] tarjetaDeClaves = new int[fila.length()][columna.length];
        tarjetaDeClaves = generaTarjeta(tarjetaDeClaves, fila, columna);
        muestraTarjeta(tarjetaDeClaves, fila, columna);
        int coordenadaX = (int) Math.floor(Math.random() * (4 - 0 + 1) + 0);
        int coordenadaY = (int) Math.floor(Math.random() * (5 - 0 + 1) + 0);
        int clave = tarjetaDeClaves[coordenadaX][coordenadaY];
        int num=0;
        boolean incorrecto=true;

        do {
            System.out.println("Introduzca la clave con las coordenadas :" + fila.charAt(coordenadaX) + " , "
                    + columna[coordenadaY] + " . Tiene " + cont + " intentos.");
            cont--;
            do{
                incorrecto=false;
                try {
            num = leer.nextInt();
                }catch( InputMismatchException e) {
                    incorrecto=true;
              System.out.println(e.getMessage());
            }
            }while(incorrecto);
        } while (cont > 0 && clave != num);
        if (clave == num) {
            System.out.println("¡Clave correcta!");
        }
        if (cont == 0) {
            System.out.println("Lo siento, se ha quedado sin intentos.");

        }

    }

    private void muestraTarjeta(int[][] tarjetaDeClaves, String fila, int[] columna) {
        System.out.println("__________________________________________________");
        for (int x = 0; x < fila.length(); x++) {

            System.out.printf("     %s   ", fila.charAt(x));
        }
        for (int x = 0; x < tarjetaDeClaves.length; x++) {
            System.out.printf(" %n  %d", columna[x]);
            for (int y = 0; y < tarjetaDeClaves[x].length; y++) {
                System.out.printf("   %d   ", tarjetaDeClaves[x][y]);
            }
        }
        System.out.printf("%n|_________________________________________________|%n");
    }

    private int[][] generaTarjeta(int[][] tarjetaDeClaves, String fila, int[] columna) {
        int max = 999, min = 100, cant = fila.length(), ale = 0;

        for (int x = 0; x < tarjetaDeClaves.length; x++) {
            for (int y = 0; y < tarjetaDeClaves[x].length; y++) {
                do {
                    ale = (int) Math.floor(Math.random() * (max - min - 1) + min);
                    tarjetaDeClaves[x][y] = ale;
                } while (repetido(ale, tarjetaDeClaves));

            }

        }
        return tarjetaDeClaves;

    }

    private boolean repetido(int ale, int[][] tarjetaDeClaves) {
        boolean repetido = true;
        for (int x = 0; x < tarjetaDeClaves.length; x++) {
            for (int y = 0; y < tarjetaDeClaves[x].length; y++) {
                if (ale == tarjetaDeClaves[x][y]) {
                    repetido = false;

                    break;

                }
            }
        }
        return repetido;
    }

}
