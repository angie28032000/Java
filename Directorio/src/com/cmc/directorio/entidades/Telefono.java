package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp;
	
	// 🔹 Constructor con parámetros
	public Telefono(String operadora, String numero, int codigo, boolean tieneWhatsapp) {
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
		this.tieneWhatsapp = tieneWhatsapp;
	}
	public Telefono(String operadora, String numero, boolean tieneWhatsapp) {
	    this.operadora = operadora;
	    this.numero = numero;
	    this.tieneWhatsapp = tieneWhatsapp;
	}
	
	// 🔹 Constructor vacío
	public Telefono() {
		this.tieneWhatsapp = false; // Por defecto siempre false
	}

	// 🔹 Métodos GET y SET
	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}

	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}
	
	// 🔹 Método para imprimir todos los datos del teléfono
	public void imprimir() {
		System.out.println("-------------- DATOS TELEFONO --------------");
		System.out.println("Operadora: " + getOperadora());
		System.out.println("Número: " + getNumero());
		System.out.println("Código: " + getCodigo());
		System.out.println("Tiene WhatsApp: " + isTieneWhatsapp());
		System.out.println("--------------------------------------------");
	}
}
