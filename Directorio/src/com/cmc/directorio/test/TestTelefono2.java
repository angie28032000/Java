package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {

		
		Telefono telf = new Telefono();
		telf.setOperadora("MOVI");
		telf.setNumero("0939079752");
		telf.setCodigo(20);

		
		AdminTelefono at = new AdminTelefono();

		
		at.activarMensajeria(telf);

		
		System.out.println();
		telf.imprimir(); 
	}
}
