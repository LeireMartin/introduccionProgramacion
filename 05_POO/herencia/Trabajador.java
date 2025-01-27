package herencia;

public class Trabajador {

    private String nombre;
    private String puesto;
    private String direccion; 
    private int numSegSocial;
    private int telefono;

    private static final double SALARIO_BASE=3000.0;

    public Trabajador() {
        //se crea siempre uno vacio po defecto
    }
    public Trabajador(String nombre, String puesto, String direccion, int numSegSocial, int telefono) {
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setDireccion(direccion);
        this.setNumSegSocial(numSegSocial);
        this.setTelefono(telefono);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(int numSegSocial) {
        this.numSegSocial = numSegSocial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static double getSalarioBase() {
        return SALARIO_BASE;
    }
    public double CalculaPaga(){
        return SALARIO_BASE;
    }

    @Override
    public String toString() {
        return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", direccion=" + direccion + ", numSegSocial="
                + numSegSocial + ", telefono=" + telefono + "]";
    }
    
}
   
    
