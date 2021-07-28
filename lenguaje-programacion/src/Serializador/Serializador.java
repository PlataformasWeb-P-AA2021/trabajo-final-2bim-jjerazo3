package Serializador;

/**
 *
 * @author Jose Cordova, Jonathan Erazo
 */

import Claro.PlanCelular;
import java.io.*;
import java.util.List;

public class Serializador {
    public static void serializa(List<PlanCelular> lista){
        try(FileOutputStream file1 = new FileOutputStream("planes.data/");
            ObjectOutputStream outputStream = new ObjectOutputStream(file1))
        {
            outputStream.writeObject(lista);
        }
        catch (IOException e)
        {
            e.printStackTrace(System.out);
        }
    }

    public static List<PlanCelular> deserializa(){
        try(FileInputStream file2 = new FileInputStream("planes.data");
            ObjectInputStream inputStream = new ObjectInputStream(file2))
        {
            return (List<PlanCelular>) inputStream.readObject();
        }
        catch (IOException e)
        {
            System.out.println("Error: No se hay registros previos");
        }
        catch (ClassCastException | ClassNotFoundException e)
        {
            System.out.println("Error: Daño en el archivo");
        }
        return null;
    }
}