package paquete2;
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private double minutos;
    private double costoMinutos;
    private double gigas;
    private double costoGigas;
    private double porcDescuento;
    private double descuento;

    public PlanPostPagoMinutosMegasEconomico(Persona p, String c,
            String m, String md, String n, double min, double costoMin,
            double gb, double costoGb, double d) {
        super(p, c, m, md, n);
        minutos = min;
        costoMinutos = costoMin;
        gigas = gb;
        costoGigas = costoGb;
        porcDescuento = d;
    }

    public void establecerMinutos(double n) {
        minutos = n;
    }

    public void establecerCostoMinutos(double n) {
        costoMinutos = n;
    }

    public void establecerGigas(double n) {
        gigas = n;
    }

    public void establecerCostoGigas(double n) {
        costoGigas = n;
    }

    public void establecerDescuento(double n) {
        porcDescuento = n;
    }

    public void establecerPorDescuento() {
        descuento = pagoMensual * (porcDescuento / 100);
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerPorcDescuento() {
        return porcDescuento;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void CalcularMensualidad() {
        pagoMensual = (minutos * costoMinutos) + (gigas * costoGigas)
                - descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Apellidos: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Numero: %s\n"
                + "Minutos: %.1f\n"
                + "Costo por minuto: $ %.2f\n"
                + "Gigas: %.1f\n"
                + "Costo por giga: $ %.2f\n"
                + "Descuento: (%.1f%s) $ %.2f\n"
                + "Pago mensual: $ %.2f\n",
                obtenerPersona().obtenerNombre(),
                obtenerPersona().obtenerApellidos(),
                obtenerPersona().obtenerIdentificacion(),
                obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumero(),
                obtenerMinutos(),
                obtenerCostoMinutos(),
                obtenerGigas(),
                obtenerCostoGigas(),
                obtenerPorcDescuento(), "%",
                obtenerDescuento(),
                obtenerPagoMensual() - obtenerDescuento());
        return cadena;
    }
}
