package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminRegistro;

public class TestId {

    public static void main(String[] args) {

        try {
            int id = AdminRegistro.buscarSoloId(1);  // <<-- prueba con un ID real

            System.out.println("ID encontrado: " + id);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}