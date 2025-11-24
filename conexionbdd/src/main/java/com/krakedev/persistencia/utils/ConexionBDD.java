package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {

    private final static String DRIVER = "org.postgresql.Driver";
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USUARIO = "postgres";
    private final static String CLAVE = "123";

    private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);

    public static Connection conectar() throws Exception {

        Connection connection = null;

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
            LOGGER.debug("conexion exitosa ");

        } catch (ClassNotFoundException e) {
            LOGGER.error("Error: No se encontró el driver de PostgreSQL", e);
            throw new Exception("Driver no encontrado");

        } catch (SQLException e) {
            LOGGER.error("Error al conectarse a la base de datos", e);
            throw new Exception("Error al conectar a la base de datos: " + e.getMessage());
        }

        return connection;
    }

}
