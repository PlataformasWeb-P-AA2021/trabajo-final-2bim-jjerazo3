package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */
public class PlanPagoMinutosMegas extends PlanCelular {
    
    private int minutos;
    private double costoMinutos;
    private int megas;
    private double costoMegas;

    public PlanPagoMinutosMegas(Persona p, String c, String m, String mo, String n,
            int minutos, double costoMinutos, int megas, double costoMegas) {
        super(p, c, m, mo, n);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megas = megas;
        this.costoMegas = costoMegas;
    }
    
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getMinutos() {
        return minutos;
    }
    
    public void setCostoMinutos(double costoMinutos) {
        this.costoMinutos = costoMinutos;
    }
    public double getCostoMinutos() {
        return costoMinutos;
    }

    public void setMegas(int megas) {
        this.megas = megas;
    }
    public int getMegas() {
        return megas;
    }

    public void setCostoMegas(double costoMegas) {
        this.costoMegas = costoMegas;
    }
    public double getCostoMegas() {
        return costoMegas;
    }

    @Override
    public void setPagoMensual(){
        this.pagoMensual = (minutos * costoMinutos) + (megas * costoMegas);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPlan Pago Minutos/Megas\n"
                + "Mimutos: %d\n"
                + "Costo por Minuto: %.2f\n"
                + "Megas: %d\n"
                + "Costo por cada Mega: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                getMinutos(),
                getCostoMinutos(),
                getMegas(),
                getCostoMegas(),
                getPagoMensual());
        return cadena;
    }
    
    
    
    
    
}
