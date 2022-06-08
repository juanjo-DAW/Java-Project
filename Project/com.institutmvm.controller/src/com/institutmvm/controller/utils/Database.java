package com.institutmvm.controller.utils;
import cat.institutmvm.aplicacio.entities.Ballena;
import cat.institutmvm.aplicacio.entities.Mantarraya;
import cat.institutmvm.aplicacio.entities.Pajaro;

import java.sql.*;

public class Database {
    Connection connection = null;
    String server = "jdbc:mysql://localhost:3306/";
    String bbdd = "juanjo_db";
    String user = "root";
    String password = "";
    String tabla;
    String db = "juanjo_db";
    String login = "root";
    String pwd = "";
    String url = "jdbc:mysql://localhost:3306/" + db;
    private Connection conexion;

    public void insertP(Pajaro p) {
        tabla = "vuelos";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            System.out.println("-> Conexión con MySQL establecida");

            String sql = "INSERT INTO Pajaros(Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,Parasitos) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, p.getEspecie());
                preparedstat.setString(2, p.getGenero());
                preparedstat.setString(3, p.getHabitat());
                preparedstat.setString(4, p.getTiempoNavegacion());
                preparedstat.setString(5, p.getHoraLlegada());
                preparedstat.setString(6, p.getViento());
                preparedstat.setString(7, p.getNubosidad());
                preparedstat.setString(8, p.getDirecionViento());
                preparedstat.setFloat(9, p.getSize());
                preparedstat.setFloat(10, p.getEmbarcaciones());
                preparedstat.setBoolean(11, p.getParasitos());

                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }
    }

    public void insertB(Ballena b) {
        tabla = "marinos";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            System.out.println("-> Conexión con MySQL establecida");

            String sql = "INSERT INTO Ballenas(Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,Parasitos,Profundidad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, b.getEspecie());
                preparedstat.setString(2, b.getGenero());
                preparedstat.setString(3, b.getHabitat());
                preparedstat.setString(4, b.getTiempoNavegacion());
                preparedstat.setString(5, b.getHoraLlegada());
                preparedstat.setString(6, b.getViento());
                preparedstat.setString(7, b.getNubosidad());
                preparedstat.setString(8, b.getDirecionViento());
                preparedstat.setFloat(9, b.getSize());
                preparedstat.setFloat(10, b.getEmbarcaciones());
                preparedstat.setBoolean(11, b.getParasitos());
                preparedstat.setString(12, b.getProfundidad());

                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }
    }

    public void insertM(Mantarraya m) {
        tabla = "marinos";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            System.out.println("-> Conexión con MySQL establecida");

            String sql = "INSERT INTO Mantarrayas(Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,Venenosas,Profundidad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, m.getEspecie());
                preparedstat.setString(2, m.getGenero());
                preparedstat.setString(3, m.getHabitat());
                preparedstat.setString(4, m.getTiempoNavegacion());
                preparedstat.setString(5, m.getHoraLlegada());
                preparedstat.setString(6, m.getViento());
                preparedstat.setString(7, m.getNubosidad());
                preparedstat.setString(8, m.getDirecionViento());
                preparedstat.setFloat(9, m.getSize());
                preparedstat.setFloat(10, m.getEmbarcaciones());
                preparedstat.setBoolean(11, m.getVenenosas());
                preparedstat.setString(12, m.getProfundidad());

                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }
    }
}