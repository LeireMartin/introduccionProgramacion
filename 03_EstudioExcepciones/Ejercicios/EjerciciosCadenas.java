import java.util.Scanner;

public class EjerciciosCadenas {
    public EjerciciosCadenas() {
        System.out.println("Ejercicios Cadenas");
        Scanner leer = new Scanner(System.in);
    // 1. Rompe cadenas: Crea un programa que me pida una frase y me la rompa en
        // palabras.
        // No SPlit
        // System.out.println("Escriba lo que quiera:");
        String cadena = "Me gusta desayunar pan con tomate.";
        String cadena2 = cadena.replace(" ", ",");
        String[] cadenaint = cadena2.split(",");
        for (int x = 0; x < cadenaint.length; x++) {
            System.out.println("La posicion numero " + x + " equivale a la palabra " + cadenaint[x]);
        }
    // 2. Un programa que me pida una frase y me diga si es palíndroma.
        String frase = "Isaac no ronca asi";

        String sinEspacios = frase.replace(" ", "").toLowerCase();
        char[] fraseChar = sinEspacios.toCharArray();
        char[] invert = new char[fraseChar.length];
        for (int x = 0; x < fraseChar.length; x++) {
            invert[x] = fraseChar[fraseChar.length - x - 1];
        }
        String original = new String(fraseChar);
        String invertido = new String(invert);

        boolean comparacion = original.equals(invertido);

        System.out.println(original + " se lee al revés " + invertido + " por lo tanto:");
        if (comparacion) {
            System.out.println("Es palindroma");
        } else {
            System.out.println("No es palindroma.");
        }

        // 3. Comprueba si un dni es incorrecto
        System.out.println("Introduzca su DNI");
        // String dni = leer.nextLine();
        String dni = "32088831J";

        try {
        compruebaDNI(dni);
        } catch (DniIncorrectoException e) {
            System.out.println(e.getMessage());
        
        }

    }

    private void compruebaDNI(String dni) throws DniIncorrectoException {
        if (dni.length() != 9) {
            throw new DniIncorrectoException();
        }
        // variables
        String letras = "T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E";
        String[] letrasEnDni = letras.split(",");
        boolean iguales = false;
        // Sacar numero
        String numero = dni.substring(0, (dni.length() - 1));
        int numeroDni = Integer.parseInt(numero);
        int posicionLetraDNi = numeroDni % 23;
        // sacar la letra
        String letra = dni.substring(8).toUpperCase();
        char letraBuscar = letra.charAt(0);
        // buscar y comparar
        if (letrasEnDni[posicionLetraDNi].charAt(0) == letraBuscar) {
            iguales = true;
        }
        if (!iguales) {
            throw new DniIncorrectoException();
        }

    }

}
