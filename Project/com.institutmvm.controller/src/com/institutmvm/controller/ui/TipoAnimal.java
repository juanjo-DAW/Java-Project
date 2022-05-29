package com.institutmvm.controller.ui;

import javax.swing.*;
import java.awt.*;

public class TipoAnimal {
    /**
     * Creacion de JTextField y el JRadioButton.
     */
    private static JRadioButton bool_YES, bool_NO;
    private static JTextField habitat = new JTextField();
    private static JTextField especie = new JTextField();
    private static JTextField tiempoNavegacion = new JTextField();
    private static JTextField horaLlegada = new JTextField();
    private static JTextField viento = new JTextField();
    private static JTextField nubosidad = new JTextField();
    private static  JTextField embarcaciones = new JTextField();
    private static JTextField size = new JTextField();

    /**
     * Creacion del formulario donde determinamos los campos que queremos i donde más tarde pediremos las filas y las columnas antes de mostrar el formulario para rellenar. Tambien determinamos en algunos campos si habran opciones para elejir o no y en otros solamente sera necesario escribir o apretar un boton.
     * @param rows
     * @param cols
     * @return
     */
    public static JPanel Estandar(int rows, int cols) {
        JPanel panelE = new JPanel(new GridLayout(rows, cols));

        panelE.add(new JLabel("Habitat"));
        panelE.add(habitat);

        panelE.add(new JLabel("Especie"));
        panelE.add(especie);

        String[] profundidadP ={"En la costa","Volando","Aprox: <50m","Aprox: <100m","Aprox: <200m","Aprox: <300m"};
        panelE.add(new JLabel("Profundidad"));
        JComboBox id2 = new JComboBox(profundidadP);
        panelE.add(id2);

        String[] generosP = {"Masculino","Femenino", "No definido"};
        panelE.add(new JLabel("Genero"));
        JComboBox id3 = new JComboBox(generosP);
        panelE.add(id3);

        panelE.add(new JLabel("Tiempo de navegacion"));
        panelE.add(tiempoNavegacion);

        panelE.add(new JLabel("Hora de llegada"));
        panelE.add(horaLlegada);

        panelE.add(new JLabel("Viento"));
        panelE.add(viento);

        panelE.add(new JLabel("Nubosidad"));
        panelE.add(nubosidad);

        String[] direcionV = {"Norte", "Sur", "Este", "Oeste"};
        panelE.add(new JLabel("Direcion viento"));
        JComboBox id4 = new JComboBox(direcionV);
        panelE.add(id4);

        panelE.add(new JLabel("Embarcaciones"));
        panelE.add(embarcaciones);

        panelE.add(new JLabel("Tamaño"));
        panelE.add(size);

        return panelE;
    }

