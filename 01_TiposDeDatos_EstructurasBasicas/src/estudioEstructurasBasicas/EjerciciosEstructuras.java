package estudioEstructurasBasicas;

import java.util.Scanner;

public class EjerciciosEstructuras {

    public EjerciciosEstructuras() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejercicios");
        // ejercicios

        System.out.println("Introduzca un numero para saber si es positivo o negativo:");
        int numero = leer.nextInt();
        if (numero >= 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else {
            System.out.println("El número " + numero + " es negativo.");
        }

        // Votar
        int edadPedro = 10, edadLuis = 16;
        System.out.println("Pedro tiene " + edadPedro + " años, y Luis tiene " + edadLuis + " años.");
        boolean luisVotar = edadLuis >= 18, pedroVotar = edadPedro >= 18;

        if (luisVotar && pedroVotar) {
            System.out.println("Los dos pueden votar.");
        } else if (pedroVotar) {
            System.out.println("Pedro puede votar, sin embargo Luis no.");

        } else if (luisVotar) {
            System.out.println("Luis puede votar pero Pedro no.");
        } else {
            System.out.println("Ninguno de los dos puede votar.");
        }

        // Ejercio menu calculo de areas.

        System.out.println("Elija un número para calcular un área:");
        System.out.println("1. Cuadrado/Rectángulo");
        System.out.println("2. Triángulo.");
        System.out.println("3. Círculo.");
        System.out.println("4. Salir.");
        int fig = leer.nextInt();

        switch (fig) {
            case 1:
                System.out.println("Introduzca el valor en cm del lado.");
                int lado = leer.nextInt();
                int areaCuadrado = lado * lado;
                System.out.println("El área es: " + areaCuadrado);
                break;
            case 2:
                System.out.println("Introduzca el valor en cm de los lados.");
                int ladoT = leer.nextInt();
                double areaTri = (ladoT * ladoT) / 2;
                System.out.println("El área es: " + areaTri);
                break;
            case 3:
                System.out.println("Introduzca el valor del radio.");
                double radio = leer.nextInt();
                double PI = 3.1416;
                double areaCir = PI * (radio * radio);
                System.out.println("El área es: " + areaCir);
                break;
            case 4:
                System.out.println("¡Adiós!");
                break;
            default:
                System.out.println("No reconozco este valor.");
                break;
        }

        // EJERCICIO DNI
        // System.out.println("Introduzca su DNI: ");
        // int dni = leer.nextInt();
        // int resto = dni % 23;
        /*
         * switch (resto) {
         * case 0:
         * String letra = "T";
         * break;
         * 
         * case 1:
         * letra = "R";
         * System.out.println(letra);
         * break;
         * 
         * case 2:
         * letra = "W";
         * System.out.println(letra);
         * break;
         * 
         * case 3:
         * letra = "A";
         * System.out.println(letra);
         * 
         * break;
         * 
         * case 4:
         * letra = "G";
         * System.out.println(letra);
         * break;
         * 
         * case 5:
         * letra = "M";
         * System.out.println(letra);
         * 
         * break;
         * 
         * case 6:
         * letra = "Y";
         * System.out.println(letra);
         * break;
         * 
         * case 7:
         * letra = "F";
         * System.out.println(letra);
         * 
         * break;
         * 
         * case 8:
         * letra = "P";
         * System.out.println(letra);
         * break;
         * 
         * case 9:
         * letra = "D";
         * System.out.println(letra);
         * 
         * break;
         * 
         * case 10:
         * letra = "X";
         * System.out.println(letra);
         * break;
         * 
         * case 11:
         * letra = "B";
         * System.out.println(letra);
         * break;
         * 
         * case 12:
         * letra = "N";
         * System.out.println(letra);
         * break;
         * case 13:
         * letra = "J";
         * System.out.println(letra);
         * break;
         * case 14:
         * letra = "Z";
         * System.out.println(letra);
         * break;
         * case 15:
         * letra = "S";
         * System.out.println(letra);
         * break;
         * case 16:
         * letra = "Q";
         * System.out.println(letra);
         * break;
         * case 17:
         * letra = "V";
         * System.out.println(letra);
         * break;
         * case 18:
         * letra = "H";
         * System.out.println(letra);
         * break;
         * case 19:
         * letra = "L";
         * System.out.println(letra);
         * break;
         * case 20:
         * letra = "C";
         * System.out.println(letra);
         * break;
         * case 21:
         * letra = "K";
         * System.out.println(letra);
         * break;
         * case 22:
         * letra = "E";
         * System.out.println(letra);
         * break;
         * default:
         * System.out.println("Error");
         * break;
         * }
         */

        // ESTRUCTURS SENTENCIS CONDICIONALES.

        // 1. INTRODUZCA EL DIA DE LA SEMANA Y AVERGÜE EL HORARIO

        System.out.println("Introduzca el día de la semana para conocer su horario(1-5): ");
        System.out.println("1. Lunes.");
        System.out.println("2. Martes.");
        System.out.println("3. Miércoles");
        System.out.println("4. Jueves.");
        System.out.println("5. Viernes.");
        System.out.println("6. Salir.");

        int diaSemana = leer.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("El lunes tienes Programación a primera hora.");
                break;
            case 2:

                System.out.println("El martes tienes Sistemas Infromáticos a primera hora.");
                break;
            case 3:
                System.out.println("El Miércoles tienes Sstenibilidad a primera hora.");
                break;
            case 4:
                System.out.println("El Jueves tienes Digitalización a primera hora.");
                break;
            case 5:
                System.out.println("El Viernes tienes FOL a primera hora.");
                break;
            case 6:
                System.out.println("Adiós.");
                break;
            default:
                System.out.println("No reconozco este día, pruebe otra vez.");
                break;
        }

