package Principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Claro.*;
import Serializador.Serializador;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */
public class Ejecutor {

    private static List<PlanCelular> lista;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        lista = Serializador.deserializa();
        lista = new ArrayList<>();
        int opc = 0;

        System.out.println("-----------------------------------------");
        System.out.println("\tBienbenido a Claro");
        System.out.println("Seleccione el plan que desea contratar:");
        System.out.println("-----------------------------------------");

        do {
            System.out.println("Seleccione una opcion de la terminal");
            System.out.print("1.Plan PostPagoMinutos\n"
                    + "2.Plan PostPagoMegas\n"
                    + "3.Plan PostPagoMinutosMegas\n"
                    + "4.Plan PostPagoMinutosMegasEconomico\n"
                    + "5.Ver Lista de planes\n"
                    + "6.Salir\n");
            opc = leer.nextInt();

            if (opc == 1) {
                System.out.println("Ingrese su nombre:");
                String nombre = leer.next();
                System.out.println("Ingrese su apellido:");
                String apellido = leer.next();
                System.out.println("Ingrese su numero de cedula:");
                String cedula = leer.next();
                Persona p = new Persona(nombre, apellido, cedula);
                System.out.println("Ingrese su ciudad: ");
                String ciudad = leer.next();
                System.out.println("Inrese la marca del celular: ");
                String marca = leer.next();
                System.out.println("Ingrese el modelo del celular: ");
                String modelo = leer.next();
                System.out.println("Ingrese su numero celular: ");
                String numero = leer.nextLine();

                System.out.println("Ingrese los minutos nacionales: ");
                int minNacionales = leer.nextInt();
                System.out.println("Ingrese el costo por minuto nacional: ");
                double costoMinutosN = leer.nextDouble();
                System.out.println("Ingrese los minutos internacionales: ");
                int minInter = leer.nextInt();
                System.out.println("Ingrese el costo por minuto internacional: ");
                double costoMinutosI = leer.nextDouble();

                lista.add(new PlanPagoMinutos(p, ciudad, marca, modelo, numero, minNacionales, costoMinutosN,
                        minInter, costoMinutosI));
            }

            if (opc == 2) {
                System.out.println("Ingrese su nombre:");
                String nombre = leer.next();
                System.out.println("Ingrese su apellido:");
                String apellido = leer.next();
                System.out.println("Ingrese su numero de cedula:");
                String cedula = leer.next();
                Persona p = new Persona(nombre, apellido, cedula);
                System.out.println("Ingrese su ciudad: ");
                String ciudad = leer.next();
                System.out.println("Inrese la marca del celular: ");
                String marca = leer.next();
                System.out.println("Ingrese el modelo del celular: ");
                String modelo = leer.next();
                System.out.println("Ingrese su numero celular: ");
                String numero = leer.next();

                System.out.println("Ingrese las megas del plan: ");
                double megas = leer.nextDouble();
                System.out.println("Ingrese el costo por Giga del plan: ");
                double costoMegas = leer.nextDouble();
                System.out.println("Ingrese la tarifa base del plan: ");
                double tarifaBase = leer.nextDouble();

                lista.add(new PlanPagoMegas(p, ciudad, marca, modelo, numero, megas, costoMegas, tarifaBase));
                return;

            }

            if (opc == 3) {
                System.out.println("Ingrese su nombre:");
                String nombre = leer.next();
                System.out.println("Ingrese su apellido:");
                String apellido = leer.next();
                System.out.println("Ingrese su numero de cedula:");
                String cedula = leer.next();
                Persona p = new Persona(nombre, apellido, cedula);
                System.out.println("Ingrese su ciudad: ");
                String ciudad = leer.next();
                System.out.println("Inrese la marca del celular: ");
                String marca = leer.next();
                System.out.println("Ingrese el modelo del celular: ");
                String modelo = leer.next();
                System.out.println("Ingrese su número celular: ");
                String numero = leer.next();

                System.out.println("Ingrese los minutos del plan: ");
                int minutos = leer.nextInt();
                System.out.println("Ingrese el costo por minuto del plan: ");
                double costoMinutos = leer.nextDouble();
                System.out.println("Ingrese las megas del plan: ");
                double megas = leer.nextDouble();
                System.out.println("Ingrese el costo por Giga del plan: ");
                double costoGigas = leer.nextDouble();

                lista.add(new PlanPagoMinutosMegas(p, ciudad, marca, modelo, numero, minutos,
                        costoMinutos, megas, costoGigas));

            }

            if (opc == 4) {
                System.out.println("Ingrese su nombre:");
                String nombre = leer.next();
                System.out.println("Ingrese su apellido:");
                String apellido = leer.next();
                System.out.println("Ingrese su numero de cedula:");
                String cedula = leer.next();
                Persona p = new Persona(nombre, apellido, cedula);
                System.out.println("Ingrese su ciudad: ");
                String ciudad = leer.next();
                System.out.println("Inrese la marca del celular: ");
                String marca = leer.next();
                System.out.println("Ingrese el modelo del celular: ");
                String modelo = leer.next();
                System.out.println("Ingrese su numero celular: ");
                String numero = leer.next();

                System.out.println("Ingrese los minutos plan: ");
                int minutos = leer.nextInt();
                System.out.println("Ingrese el costo por minuto del plan: ");
                double costoMinutos = leer.nextDouble();
                System.out.println("Ingrese las megas del plan: ");
                double megas = leer.nextDouble();
                System.out.println("Ingrese el costo por Giga del plan: ");
                double costoGigas = leer.nextDouble();
                System.out.println("Ingrese el descuento del plan: ");
                int descuento = leer.nextInt();

                lista.add(new PlanEconomico(p, ciudad, marca, modelo, numero, minutos,
                        costoMinutos, megas, costoGigas, descuento));

            }

            if (opc == 5) {
                int i = 1;
                System.out.println();
                for (PlanCelular plan : lista) {
                    System.out.println("---------------" + i + "---------------");
                    System.out.println(plan + "\n");
                    i++;
                }
            }

            if (opc > 6) {
                System.out.println("Opcion Incorreta");
            }

        } while ((opc >= 1) && (opc <= 5));

        if (opc == 6) {
            System.out.println("Terminal Finalizada");
        }

    }
}
