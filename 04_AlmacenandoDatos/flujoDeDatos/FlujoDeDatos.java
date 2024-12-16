package flujoDeDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlujoDeDatos {
    public FlujoDeDatos() {
       /*  InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String datos = "";
        System.out.println("Introduzca su nombre: ");
        // Lanza una excepción
        // dato=br.readine();
        // Hay que ponrlo dentro de un try catch SIEMPRE

        try {
            datos = br.readLine();
        } catch (IOException e) {
            // TODO: handle exception
        }
        System.out.println(datos);*/
        System.out.println("Introduzca un dato");
        String dato="";
        try {
            dato=Leer.dato();
        } catch (IOException e) {
           System.out.println("Error: "+e.getMessage());
        }
    }
}