        // 2. Ecribir hora por teclado y que te diga buenos días

        System.out.println("¿Qué hora es?(Sin los minutos)");

        int hora = leer.nextInt();

        boolean mañana = (hora >= 6 && hora <= 12);
        boolean tarde = (hora >= 13 && hora <= 20);
        boolean noche = ((hora >= 21) && (hora < 24) || (hora <= 5) && (hora >= 0));

        if (mañana) {
            System.out.println("Buenos días");
        } else if (tarde) {
            System.out.println("¡Buenas tardes!");
        } else if (noche) {
            System.out.println("Buenas noches, a dormir!");
        } else {
            System.out.println("No reconozco esa hora");
        }

        // 3. Salario de trabajador

        System.out.println("¿Cuantas horas has trabajado esta semana?");
        int horasLab = leer.nextInt();
        if (horasLab <= 40) {
            System.out.println("Usted va a cobrar " + (horasLab * 12) + " euros.");
        } else if (horasLab > 40) {
            int horaExtra = horasLab - 40;
            int salLab = horasLab * 12;
            int salExtra = horaExtra * 16;
            System.out.println("Utd. va a cobrar " + (salExtra + salLab) + " euros.");
        }

        // 4.HOROSCOPO
        System.out.println("Introduzca su mes de cumpleaños");
        String cumple = leer.next();

