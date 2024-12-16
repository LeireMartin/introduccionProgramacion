package ejercicios;

import java.util.Arrays;

public class EjerciciosArrayUni {

    public EjerciciosArrayUni() {


        //1. Creaun array de 10 aleatorios entre el 1 y el 100 e indica el menor y el mayor.
        int[] aleatorios = generaAleatoriosNoRep(10, 1, 100);
        String ale=" ";
        int min=aleatorios[0];
        int max=aleatorios[0];

        for(int x=0; x<aleatorios.length;x++){
           ale+=aleatorios[x]+" ";
           if(aleatorios[x]<min){
            min=aleatorios[x];
           }
           if(aleatorios[x]>max){
           max=aleatorios[x];
           }
        }
        System.out.println(ale);
        System.out.println("E la mayor es: "+max);
        System.out.println("El menor es: "+ min);

        //2. Crea un array de 20 numeros enteros entre el 1 y el 10 uestra cuantas veces aparece cada uno;
        int[] ale2= generaAleatoriosNoRep(20, 1, 10);
        String aleString=" ";
        int[] contadores=new int[10];
        for(int x=0; x<ale2.length;x++){
            aleString+=ale2[x]+" ";
            contadores[ale2[x]-1]++;
        }
        System.out.println(aleString);
        for(int i=0;i<contadores.length;i++){
            System.out.println("El número "+(i+1)+" aparece "+contadores[i]+" veces. ");
        }

        //3. Crea un array de 6 elementos y permite que el usuario los ingrese. Invierte el orden de los elementos y muestra el array resultante.

        int[] num={1,2,3,4,5,6};
        int[] invertido=new int[num.length];
        String array=" ";
        for(int x=0;x<num.length;x++){
            array+=num[x]+" ";
        }
        System.out.println(array);

        for(int x=0;x<num.length;x++){
            invertido[x]=num[num.length-1-x];
        }
         array=" ";
         for(int x=0; x<invertido.length;x++){
            array+=invertido[x]+"";
         }
         System.out.println(array);

        // 4.-Crea dos arrays de 5 elementos cada uno con valores ingresados por el
        // usuario.
        // Genera un tercer array que intercale los valores de los dos primeros arrays
        // (es decir, el primer elemento del primer array, seguido del primer elemento
        // del segundo array,
        // y así sucesivamente). Muestra el array resultante

        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 6, 7, 8, 9, 10 };
        int[] array3 = new int[10];
        for (int x = 0; x < array1.length; x++) {
            array3[2 * x] = array1[x];
            array3[2 * x + 1] = array2[x];

        }
        System.out.println(Arrays.toString(array3));

    }

    private int[] generaAleatoriosNoRep(int i, int j, int k) {
        int[] ale=new int[i];

        for(int x=0;x<ale.length;x++){
        ale[x]=(int)Math.floor(Math.random()*(k-j-1)+j);
    }
        return ale;
    }

}
