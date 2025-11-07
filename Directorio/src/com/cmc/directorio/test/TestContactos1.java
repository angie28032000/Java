package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("Claro", "0999999999", true);
		Telefono t2 = new Telefono("Movistar", "0988888888", false);

		Contacto c1 = new Contacto("Ana", "Pérez", t1, 65.5);
		Contacto c2 = new Contacto("Luis", "Gómez", t2, 70.2);

		AdminContactos admin = new AdminContactos();

		// Buscar más pesado
		Contacto masPesado = admin.buscarMasPesado(c1, c2);
		System.out.println("El contacto más pesado es:");
		masPesado.imprimir();

		// Comparar operadoras
		boolean mismaOperadora = admin.compararOperadoras(c1, c2);
		System.out.println("¿Tienen la misma operadora?: " + mismaOperadora);
	}

}
