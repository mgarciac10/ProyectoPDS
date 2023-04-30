package modulos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import modulos.Salida;

import java.io.IOException;

public class Persistencia
{
    
    public static void guardar(double[] resultadosPh,double[] resultadosHum, double[] resultadosTemp){
        File f = new File("Cultivos.txt");
        Salida sal = new Salida();
        FileWriter writer = null;
        PrintWriter pw = null;
        
        // File creation
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("Cultivos.txt",true);
            pw = new PrintWriter(writer);
            pw.println("PH: " + resultadosPh[2] + "\n" + "Humedad: " + resultadosHum[2] + "\n" + "Temperatura: " + resultadosTemp[2]);
        }catch(IOException exception){
                System.err.println("Error abriendo el archivo");
        }finally {
           try {
               //Closing the file
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
