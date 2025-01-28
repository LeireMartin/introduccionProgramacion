package listas;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import modelo.Bicicleta;
import modelo.Persona;

public class Listas {
    public Listas(){
        System.out.println("Estudio de Listas");

        Persona p1=new Persona("Juan", "Lopez", "32088831J");
        Persona p2=new Persona("Luis", "Ali", "28099965L");
        Bicicleta b1=new Bicicleta(11, 29);

        Collection coleccion=new ArrayList<>();

        coleccion.add(p1);
        coleccion.add(p2);
        coleccion.add(b1);
        System.out.println();
        for (Object object : coleccion) {
            if(object instanceof Persona ){//Te mira si el objeto que as cargado es una instancia de la cale persona

            }
        }
        
        List<Persona> lista=null;
        lista=new ArrayList<Persona>();
        lista.add(p2);
        lista.add(p1);
        lista.set(0, p2);
        System.out.println(lista.get(2));
        for (Persona persona : lista) {
            System.out.println(persona);
        }

        System.out.println("El tamaño de la lista es:"+lista.size());
        //lista.remove(0)
       //lista.remove(p1);
        System.out.println("El tamaño de la lista es :"+ lista.size());
        
    System.out.println("======================ITERATOR==========================");
    java.util.Iterator<Persona> iter=lista.iterator();
    while (iter.hasNext()) {
        System.out.println(iter.next().toString());
        
    }

    }

}
