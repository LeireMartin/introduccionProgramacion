package estudioEstructurasBasicas;

import java.util.Scanner;

public class EstudioOperadoresAritmeticos {

        public EstudioOperadoresAritmeticos() {

                System.out.println("Estudio de Operadores Aritméticos");

                int suma, c = -5, d = 3, multi;
                double sumaDoble, num1 = 5.5, num2 = 2.3;
                suma = c - d;
                multi = c * d;
                System.out.println("Suma= " + suma);
                System.out.println("Multiplicacion= " + multi);
                sumaDoble = num1 + num2;
                System.out.println("SumaDoble=" + sumaDoble);
                sumaDoble = num1 + c;
                suma = (int) sumaDoble;
                int divEntera, divid = 7, div = 3;
                double divReal, div2 = 3;
                divEntera = divid / div;
                System.out.println("Divi entera=" + divEntera);
                divReal = divid / (double) div;
                System.out.println("Divi Real=" + divReal);
                divReal = divid / div2;
                System.out.println("Divi real 2=" + divReal);
                int resto;
                divid = 9;
                div = 2;
                resto = divid % div;
                System.out.println("El resto de la división es: " + resto);

                // Contadores
                // Hacer tabla de multiplicar. En este caso tabla del 5
                int cont = 10;
                cont = cont + 1;
                System.out.println("Contador= " + cont);
                cont++;
                System.out.println("Contador= " + cont);
                int y = cont++; // Primero se asigna el valor de y, luego se le suma el contador.
                System.out.println("y= " + y);
                y = ++cont;
                System.out.println("y= " + y);
                y = ++cont;
                System.out.println("y= " + y);

                cont = cont + 2;
                System.out.println("Contador= " + cont);
                cont += 2; // Sumar de 2 en 2
                System.out.println("Contador= " + cont);
                cont *= 4; // Multiplicar de 4 en 4
                System.out.println("Contador= " + cont);
                cont /= 2;
                System.out.println("Contador= " + cont);

                // Acumuladores
                int acu = 3;
                acu = acu + cont;
                System.out.println("Acumulador= " + acu); // Para ver cuanto hay acumulado en el contador
                acu += cont;
                System.out.println("Acumulador= " + acu); // Se suma el contador a lo acumulado
                acu *= cont;
                System.out.println("Acumulador= " + acu); // Se multimplica el contador a lo acumulado

                // Operaciones de relación
                int z = 5, r = 4;
                boolean sw = false, sw1, sw2;
                sw = z == r;
                System.out.println("sw= " + sw); // Preguntamos si z es igual que r
                sw = z != r;
                System.out.println("sw= " + sw); // Preguntamos si z es distinto de r
                sw = z >= r;
                System.out.println("sw= " + sw); // Preguntamos si z es mayor o igual que r

                // Operador ternario
                int resultado = (z > r) ? z : r;
                int notaNumerica = 4;
                String notaCadena = notaNumerica < 5 ? "suspenso" : "aprobado";

                System.out.println("El mayor es: " + resultado);
                System.out.println("Resultado del examen: " + notaCadena);

                // Operadores lógicos
                sw1 = true;
                sw2 = false;
                boolean a = true;
                boolean b = false;
                System.out.println(!sw1); // Devuelve lo contrario de sw1
                System.out.println(sw1 || sw2); // Devuelve True si al menos uno de los dos es verdadero
                System.out.println(sw1 && sw2); // Devuelve True solo cuando los dos son verdaderos
                System.out.println(sw1 ^ sw2); // Devuelve True sólo si uno de los operadores es "true" (no se suele
                                               // usar).

                System.out.println((a || (6 > 10)));

                // Ejercicio
                Scanner leer = new Scanner(System.in);
                double nota1, media, nota2;
                System.out.println("Introduzca su nota de primer examen:");
                nota1 = leer.nextDouble();
                System.out.println("Itroduzca su media deseada:");
                media = leer.nextDouble();
                nota2 = ((media - (0.4 * nota1)) / 0.6);
                System.out.println("La nota que necesita para el siguiente examen es: " + nota2);

        }

}
