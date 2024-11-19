package estudioArrays;

import java.util.Scanner;

public class CaballoAjedrez {
    public CaballoAjedrez(){

        Scanner leer=new Scanner(System.in);
		
		System.out.println("En que posición esta el caballo: ");
		int fila=leer.nextInt();
		int columna=leer.nextInt();
		
		int posCaballo=2;
		int mov= 1;
		int x=fila-1;
		int y=columna-1;
		int tablero[][]= new int [8][8];
		tablero[x][y]=posCaballo;
		
		x++;
		y+=2;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		x=fila-1;
		y=columna-1;
		x++;
		y-=2;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		x=fila-1;
		y=columna-1;
		x--;
		y-=2;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		x=fila-1;
		y=columna-1;
		x--;
		y+=2;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		x=fila-1;
		y=columna-1;
		x+=2;
		y++;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		x=fila-1;
		y=columna-1;
		x+=2;
		y--;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		x=fila-1;
		y=columna-1;
		x-=2;
		y++;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		x=fila-1;
		y=columna-1;
		x-=2;
		y--;
		if (x<8 && y<8 && x>=0 && y>=0)
			tablero[x][y]=mov;
		
		
		
		mostrar(tablero);
		
		
	}

	private void mostrar(int[][] tablero) {
		// TODO Auto-generated method stub
		for (int x=0; x<tablero.length; x++) {
            System.out.println("");
			for(int y=0; y<tablero[x].length; y++) {
				System.out.print(tablero[x][y]+"  ");
			}
		}
    }

}
