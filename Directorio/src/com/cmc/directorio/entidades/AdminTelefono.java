package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	// 🔹 Activa mensajería solo si el teléfono tiene operadora
	public void activarMensajeria(Telefono t) {
		if (t.getOperadora() != null) {
			t.setTieneWhatsapp(true);
			System.out.println("WhatsApp activado para el número: " + t.getNumero());
		} else {
			t.setTieneWhatsapp(false);
			System.out.println("No se puede activar WhatsApp (operadora vacía)");
		}
	}
	
	// 🔹 Contar cuántos teléfonos tienen operadora (no null)
	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contador = 0;
		
		if (t1.getOperadora() != null) {
			contador++;
		}
		if (t2.getOperadora() != null) {
			contador++;
		}
		if (t3.getOperadora() != null) {
			contador++;
		}
		
		return contador;
	}
	
	// 🔹 Contar cuántos teléfonos NO tienen operadora (son null)
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int contador = 0;
		
		if (t1.getOperadora() == null) {
			contador++;
		}
		if (t2.getOperadora() == null) {
			contador++;
		}
		if (t3.getOperadora() == null) {
			contador++;
		}
		if (t4.getOperadora() == null) {
			contador++;
		}
		
		return contador;
	}
}
