package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */

public abstract class PlanCelular {
    
    protected Persona propietario;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numero;
    protected double pagoMensual;
    
    public PlanCelular(Persona p, String c, String m, String mo,
            String n){
        this.propietario = p;
        this.ciudad = c;
        this.marca = m;
        this.modelo = mo;
        this.numero = n;
    
    }
    
    public void setPropietario(Persona p){
        this.propietario = p;
    }
    public Persona getPropietario(){
        return propietario;
    }
    
    public void setCiudad(String c){
        this.ciudad = c;
    }
    public String getCiudad (){
        return ciudad;
    }
    
    public void setMarca(String m) {
        this.marca = m;
    }
    public String getMarca() {
        return marca;
    }
    
    public void setModelo(String mo){
        this.modelo = mo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setNumero(String n) {
        this.numero = n;
    }
    public String getNumero() {
        return numero;
    }
    
    public abstract void setPagoMensual();

    @Override
    public String toString() {
        String cadena = String.format("\tPlan Celular\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Celula: %s\n"
                + "Ciudad: %s\n"
                + "Marca celular: %s\n"
                + "Modelo del celular: %s\n"
                + "Número del celular: %d\n", 
                propietario.getNombre(),
                propietario.getApellido(),
                propietario.getCedula(),
                getCiudad(),
                getMarca(),
                getModelo(),
                getNumero());
        return cadena;
    }
    
    
}
