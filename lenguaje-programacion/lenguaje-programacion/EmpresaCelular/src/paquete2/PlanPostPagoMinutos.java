package paquete2;
public class PlanPostPagoMinutos extends PlanCelular {

    private double minutosNacional;
    private double costoMinNacional;
    private double minutosIntern;
    private double costoMinInternac;

    public PlanPostPagoMinutos(Persona per,String ciud, String marc, 
            String model, String num, double min_nac, double cost_min_nac,
            double min_internac, double cost_min_inter) {
        super(per, ciud, marc, model, num);
        minutosNacional = min_nac;
        costoMinNacional = cost_min_nac;
        minutosIntern = min_internac;
        costoMinInternac = cost_min_inter;
    }

    public void establecerMinutosNacional(double min_nac) {
        minutosNacional = min_nac;
    }

    public void establecerCostoMinNacional(double cost_min_nac) {
        costoMinNacional = cost_min_nac;
    }

    public void establecerMinutosInter(double min_inter) {
        minutosIntern = min_inter;
    }

    public void establecerCostoMinInter(double cost_min_inter) {
        costoMinInternac = cost_min_inter;
    }

    public double obtenerMinutosNacional() {
        return minutosNacional;
    }

    public double obtenerCostoMinNacional() {
        return costoMinNacional;
    }

    public double obtenerMinutosInter() {
        return minutosIntern;
    }

    public double obtenerCostoMinInter() {
        return costoMinInternac;
    }

    @Override
    public void CalcularMensualidad() {
        pagoMensual = (minutosNacional * costoMinNacional)
                + (minutosIntern * costoMinInternac);
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
                + "Minutos nacionales: %.1f\n"
                + "Costo por minuto nacional: $ %.2f\n"
                + "Minutos internacionales: %.1f\n"
                + "Costo por minuto internacional: $ %.2f\n"
                + "Pago mensual: $ %.2f\n",
                obtenerPersona().obtenerNombre(),
                obtenerPersona().obtenerApellidos(),
                obtenerPersona().obtenerIdentificacion(),
                obtenerCiudad(),
                obtenerMarca(),
                obtenerModelo(),
                obtenerNumero(),
                obtenerMinutosNacional(),
                obtenerCostoMinNacional(),
                obtenerMinutosInter(),
                obtenerCostoMinInter(),
                obtenerPagoMensual());
        return cadena;
    }
}
