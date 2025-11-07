package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {
	public static void main(String[] args) {
		
		Telefono telf = new Telefono();
		
		telf.setOperadora("MOVI");
		telf.setNumero("0939079750");
		telf.setCodigo(10);
		
		telf.imprimir();
		
		
	}

}
