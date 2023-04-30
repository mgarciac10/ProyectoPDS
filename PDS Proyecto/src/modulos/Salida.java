package modulos;

import modulos.Procesamiento;

public class Salida {


    public static void SalidaDatos (double[] resultadosPh,double[] resultadosHum, double[] resultadosTemp, int tipo ) {
    Procesamiento pro = new Procesamiento();
  
          //Se revisan los datos y se le da la información al usuario.
          System.out.println("\nPh mínimo: "+ resultadosPh[1]+ " Ph máximo: "+      resultadosPh[0]);
          pro.ph(resultadosPh, tipo);
          System.out.println("\nHumedad mínima: "+ resultadosHum[1]+ " Humedad máxima: "+ resultadosHum[0]);
          pro.hum(resultadosHum, tipo);
          System.out.println("\nTemperatura mínima: "+ resultadosTemp[1]+ "° Temperatura máxima: "+ resultadosTemp[0]+ "°");
          pro.temp(resultadosTemp, tipo);
    }
  }
