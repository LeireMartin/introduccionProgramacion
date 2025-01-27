
import excepciones.CampoVacioException;
import excepciones.DniException;
import herencia.Consultor;
import herencia.Empleado;
//import modelo.Persona;
import herencia.Trabajador;

public class Main {

    public static void main(String[] args) throws CampoVacioException {
        System.out.println("Programación Orientada a Objetos");
        // estudioClasePersona();
        // estudioConstructores();
        // ClaseDni();
        // PasoValorReferencia();

        // Modificadores();
        // herencia();
        // polimofifismo();
        interfaces();
    }

    private static void interfaces() {
       
    }

    public static void imprimirNombreYPaga(Trabajador trabajador) {
        System.out.printf("El trabajador %s tiene una paga de %.2f Euros %n", trabajador.getNombre(),
                trabajador.CalculaPaga());
    }

    private static void polimofifismo() {
        Trabajador trabajador;
        Trabajador empleado;
        Trabajador consultor;
        trabajador = new Trabajador("Maria", "Directora", "Calle Jerez", 123, 66501234);
        empleado = new Empleado("Jose", "Vents", "6890", 898372, 3238, 10000000.0, 1000);
        consultor = new Consultor("Juan", "Consultor", "avenida", 4, 7, 30, 100000.0);

        imprimirNombreYPaga(trabajador);
        imprimirNombreYPaga(empleado);
        imprimirNombreYPaga(consultor);
    }

    private static void herencia() {
        Trabajador trabajador = new Trabajador("Pepe", "Programador", "Calle 123", 123456789, 987654321);
        System.out.println(trabajador);
        System.out.println(trabajador.CalculaPaga());

        Empleado empleado = new Empleado(null, null, null, 0, 0);
        System.out.println(empleado);

    }

    private static void metodosEstaticos() {

    }

    private static void Modificadores() {

    }

    private static void PasoValorReferencia() {
        Circulo circulo = new Circulo(2, 3);
        System.out.println(circulo);
        moverCirculo(circulo, 20, 30);
        System.out.println(circulo);
    }

    private static void moverCirculo(Circulo c, int i, int j) {
        c.setX(i);
        c.setY(j);
        c = new Circulo(5, 5);// no cambia por que es un nuevo objeto, no es el miso que mandamos al metodo
    }

    private static void ClaseDni() throws CampoVacioException {

        try {
            Persona1 persona = new Persona1("Daniel", "Vega", "32098557X");
            System.out.println(persona);
            System.out.println("Edad: " + persona.getEdad());
            persona.setEdad(25);
            System.out.println("Nueva edad: " + persona.getEdad());
        } catch (DniException e) {
            System.out.println(e.getMessage());
        }

        Punto punto = new Punto(2, 3);
        Punto punto1 = new Punto(5, 3);
        Punto punto2 = new Punto(2, 0);
        Punto punto3 = new Punto(-2, 3);
        Punto[] puntos = { punto, punto1, punto2, punto3 };
        Rectangulo rectangulo = new Rectangulo(punto, punto1, punto2, punto3);
        Rectangulo rectangulo2 = new Rectangulo(puntos);
        System.out.println(rectangulo);
        rectangulo = null;
    }
}
