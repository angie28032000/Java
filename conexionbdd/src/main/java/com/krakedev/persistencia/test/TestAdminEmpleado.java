package com.krakedev.persistencia.test;

import java.sql.Date;
import java.sql.Time;

import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.entidades.Registro_empleado;
import com.krakedev.persistencia.servicios.AdminRegistro;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminEmpleado {

    public static void main(String[] args) {
        Empleado ep = new Empleado(3, "Mora", "2022/04/02", "12:04:22");
        Registro_empleado re = new Registro_empleado(19, "1004641658", 2);

        try {
            Date fechaRe = (Date) Convertidor.convertirFecha("2000/12/23");
            Time horaRe = (Time) Convertidor.convertirHora("12:33");

            re.setCedula("1001639184");
            re.setFecha(fechaRe);
            re.setHora(horaRe);
            re.setCodigoempleado(3);

            AdminRegistro.insertar(re);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }
}
