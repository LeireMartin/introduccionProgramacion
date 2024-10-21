package vista;

import estudioEstructurasBasicas.EjerciciosBucles;
import estudioEstructurasBasicas.EjerciciosEstructuras;
import estudioEstructurasBasicas.EstudioEstructurasCondicionales;
import estudioEstructurasBasicas.EstudioEstructurasRepeticion;
import estudioEstructurasBasicas.EjerciciosEstructuras;

public class Main {
    public static void main(String[] args) { // metodo que arranca la aplicacion, dónde voy a llamar al resto de las
                                             // clases.
        // Dentro de los parentesis de un metodo se reciben arrays, en este caso recibe
        // arrays de args (argumentos) de tipo string.
        System.out.println("----Estudio de tipo de datos y estructuras básicas:----");

        // EstudioTipoDeDatos estudioTipoDeDatos=new EstudioTipoDeDatos();
        // EstudioOperadoresAritmeticos estudioOperadoresAritmeticos=new
        // EstudioOperadoresAritmeticos();
        //EstudioEstructurasCondicionales estudioEstructurasCondicionales=new EstudioEstructurasCondicionales();
        //EjerciciosEstructuras ejerciciosEstructuras = new EjerciciosEstructuras();
        EjerciciosBucles ejerciciosBucles = new EjerciciosBucles();
        //EstudioEstructurasRepeticion estudioEstructurasRepeticion=new EstudioEstructurasRepeticion();
    }
}
