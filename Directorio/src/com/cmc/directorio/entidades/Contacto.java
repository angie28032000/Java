package com.cmc.directorio.entidades;

public class Contacto {
	 private String nombre;
	    private String apellido;
	    private boolean activo;
	    private Telefono telefono;
	    private double peso;

	    // Constructor sin "activo"
	    public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.telefono = telefono;
	        this.peso = peso;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public boolean isActivo() {
	        return activo;
	    }

	    public void setActivo(boolean activo) {
	        this.activo = activo;
	    }

	    public Telefono getTelefono() {
	        return telefono;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void imprimir() {
	        System.out.println("Nombre: " + nombre + " " + apellido);
	        System.out.println("Peso: " + peso);
	        System.out.println("Activo: " + activo);
	        System.out.println("Operadora: " + telefono.getOperadora());
	        System.out.println("Número: " + telefono.getNumero());
	        System.out.println("Tiene WhatsApp: " + telefono.isTieneWhatsapp());
	    }
	}

