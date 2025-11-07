package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		
		// 🔹 Crear teléfonos
		Telefono t1 = new Telefono();
		t1.setOperadora("MOVI");
		t1.setNumero("0939079752");
		t1.setCodigo(20);
		
		Telefono t2 = new Telefono();
		t2.setOperadora("MOVI");
		t2.setNumero("0987654321");
		t2.setCodigo(15);
		
		Telefono t3 = new Telefono();
		t3.setOperadora("CLARO");
		t3.setNumero("0912345678");
		t3.setCodigo(30);
		
		// 🔹 Crear administrador
		AdminTelefono admin = new AdminTelefono();
		
		// 🔹 Activar mensajería (solo si tiene operadora)
		admin.activarMensajeria(t1);
		admin.activarMensajeria(t2);
		admin.activarMensajeria(t3);
		
		System.out.println();
		
		// 🔹 Imprimir los datos de cada teléfono
		t1.imprimir();
		t2.imprimir();
		t3.imprimir();
		
		// 🔹 Contar cuántos teléfonos tienen operadora asignada
		int totalConOperadora = admin.contarMovi(t1, t2, t3);
		System.out.println("Teléfonos con operadora asignada: " + totalConOperadora);
	}
}
