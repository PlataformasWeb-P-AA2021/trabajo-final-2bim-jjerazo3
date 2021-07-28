package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String cedula;

    public Persona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        
    }

    public String getNombre() {
        return nombre;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPersona\n"
                + "Nombre = %s\n"
                + "Apellido = %s\n"
                + "Cedula = %s\n",
                getNombre(),
                getApellido(),
                getCedula());
        return cadena;
    }
    
    
}
