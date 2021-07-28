package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */
public class PlanPagoMegas extends PlanCelular{
    
    private double megas;
    private double costoMegas;
    private double tarifaBase;

    public PlanPagoMegas(Persona p, String c, String m, String mo, String n, 
            double megas, double costoMegas, double tarifaBase) {
        super(p, c, m, mo, n);
        this.megas = megas;
        this.costoMegas = costoMegas;
        this.tarifaBase = tarifaBase;
        setPagoMensual();
    }
    
    public void setMegas(int megas) {
        this.megas = megas;
    }
    public double getMegas() {
        return megas / 1024;
    }
    
    public void setCostoMegas(double costoMegas) {
        this.costoMegas = costoMegas / 1024;
    }
    public double getCostoMegas() {
        return costoMegas;
    }
    
    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    public double getTarifaBase() {
        return tarifaBase;
    }
    
    @Override
    public void setPagoMensual(){
        this.pagoMensual = tarifaBase + (megas * costoMegas) ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPlan Pago Megas\n"
                + "Megas: %d GB\n"
                + "Costo por cada Mega: %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                getMegas(),
                getCostoMegas(),
                getTarifaBase(),
                getPagoMensual());
        return cadena;
    }
    
    
}
