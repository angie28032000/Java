package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminRegistro;

public class TestEliminar {

    public static void main(String[] args) {

        try {
            // Código del registro que quieres eliminar
            int codigoAEliminar = 11;

            AdminRegistro.eliminar(codigoAEliminar);

            System.out.println("Registro eliminado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al eliminar: " + e.getMessage());
        }

    }

}

