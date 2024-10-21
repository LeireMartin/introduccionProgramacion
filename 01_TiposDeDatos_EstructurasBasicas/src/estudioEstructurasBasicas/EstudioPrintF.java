package estudioEstructurasBasicas;

public class EstudioPrintF {
    public EstudioPrintF() {

        // TODO Esbozo de constructor generado automáticamente
        int x = 33;
        int y = 10;
        int contador = 0;
        double dec = 1 / 3.0;
        String nombre = "Pepe";
        String apell = "Garcia";
        // %d %f %s %c
        System.out.printf("Numero Entero: %d otro numero : %d %n", x, y);// Muestra los valores en orden determinado por
                                                                         // %d
        System.out.printf("%10d %n", x);
        System.out.println("dec con todos los decimales " + dec);
        System.out.printf("Real :%f %n", dec);
        System.out.printf("%.3f %n", dec);
        System.out.printf("Alineacion derecha %10.3f %n", dec);
        System.out.printf("Alineacion izquierda %-10.3f %d %n", dec, x);
        System.out.printf("%s %n", nombre);
        System.out.printf("%10s %n", nombre);
        System.out.printf("%-10s %-10s %n", nombre, apell);
        while (x < 123) {
            contador++;
            char c = (char) x;
            System.out.printf("%3d : %c", x, c);
            x++;
            if (contador == 5) {
                System.out.println("");
                contador = 0;
            }
        }
    }
}
