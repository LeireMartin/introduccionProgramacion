package estudioEstructurasBasicas;

import java.util.Scanner;

public class EstudioEstructurasRepeticion {
    Scanner leer = new Scanner(System.in);

    public EstudioEstructurasRepeticion() {
        System.out.println("***Estudio de Estructuras de repetición***");

        System.out.println("*-Bucle For-*");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("******de 2 en 2********");
        int x = 0;
        System.out.println(x);
        for (int i = 1; i < 11; i += 2) {
            x = i;
            System.out.println(i);
        }
        System.out.println(x);

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("***Estudio bucle WHILE***");

        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        System.out.println("**** do  while ***");

        do {
            System.out.println(i);
            i++;
        } while (i < 11);

        //// EJERCICIO

        System.out.println("Introduzca números para calcular su suma total y el numero de numeros que ha metido:");
        System.out.println("(Para salir, introduzca un nº negativo)");

        int noIntroducido = 0;
        int cuentaNo = 0;
        int sumaNo = 0;

        while (noIntroducido >= 0) {
            noIntroducido = leer.nextInt();
            cuentaNo++;
            sumaNo += noIntroducido;

        }
        System.out.println("Ha introducido: "+(cuentaNo-1)+" números");
        System.out.println("La suma total de sus números es: "+(sumaNo - noIntroducido));

    }
}
