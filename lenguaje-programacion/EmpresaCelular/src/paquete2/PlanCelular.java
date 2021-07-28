package paquete2;

import java.io.Serializable;

public abstract class PlanCelular implements Serializable{
    
    protected Persona persona;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numero;
    protected double pagoMensual;
    
    public PlanCelular(Persona p, String c, String m, String md, 
            String n) {
        persona = p;
        ciudad = c;
        marca = m;
        modelo = md;
        numero = n;
    }
    
    public void establecerPersona(Persona n) {
        persona = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerModelo(String n) {
        modelo = n;
    }

    public void establecerNumero(String n) {
        numero = n;
    }
    public abstract void CalcularMensualidad();
    
    public Persona obtenerPersona() {
        return persona;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public String obtenerNumero() {
        return numero;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }
    
    @Override
    public String toString(){
        return String.format("PlanCelular.");
    }
}
