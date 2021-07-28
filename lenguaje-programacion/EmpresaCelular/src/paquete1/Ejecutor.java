package paquete1;

import paquete2.*;
import paquete3.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        double minutos = 0, costo_min = 0, gigas = 0, costo_giga = 0, tarifa = 0,
                porcentaje = 0;
        String nombre="", apellido="", cedula="", ciudad="", marca="", modelo="", numero="";
        
        ArrayList<PlanCelular> lista = new ArrayList<>(); 
        
        System.out.println("\tMenu de planes");
        while (opc != 6) { 
            double minutos_inter = 0, costo_min_inter = 0;
            System.out.println("------------------------------");
            System.out.println("1. Plan PostPago Minutos");
            System.out.println("2. Plan PostPago Megas");
            System.out.println("3. Plan PostPago Minutos Megas");
            System.out.println("4. Plan PostPago Minutos Megas Economico");
            System.out.println("5. Ver lista de planes");
            System.out.println("6. Salir");
            opc = sc.nextInt();
            sc.nextLine();
            
            switch (opc) { 
                case 1:


                    System.out.print("Nombres: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellidos: ");
                    apellido = sc.nextLine();
                    System.out.print("Cédula: ");
                    cedula = sc.nextLine();
                    System.out.print("Ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Marca de celular: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo de celular: ");
                    modelo = sc.nextLine();
                    System.out.print("Número de celular: ");
                    numero = sc.nextLine();
                    System.out.print("Minutos nacionales: ");
                    minutos = sc.nextDouble();                   
                    System.out.print("Costo por minuto nacional: $ ");
                    costo_min = sc.nextDouble();                   
                    System.out.print("Minutos internacionales: ");
                    minutos_inter = sc.nextDouble();
                    System.out.print("Costo por minuto internacional: $ ");
                    costo_min_inter = sc.nextDouble();                       
                   
                    Persona persona1 = new Persona(nombre, apellido, cedula);
                    
                    PlanPostPagoMinutos plan1 = new PlanPostPagoMinutos(persona1,
                            ciudad, marca, modelo, numero, minutos, costo_min,
                            minutos_inter, costo_min_inter);
                    
                    plan1.CalcularMensualidad();
                    
                    lista.add(plan1);
                    
                    break;
                case 2:
                    System.out.print("Nombres: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellidos: ");
                    apellido = sc.nextLine();
                    System.out.print("Cédula: ");
                    cedula = sc.nextLine();
                    System.out.print("Ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Marca de celular: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo de celular: ");
                    modelo = sc.nextLine();
                    System.out.print("Número de celular: ");
                    numero = sc.nextLine();
                    System.out.print("Gigas: ");
                    gigas = sc.nextDouble();                    
                    System.out.print("Costo por cada giga: $ ");
                    costo_giga = sc.nextDouble();                    
                    System.out.print("Tarifa base: $ ");
                    tarifa = sc.nextDouble();
                    
                    Persona persona2 = new Persona(nombre, apellido, cedula);
                    
                    PlanPostPagoMegas plan2 = new PlanPostPagoMegas(persona2, 
                            ciudad,
                            marca, modelo, numero, gigas, costo_giga, tarifa);
                    
                    plan2.CalcularMensualidad(); 
                    
                    lista.add(plan2); 
                    break;
                case 3:

                    System.out.print("Nombres: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellidos: ");
                    apellido = sc.nextLine();
                    System.out.print("Cédula: ");
                    cedula = sc.nextLine();
                    System.out.print("Ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Marca de celular: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo de celular: ");
                    modelo = sc.nextLine();
                    System.out.print("Número de celular: ");
                    numero = sc.nextLine();
                    System.out.print("Minutos: ");
                    minutos = sc.nextDouble();
                    System.out.print("Costo por minuto: $ ");
                    costo_min = sc.nextDouble();                   
                    System.out.print("Gigas: ");
                    gigas = sc.nextDouble();                   
                    System.out.print("Costo por cada giga: $ ");
                    costo_giga = sc.nextDouble();
                    
                    Persona p3 = new Persona(nombre, apellido, cedula);
                  
                    PlanPostPagoMinutosMegas plan3
                            = new PlanPostPagoMinutosMegas(p3, ciudad, marca,
                                    modelo, numero, minutos, costo_min,
                                    gigas, costo_giga);
                    
                    plan3.CalcularMensualidad(); 
                    
                    lista.add(plan3);
                    
                    break;
                case 4:

                    System.out.print("Nombres: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellidos: ");
                    apellido = sc.nextLine();
                    System.out.print("Cédula: ");
                    cedula = sc.nextLine();
                    System.out.print("Ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Marca de celular: ");
                    marca = sc.nextLine();
                    System.out.print("Modelo de celular: ");
                    modelo = sc.nextLine();
                    System.out.print("Numero de celular: ");
                    numero = sc.nextLine();
                    System.out.print("Minutos: ");
                    minutos = sc.nextDouble();
                    
                    System.out.print("Costo por minuto: $ ");
                    costo_min = sc.nextDouble();
                    
                    System.out.print("Gigas: ");
                    gigas = sc.nextDouble();
                    
                    System.out.print("Costo por cada giga: $ ");
                    costo_giga = sc.nextDouble();
                    
                    System.out.print("Porcentaje de descuento: ");
                    porcentaje = sc.nextDouble();
                   
                    Persona p4 = new Persona(nombre, apellido, cedula);
                    
                    PlanPostPagoMinutosMegasEconomico plan4
                            = new PlanPostPagoMinutosMegasEconomico(p4, ciudad, 
                                    marca, modelo, numero, minutos,costo_min, 
                                    gigas, costo_giga, porcentaje);
                    
                    plan4.CalcularMensualidad(); 
                    
                    lista.add(plan4); 
                    
                    break;
                case 5: 
                    if (lista.size() >= 1) {
                        String nombreArchivo = "planes.data"; 
                        EscrituraArchivoSecuencial archivo
                                = new EscrituraArchivoSecuencial(nombreArchivo);
                        for (int i = 0; i < lista.size(); i++) {                          
                            archivo.establecerRegistro(lista.get(i));                            
                            archivo.establecerSalida();
                        }
                        archivo.cerrarArchivo();
                        LecturaArchivoSecuencial lectura
                                = new LecturaArchivoSecuencial(nombreArchivo);
                        lectura.establecerListaPlanes();
                        System.out.println(lectura);
                        lectura.cerrarArchivo();
                        
                    } 
                    else {
                        System.out.println("No se encuentran planes que mostrar");
                    }
                    
                    break;
                    
                case 6:System.out.println("Gracias");
                
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        }
    }
}
