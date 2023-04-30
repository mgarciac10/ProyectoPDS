import Interfaz.PanelCultivo;
import modulos.Entrada;
import modulos.Persistencia;
import modulos.Procesamiento;
import modulos.Salida;

import javax.swing.*;

public class MainCultivo {


    public static void main(String[] args) {
        JFrame frame = new JFrame ("Valide su cultivo");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new PanelCultivo(new Entrada(),new Procesamiento(),new Salida(),new Persistencia()));
        frame.pack();
        frame.setVisible (true);
    }
}
