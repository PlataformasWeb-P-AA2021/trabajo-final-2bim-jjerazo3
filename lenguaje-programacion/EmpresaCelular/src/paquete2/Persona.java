package paquete2;

import java.io.Serializable;


public class Persona implements Serializable {

  
    private String nombre;
    private String apellidos;
    private String identificacion;

  
    public Persona(String n, String a, String id) {
        nombre = n;
        apellidos = a;
        identificacion = id;
    }

  
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellidos(String n) {
        apellidos = n;
    }

    public void establecerIdentificacion(String n) {
        identificacion = n;
    }

  
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }
}
