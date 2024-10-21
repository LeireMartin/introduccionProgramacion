package estudioEstructurasBasicas;

import java.util.Scanner;

public class EstudioEstructurasCondicionales {

    public EstudioEstructurasCondicionales() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Estudio de Estructuras Condicionales");

        int edad = 20;
        boolean esBisiesto = true;
        if (esBisiesto) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("No es bisiesto.");
        }
        boolean esMayordeEdad = edad >= 18;
        if (esMayordeEdad) {
            System.out.println("Es mayor de edad");
        } else {
            System.err.println("Es menor de edad.");
        }

        // Equals metodo IF/ELSE IF/ELSE

        System.out.println(" Equals y Else if");

        // SWITCH
        System.out.println("Introduzca los valores.");
        double j = leer.nextDouble();
        double k = leer.nextDouble();

        System.out.println("Menu");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Mutiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Salir.");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduzca los valores.");
                double suma = j + k;
                System.out.println("La suma de " + j + " + " + k + " es igual a: " + suma);

                break;

            case 2:
                double resta = j - k;
                System.out.println("La resta de " + j + " + " + k + " es igual a: " + resta);

                break;
            case 3:
                double mul = j * k;
                System.out.println("La multiplicación de " + j + " x " + k + " es igual a: " + mul);
                break;
            case 4:
                double div = j / k;
                System.out.println("La división de " + j + " / " + k + " es igual a: " + div);

                break;
            case 5:
                System.out.println("Adiós.");

                break;
            default:
                System.out.println("No reconozco ese número.");
                break;
        }
        // Estudio Switch

        System.out.println("Por favor introduzca un mes según su número");

        int mes = leer.nextInt();

        String nombreDelMes;
        switch (mes) {
            case 1:
                nombreDelMes = "enero";
                break;// si no pusieramos un break cogeria todas las siguientes al corrspondiente,
                      // ejemplo 2 = Febrero, Marzo, Abri, etc

            case 2:
                nombreDelMes = "Febrero";
                break;

            case 3:
                nombreDelMes = "Marzo";

                break;

            case 4:
                nombreDelMes = "Abril";
                break;

            case 5:
                nombreDelMes = "Mayo";

                break;

            case 6:
                nombreDelMes = "Junio";
                break;

            case 7:
                nombreDelMes = "Julio";

                break;

            case 8:
                nombreDelMes = "Agosto";
                break;

            case 9:
                nombreDelMes = "Septiembre";

                break;

            case 10:
                nombreDelMes = "Octubre";
                break;

            case 11:
                nombreDelMes = "Noviembre";
                break;

            case 12:
                nombreDelMes = "Diciembre";
                break;

            default:
                nombreDelMes = "No existe un mes con ese valor númerico";
        }

        System.out.println("Mes " + mes + ": " + nombreDelMes);

    }
}
