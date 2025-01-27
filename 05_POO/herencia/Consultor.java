package herencia;

public class Consultor extends Trabajador {

    private int horas;
    private double tarifa;


    public Consultor() {
        super();
    }


    public Consultor(String nombre, String puesto, String direccion, int numSegSocial, int telefono, int horas,
            double tarifa) {
        super(nombre, puesto, direccion, numSegSocial, telefono);
        this.horas = horas;
        this.tarifa = tarifa;
    }


    @Override
    public String toString() {
        return "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
    }
    

}
