package paquete2;
public class PlanPostPagoMinutosMegas extends PlanCelular {

    private double minutos;
    private double costoMinutos;
    private double megas;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(Persona p, String c, String m,
            String md, String n, double min, double costoMin, double gb,
            double costoGb) {
        super(p, c, m, md, n);
        minutos = min;
        costoMinutos = costoMin;
        megas = gb;
        costoGigas = costoGb;
    }

    public void establecerMinutos(double n) {
        minutos = n;
    }

    public void establecerCostoMinutos(double n) {
        costoMinutos = n;
    }

    public void establecerGigas(double n) {
        megas = n;
    }

    public void establecerCostoGigas(double n) {
        costoGigas = n;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerGigas() {
        return megas / 1000;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    @Override
    public void CalcularMensualidad() {
        pagoMensual = (minutos * costoMinutos) + (megas * costoGigas);
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Marca: %s\n"
                + "Modelo: %s\n"
                + "Numero: %s\n"
                + "Minutos: %.1f\n"
                + "Costo por minuto: $ %.2f\n"
                + "Gigas: %.3f GB\n"
                + "Costo por giga: $ %.2f\n"
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
                obtenerPagoMensual());
        return cadena;
    }
}
