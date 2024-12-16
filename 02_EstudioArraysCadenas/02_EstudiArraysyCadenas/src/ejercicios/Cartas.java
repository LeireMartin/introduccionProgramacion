package ejercicios;


import java.util.Arrays;

public class Cartas {
    public Cartas() {
        String baraja[] = { "1O", "2O", "3O", "4O", "5O", "6O", "7O", "sotaO", "caballoO", "reyO",
                "1B", "2B", "3B", "4B", "5B", "6B", "7B", "sotaB", "caballoB", "reyB",
                "1E", "2E", "3E", "4E", "5E", "6E", "7E", "sotaE", "caballoE", "reyE",
                "1C", "2C", "3C", "4C", "5C", "6C", "7C", "sotaC", "caballoC", "reyC" };

        int[][] reparto = new int[10][];// son 10 partidas , NO DEFINIR COLUMNAS SI NO DA ERROR
        int[] jugada;

        for (int f = 0; f < reparto.length; f++) {
            jugada = repartirCartas(8, 0, 39); // ALE SIN REPETICION
            reparto[f] = jugada; // CADA JUGADA ES UN REPARTO, LAS FILAS DEL ARRAY REPARTO SON LAS DIFERENTES
                                 // JUGADAS
        }
        System.out.println();
        //SACO UNA CARTA GANADORA ALEATORIA DEL 1 AL 40 PARA MAS TARDE RELACIONARLA CON EL ARRAY BARAJAS
        int cartaGanadora = (int) Math.floor(Math.random() * (39 - 0 + 1) + 0);
        System.out.println();
        System.out.println("CARTA GANADORA: " + baraja[cartaGanadora]);//lA MUESTRO SI SACO UN 2 SALE LA POSICION 2 DE LA BARAJA
        // Metodo Para Mostar la partida
        mostarPartidas(reparto, baraja, 0);
        System.out.println();
        System.out.println("=================");

        cartasRepartidas(reparto, baraja, cartaGanadora);

    }// Fin del constructor


    // -------METODOS------
    private void cartasRepartidas(int[][] reparto, String[] baraja, int cartaGanadora) {
       //La longitud del array de jugadores es el numero de cartas que hay.
      //los array de os jugaores no indican las cartas de cada uno, si no las veces que ha scado los jugadores cada carta
       int[] jugador1=new int[40];
       int[] jugador2=new int[40];
       //Vamos a ver cuantas veces ha sacado cada jugador cada carta, y luego vamos a ver quien ha sacado más veces la carta ganadora, comparando la posicion y el valor asignado en el array.
       for(int f=0; f<reparto.length;f++){
        for(int c=0; c<reparto[f].length;c++){
            if(c<4)jugador1[reparto[f][c]]++;

            else{
                jugador2[ reparto[f][c]]++;
            }

        }
       }
       System.out.println(Arrays.toString(jugador1));
       System.out.println(Arrays.toString(jugador2));
       System.out.println("jugador 1 "+ baraja[cartaGanadora]+" "+jugador1[cartaGanadora]);
       System.out.println("jugador 2 "+ baraja[cartaGanadora]+" "+jugador2[cartaGanadora]);

       if(jugador1[cartaGanadora]>jugador2[cartaGanadora]){
        System.out.println("Gana el jugador 1!");
       }else if(jugador1[cartaGanadora]<jugador2[cartaGanadora]) {
        System.out.println("Gana el jugador 2!");
       }else{System.out.println("EMPATE!");}

    }

    private void mostarPartidas(int[][] reparto, String[] baraja, int i) {
        System.out.println("- Jugador 1                  - Jugador 2");
        for(int f=0;f<reparto.length;f++){
            System.out.println("");
            for(int c=0;c<reparto[f].length;c++){
                if(c<4){
                    System.out.println(baraja[reparto[f][c]]+" "); //Mano del jugador 1
                }else{
                    if(c==4)System.out.println("     ");//Para crear una separacion enre el jugador 1 y 2 ponemos unos espacios entre ellos y separamos las columnas.
                    System.out.println(baraja[reparto[f][c]]+" ");//mano del jugador 2
                }

            }
        }
    }

    private int[] repartirCartas(int cantidad, int min, int max) {
        int[] nuevaJugada = new int[cantidad];
        int ale = 0;
        for (int f = 0; f < nuevaJugada.length; f++) {// Vamos a recorrer las posiciones de array unidimensioanl de la
                                                      // nueva partida para ir generando numeros aleatorios.
            // dentro de un do while para cuando se repita se quede dentro del bucle y salga
            // cuando no este repetido
            do {
                ale=(int)Math.floor(Math.random()*(max-min+1)+min);
               
            } while (repetido(ale, nuevaJugada));
            nuevaJugada[f]=ale;
        }
        return nuevaJugada;

    }

    private boolean repetido(int ale, int[] aleatorios) {//el array es el mismo que nuev jugada pero le he cambiado el nombre por temas de claridad.
        boolean repe=false;
        for(int f=0;f< aleatorios.length;f++){
            if(ale==aleatorios[f]){
                repe=true;
                break;
            }
            
        }return repe;
    }

    

}
