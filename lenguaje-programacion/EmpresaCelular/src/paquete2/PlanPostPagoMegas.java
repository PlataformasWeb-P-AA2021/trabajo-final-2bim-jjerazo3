package paquete2;
public class PlanPostPagoMegas extends PlanCelular {

    private double megas;
    private double costoGigas;
    private double tarifaBase;

    public PlanPostPagoMegas(Persona p, String c, String m,
            String md, String n, double gb, double costogb, double tarifa) {
        super(p, c, m, md, n);
        megas = gb;
        costoGigas = costogb;
        tarifaBase = tarifa;
    }

    public void establecerGigas(double n) {
        megas = n;
    }

    public void establecerCostoGigas(double n) {
        costoGigas = n;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    public double obtenerGigas() {
        return megas / 1000;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public void CalcularMensualidad() {
        pagoMensual = (megas * costoGigas) + tarifaBase;
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
                + "Gigas: %.3f GB\n"
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
