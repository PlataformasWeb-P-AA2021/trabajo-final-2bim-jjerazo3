package paquete2;
public class PlanPostPagoMegas extends PlanCelular {

    private double gigas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(Persona p, String c, String m,
            String md, String n, double gb, double costogb, double tarifa) {
        super(p, c, m, md, n);
        gigas = gb;
        costoGigas = costogb;
        tarifaBase = tarifa;
    }

    public void establecerGigas(double n) {
        gigas = n;
    }

    public void establecerCostoGigas(double n) {
        costoGigas = n;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public void CalcularMensualidad() {
        pagoMensual = (gigas * costoGigas) + tarifaBase;
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
                + "Gigas: %.1f\n"
                + "Costo por giga: $ %.2f\n"
                + "Tarifa base: $ %.2f\n"
                + "Pago mensual: $ %.2f\n",
                obtenerPersona().obtenerNombre(),
                obtenerPersona().obtenerApellidos(),
                obtenerPersona().obtenerIdentificacion(),
                obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumero(),
                obtenerGigas(),
                obtenerCostoGigas(),
                obtenerTarifaBase(),
                obtenerPagoMensual());
        return cadena;
    }
}
