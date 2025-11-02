package com.krakedev;

public class Mensajeria {
	private String mensaje;
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void saludar() {
		System.out.println("hola todos"+mensaje);
	}
	

}
