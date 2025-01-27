package herencia;

public class Empleado extends Trabajador { //hereda de trabjador
    //en java solo se puede heredar de una clase
    private double sueldo;
    private double impuestos;
    private final int PAGAS= 14;


    public Empleado() {
        super(); //con el supr accedemos a la clase Trabajador por que hereda de trabajador, con el super lo llamo
    }


    public Empleado(String nombre, String puesto, String direccion, int numSegSocial, int telefono) {
        super(nombre, puesto, direccion, numSegSocial, telefono);
    }


    public Empleado(String nombre, String puesto, String direccion, int numSegSocial, int telefono, double sueldo,
            double impuestos) {

                //He creado un constructor completo con todos los atributos
                //Los atributos que son por herencia se lo mando al super de la clase padre ue  sera Trabajador(con todos atributos)

        super(nombre, puesto, direccion, numSegSocial, telefono);
        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }


    public double getSueldo() {
        return sueldo;
    }


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public double getImpuestos() {
        return impuestos;
    }


    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }


    public int getPAGAS() {
        return PAGAS;
    }

    public double CalculaPaga(){
        return(sueldo-impuestos)/PAGAS;
    }


    @Override
    public String toString() {
        return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", PAGAS=" + PAGAS + "]";
        // Con el super puedo acceder a todo de la clase padre(metodos y atributos)

    }

    
    

}
