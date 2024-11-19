package ejercicios;

import java.util.Arrays;

public class EjerciciosArrayUni {

    public EjerciciosArrayUni(){

       //4.-Crea dos arrays de 5 elementos cada uno con valores ingresados por el usuario. 
       //Genera un tercer array que intercale los valores de los dos primeros arrays 
       //(es decir, el primer elemento del primer array, seguido del primer elemento del segundo array, 
       //y así sucesivamente). Muestra el array resultante

       int[] array1={1,2,3,4,5};
       int[] array2={6,7,8,9,10};
       int[] array3=new int [10];
       for(int x=0; x<array1.length;x++){
        array3[2*x]=array1[x];
        array3[2*x+1]= array2[x];


       }
       System.out.println(Arrays.toString(array3));


    }

}
