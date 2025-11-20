package com.krakedev.estaticos.ejercicio.utils;

public class Util {

    public static String formatearHora(int numero) {
        String valor = numero + "";
        if (valor.length() == 1) {
            valor = "0" + valor;
        }
        return valor;
    }

    public static String formatearDia(int numero) {
        switch (numero) {
            case DiasSemana.LUNES: return "Lunes";
            case DiasSemana.MARTES: return "Martes";
            case DiasSemana.MIERCOLES: return "Miércoles";
            case DiasSemana.JUEVES: return "Jueves";
            case DiasSemana.VIERNES: return "Viernes";
            case DiasSemana.SABADO: return "Sábado";
            case DiasSemana.DOMINGO: return "Domingo";
            default: return "Desconocido";
        }
    }
}

