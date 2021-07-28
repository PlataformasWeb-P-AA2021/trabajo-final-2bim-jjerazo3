package Claro;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */
public class PlanPagoMinutosMegas extends PlanCelular {

    private int minutos;
    private double costoMinutos;
    private double megas;
    private double costoGigas;

    public PlanPagoMinutosMegas(Persona p, String c, String m, String mo, String n,
            int minutos, double costoMinutos, double megas, double costoGigas) {
        super(p, c, m, mo, n);
        this.minutos = minutos;
        this.costoMinutos = costoMinutos;
        this.megas = megas;
        this.costoGigas = costoGigas;
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
        this.megas = megas / 1024;
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

    @Override
    public void setPagoMensual() {
        this.pagoMensual = (minutos * costoMinutos) + (megas * costoGigas);
    }

    @Override
    public String toString() {
        String cadena = String.format("\tPlan Pago Minutos/Megas\n"
                + "Mimutos: %d\n"
                + "Costo por Minuto: %.2f\n"
                + "Gigas: %d\n"
                + "Costo por cada Giga: %.2f\n"
                + "Pago Mensual: %.2f\n",
                super.toString(),
                getMinutos(),
                getCostoMinutos(),
                getMegas(),
                getCostoGigas(),
                getPagoMensual());
        return cadena;
    }

}
