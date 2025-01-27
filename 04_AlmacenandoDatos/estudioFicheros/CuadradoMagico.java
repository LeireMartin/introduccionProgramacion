package estudioFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class CuadradoMagico {

    public CuadradoMagico() {

        File f;
        FileReader fr;
        BufferedReader br;
        int numMatriz = 0;
        int tamMatriz = 0;
        int[][] matriz;
        f = new File("Magico.txt");

        try {
            if (!f.exists()) {
                System.out.println("El fichero no existe");
                f.createNewFile();
            }

            fr = new FileReader(f);
            br = new BufferedReader(fr);
            numMatriz = Integer.parseInt(br.readLine());
            for (int i = 0; i < numMatriz; i++) {
                tamMatriz = Integer.parseInt(br.readLine());
                matriz = new int[tamMatriz][];
                for (int j = 0; j < tamMatriz; j++) {
                    matriz[j] = lineaArrayInt(br.readLine().split(","));

                }
                System.out.println(Arrays.deepToString(matriz));
                if (esCuadradoMagico(matriz)) {
                    System.out.println("Es cuadrado mágico");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int[] lineaArrayInt(String[] split) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lineaArrayInt'");
    }

    private boolean esCuadradoMagico(int[][] matriz) {
        return false;
    }
}
