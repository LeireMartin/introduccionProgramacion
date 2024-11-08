package estudioArrays;

import java.util.Scanner;

public class EstudioArrayBidiensionales {
    public EstudioArrayBidiensionales(){
        
        Scanner leer=new Scanner(System.in);
        
    System.out.println("En este programa aprenderemos a:");
        //Un array es una matriz o tabla del mismo tipo de datos.
    System.out.println("----DECLARAR UN ARRAY BIDIMENSIONAL----");

     int[][] notas;

    System.out.println("---INSTANCIAR UN ARRAY BIDIMENSIONAL---");

        notas= new int[3][4]; //orden: FILAS Y COLUMNAS.

    System.out.println("--DECLARAR E INSTANCIAR--");

        int[][] notas2=new int[4][5];

    //NO TIENE  QUE TENER LA MISMA CANTIDAD DE DATOS EN LAS FILAS

    System.out.println("--RELLENAR CELDAS MANUALMENTE--");

        notas[0][0]=1;//La celda con las cordenadas "0,0" ahora tiene un valor de "1";
        notas[0][1]=5;//La celda "0,1" ahora tiene un valor de 5;
        notas[0][2]=9;
        notas[0][3]=10;

    System.out.println("--RELLENAR CELDAS CON UN BUCLE PIDIENDO DATOS POR TECLADO--");

    for( int x=0; x<notas.length; x++){

        for( int y=0;y<notas[x].length;y++){

        System.out.println("Introduzca el valor de las celdas en la primera fila:");

        notas [x][y]=leer.nextInt();
        }
    }

    System.out.println("----INSTANCIAR FILAS----");

        int[][] notas3= new int[3][];

        notas3 [0]=new int[4];
        //He declarado e instanciado la tres filas pero solo he instanciado las 4 columnas de la primer fila;

        /*Se veria asi:
         * {0,0,0,0}
         * {null}
         * {null}
         */
    System.out.println("--DECLARAR, INSTACIAR Y RELLENAR--");

         int[][] notas4={{7,3,5,2},
                         {1,3,4,5},
                         {9,3,5,7}};

    System.out.println("EXTRAER Y GUARDAR EN ARRAY UNIDIMENSIONAL");

        int[] notaUnidimensional= notas[0];
    }

}
