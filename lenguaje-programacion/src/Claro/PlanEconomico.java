package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */
public class PlanEconomico extends PlanCelular {
    
    private int minutos;
    private double costoMinutos;
    private int megas;
    private double costoMegas;
    private int porcentajeDescuento;

    public PlanEconomico(Persona p, String c, String m, String mo, String n,
            int minutos, double costoMinutos, int megas, double costoMegas, int porcentajeDescuento) {
        super(p, c, m, mo, n);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megas = megas;
        this.costoMegas = costoMegas;
        this.porcentajeDescuento = porcentajeDescuento;
        setPagoMensual();
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
    
    public void setPorcentajeDescuento(int Descuento) {
        this.porcentajeDescuento = Descuento;
    }
    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void setPagoMensual(){
        this.pagoMensual = ((minutos * costoMinutos) + (megas * costoMegas))
                - (((minutos * costoMinutos) + (megas * costoMegas))*porcentajeDescuento)/100 ;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPlan Pago Economico\n"
                + "Minutos: %d\n"
                + "Costo minutos: %.2f\n"
                + "Megas: %d\n"
                + "Costo por cada Megas: %.2f\n"
                + "Porcentaje descuento: %d\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                getMinutos(),
                getCostoMinutos(),
                getMegas(),
                getCostoMegas(),
                getPorcentajeDescuento(),
                getPagoMensual());
        return cadena;
    }
    
    
    
    
}
