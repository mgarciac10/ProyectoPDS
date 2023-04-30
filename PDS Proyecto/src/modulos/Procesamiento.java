package modulos;

public class Procesamiento {

    //Función para hallar el número mayor el menor y el resultados[2] del array.
    public double[] menorMayorProm(int[] arreglo, double[] resultados){
        int suma = 0;
        resultados[0] = 0;
        resultados[1] = 1000;

        for(int i = 0; i < arreglo.length; i++){
            if(resultados[0] < arreglo[i] )
                resultados[0] = arreglo[i];

            if(resultados[1] > arreglo[i])
                resultados[1] = arreglo[i];
            
            suma = suma + arreglo[i];
        }
        double prom;
        prom = suma/(double) arreglo.length;
        resultados[2] = prom;
        return(resultados);
    }

    //Función para ver en que estado están los cultivos en cuanto al PH utilizando el resultados[2] del total de datos del "Sensor".
    public void ph(double resultados[], int tipo){
        if(tipo == 1){
            if(resultados[2] < 5.5){
                System.out.println("La tierra de sus cultivos  es demasiado ácida, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Le recomendamos mezclar la tierra de su cultivo con: Piedra caliza molida, dolomita o regar sus cultivos con agua rica en cal.");
            }
            else if (resultados[2] > 7){
                System.out.println("La tierra de sus cultivos es demasiado alcalina, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Le recomendamos mezclar la tierra de su cultivo con: fertilizantes nitrogenados, materia organica y en casos mas extremos sulfato de aluminio o azufre.");
            }
            else{
                System.out.println("La tierra de sus cultivos  está en excelentes condiciones, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Por lo que no tiene que hacer ninguna alteración a su cultivo.");
            }
        }
        else if(tipo == 2){
            if (resultados[2] < 5.5){
                System.out.println("La tierra de sus cultivos  es demasiado ácida, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Le recomendamos mezclar la tierra de su cultivo con: Piedra caliza molida, dolomita o regar sus cultivos con agua rica en cal.");
            }
            else if (resultados[2] > 7.5){
                System.out.println("La tierra de sus cultivos es demasiado alcalina, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Le recomendamos mezclar la tierra de su cultivo con: fertilizantes nitrogenados, materia organica y en casos mas extremos sulfato de aluminio o azufre.");
            }
            else{
                System.out.println("La tierra de sus cultivos  está en excelentes condiciones, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Por lo que no tiene que hacer ninguna alteración a su cultivo.");
            }
        }
        else if(tipo == 3){
            if (resultados[2] < 4.9){
                System.out.println("La tierra de sus cultivos  es demasiado ácida, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Le recomendamos mezclar la tierra de su cultivo con: Piedra caliza molida, dolomita o regar sus cultivos con agua rica en cal.");
            }
            else if (resultados[2] > 5.6){
                System.out.println("La tierra de sus cultivos es demasiado alcalina, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Le recomendamos mezclar la tierra de su cultivo con: fertilizantes nitrogenados, materia organica y en casos mas extremos sulfato de aluminio o azufre.");
            }
            else{
                System.out.println("La tierra de sus cultivos  está en excelentes condiciones, en la escala de PH se encuentra en: " + resultados[2] + 
                ". Por lo que no tiene que hacer ninguna alteración a su cultivo.");
            }
        }
    }

    //Función para ver en que estado están los cultivos en cuanto a humedad utilizando el promedio del total de datos del "sensor".
    public void hum(double resultados[], int tipo){
        if(tipo == 1 || tipo == 2){
            if(resultados[2] < 60){
                System.out.println("Sus cultivos están demasiado secos, la tierra tiene un: " + resultados[2] + 
                "% de humedad. Le recomendamos regar sus cultivos más seguido.");
            }
            else if(resultados[2] > 80){
                System.out.println("Sus cultivos están demasiado humedos, la tierra tiene un: " + resultados[2] + 
                "% de humedad. Le recomendamos no regar sus cultivos tan seguido.");
            }
            else{
                System.out.println("Sus cultivos están en excelentes condiciones en cuanto a humedad, la tierra tiene un: " + resultados[2] + 
                "% de humedad. Siga regando sus cultivos como lo ha estado haciendo.");
            }
            
        }
        else if(tipo == 3){
            if(resultados[2] < 40){
                System.out.println("Sus cultivos están demasiado secos, la tierra tiene un: " + resultados[2] + 
                "% de humedad. Le recomendamos regar sus cultivos más seguido.");
            }
            else if(resultados[2] > 80){
                System.out.println("Sus cultivos están demasiado humedos, la tierra tiene un: " + resultados[2] + 
                "% de humedad. Le recomendamos no regar sus cultivos tan seguido.");
            }
            else{
                System.out.println("Sus cultivos están en excelentes condiciones en cuanto a humedad, la tierra tiene un: " + resultados[2] + 
                "% de humedad. Siga regando sus cultivos como lo ha estado haciendo.");
            }
        }
    }

