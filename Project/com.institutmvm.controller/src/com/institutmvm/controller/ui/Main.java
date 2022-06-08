package com.institutmvm.controller.ui;
import javax.swing.*;
import java.awt.*;

/**
 * Controlador principal que se encarga de carrgar y controlar mi aplicacion.
 */


public class Main {

    /**
     * Crea una ventana donde el usuario decidira una de las opciones mostradas para elegir un formulario u otro.
     *
     * @param args
     * @throws Exception
    */

    public static void main(String[] args) throws Exception {
        //Definicion de las clases que tendra la interfaz para que el usuario elija.
        String[] type = {"Pajaro", "Ballena", "Mantarraya"};

        JComboBox interfaz = new JComboBox(type);

        /**
         * Determina la cantidad de filas y columnas de la primera ventana donde el usuario elejira el formulario.
         */
        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(interfaz);

        int resultado = JOptionPane.showConfirmDialog(null, panel, "Tipo",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (resultado == JOptionPane.OK_OPTION) {
            System.out.println("OK");
            System.out.println(interfaz.getSelectedItem());

        } else {
            System.out.println("Cancelado");
        }

        /**
         * Selector que nos permite escojer el formulario que queramos a partir de un switch case y al completarse te manda un mensaje.
         */
        if (resultado == JOptionPane.OK_OPTION) {
            TipoAnimal tanimal = new TipoAnimal();

            switch (interfaz.getSelectedItem().toString()) {

                case "Pajaro":
                    tanimal.especiePajaro();
                    break;
                case "Ballena":
                    tanimal.especieBallena();
                case "Mantarraya":
                    tanimal.especieMantarraya();
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Completado correctamente",
                    "Ending", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Cancelado");
        }
    }
}