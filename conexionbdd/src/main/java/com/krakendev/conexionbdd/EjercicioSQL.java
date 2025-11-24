package com.krakendev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjercicioSQL {

    public static void main(String[] args) {
    	
    	// CONEXION PARA LA BASE DE DATOS
        Connection connection = null;
        PreparedStatement ps=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "123");
            System.out.println("Conexion exitosa");
            
            //PARA INSERTAR EN LA TABLA DE DATOS DE BDD
            ps=connection.prepareStatement("insert into registros_entrada (codigo_registro,cedula,fecha,hora,codigo_empleado)"
            		+ "values(?,?,?,?,?)");
            ps.setInt(1, 11);
            ps.setString(2, "1004641658");
           
            
            
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    		String fechaStr="2020/03/22 10:05:04";
    		
    		try {
    		Date fecha = sdf.parse(fechaStr);
    		System.out.println(fecha);
    		long fechaMilis= fecha.getTime();
    		System.out.println(fechaMilis);
    		//crea un java sqlDate,partiendo de un java.util.Date
    		java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
    		System.out.println(fechaSQL);
    		Time timeSQL=new Time (fechaMilis);
    		System.out.println(timeSQL);
    		
    		ps.setDate(3, fechaSQL);
    		ps.setTime(4, timeSQL);
    		ps.setInt(5, 2201);
    		  
    		
    		
    		// PARA EJECUTAR 
    		 ps.executeUpdate();
    		 System.out.println("Ejecuta insert ");
    		
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    		
    		    
            //PARA AGREGAR DE TIPO MONEY SE UTILIZA 
            
  //-------  //ps.setBigDecimal(7,new BigDecimal(123.34));
                 
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            
        }
    }
}
