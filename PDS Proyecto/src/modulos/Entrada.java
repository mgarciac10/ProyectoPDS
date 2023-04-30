package modulos;

import java.util.Random;
import java.util.Scanner;
public class Entrada {
  int dias;
  int tipo;

    //Funcion para pedir valores iniciales
    public void ValoresIniciales() {
      Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de dias que quiere analizar:");
        dias = sc.nextInt();
        System.out.println("Ingrese el tipo de cultivo que quiere analizar: (1:Papa, 2:Caña de azucar, 3:Café)");
        tipo = sc.nextInt();
    }

    public int get_dias() {
      return dias;
    }

    public int get_tipo() {
      return tipo;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //Función para llenar un array que represente los datos de un sensor con números random.
    public int[] llenarArreglo(int[] arreglo, int min, int max) {
        Random rnd = new Random();
    
        for (int i = 0; i < arreglo.length ; i++) {
            arreglo[i] = rnd.nextInt(max - min + 1) + min;
        }
    
        return arreglo;
    }
  
}