    // Función para ver en que estado están los cultivos en cuanto a temperatura utilizando el promedio del total de datos del “Sensor”
    public void temp(double resultados[], int tipo){
        if(tipo == 1){
            if(resultados[2] < 14){
                System.out.println("Sus cultivos están muy frios, la temperatura es de: " + resultados[2] + 
                "°. Le recomendamos construir una estructura que pueda protegerlos del frio como cortavientos o invernaderos, si no son posibles las opciones anteriores también puede cubrir sus cultivos con plásticos.");
            }
            else if (resultados[2] > 25){
                System.out.println("Sus cultivos están muy calientes, la temperatura es de: " + resultados[2] + 
                "°. Le recomendamos regar los cultivos con mayor intensidad en las horas más calurosas del día, además regar los alrededores de la planta para reducir el impacto térmico.");
            }
            else{
                System.out.println("Sus cultivos están en una excelente temperatura, la temperatura es de: " + resultados[2] + 
                "°.");
            }
        }
        else if(tipo == 2){
            if (resultados[2] < 24){
                System.out.println("Sus cultivos están muy frios, la temperatura es de: " + resultados[2] + 
                "°. Le recomendamos construir una estructura que pueda protegerlos del frio como cortavientos o invernaderos, si no son posibles las opciones anteriores también puede cubrir sus cultivos con plásticos.");
            }
            else if (resultados[2] > 35){
                System.out.println("Sus cultivos están muy calientes, la temperatura es de: " + resultados[2] + 
                "°. Le recomendamos regar los cultivos con mayor intensidad en las horas más calurosas del día, además regar los alrededores de la planta para reducir el impacto térmico.");
            }
            else{
                System.out.println("Sus cultivos están en una excelente temperatura, la temperatura es de: " + resultados[2] + 
                "°.");
            }
        }
        else if(tipo == 3){
            if (resultados[2] < 15){
                System.out.println("Sus cultivos están muy frios, la temperatura es de: " + resultados[2] + 
                "°. Le recomendamos construir una estructura que pueda protegerlos del frio como cortavientos o invernaderos, si no son posibles las opciones anteriores también puede cubrir sus cultivos con plásticos.");
            }
            else if (resultados[2] > 24){
                System.out.println("Sus cultivos están muy calientes, la temperatura es de: " + resultados[2] + 
                "°. Le recomendamos regar los cultivos con mayor intensidad en las horas más calurosas del día, además regar los alrededores de la planta para reducir el impacto térmico.");
            }
            else{
                System.out.println("Sus cultivos están en una excelente temperatura, la temperatura es de: " + resultados[2] + 
                "°.");
            }
        }
    }






    


    public String ph1(double resultados[], int tipo){
        if(tipo == 1){
            if(resultados[2] < 5.5){
                return "La tierra de sus cultivos  es demasiado ácida, en la escala de PH se encuentra en: " + resultados[2] +
                        ". Le recomendamos mezclar la tierra de su cultivo con: Piedra caliza molida, dolomita o regar sus cultivos con agua rica en cal.";
            }
            else if (resultados[2] > 7){
                return ("La tierra de sus cultivos es demasiado alcalina, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Le recomendamos mezclar la tierra de su cultivo con: fertilizantes nitrogenados, materia organica y en casos mas extremos sulfato de aluminio o azufre.");
            }
            else{
                return ("La tierra de sus cultivos  está en excelentes condiciones, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Por lo que no tiene que hacer ninguna alteración a su cultivo.");
            }
        }
        else if(tipo == 2){
            if (resultados[2] < 5.5){
                return ("La tierra de sus cultivos  es demasiado ácida, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Le recomendamos mezclar la tierra de su cultivo con: Piedra caliza molida, dolomita o regar sus cultivos con agua rica en cal.");
            }
            else if (resultados[2] > 7.5){
                return ("La tierra de sus cultivos es demasiado alcalina, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Le recomendamos mezclar la tierra de su cultivo con: fertilizantes nitrogenados, materia organica y en casos mas extremos sulfato de aluminio o azufre.");
            }
            else{
                return ("La tierra de sus cultivos  está en excelentes condiciones, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Por lo que no tiene que hacer ninguna alteración a su cultivo.");
            }
        }
        else if(tipo == 3){
            if (resultados[2] < 4.9){
                return ("La tierra de sus cultivos  es demasiado ácida, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Le recomendamos mezclar la tierra de su cultivo con: Piedra caliza molida, dolomita o regar sus cultivos con agua rica en cal.");
            }
            else if (resultados[2] > 5.6){
                return ("La tierra de sus cultivos es demasiado alcalina, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Le recomendamos mezclar la tierra de su cultivo con: fertilizantes nitrogenados, materia organica y en casos mas extremos sulfato de aluminio o azufre.");
            }
            else{
                return ("La tierra de sus cultivos  está en excelentes condiciones, en la escala de PH se encuentra en: " + resultados[2] +
                        ".\n Por lo que no tiene que hacer ninguna alteración a su cultivo.");
            }
        }
        return "";
    }

