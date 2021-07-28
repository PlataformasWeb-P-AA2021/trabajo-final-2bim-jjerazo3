package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */
public class PlanPagoMegas extends PlanCelular{
    
    private double megas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPagoMegas(Persona p, String c, String m, String mo, String n, 
            double megas, double costoGigas, double tarifaBase) {
        super(p, c, m, mo, n);
        this.megas = megas;
        this.costoGigas = costoGigas;
        this.tarifaBase = tarifaBase;
        setPagoMensual();
    }
    
    public void setMegas(int megas) {
        this.megas = megas/1024;
    }
    public double getMegas() {
        return megas;
    }
    
    public void setCostoGigas(double costoGigas) {
        this.costoGigas = costoGigas;
    }
    public double getCostoGigas() {
        return costoGigas;
    }
    
    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    public double getTarifaBase() {
        return tarifaBase;
    }
    
    @Override
    public void setPagoMensual(){
        this.pagoMensual = tarifaBase + (megas * costoGigas) ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPlan Pago Megas\n"
                + "Gigas: %d GB\n"
                + "Costo por cada Giga: %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                getMegas(),
                getCostoGigas(),
                getTarifaBase(),
                getPagoMensual());
        return cadena;
    }
    
    
}
