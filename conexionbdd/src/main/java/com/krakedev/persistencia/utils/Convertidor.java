package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {

    private static final String FORMATO_FECHA = "yyyy/MM/dd";
    private static final String FORMATO_HORA = "hh:mm"; // formato 24 horas

    private static final Logger LOGGER = LogManager.getLogger(Convertidor.class);

    public static Date convertirFecha(String fechaStr) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
        Date fechaDate=null;

        try {
        	LOGGER.trace("Conviriendo fecha"+fechaStr);
            return sdf.parse(fechaStr);// ← AHORA SÍ DEVUELVE LA FECHA
        
        } catch (ParseException e) {
            LOGGER.error("La fecha no tiene el formato correcto: " + fechaStr, e);
            throw new Exception("La fecha no tiene el formato correcto: " + fechaStr);
        }
    }

    public static Date convertirHora(String horaStr) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);

        try {
            return sdf.parse(horaStr);  // ← AHORA SÍ DEVUELVE LA HORA
        } catch (ParseException e) {
            LOGGER.error("La hora no tiene el formato correcto: " + horaStr, e);
            throw new Exception("La hora no tiene el formato correcto: " + horaStr);
        }
    }
}
