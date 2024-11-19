package estudioArrays;

import java.util.Arrays;

public class Cartas {
    public Cartas() {

        int[][] cartas = {  {1,2,3,4,5,6,7,8,9,10},
                            {11,12,13,14,15,16,17,18,19,20},
                            {21,22,23,24,25,26,27,28,29,30},
                            {31,32,33,34,35,36,37,38,39,40} };

        int max = 40, min = 1, persona = 4;
        int[][] mano = cartasAleatoriasNoRep(max, min, persona);
        for(int f= 0;f<mano.length;f++){
            System.out.println();
                for( int c=0; c<mano[f].length; c++){
                System.out.print( mano[f][c]+"-");
                }
            }
    }


    
//Cartas aleatorias
    private int[][] cartasAleatoriasNoRep(int max, int min, int persona) {

        int[][] mano = new int[persona][persona];
        boolean repetido;

        for (int i = 0; i < mano.length; i++) {
            int ale;
            for (int k=0; k<mano[i].length; k++){
            do {
                ale = (int) Math.floor(Math.random() * (max - min + 1) + min);
                repetido = false;

                // Duplicados
                for (int j = 0; j < i; j++) {
                    if (ale == mano[i][j]) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
           mano[i][k] = ale;
            }
        }
        return mano;
}
}
