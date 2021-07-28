package paquete3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete2.PlanCelular;

public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private PlanCelular registro;
    private ArrayList<PlanCelular> lista;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerLista(); 
        
        try { 
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo." + ioException);
        } 
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    
    public void establecerRegistro(PlanCelular p) {
        registro = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro); 
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
            System.err.println(ex);
        }
    }

    
    public void establecerLista() {
        LecturaArchivoSecuencial l
                = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaPlanes();
        lista = l.obtenerListaPlanes();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<PlanCelular> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    
    public PlanCelular obtenerRegistro() {
        return registro;
    }

    public void cerrarArchivo() {
        try { 
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
        } 
    }
}
