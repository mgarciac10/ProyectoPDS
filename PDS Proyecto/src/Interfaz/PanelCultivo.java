package Interfaz;

import javax.swing.*;

import modulos.Entrada;
import modulos.Persistencia;
import modulos.Procesamiento;
import modulos.Salida;

import java.awt.*;

public class PanelCultivo extends Panel{

    private JLabel labelDias;
    private JTextField textDias;
    private JLabel labelCultivo;
    private JTextField textCultivos;
    private JLabel labelTipoCultivo;
    private JButton btnValidateCultivo;
    private JLabel labelPh;
    private JLabel labelPhSuggest;
    private JLabel labelHum;
    private JLabel labelHumSuggest;
    private JLabel labelTemp;
    private JLabel labelTempSuggest;

    Entrada entrada;
    Procesamiento pro;
    Salida salida;
    Persistencia per;

    public PanelCultivo(Entrada entrada, Procesamiento pro, Salida sal, Persistencia per) {

        this.entrada = entrada;
        this.pro = pro;
        this.salida = sal;
        this.per = per;

        //construct components
        labelDias = new JLabel ("Dias a analizar");
        textDias = new JTextField (5);
        //Set the Var dias to Entrada.dias


        labelCultivo = new JLabel ("Tipo de cultivo a analizar");
        textCultivos = new JTextField (5);
        //Set the Var tipo to Entrada.tipo

        labelTipoCultivo = new JLabel ("(1.Papa /  2.Caña de azucar / 3.Café)");

        btnValidateCultivo=new JButton("Continuar");
        btnValidateCultivo.setSize(400,400);
        btnValidateCultivo.setLayout(null);
        btnValidateCultivo.setVisible(true);

        //Click event for the button
        btnValidateCultivo.addActionListener(e -> {

            entrada.setDias(Integer.parseInt(textDias.getText()));
            entrada.setTipo(Integer.parseInt(textCultivos.getText()));

            int[] arrayPh = new int[entrada.get_dias()];
            int[] arrayTemp = new int[entrada.get_dias()];
            int[] arrayHum = new int[entrada.get_dias()];
            double[] resultadosPh = {0, 0, 0};
            double[] resultadosTemp = {0, 0, 0};
            double[] resultadosHum = {0, 0, 0};

            entrada.llenarArreglo(arrayPh, 0, 14);
            entrada.llenarArreglo(arrayTemp, 0, 50);
            entrada.llenarArreglo(arrayHum, 0, 100);

            //Encontramos la variable mayor, menor y el promedio del arreglo.
            pro.menorMayorProm(arrayPh, resultadosPh);
            pro.menorMayorProm(arrayTemp, resultadosTemp);
            pro.menorMayorProm(arrayHum, resultadosHum);

            sal.SalidaDatos(resultadosPh, resultadosHum, resultadosTemp, entrada.get_tipo());
            per.guardar(resultadosPh, resultadosHum, resultadosTemp);

            labelPh.setText("\nPh mínimo: "+ resultadosPh[1]+ " Ph máximo: "+      resultadosPh[0]);
            labelPhSuggest.setText(pro.ph(resultadosPh,entrada.get_tipo()));
            labelPh.setVisible(true);
            labelPhSuggest.setVisible(true);
            labelHum.setText("\nHumedad mínima: "+ resultadosHum[1]+ " Humedad máxima: "+ resultadosHum[0]);
            labelHumSuggest.setText(pro.hum(resultadosHum,entrada.get_tipo()));
            labelHum.setVisible(true);
            labelHumSuggest.setVisible(true);
            labelTemp.setText("\nTemperatura mínima: "+ resultadosTemp[1]+ "° Temperatura máxima: "+ resultadosTemp[0]+ "°");
            labelTempSuggest.setText(pro.temp(resultadosTemp,entrada.get_tipo()));
            labelTemp.setVisible(true);
            labelTempSuggest.setVisible(true);

        });

        labelPh = new JLabel();
        labelPh.setVisible(false);
        labelHum = new JLabel();
        labelHum.setVisible(false);
        labelTemp = new JLabel();
        labelTemp.setVisible(false);
        labelPhSuggest = new JLabel();
        labelPhSuggest.setVisible(false);
        labelHumSuggest = new JLabel();
        labelHumSuggest.setVisible(false);
        labelTempSuggest = new JLabel();
        labelTempSuggest.setVisible(false);



    //adjust size and set layout
        setPreferredSize (new Dimension(2500, 550));
        setLayout (null);

        //add components
        add (labelDias);
        add (textDias);
        add (labelCultivo);
        add (textCultivos);
        add (labelTipoCultivo);
        add(btnValidateCultivo);
        add(labelPh);
        add(labelHum);
        add(labelTemp);
        add(labelPhSuggest);
        add(labelHumSuggest);
        add(labelTempSuggest);

        //set component bounds (only needed by Absolute Positioning)
        labelDias.setBounds (15, 30, 100, 25);
        textDias.setBounds (15, 55, 285, 25);
        labelCultivo.setBounds (15, 95, 150, 25);
        textCultivos.setBounds (15, 120, 285, 25);
        labelTipoCultivo.setBounds (15, 145, 205, 25);
        btnValidateCultivo.setBounds(18,200,95,30);
        labelPh.setBounds(10,250,400,50);
        labelHum.setBounds(10,300,400,50);
        labelTemp.setBounds(10,350,400,50);
        labelPhSuggest.setBounds(10,275,2000,50);
        labelHumSuggest.setBounds(10,325,2000,50);
        labelTempSuggest.setBounds(10,375,2000,50);
    }

}