        switch (cumple.toLowerCase()) {
            case "enero":
                System.out.println("¿Qué día?");
                int diaCum = leer.nextInt();
                if (diaCum <= 19) {
                    System.out.println("Capricornio");
                } else if (diaCum > 19) {
                    System.out.println("Acuario");
                }
                break;
            case "febrero":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 18) {
                    System.out.println("Acuario");
                } else if (diaCum > 18) {
                    System.out.println("Piscis");
                }
                break;
            case "marzo":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 21) {
                    System.out.println("Piscis");
                } else if (diaCum > 21) {
                    System.out.println("Aries");
                }
                break;
            case "abril":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 20) {
                    System.out.println("Aries");
                } else if (diaCum > 20) {
                    System.out.println("Tauro");
                }
                break;
            case "mayo":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 21) {
                    System.out.println("Tauro");
                } else if (diaCum > 21) {
                    System.out.println("Geminis");
                }
                break;
            case "junio":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 21) {
                    System.out.println("Geminis");
                } else if (diaCum > 21) {
                    System.out.println("Cáncer");
                }
                break;
            case "julio":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 23) {
                    System.out.println("Cáncer");
                } else if (diaCum > 23) {
                    System.out.println("Leo");
                }
                break;
            case "agosto":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 23) {
                    System.out.println("Leo");
                } else if (diaCum > 23) {
                    System.out.println("Virgo");
                }
                break;
            case "septiembre":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 23) {
                    System.out.println("Virgo");
                } else if (diaCum > 23) {
                    System.out.println("Libra");
                }
                break;
            case "octubre":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 23) {
                    System.out.println("Libra");
                } else if (diaCum > 23) {
                    System.out.println("Escorpio");
                }
                break;
            case "noviembre":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 19) {
                    System.out.println("Escorpio");
                } else if (diaCum > 19) {
                    System.out.println("Sagitario");
                }
                break;
            case "diciembre":
                System.out.println("¿Qué día?");
                diaCum = leer.nextInt();
                if (diaCum <= 19) {
                    System.out.println("Sagitario");
                } else if (diaCum > 19) {
                    System.out.println("Capricornio");
                }
                break;
            default:
                System.out.println("Hola");
                break;
        }
        // 5. Segundos para medianoche

        System.out.println("Introduzca la hora y los minutos para conocer cuanto queda para medianoche");
        int horaDia = leer.nextInt();
        int minDia = leer.nextInt();
        int horaRest = 24 - horaDia - 1;
        int minRest = 60 - minDia;
        int segRest = (minRest * 60) + (horaRest * 3600);
        System.out.println("Quedan " + segRest + " segundos restantes para medianoche.");

        // 6. Ordenar numeros
        System.out.println("introduzca 3 numeros enteros.");

        int no1 = leer.nextInt();
        int no2 = leer.nextInt();
        int no3 = leer.nextInt();

        if ((no1 > no2) && (no1 > no3) && (no2 > no3)) {
            System.out.println(no1 + ", " + no2 + ", " + no3);
        } else if ((no1 > no2) && (no1 > no3) && (no2 < no3)) {
            System.out.println(no1 + ", " + no3 + ", " + no2);
        } else if ((no2 > no1) && (no2 > no3) && (no1 > no3)) {
            System.out.println(no2 + ", " + no1 + ", " + no3);
        } else if ((no2 > no1) && (no2 > no3) && (no1 < no3)) {
            System.out.println(no2 + ", " + no3 + ", " + no1);
        } else if ((no3 > no1) && (no3 > no2) && (no1 < no2)) {
            System.out.println(no3 + ", " + no2 + ", " + no1);
        } else if ((no3 > no1) && (no3 > no2) && (no1 > no2)) {
            System.out.println(no3 + ", " + no1 + ", " + no2);
        } else {
            System.out.println("Son iguales");
        }

        // 7. Ultimodigito

        System.out.println("Introduce un número entero para conocer su último dígito: ");
        int num = leer.nextInt();
        int ultNum = num % 10;
        System.out.println(ultNum);

        // 8. Primer digito

        System.out.println("Introduce un número entero de hasta 5 cifras para conocer su primer dígito");
        int numPriCi = leer.nextInt();

        if ((numPriCi >= 10000)&&(numPriCi <=10000)) {
            int priCi = numPriCi / 10000;
            System.out.println(priCi);
        } else if (numPriCi >= 1000) {
            int priCi = numPriCi / 1000;
            System.out.println(priCi);
        } else if (numPriCi >= 100) {
            int priCi = numPriCi / 100;
            System.out.println(priCi);
        } else if (numPriCi >= 10) {
            int priCi = numPriCi / 10;
            System.out.println(priCi);
        } else if (numPriCi >= 1) {
            int priCi = numPriCi / 1;
            System.out.println(priCi);
        } else {
            System.out.println("Max 5 cifras o mayor que 0.");
        }

        // 9.Cuantas cifras tiene un num entero. max 5 cifras

        System.out.println("Introduce un numero entero positivo, max 5 cifras, para saber cuantas cifras tiene:");

        int cantidadNum = leer.nextInt();

        if ((cantidadNum >= 10000) && (cantidadNum < 100000)) {

            System.out.println("El número tiene 5 cifras");

        } else if ((cantidadNum >= 1000) && (cantidadNum < 10000)) {

            System.out.println("El número tiene 4 cifras.");
        } else if ((cantidadNum >= 100) && (cantidadNum < 1000)) {

            System.out.println("El número tiene 3 cifras.");
        } else if ((cantidadNum >= 10) && (cantidadNum < 100)) {

            System.out.println("El numero tiene 2 cifras.");
        } else if ((cantidadNum >= 0) && (cantidadNum < 10)) {

            System.out.println("El número tiene 1 cifra.");
        } else {
            System.out.println("Max 5 cifras o mayor que 0.");
        }
        // 10. Realiza un programa que diga si un numero entero positivo es capicua. 5
        // cifras.
        System.out.println("Introduce un número para saber si es capicua:");
        cantidadNum = leer.nextInt();

        if ((cantidadNum >= 10000) && (cantidadNum < 100000)) {

            int restoNum = cantidadNum % 10;
            int decenaNum = cantidadNum / 10;
            int centenaNum = cantidadNum / 1000;
            int milNum = cantidadNum / 10000;
            if ((milNum == restoNum) && (((centenaNum % 10)) == (decenaNum % 10))) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es cap");
            }

        } else if ((cantidadNum >= 1000) && (cantidadNum < 10000)) {
            int restoNum = cantidadNum % 10;
            int decenaNum = cantidadNum / 10;
            int centenaNum = cantidadNum / 100;
            int milNum = cantidadNum / 1000;
            if ((restoNum == milNum) && (((centenaNum % 10)) == (decenaNum % 10))) {
                System.out.println("Es capicua.");
            } else {
                System.out.println("No es capicua.");
            }

        } else if ((cantidadNum >= 100) && (cantidadNum < 1000)) {
            int restoNum = cantidadNum % 10;
            int divNum = cantidadNum / 100;

            if (divNum == restoNum) {
                System.out.println("Es capicua.");
            } else {
                System.out.println("No es capicua.");
            }
            System.out.println("El número tiene 3 cifras.");
        } else if ((cantidadNum >= 10) && (cantidadNum < 100)) {

            int restoNum = cantidadNum % 10;
            int divNum = cantidadNum / 10;

            if (divNum == restoNum) {
                System.out.println("Es capicua.");
            } else {
                System.out.println("No es capicua.");
            }

        } else if ((cantidadNum >= 0) && (cantidadNum < 10)) {

            System.out.println("El número es capicua.");
        } else {
            System.out.println("Max 5 cifras o mayor que 0.");
        }

        // 11. EJERCICIO CALCULO DE PRECIO AL PRODUCTO

        System.out.println("Introduzca el valor del producto según su base aplicable: ");
        int precBase = leer.nextInt();
        System.out.println("Elija el tipo de IVA aplicable");
        System.out.println("General, Reducido o Superreducido.");
        String ivaAplic = leer.next();

        switch (ivaAplic) {
            case "general":
                double ivaGen = (precBase * 0.21) + precBase;
                System.out.println("¿Tiene promocion?");
                System.out.println("1. 50%");
                System.out.println("2. -5€");
                System.out.println("3. -5%");
                System.out.println("4. No");
                int desc = leer.nextInt();
                switch (desc) {
                    case 1:
                        double resulFin = ivaGen - (ivaGen * 0.5);
                        System.out.println(resulFin);
                        break;
                    case 2:
                        resulFin = ivaGen - 5;
                        System.out.println(resulFin);
                        break;
                    case 3:
                        resulFin = ivaGen - (ivaGen * 0.05);
                        break;
                    case 4:
                        System.out.println(ivaGen);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;

            case "reducido":
                double ivaRed = (precBase * 0.1) + precBase;
                System.out.println("¿Tiene promocion?");
                System.out.println("1. 50%");
                System.out.println("2. -5€");
                System.out.println("3. -5%");
                System.out.println("4. No");
                desc = leer.nextInt();
                switch (desc) {
                    case 1:
                        double resulFin = ivaRed - (ivaRed * 0.5);
                        System.out.println(resulFin);
                        break;
                    case 2:
                        resulFin = ivaRed - 5;
                        System.out.println(resulFin);
                        break;
                    case 3:
                        resulFin = ivaRed - (ivaRed * 0.05);
                        break;
                    case 4:
                        System.out.println(ivaRed);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "superreducido":
                double ivaSuperRed = (precBase * 0.04) + precBase;
                System.out.println("¿Tiene promocion?");
                System.out.println("1. 50%");
                System.out.println("2. -5€");
                System.out.println("3. -5%");
                System.out.println("4. No");
                desc = leer.nextInt();
                switch (desc) {
                    case 1:
                        double resulFin = ivaSuperRed - (ivaSuperRed * 0.5);
                        System.out.println(resulFin);
                        break;
                    case 2:
                        resulFin = ivaSuperRed - 5;
                        System.out.println(resulFin);
                        break;
                    case 3:
                        resulFin = ivaSuperRed - (ivaSuperRed * 0.05);
                        break;
                    case 4:
                        System.out.println(ivaSuperRed);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;

            default:
                System.out.println("Error");
                break;
        }
    }

}
