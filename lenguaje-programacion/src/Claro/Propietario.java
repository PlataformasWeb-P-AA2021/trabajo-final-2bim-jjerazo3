package Claro;
import Claro.Persona;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */

public class Propietario {
    
    private Persona propietario;
    private String ciudad;

    public Propietario(Persona pro, String ciudad) {
        this.propietario = pro;
        this.ciudad = ciudad;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    @Override
    public String toString() {
        String cadena = String.format("\tPropietario\n"
                + "Propietario = %s\n"
                + "Ciudad = %s\n",
                getPropietario(),
                getCiudad());

        return cadena;
    }
    
    
}