    //Función para ver en que estado están los cultivos en cuanto a humedad utilizando el promedio del total de datos del "sensor".
    public String hum1(double resultados[], int tipo){
        if(tipo == 1 || tipo == 2){
            if(resultados[2] < 60){
                return ("Sus cultivos están demasiado secos, la tierra tiene un: " + resultados[2] +
                        "% de humedad.\n Le recomendamos regar sus cultivos más seguido.");
            }
            else if(resultados[2] > 80){
                return ("Sus cultivos están demasiado humedos, la tierra tiene un: " + resultados[2] +
                        "% de humedad.\n Le recomendamos no regar sus cultivos tan seguido.");
            }
            else{
                return ("Sus cultivos están en excelentes condiciones en cuanto a humedad, la tierra tiene un: " + resultados[2] +
                        "% de humedad.\n Siga regando sus cultivos como lo ha estado haciendo.");
            }

        }
        else if(tipo == 3){
            if(resultados[2] < 40){
                return ("Sus cultivos están demasiado secos, la tierra tiene un: " + resultados[2] +
                        "% de humedad. Le recomendamos regar sus cultivos más seguido.");
            }
            else if(resultados[2] > 80){
                return ("Sus cultivos están demasiado humedos, la tierra tiene un: " + resultados[2] +
                        "% de humedad. Le recomendamos no regar sus cultivos tan seguido.");
            }
            else{
                return ("Sus cultivos están en excelentes condiciones en cuanto a humedad, la tierra tiene un: " + resultados[2] +
                        "% de humedad. Siga regando sus cultivos como lo ha estado haciendo.");
            }
        }
        return "";
    }

    // Función para ver en que estado están los cultivos en cuanto a temperatura utilizando el promedio del total de datos del “Sensor”
    public String temp1(double resultados[], int tipo){
        if(tipo == 1){
            if(resultados[2] < 14){
                return ("Sus cultivos están muy frios, la temperatura es de: " + resultados[2] +
                        "°. Le recomendamos construir una estructura que pueda protegerlos del frio como cortavientos o invernaderos, si no son posibles las opciones anteriores también puede cubrir sus cultivos con plásticos.");
            }
            else if (resultados[2] > 25){
                return ("Sus cultivos están muy calientes, la temperatura es de: " + resultados[2] +
                        "°. Le recomendamos regar los cultivos con mayor intensidad en las horas más calurosas del día, además regar los alrededores de la planta para reducir el impacto térmico.");
            }
            else{
                return ("Sus cultivos están en una excelente temperatura, la temperatura es de: " + resultados[2] +
                        "°.");
            }
        }
        else if(tipo == 2){
            if (resultados[2] < 24){
                return ("Sus cultivos están muy frios, la temperatura es de: " + resultados[2] +
                        "°. Le recomendamos construir una estructura que pueda protegerlos del frio como cortavientos o invernaderos, si no son posibles las opciones anteriores también puede cubrir sus cultivos con plásticos.");
            }
            else if (resultados[2] > 35){
                return ("Sus cultivos están muy calientes, la temperatura es de: " + resultados[2] +
                        "°. Le recomendamos regar los cultivos con mayor intensidad en las horas más calurosas del día, además regar los alrededores de la planta para reducir el impacto térmico.");
            }
            else{
                return ("Sus cultivos están en una excelente temperatura, la temperatura es de: " + resultados[2] +
                        "°.");
            }
        }
        else if(tipo == 3){
            if (resultados[2] < 15){
                return ("Sus cultivos están muy frios, la temperatura es de: " + resultados[2] +
                        "°. Le recomendamos construir una estructura que pueda protegerlos del frio como cortavientos o invernaderos, si no son posibles las opciones anteriores también puede cubrir sus cultivos con plásticos.");
            }
            else if (resultados[2] > 24){
                return ("Sus cultivos están muy calientes, la temperatura es de: " + resultados[2] +
                        "°. Le recomendamos regar los cultivos con mayor intensidad en las horas más calurosas del día, además regar los alrededores de la planta para reducir el impacto térmico.");
            }
            else{
                return ("Sus cultivos están en una excelente temperatura, la temperatura es de: " + resultados[2] +
                        "°.");
            }
        }
        return "";
    }
  
}
