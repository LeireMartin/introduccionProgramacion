package estudioEstructurasBasicas;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class EjerciciosBucles {

    public EjerciciosBucles() {

        Scanner leer = new Scanner(System.in);
        /* 
          // 1. Multiplos de 5 del 0 al 100 con los 3 bucles
          int i = 0;
          while (i < 101) {
              System.out.println(i);
              i = i + 5;
          }
          for (int j = 0; j < 101; j += 5) {
              System.out.println(j);
          }
          int k = 0;
          do {
              System.out.println(k);
              k += 5;
          } while (k < 101);
  
  
          // 2.MUESTRA NUMS DEL 320 AL 160 DE -20 EN -20. Bucle while
  
  
          int l = 320;
          while (l > 159) {
              System.out.println(l);
              l = l - 20;
          }
        */
  
          // 3.Realiza el control de acceso a una caja fuerte. La combinación será un
          // número de 4 cifras. El programa nos pedirá
          // la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo
          // siento, esa no es la combinación”y si
          // acertamos se nos dirá “La caja fuerte se ha abierto
          // satisfactoriamente”.Tendremos cuatro oportunidades para abrir la
          // caja fuerte.
  
  
        /*Scanner leer = new Scanner(System.in);
          System.out.println("Introduza la clave");
          int m = 0;
          int cont = 4;
          do {
              m = leer.nextInt();
              cont--;
  
  
              if (m == 1234) {
                  System.out.println("La caja fuerte se ha abierto");
              } else if (m < 10000) {
  
  
                  System.out.println("pruebe otra vez, le quedan " + cont + " intentos.");
              } else if (cont == 0) {
                  System.out.println("Se le acabaron los itentos.");
              }
          } while (cont < 4 && cont > 0);
        */
  
  // 4.- Realiza un programa que nos diga cuántos dígitos tiene un número
          // introducido por teclado. Este ejercicio es
          // equivalente a otro realizado anteriormente, con la salvedad de que el
          // anterior estaba limitado a números de 5 dígitos
          // como máximo. En esta ocasión, hay que realizar el ejercicio utilizando
          // bucles; de esta manera, la única limitación en
          // el número de dígitos la establece el tipo de dato que se utilice (int o
          // long).
  
  
        /*System.out.println("Introduzca para saber cifras de un numero");
          int n = leer.nextInt();
          int contador=0;
          do{ n= n/10;contador++;
               if (n==0) {
                  System.out.println("EL número tiene "+contador+" cifras");
              }
          }while(n>0);
        */

        // 5.- Escribe un programa que calcule la media de un conjunto de números
        // positivos introducidos por teclado. A priori,
        // el programa no sabe cuántos números se introducirán. El usuario indicará que
        // ha terminado de introducir los datos
        // cuando meta un número negativo.
        /*
         * System.out.println("Introduzca sus notas para saber su media");
         * double notas = 0;
         * double sumaNotas = 0;
         * double contNotas = 0;
         * do {
         * notas = leer.nextDouble();
         * sumaNotas += notas; // poner primero sumaNotas para ir sumando las notas
         * contNotas++;
         * 
         * } while (notas > 0);
         * 
         * double mediaNotas = (sumaNotas - notas) / (contNotas - 1);// le quitamos la
         * ultima nota que es negativa y al
         * // contador le quitamos la ultima cifra(-1)
         * System.out.println(mediaNotas);
         * 
         * 
         */

        // 6.- Escribe un programa que muestre los n primeros términos de la serie de
        // Fibonacci. El primer término de la serie de
        // Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
        // anteriores, por lo que tendríamos que los términos
        // son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
        // introducir por teclado.
        /*
         * System.out.println("¿Cuántos números de la serie fibonacci quieres ver?");
         * int x = leer.nextInt();
         * if (x > 0) {
         * int ant = 0, sig = 1, fibo = 0;//fuera del bucle o se reasignan las variables
         * cada vez que etra en el bucle
         * for (int contFibo = 0; x > contFibo; contFibo++) {
        
         * System.out.println(fibo);
         * fibo = ant + sig;
         * ant = sig;
         * sig = fibo;
         * }
         * } else {
         * System.out.println("Introduzca un numero positiv mayor que 0 por favor");
         * }
         */

        // 7. ES PRIMO?

        /*
         * System.out.println("Introduzca un número para saber si es primo");
         * int num=leer.nextInt();
         * boolean esPrimo=true;
         * for(int div=2; div<num;div++){
         * int resto=num%div;
         * if (resto ==0){ esPrimo=false;}
         * }
         * if(esPrimo){
         * System.out.println("Es primo");
         * }
         * else{System.out.println("No es primo");}
         */
        // 8. Escribe un programa que obtenga los números enteros comprendidos entre dos
        // números introducidos por teclado y validados como distintos,
        //  el programa debe empezar por el menor de los
        // enteros introducidos e ir incrementando
        // de 7 en 7.

        /*int no1;
        int no2;
        boolean sonIguales=false;

        do {
            System.out.println("Introduzca dos numeros enteros diferentes:");
            no1 =leer.nextInt();
            no2 = leer.nextInt();
            sonIguales= no1==no2;
            if (sonIguales) {
                System.out.println("Los nº son iguales, por favor introduzca dos números diferentes.");
            } 
        }while(sonIguales);

        if(no1>no2){
            int aux= no1;
            no1=no2;
            no2=aux;
        }
        for( int i= no1; i<=no2;i+=7){
            System.out.print(i+" ");
        }
        System.out.println();
        */

        // 12. Factorial de un n pedido por teclado

        // System.out.println("Introduce un nº entero para conocer su factorial");

        // int num = leer.nextInt();

        // int factorial=1;
        // for(int i=num;i>0;i--){

        //     factorial*=i;
        // }
        // System.out.println(factorial);


    }
}
