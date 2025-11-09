package com.clearminds.componentes;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	
	
	public Producto(String codigo, String nombre, Double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void incrementarPrecio (int porcentaje ) {
		double incremento = precio * (porcentaje / 100);
		precio=precio-incremento;
		
	}
	
	public void disminuirPrecio(double descuento) {
		precio=precio-descuento;
		
	}
	
	
	
	

}
