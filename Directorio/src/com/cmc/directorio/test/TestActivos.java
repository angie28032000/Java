package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		Telefono t1 = new Telefono("Claro", "0912345678", false);

		Contacto c1 = new Contacto("Pedro", "Mora", t1, 68.0);
		AdminContactos admin = new AdminContactos();

		System.out.println("Antes de activar:");
		c1.imprimir();

		admin.activarUsuario(c1);

		System.out.println("Después de activar:");
		c1.imprimir();
	}
}
