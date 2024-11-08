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

    





    }

}
