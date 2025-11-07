package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

			public static void main(String[] args) {
				
				// 🔹 Crear 4 teléfonos
				Telefono t1 = new Telefono();
				t1.setOperadora("MOVI");
				t1.setNumero("0939079752");
				t1.setCodigo(20);
				
				Telefono t2 = new Telefono();
				t2.setOperadora("CLARO");
				t2.setNumero("0987654321");
				t2.setCodigo(15);
				
				Telefono t3 = new Telefono();
				t3.setOperadora("Movi");
				t3.setNumero("0912345678");
				t3.setCodigo(30);
				
				Telefono t4 = new Telefono();
				t4.setOperadora("Claro");
				t4.setNumero("0991112222");
				t4.setCodigo(40);
				
				// 🔹 Crear administrador
				AdminTelefono admin = new AdminTelefono();
				
				// 🔹 Activar mensajería (solo si tiene operadora)
				admin.activarMensajeria(t1);
				admin.activarMensajeria(t2);
				admin.activarMensajeria(t3);
				admin.activarMensajeria(t4);
				
				System.out.println();
				
				// 🔹 Imprimir los datos de cada teléfono
				t1.imprimir();
				t2.imprimir();
				t3.imprimir();
				t4.imprimir();
				
				System.out.println();
				
				// 🔹 Contar cuántos teléfonos son MOVI o CLARO
				int totalMovi = admin.contarMovi(t1, t2, t3);
				int totalClaro = admin.contarClaro(t1, t2, t3, t4);
				
				System.out.println("Teléfonos con operadora MOVI: " + totalMovi);
				System.out.println("Teléfonos con operadora CLARO: " + totalClaro);
			}
		

}


