package ejercicios;

import java.util.Arrays;

public class JugandoTute {
    public JugandoTute() {
        String baraja[] = { "1O", "2O", "3O", "4O", "5O", "6O", "7O", "10O", "11O", "12O",
                "1B", "2B", "3B", "4B", "5B", "6B", "7B", "10B", "11B", "12B",
                "1E", "2E", "3E", "4E", "5E", "6E", "7E", "10E", "11E", "12E",
                "1C", "2C", "3C", "4C", "5C", "6C", "7C", "10C", "11C", "12C" };

        String palo[] = { "O", "B", "E", "C" };

        String jugador1 = "";
        String jugador2 = "";
        String jugador3 = "";
        String jugador4 = "";

        int reparto[] = generaAleatoriosSinRepeticion(40, 0, 39);

        mostrarReparto(reparto, baraja);

        System.out.println();

        mostrarJugadasJugadores(jugador1, jugador2, jugador3, jugador4, reparto, baraja);

        int paloTriunfo = generarNumeroAleatorio(0, 3);

        System.out.println("El palo del triunfo es: " + palo[paloTriunfo]);

        boolean noHanCantado = true;

        jugador1Cante(jugador1, palo, paloTriunfo, noHanCantado);
        jugador2Cante(jugador2, palo, paloTriunfo, noHanCantado);
        jugador3Cante(jugador3, palo, paloTriunfo, noHanCantado);
        jugador4Cante(jugador4, palo, paloTriunfo, noHanCantado);

        if (noHanCantado)
            System.out.println("Nadie ha cantado nada");

    }

    private void jugador4Cante(String jugador4, String[] palo, int paloTriunfo, boolean noHanCantado) {
        // TODO Auto-generated method stub
        boolean jugador4NoHaCantado = true;
        if (jugador4.contains("11O") && jugador4.contains("12O")) {
            if (palo[paloTriunfo].equals("O"))
                System.out.print("Jugador 4 ha cantado 40 en oros");
            else
                System.out.print("Jugador 4 ha cantado 20 en oros");
            noHanCantado = false;
            jugador4NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador4.contains("11B") && jugador4.contains("12B")) {
            if (palo[paloTriunfo].equals("B"))
                System.out.print("Jugador 4 ha cantado 40 en basto");
            else
                System.out.print("Jugador 4 ha cantado 20 en basto");
            noHanCantado = false;
            jugador4NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador4.contains("11E") && jugador4.contains("12E")) {
            if (palo[paloTriunfo].equals("E"))
                System.out.print("Jugador 4 ha cantado 40 en espadas");
            else
                System.out.print("Jugador 4 ha cantado 20 en espadas");
            noHanCantado = false;
            jugador4NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador4.contains("11C") && jugador4.contains("12C")) {
            if (palo[paloTriunfo].equals("C"))
                System.out.print("Jugador 4 ha cantado 40 en copas");
            else
                System.out.print("Jugador 4 ha cantado 20 en copas");
            noHanCantado = false;
            jugador4NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador4NoHaCantado)
            System.out.println("Jugador 4 no ha podido cantar");

    }

    private void jugador3Cante(String jugador3, String[] palo, int paloTriunfo, boolean noHanCantado) {
        // TODO Auto-generated method stub
        boolean jugador3NoHaCantado = true;
        if (jugador3.contains("11O") && jugador3.contains("12O")) {
            if (palo[paloTriunfo].equals("O"))
                System.out.print("Jugador 3 ha cantado 40 en oros");
            else
                System.out.print("Jugador 3 ha cantado 20 en oros");
            noHanCantado = false;
            jugador3NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador3.contains("11B") && jugador3.contains("12B")) {
            if (palo[paloTriunfo].equals("B"))
                System.out.print("Jugador 3 ha cantado 40 en basto");
            else
                System.out.print("Jugador 3 ha cantado 20 en basto");
            noHanCantado = false;
            jugador3NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador3.contains("11E") && jugador3.contains("12E")) {
            if (palo[paloTriunfo].equals("E"))
                System.out.print("Jugador 3 ha cantado 40 en espadas");
            else
                System.out.print("Jugador 3 ha cantado 20 en espadas");
            noHanCantado = false;
            jugador3NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador3.contains("11C") && jugador3.contains("12C")) {
            if (palo[paloTriunfo].equals("C"))
                System.out.print("Jugador 3 ha cantado 40 en copas");
            else
                System.out.print("Jugador 3 ha cantado 20 en copas");
            noHanCantado = false;
            jugador3NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador3NoHaCantado)
            System.out.println("Jugador 3 no ha podido cantar");

    }

