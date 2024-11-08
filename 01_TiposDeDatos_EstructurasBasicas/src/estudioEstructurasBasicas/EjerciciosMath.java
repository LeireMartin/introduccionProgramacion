package estudioEstructurasBasicas;

import java.util.Scanner;

public class EjerciciosMath {
  public EjerciciosMath() {
    Scanner leer = new Scanner(System.in);

    System.out.println("*******Ejercicio 1*******");
    // 1. Introducir un número entero por teclado que se supone que es un año.
    // Indicar si es bisiesto o no y por qué motivo (P.e.: “Es bisiesto por ser
    // múltiplo de 4 y no de 100”.
    // P.e.: “Es bisiesto por ser múltiplo de 400”. P.e.: “No es bisiesto por ser
    // múltiplo de 100”).

    // int anno=0;

    // do{
    // System.out.println("Introduce un año para saber si es bisiesto");
    // anno = leer.nextInt();

    // }while(anno<0);
    // if (anno>0){
    // if((anno%100==0)&&(anno%400==0)){
    // System.out.println("El año "+ anno+" es Bisiesto a pesar de ser múltiplo de
    // 100 por que tabien es múltiplo de 400.");
    // }
    // else if(anno%100==0){
    // System.out.println("El año"+anno+ "no es bisiesto por que es múltiplo de
    // 100");
    // System.out.println("El año "+ anno+" es Bisiesto a pesar de ser múltiplo de
    // 100 por que tabien es múltiplo de 400.");
    // }
    // else if(anno%4==0){
    // System.out.println("El año "+anno+ " es bisiesto por que es múltipo de 4");
    // }
    // else{
    // System.out.println("El año "+anno+" no es bisiesto, no es múltiplo ni de 4 ni
    // de 400");
    // }
    // }
    /*
     * System.out.println("*******Ejercicio 2*******");
     * // 2. Calcular la suma : 1 + 2 + 3 +.....+ 20.
     * // Luego, la suma : 1 + 3 +5 + + 51.
     * // Y, por último, la suma : 1 - 2 + 3 - + 19 - 20.
     * 
     * // a.
     * int suma1 = 0;
     * for (int i = 1; i < 21; i++) {
     * suma1 += i;
     * }
     * System.out.println(suma1);
     * 
     * // //b.
     * 
     * int a = 0;
     * int suma2 = 0;
     * do {
     * a++;
     * if (a % 2 != 0) {
     * suma2 += a;
     * }
     * } while (a < 52);
     * System.out.println(suma2);
     * // c. -10
     * int suma3 = 0;
     * 
     * for (int no = 1; no < 21; no++) {
     * if (no % 2 == 0) {
     * suma3 -= no;
     * } else if (no % 2 != 0) {
     * suma3 += no;
     * }
     * }
     * System.out.println(suma3);
     */
    // 3. Leer 10 datos, compuesto cada uno de ellos por un nombre de persona y su
    // sueldo neto mensual,
    // y obtener y visualizar el nombre y sueldo de la persona que más cobra y de la
    // que menos.
    // Si hay varias con el mismo sueldo (máximo o mínimo) se presentará la primera
    // que aparezca en la secuencia de entrada.

    System.out.println("*****Sueldos y nombres*****");
    /*
     * int sueldo = 0, maxSueldo = 0, minSueldo = 99999999;
     * String nombre = "", maxSueldoNom = "", minSueldoNom = "";
     * 
     * for (int i = 0; i < 5; i++) {
     * System.out.
     * println("Ingrese primero un nombre y despues el sueldo correspondiente:");
     * nombre = leer.next();
     * sueldo = leer.nextInt();
     * if (sueldo > maxSueldo) {
     * maxSueldo = sueldo;
     * maxSueldoNom = nombre;
     * }
     * if (sueldo < minSueldo) {
     * minSueldo = sueldo;
     * minSueldoNom = nombre;
     * }
     * 
     * }
     * System.out.
     * printf("El mayor sueldo correspode a %s , que tiene un sueldo de %d .%n",
     * maxSueldoNom, maxSueldo);
     * System.out.
     * printf("El sueldo más bajo corresponde a %s , que tiene un sueldo de %d .%n "
     * , minSueldoNom,
     * minSueldo);
     */

    System.out.println("Mínimo común múltiplo:");
    // Dados dos números enteros positivos, hallar el mínimo común múltiplo.
    // Método a usar: Se van hallando los sucesivos múltiplos del mayor de
    // ellos hasta encontrar uno que sea divisible por el más pequeño.
    /*
     * int menor=0, mayor=0,mcm=0, cont=0;
     * System.out.
     * println("Introduzca dos números enteros positivos para saber el mínimo común múltiplo:"
     * );
     * menor=leer.nextInt();
     * mayor=leer.nextInt();
     * if(menor>mayor){
     * int aux=mayor;
     * mayor=menor;
     * menor=aux;
     * }
     * mcm=mayor;
     * do{
     * cont++;
     * mcm=mayor*cont;
     * }while(mcm%menor!=0);
     * System.out.printf("El MCM de %d, y %d, es: %d.",menor,mayor,mcm);
     */
    /*
     * //5.
     * System.out.println("*****Ejercicio 5*****");
     * System.out.println("Introduzca un número para conocerlo en binario:");
     * int noleido = leer.nextInt();
     * String binario = "";
     * 
     * if (noleido == 0) {
     * binario = "0";
     * } else {
     * while (noleido > 0) {
     * binario = (noleido % 2) + binario;
     * noleido /= 2;
     * }
     * 
     * System.out.println("En binario es: " + binario);
     * 
     * 
     * }
     */

    System.out.println("--Adivina el numero aleatorio--");

    /*
     * int mayor = 0, menor = 0, intentos = 0, aux = 0, aleatorio = 0, adivinaAle =
     * 0, contIntentos = 0;
     * System.out.
     * println("Introduzca dos números enteros entre los cuales se va a generar un aleatorio:"
     * );
     * mayor = leer.nextInt();
     * menor = leer.nextInt();
     * if (menor > mayor) {
     * aux = mayor;
     * mayor = menor;
     * menor = aux;
     * }
     * aleatorio = (int) Math.floor(Math.random() * (mayor - menor + 1) + menor);
     * System.out.
     * println("El número ya ha sido generado... Cuántos intentos quieres para adivinarlo?"
     * );
     * intentos = leer.nextInt();
     * while (intentos > 0) {
     * System.out.println("Adivina el numero!");
     * adivinaAle = leer.nextInt();
     * intentos--;
     * contIntentos++;
     * if (adivinaAle == aleatorio) {
     * System.out.
     * printf("Enhorabuena has acertado el número era: %d, has necesitado solo %d intentos."
     * ,
     * aleatorio, contIntentos);
     * break;
     * }
     * if (adivinaAle != aleatorio) {
     * if (adivinaAle < aleatorio) {
     * System.out.printf("El aleatorio es mayor que %d te quedan %d intentos. %n",
     * adivinaAle, intentos);
     * 
     * } else if (adivinaAle > aleatorio) {
     * System.out.printf("El aleatorio es menor que %d te quedan %d intentos. %n",
     * adivinaAle, intentos);
     * 
     * }
     * }
     * 
     * }
     * if (intentos == 0) {
     * System.out.println("Te quedaste sin intentos :( el numero era: "+aleatorio);
     * }
     */
    System.out.println("Ecuacion de segundo grado");
    /*
     * double x1, x2;
     * 
     * System.out.println("Este programa resuelve ecuaciones de segundo grado.");
     * System.out.println("ax^2 + bx + c = 0");
     * 
     * System.out.println("Por favor, introduzca los valores.");
     * 
     * System.out.print("a = ");
     * double a = leer.nextDouble();
     * 
     * System.out.print("b = ");
     * double b = leer.nextDouble();
     * 
     * System.out.print("c = ");
     * double c = leer.nextDouble();
     * 
     * 
     * // 0x^2 + 0x + 0 = 0
     * 
     * if ((a == 0) && (b == 0) && (c == 0)) {
     * System.out.println("La ecuación tiene infinitas soluciones.");
     * }
     * 
     * // 0x^2 + 0x + c = 0 con c distinto de 0
     * 
     * if ((a == 0) && (b == 0) && (c != 0)) {
     * System.out.println("La ecuación no tiene solución.");
     * }
     * 
     * // ax^2 + bx + 0 = 0 con a y b distintos de 0
     * 
     * if ((a != 0) && (b != 0) && (c == 0)) {
     * System.out.println("x1 = 0");
     * System.out.println("x2 = " + (-b / a));
     * }
     * 
     * 
     * // 0x^2 + bx + c = 0 con b y c distintos de 0
     * 
     * if ((a == 0) && (b != 0) && (c != 0)) {
     * System.out.println("x1 = x2 = " + (-c / b));
     * }
     * 
     * // ax^2 + bx + c = 0 con a, b y c distintos de 0
     * 
     * if ((a != 0) && (b != 0) && (c != 0)) {
     * 
     * double discriminante = b*b - (4 * a * c);
     * 
     * if (discriminante < 0) {
     * System.out.println("La ecuación no tiene soluciones reales");
     * } else {
     * System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
     * System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
     * }
     * }
     */
    

       System.out.println("¿Número elegante?");

        int menor = 123, mayor = 300;

        for (int num = menor; num < mayor; num++) {
            if (esElegante(num)) {
                System.out.println(num);
            }
        }
    
  }

  private static boolean esElegante(int num) {
    int suma;
    while (num != 1 && num != 4) {
        suma = 0;
        while (num > 0) {
            int resto = num % 10;
            suma += (resto * resto);
            num /= 10;
        }
        num = suma;
    }
    return num == 1;
}
}

