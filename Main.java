import java.util.Scanner;
import java.util.Random;

public class Main{

    //Función para llenar un array que represente los datos de un sensor con números random.
    public static int[] llenarArreglo(int[] arreglo, int min, int max) {
        Random rnd = new Random();
    
        for (int i = 0; i < arreglo.length ; i++) {
            arreglo[i] = rnd.nextInt(max - min + 1) + min;
        }
    
        return arreglo;
    }

    //Función para hallar el número mayor el menor y el resultados[2] del array.
    public static double[] menorMayorProm(int[] arreglo, double[] resultados){
        int suma = 0;
        resultados[0] = 0;
        resultados[1] = 0;

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
    public static void ph(double resultados[], int tipo){
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
    public static void hum(double resultados[], int tipo){
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
    public static void temp(double resultados[], int tipo){
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //El usuario ingresa los valores.
        System.out.println("Ingrese el número de dias que quiere analizar:");
        int n = sc.nextInt();
        System.out.println("Ingrese el tipo de cultivo que quiere analizar: (1:Papa, 2:Caña de azucar, 3:Café)");
        int tipo = sc.nextInt();

        //Se crean y llenan los arreglos.
        int[] arrayPh = new int[n];
        int[] arrayTemp = new int[n];
        int[] arrayHum = new int[n];
        double[] resultadosPh = {0, 0, 0};
        double[] resultadosTemp = {0, 0, 0};
        double[] resultadosHum = {0, 0, 0};

        llenarArreglo(arrayPh, 0, 14);
        llenarArreglo(arrayTemp, 0, 50);
        llenarArreglo(arrayHum, 0, 100);

        //Encontramos la variable mayor, menor y el promedio del arreglo.
        menorMayorProm(arrayPh, resultadosPh);
        menorMayorProm(arrayTemp, resultadosTemp);
        menorMayorProm(arrayHum, resultadosHum);

        //Se revisan los datos y se le da la información al usuario.
        System.out.println("\nPh mínimo: "+ resultadosPh[1]+ " Ph máximo: "+ resultadosPh[0]);
        ph(resultadosPh, tipo);
        System.out.println("\nHumedad mínima: "+ resultadosHum[1]+ " Humedad máxima: "+ resultadosHum[0]);
        hum(resultadosHum, tipo);
        System.out.println("\nTemperatura mínima: "+ resultadosTemp[1]+ "° Temperatura máxima: "+ resultadosTemp[0]+ "°");
        temp(resultadosTemp, tipo);
    }
}
