package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Registro_empleado;
import com.krakedev.persistencia.servicios.AdminRegistro;

public class TestConsultaReEm {

	public static void main(String[] args) {
		
		try {
			
			ArrayList<Registro_empleado> re= AdminRegistro.buscarPorNombre("1");
			System.out.println(re);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
