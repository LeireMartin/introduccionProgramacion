package estudioArrays;

public class EstudioArrayUnidimensionales {
    public EstudioArrayUnidimensionales() {
        int[] enteros;// declaramos el array con los corchetes
        enteros = new int[5];// instanciamos el array para oder utilizarlo, [cantidad de elementos]
        // si PONEMOS UN PUNTO DE DEPURACION AQUI Y VEMOS EL VALOR DEL ARRAY TE DICE LOS
        // ELEMENTOS QUE TIENE EY EL VALOR POR DEFECTO

        System.out.println("-----ASIGNAR VALORES AL ARRAY-----");
        enteros[0] = 1;
        enteros[1] = 2;
        enteros[2] = 3;
        enteros[3] = 4;
        enteros[4] = 5;
        System.out.printf("El valor de la posición 2 es: %d %n", enteros[1]);

        // DECLARAR E INSTANCIAR EN LA MISMA LINEA

        int[] notas = new int[10];

        // System.out.println("Pausa");

        // DECLARAR, INSTANCIAR Y RELLENAR DEL TIRON

        int[] notasAlumnos = { 5, 6, 7, 8, 9, 10, 4, 3, 6, 4 };

        // Recorrer un array
        int suspenso = 0;
        for (int i = 0; i < notas.length; i++) {
            // Suspensos
            if (notas[i] < 5) {
                suspenso++;
            }
        }
        System.out.printf("Han suspendido %d alumnos.%n", suspenso);

        int[] notas2 = notasAlumnos;// Esto no copia el array si no que es el mismo con distinto nombre
        // si cambiamos las variables en notas2 tambien se cambiaran en notas Alumnos
        int numero = 0;
        // METODOS DE HACER CALCULOS CON ARRAYS
        double media = calculamedia(notas, numero);
        // como no esta creada click en la bombilla create new method

        System.out.println("---Arrays Paralelos");

        String[] alumnos = { "Ana", "Isa", "Luis", "Mar", "Juan", "Paco", "Fran", "Leire", "Ale", "Fran" };
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("El/La alumno/a %s ha sacado una nota de %d. %n", alumnos[i], notasAlumnos[i]);
        }
        int alumnoSuspenso = 0, bien = 0, notable = 0, sobresaliente = 0;
        // Cuantos suspensos/aprobados/notables/sobresalientes:
        for (int i = 0; i < notasAlumnos.length; i++) {
            if (notasAlumnos[i] < 5) {
                alumnoSuspenso++;
            } else if (notasAlumnos[i] <= 6) {
                bien++;
            } else if (notasAlumnos[i] <= 8) {
                notable++;
            } else if (notasAlumnos[i] <= 10) {
                sobresaliente++;
            }

        }
        System.out.printf("Hay %d suspensos, %d aprobados, %d notables y %d sobresalientes.%n", alumnoSuspenso, bien,
                notable, sobresaliente);



    }

    // se crea solo declarando el metodo en la linea 44
    private double calculamedia(int[] notasAsignatura, int numero) {
        double media = 0;
        for (int i = 0; i < notasAsignatura.length; i++) {
            media += notasAsignatura[i];
        }
        numero = 10;// al ser una variable primitiva y no un objeto como el array se copia y no se
                    // cambia su valor.
        return media / notasAsignatura.length;

    }
}
