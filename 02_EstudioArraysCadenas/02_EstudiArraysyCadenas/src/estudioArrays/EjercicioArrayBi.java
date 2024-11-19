package estudioArrays;

import java.util.Scanner;

public class EjercicioArrayBi {
    public EjercicioArrayBi() {
        // 1.- Escriba un programa que permita registrar 6 números en forma de tabla
        // 3x2. A
        // continuación el programa mostrará los valores máximo y mínimo de cada fila y
        // de toda la
        // tabla.
        // Cual es el num mayor y menor de cada fila y de todo el array.
        Scanner leer = new Scanner(System.in);

        System.out.println(
                "Intoduzca valores para rellenar un array, te dire cual es el vaor máximo de una fila y en general");

        // int[][] array = new int[3][2];

        /**
         * for (int f = 0; f < array.length; f++) {
         * for (int c = 0; c < array[f].length; c++) {
         * array[f][c] = leer.nextInt();
         * 
         * }
         * }
         **/

        /**
         * int menor = 99, mayor = 0, menorCol = 99, mayorCol = 0, menorFil = 99,
         * mayorFil = 0;
         * int[][] array = { { 1, 2 },
         * { 3, 4 },
         * { 5, 6 } };
         * 
         * for (int f = 0; f < array.length; f++) {
         * 
         * for (int c = 0; c < array[f].length; c++) {
         * if (menor > array[f][c]) {
         * menor = array[f][c];
         * }
         * if (mayor < array[f][c]) {
         * mayor = array[f][c];
         * }
         * 
         * }
         * }
         * System.out.println("Mayor " + mayor + " y menor " + menor + " del array.");
         * 
         * System.out.println("Seleccione columna para conocer el mayor y el menor");
         * int c = leer.nextInt();
         * c--;
         * for (int f = 0; f < array.length; f++) {
         * if (menorCol > array[f][c]) {
         * menorCol = array[f][c];
         * }
         * if (mayorCol < array[f][c]) {
         * mayorCol = array[f][c];
         * }
         * 
         * }
         * System.out.println(mayorCol + "y" + menorCol);
         * 
         * System.out.println("Seleccione fila para conocer el mayor y el menor");
         * int f = leer.nextInt();
         * f--;
         * for (int columna = 0; columna < array[f].length; columna++) {
         * if (menorFil > array[f][columna]) {
         * menorFil = array[f][columna];
         * }
         * if (mayorFil < array[f][columna]) {
         * mayorFil = array[f][columna];
         * }
         * }
         * 
         * System.out.println(mayorFil + " y " + menorFil);
         **/
        leer = null;
        // 2.-Diseña un programa en Java que rellene un array de 4x4 de la siguiente
        // manera:
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1
        // A continuación muestre el contenido del array por pantalla.
        System.out.println("Rellenar la diagonal principal");

        /**
         * int[][] diagonalPrincipal = new int[4][4];
         * for (int f = 0; f < diagonalPrincipal.length; f++) {
         * for (int c = 0; c < diagonalPrincipal[f].length; c++) {
         * if (f == c) {
         * diagonalPrincipal[f][c] = 1;
         * 
         * } else {
         * diagonalPrincipal[f][c] = 0;
         * }
         * 
         * }
         * }
         * System.out.printf("%d-%d-%d-%d%n", diagonalPrincipal[0][0],
         * diagonalPrincipal[0][1], diagonalPrincipal[0][2],
         * diagonalPrincipal[0][3]);
         * System.out.printf("%d-%d-%d-%d%n", diagonalPrincipal[1][0],
         * diagonalPrincipal[1][1], diagonalPrincipal[1][2],
         * diagonalPrincipal[1][3]);
         * System.out.printf("%d-%d-%d-%d%n", diagonalPrincipal[2][0],
         * diagonalPrincipal[2][1], diagonalPrincipal[2][2],
         * diagonalPrincipal[2][3]);
         * System.out.printf("%d-%d-%d-%d%n", diagonalPrincipal[3][0],
         * diagonalPrincipal[3][1], diagonalPrincipal[3][2],
         * diagonalPrincipal[3][3]);
         **/

        /**
         * 3.-Diseñar un programa en Java que compruebe si un array de enteros de 5x5,
         * es un cuadrado mágico.
         * Se considera un cuadrado mágico aquel en el que las filas, las columnas y las
         * diagonales suman igual.
         **/

        int[][] cuadradoMagico = {  { 1, 1, 1, 1, 1 },
                                    { 1, 1, 1, 1, 1 },
                                    { 1, 1, 1, 1, 1 },
                                    { 1, 1, 1, 1, 1 },
                                    { 1, 1, 1, 1, 1 } };

        int  sumafila = 0, sumacolumna = 0, sumadiagonal = 0;
        boolean magico = false;

        sumafila = sumarFilas(cuadradoMagico);
        sumacolumna = sumarColumnas(cuadradoMagico);
        sumadiagonal = sumarDiagonales(cuadradoMagico);

        if ((sumafila == sumacolumna) && (sumacolumna == sumadiagonal)) {
            magico = true;
        }

        if (magico) {
            System.out.println("El arrays es un cuadrado mágico");
        } else {
            System.out.println("El arrays NO es un cuadrado mágico");
        }

        // 4. Crea un programa que llene la matriz con el siguiente patron:
       /**  int[][] ejemplo = { { 0, 1, 2, 3, 4 },
                                { 1, 2, 3, 4, 3 },
                                { 2, 3, 4, 3, 2 },
                                { 3, 4, 3, 2, 1 },
                                { 4, 3, 2, 1, 0 }};
        int[][] matriz4= new int[5][5];
        int contador=0;
        for(int f= 0;f<matriz4.length;f++){
            for( int c=0; c<matriz4[f].length; c++){
            int suma=f+c;
                if(suma<matriz4.length){
                matriz4[f][c]=f+c;
                contador=0;
                }
                if (suma>(matriz4.length-1)){
                    contador+=2; 
                    matriz4[f][c]=c+f-contador;  
                }
            }
        }
        for(int f= 0;f<matriz4.length;f++){
        System.out.println();
            for( int c=0; c<matriz4[f].length; c++){
            System.out.print( matriz4[f][c]+"-");      
        }}
            */
    }//costructor

    private int sumarDiagonales(int[][] cuadradoMagico) {
       int suma=0;
       for(int f=0; f<cuadradoMagico.length;f++){
        for (int c=0; c<cuadradoMagico[f].length; c++){

        }
       }
       return suma;
    }

    private int sumarColumnas(int[][] cuadradoMagico) {
        int suma = 0;
        for(int f=0; f<cuadradoMagico.length;f++){
            for (int c=0; c<cuadradoMagico[f].length; c++){
                
            }
        }
        return suma;
    }

    private int sumarFilas(int[][] cuadradoMagico) {
        int suma = 0;
        // sumar todas las filas
        return suma;
    }

}
