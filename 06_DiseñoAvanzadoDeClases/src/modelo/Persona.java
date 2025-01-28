package modelo;
public class Persona {

    //atributos se declaran a nivel de clase
    public String nombre;
    public Persona() {
    }
    public String apellido;
    public String dni;
    public String getNombre() {
        return nombre;
    }
    
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    //metodo que identifica el comportamiento de una clase

   
}