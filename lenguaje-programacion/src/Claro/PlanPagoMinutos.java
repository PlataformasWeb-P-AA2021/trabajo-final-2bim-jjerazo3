package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */

public class PlanPagoMinutos extends PlanCelular{
    
    private int minutosNacionales;
    private double costoMinNacionales;
    private int minutosInternacionales;
    private double costoMinInternacionales;
    
    public PlanPagoMinutos (Persona p, String ciu, String m, String mo,String n,
            int mn, double cmn, int mi, double cmi){
        super(p, ciu, m, mo, n);
        this.minutosNacionales = mn;
        this.costoMinNacionales = cmn;
        this.minutosInternacionales = mi;
        this.costoMinInternacionales = cmi;
        setPagoMensual();
    }
    
    public void setMinutosNacionales(int mn) {
        this.minutosNacionales = mn;
    }
    public double getMinutosNacioales() {
        return minutosNacionales;
    }
    
    public void setCostoMinNacionales(double cmn) {
        this.costoMinNacionales = cmn;
    }
    public double getCostoMinNacionales() {
        return costoMinNacionales;
    }
    
    public void setMinutosInternacionales(int mi) {
        this.minutosInternacionales = mi;
    }
    public double getMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void setCostoMinInternacionales(double cmi) {
        this.costoMinInternacionales = cmi;
    }
    public double getCostoMinInternacionales() {
        return costoMinInternacionales;
    }
    
    @Override
    public void setPagoMensual(){
        this.pagoMensual = (minutosNacionales * costoMinNacionales)
                + (minutosInternacionales * costoMinInternacionales);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPlan Pago minutos\n"
                + "Minutos nacionales: %d\n"
                + "Costo minutos nacionales: %.2f\n"
                + "Minutos internacionales: %d\n"
                + "Costo por minutos internacionales: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                getMinutosNacioales(),
                getCostoMinNacionales(),
                getMinutosInternacionales(),
                getCostoMinInternacionales(),
                getPagoMensual());
        return cadena;
    }
    
    
}