    private void jugador2Cante(String jugador2, String[] palo, int paloTriunfo, boolean noHanCantado) {
        // TODO Auto-generated method stub
        boolean jugador2NoHaCantado = true;
        if (jugador2.contains("11O") && jugador2.contains("12O")) {
            if (palo[paloTriunfo].equals("O"))
                System.out.print("Jugador 2 ha cantado 40 en oros");
            else
                System.out.print("Jugador 2 ha cantado 20 en oros");
            noHanCantado = false;
            jugador2NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador2.contains("11B") && jugador2.contains("12B")) {
            if (palo[paloTriunfo].equals("B"))
                System.out.print("Jugador 2 ha cantado 40 en basto");
            else
                System.out.print("Jugador 2 ha cantado 20 en basto");
            noHanCantado = false;
            jugador2NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador2.contains("11E") && jugador2.contains("12E")) {
            if (palo[paloTriunfo].equals("E"))
                System.out.print("Jugador 2 ha cantado 40 en espadas");
            else
                System.out.print("Jugador 2 ha cantado 20 en espadas");
            noHanCantado = false;
            jugador2NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador2.contains("11C") && jugador2.contains("12C")) {
            if (palo[paloTriunfo].equals("C"))
                System.out.print("Jugador 2 ha cantado 40 en copas");
            else
                System.out.print("Jugador 2 ha cantado 20 en copas");
            noHanCantado = false;
            jugador2NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador2NoHaCantado)
            System.out.println("Jugador 2 no ha podido cantar");

    }

    private void jugador1Cante(String jugador1, String[] palo, int paloTriunfo, boolean noHanCantado) {
        // TODO Auto-generated method stub
        boolean jugador1NoHaCantado = true;
        if (jugador1.contains("11O") && jugador1.contains("12O")) {
            if (palo[paloTriunfo].equals("O"))
                System.out.print("Jugador 1 ha cantado 40 en oros");
            else
                System.out.print("Jugador 1 ha cantado 20 en oros");
            noHanCantado = false;
            jugador1NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador1.contains("11B") && jugador1.contains("12B")) {
            if (palo[paloTriunfo].equals("B"))
                System.out.print("Jugador 1 ha cantado 40 en basto");
            else
                System.out.print("Jugador 1 ha cantado 20 en basto");
            noHanCantado = false;
            jugador1NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador1.contains("11E") && jugador1.contains("12E")) {
            if (palo[paloTriunfo].equals("E"))
                System.out.print("Jugador 1 ha cantado 40 en espadas");
            else
                System.out.print("Jugador 1 ha cantado 20 en espadas");
            noHanCantado = false;
            jugador1NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador1.contains("11C") && jugador1.contains("12C")) {
            if (palo[paloTriunfo].equals("C"))
                System.out.print("Jugador 1 ha cantado 40 en copas");
            else
                System.out.print("Jugador 1 ha cantado 20 en copas");
            noHanCantado = false;
            jugador1NoHaCantado = false;
            System.out.print(" ,");
        }

        if (jugador1NoHaCantado)
            System.out.println("Jugador 1 no ha podido cantar");

    }

    private int generarNumeroAleatorio(int limInf, int limSup) {
        // TODO Auto-generated method stub
        int ale = (int) Math.floor(Math.random() * ((limSup - limInf + 1) + limInf));
        return ale;
    }

    private void mostrarJugadasJugadores(String jugador1, String jugador2, String jugador3, String jugador4,
            int[] reparto, String[] baraja) {
        // TODO Auto-generated method stub

        for (int x = 0; x < reparto.length; x++) {
            if (x < 10)
                jugador1 += baraja[reparto[x]];
            else if (x < 20)
                jugador2 += baraja[reparto[x]];
            else if (x < 30)
                jugador3 += baraja[reparto[x]];
            else if (x < 40)
                jugador4 += baraja[reparto[x]];
        }

        System.out.println();
        System.out.println("Jugador 1: " + jugador1);
        System.out.println("Jugador 2: " + jugador2);
        System.out.println("Jugador 3: " + jugador3);
        System.out.println("Jugador 4: " + jugador4);

    }

    private void mostrarReparto(int[] reparto, String[] baraja) {
        // TODO Auto-generated method stub
        System.out.println("Reparto: ");
        for (int x = 0; x < reparto.length; x++) {
            System.out.print(baraja[reparto[x]] + " ");
        }

    }

    private int[] generaAleatoriosSinRepeticion(int cant, int limInf, int limSup) {
        // TODO Auto-generated method stub
        int aleatorios[] = new int[cant];
        Arrays.fill(aleatorios, -1);
        int ale = 0;
        if ((limSup - limInf + 1) < cant)
            return aleatorios;
        for (int x = 0; x < aleatorios.length; x++) {
            do {
                ale = (int) Math.floor(Math.random() * ((limSup - limInf + 1) + limInf));
            } while (repetido(aleatorios, ale));

            aleatorios[x] = ale;
        }
        return aleatorios;
    }

    private boolean repetido(int[] aleatorios, int ale) {
        // TODO Auto-generated method stub
        boolean repetido = false;
        for (int x = 0; x < aleatorios.length; x++) {
            if (ale == aleatorios[x]) {
                repetido = true;
                break;
            }
        }
        return repetido;
    }

}
