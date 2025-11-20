package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

    public static void main(String[] args) {

        AdminAlarmas admin = new AdminAlarmas();

        
        admin.agregarAlarma(new Alarma(DiasSemana.LUNES, 5, 45));
        admin.agregarAlarma(new Alarma(DiasSemana.MIERCOLES, 7, 5));
        admin.agregarAlarma(new Alarma(DiasSemana.VIERNES, 14, 9));
        admin.agregarAlarma(new Alarma(DiasSemana.DOMINGO, 9, 30));

       
        ArrayList<Alarma> alarmasActuales = admin.getAlarmas();

  
        System.out.println(alarmasActuales);
    }
}