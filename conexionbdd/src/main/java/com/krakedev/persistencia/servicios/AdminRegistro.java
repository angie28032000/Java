package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Registro_empleado;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminRegistro {

    private static final Logger LOGGER = LogManager.getLogger(AdminRegistro.class);

    // ============================
    // INSERTAR
    // ============================
    public static void insertar(Registro_empleado registroempleado) throws Exception {

        Connection con = null;
        PreparedStatement ps = null;
        LOGGER.trace("Registro a insertar >>>>" + registroempleado);

        try {
            con = ConexionBDD.conectar();

            ps = con.prepareStatement(
                    "INSERT INTO registros_entrada (codigo_registro, cedula, fecha, hora, codigo_empleado) " +
                            "VALUES (?, ?, ?, ?, ?)");

            ps.setInt(1, registroempleado.getCodigo_registro());
            ps.setString(2, registroempleado.getCedula());
            ps.setDate(3, registroempleado.getFecha());
            ps.setTime(4, registroempleado.getHora());
            ps.setInt(5, registroempleado.getCodigoempleado());

            ps.executeUpdate();

            LOGGER.info("Registro ingresado correctamente: {}", registroempleado);

        } catch (SQLException e) {

            LOGGER.error("Error al insertar registro", e);
            throw new Exception("Error SQL: " + e.getMessage());

        } finally {

            try {
                if (ps != null) ps.close();
                if (con != null) con.close();

            } catch (SQLException e) {
                LOGGER.error("Error al cerrar la conexión", e);
                throw new Exception("No se pudo cerrar la conexión");
            }
        }
    }

    // ============================
    // ACTUALIZAR
    // ============================
    public static void actualizar(Registro_empleado registro) throws Exception {

        Connection con = null;
        PreparedStatement ps = null;
        LOGGER.trace("Registro a actualizar >>>>" + registro);

        try {
            con = ConexionBDD.conectar();

            ps = con.prepareStatement(
                    "UPDATE registros_entrada SET cedula = ?, fecha = ?, hora = ?, codigo_empleado = ? " +
                            "WHERE codigo_registro = ?");

            ps.setString(1, registro.getCedula());
            ps.setDate(2, registro.getFecha());
            ps.setTime(3, registro.getHora());
            ps.setInt(4, registro.getCodigoempleado());
            ps.setInt(5, registro.getCodigo_registro());

            int filas = ps.executeUpdate();

            if (filas == 0) {
                throw new Exception("No existe el registro con código: " + registro.getCodigo_registro());
            }

            LOGGER.info("Registro actualizado correctamente: {}", registro);

        } catch (SQLException e) {
            LOGGER.error("Error al actualizar registro", e);
            throw new Exception("Error SQL: " + e.getMessage());

        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();

            } catch (SQLException e) {
                LOGGER.error("Error al cerrar la conexión", e);
                throw new Exception("No se pudo cerrar la conexión");
            }
        }
    }

    // ============================
    // ELIMINAR
    // ============================
    public static void eliminar(int codigoRegistro) throws Exception {

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ConexionBDD.conectar();

            ps = con.prepareStatement(
                    "DELETE FROM registros_entrada WHERE codigo_registro = ?");

            ps.setInt(1, codigoRegistro);

            int filas = ps.executeUpdate();

            if (filas == 0) {
                throw new Exception("No existe el registro con código: " + codigoRegistro);
            }

            LOGGER.info("Registro eliminado correctamente: {}", codigoRegistro);

        } catch (SQLException e) {
            LOGGER.error("Error al eliminar registro", e);
            throw new Exception("Error SQL: " + e.getMessage());

        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();

            } catch (SQLException e) {
                LOGGER.error("No se pudo cerrar la conexión", e);
                throw new Exception("Error al cerrar la conexión");
            }
        }
    }

}