    public static void especiePajaro() {

        /**
         * Determinamos las columnas y filas del formulario
         */
        JPanel paneleP = Estandar(8, 2);

        /**
         * Creamos y añadimos un nuevo campo que se llamara "Parasitos" que tendra una mida determinada en el codigo y sera un boton con la funcion de responder a un atributo booleano.
         */
        paneleP.add(new JLabel("Parasitos"));
        paneleP.add(Box.createRigidArea(new Dimension(30, 10)));

        bool_YES = new JRadioButton("Si");
        bool_NO = new JRadioButton("No");

        bool_YES.addChangeListener(l -> {
            if (bool_YES.isSelected()) {
                bool_NO.setSelected(false);
            }
        });
        paneleP.add(bool_YES);

        bool_NO.addChangeListener(l -> {
            if (bool_NO.isSelected()) {
                bool_YES.setSelected(false);
            }
        });
        paneleP.add(bool_NO);

        int nextWindow = JOptionPane.showConfirmDialog(null, paneleP, "Datos de un Pajaro",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        /**
         * Fuincion que determina que los campos no esten vacios, y en caso de estar vacios mandar un mensaje de error y pedir volver a llenar.
         */

        if (nextWindow == JOptionPane.OK_OPTION) {
            if (habitat.getText().equals("") || especie.getText().equals("") || tiempoNavegacion.getText().equals("") ||
                    horaLlegada.getText().equals("") || viento.getText().equals("") || nubosidad.getText().equals("") ||
                    embarcaciones.getText().equals("") || size.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Procura llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                especiePajaro();
            }
        }
    }

    public static void especieBallena() {

        /**
         * Determinamos las columnas y filas del formulario
         */
        JPanel paneleB = Estandar(7, 2);

        /**
         * Creamos y añadimos un nuevo campo que se llamara "Parasitos" que tendra una mida determinada en el codigo y sera un boton con la funcion de responder a un atributo booleano.
         */
        paneleB.add(new JLabel("Parasitos"));
        paneleB.add(Box.createRigidArea(new Dimension(30, 10)));

        bool_YES = new JRadioButton("Si");
        bool_NO = new JRadioButton("No");

        bool_YES.addChangeListener(l -> {
            if (bool_YES.isSelected()) {
                bool_NO.setSelected(false);
            }
        });
        paneleB.add(bool_YES);

        bool_NO.addChangeListener(l -> {
            if (bool_NO.isSelected()) {
                bool_YES.setSelected(false);
            }
        });
        paneleB.add(bool_NO);

        int nextWindow = JOptionPane.showConfirmDialog(null, paneleB, "Datos de una Ballena",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        /**
         * Fuincion que determina que los campos no esten vacios, y en caso de estar vacios mandar un mensaje de error y pedir volver a llenar.
         */

        if (nextWindow == JOptionPane.OK_OPTION) {
            if (habitat.getText().equals("") || especie.getText().equals("") || tiempoNavegacion.getText().equals("") ||
                    horaLlegada.getText().equals("") || viento.getText().equals("") || nubosidad.getText().equals("") ||
                    embarcaciones.getText().equals("") || size.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Procura llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                especiePajaro();
            }
        }
    }
    public static void especieMantarraya() {

        /**
         * Determinamos las columnas y filas del formulario
         */
        JPanel paneleM = Estandar(4, 2);

        /**
         * Creamos y añadimos unos nuevos campos que se llamaran "Parasitos" y "Venenosas", donde tendra una mida determinada en el codigo y sera un boton con la funcion de responder a un atributo booleano.
         */
        paneleM.add(new JLabel("Parasitos"));
        paneleM.add(Box.createRigidArea(new Dimension(10, 10)));

        bool_YES = new JRadioButton("Si");
        bool_NO = new JRadioButton("No");

        bool_YES.addChangeListener(l -> {
            if (bool_YES.isSelected()) {
                bool_NO.setSelected(false);
            }
        });
        paneleM.add(bool_YES);

        bool_NO.addChangeListener(l -> {
            if (bool_NO.isSelected()) {
                bool_YES.setSelected(false);
            }
        });
        paneleM.add(bool_NO);

        paneleM.add(new JLabel("Venenosas"));
        paneleM.add(Box.createRigidArea(new Dimension(30, 10)));

        bool_YES = new JRadioButton("Si");
        bool_NO = new JRadioButton("No");

        bool_YES.addChangeListener(l -> {
            if (bool_YES.isSelected()) {
                bool_NO.setSelected(false);
            }
        });
        paneleM.add(bool_YES);

        bool_NO.addChangeListener(l -> {
            if (bool_NO.isSelected()) {
                bool_YES.setSelected(false);
            }
        });
        paneleM.add(bool_NO);

        int nextWindow = JOptionPane.showConfirmDialog(null, paneleM, "Datos de una Mantarraya",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        /**
         * Fuincion que determina que los campos no esten vacios, y en caso de estar vacios mandar un mensaje de error y pedir volver a llenar.
         */
        if (nextWindow == JOptionPane.OK_OPTION) {
            if (habitat.getText().equals("") || especie.getText().equals("") || tiempoNavegacion.getText().equals("") ||
                    horaLlegada.getText().equals("") || viento.getText().equals("") || nubosidad.getText().equals("") ||
                    embarcaciones.getText().equals("") || size.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Procura llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                especiePajaro();
            }
        }
    }
}