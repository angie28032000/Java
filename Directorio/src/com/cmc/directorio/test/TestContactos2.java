package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("Movistar", "0991111111", true);
		Telefono t2 = new Telefono("Movistar", "0982222222", true);

		Contacto c1 = new Contacto("Marta", "Ruiz", t1, 60.0);
		Contacto c2 = new Contacto("Juan", "Lopez", t2, 58.5);

		AdminContactos admin = new AdminContactos();

		Contacto masPesado = admin.buscarMasPesado(c1, c2);
		System.out.println("El contacto más pesado es:");
		masPesado.imprimir();

		boolean mismaOperadora = admin.compararOperadoras(c1, c2);
		System.out.println("¿Tienen la misma operadora?: " + mismaOperadora);
	}

}
