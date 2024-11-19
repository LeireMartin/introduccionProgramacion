package ejercicios;

import java.util.Scanner;

public class EjercicioNotas {
    public EjercicioNotas() {

        Scanner leer = new Scanner(System.in);

        String[] asignaturas = { "Matemáticas", "Lengua", "Inglés", "Conocimiento del Medio", "Educación Física" };
        String[] nombres = { "Ana", "Juan", "Pepe", "Leire", "Alex", "Ivan", "Pepa", "Luis", "Chus", "Tere" };
        int[][] notas = { { 10, 8, 7, 10, 3, 7, 8, 9, 4, 6 },
                            { 9, 5, 7, 8, 9, 7, 6, 5, 2, 5 },
                            { 8, 8, 6, 10, 8, 9, 8, 7, 3, 5 },
                            { 7, 8, 9, 10, 7, 6, 5, 8, 9, 10 },
                            { 8, 4, 5, 9, 10, 8, 7, 3, 7, 9 } };

        System.out.printf(
                "1. Mostrar notas de una asignatura.%n2. Mostrar boletin notas de un alumno.%nELIJA UNA OPCIÓN:%n");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Notas Asignatura");

                break;

            case 2:
                System.out.printf(
                        "Imprimir boletín de notas de:%n1. Ana%n2. Juan%n3. Pepe%n4. Leire%n5. Alex%n6. Ivan%n7. Pepa%n8. Luis%n9. Chus%n10. Tere%n");
                int alumno = leer.nextInt();

                alumno--;
                System.out.println("---Boletín de notas de " + nombres[alumno] + "---");

                boolean media = true;

                media = mediaAsignatura(notas, alumno, nombres, asignaturas, media);

                if (!media) {
                    System.out.println("El alumno ha suspendido y no tiene media.");
                }
                if (media) {

                    int mediaNum = sumadeNotas(notas, alumno, nombres, asignaturas);
                    System.out.println("----La media de " + nombres[alumno] + " es de: " + mediaNum+" -----");
                }
                break;
            default:
                break;
        }
    }//FIN DEL CONSTRUCTOR

    private int sumadeNotas(int[][] notas, int alumno, String[] nombres, String[] asignaturas) {
        int mediaNum = 0;

        int sumaNotas=0;
        for (int f = 0; f < notas.length; f++) {
            
            int nota = notas[f][alumno];
            sumaNotas += nota;
            mediaNum= sumaNotas/asignaturas.length;

        }
        return mediaNum;
    }

    private boolean mediaAsignatura(int[][] notas, int alumno, String[] nombres, String[] asignaturas, boolean media) {
        int suspenso=0;
           
        for (int f = 0; f < notas.length; f++) {
            System.out.println(asignaturas[f] + ": " + notas[f][alumno]);
            int nota = notas[f][alumno];
            
            if (nota < 5) {
                suspenso++;
                media = false;
                System.out.println("El alumno ha suspendido "+ asignaturas[f]+" con un "+ notas[f][alumno]);
            }
           
        }
        if ((notas[0][alumno]<5)&&(notas[1][alumno]<5)){
            System.out.println("Ha suspendido una asignatura truncal.");
        }
    
        if (suspenso>=3){
            System.out.println("El alumno ha suspendido 3 o más asignaturas y tiene que repetir curso.");
        }
        return media;
    }

}
