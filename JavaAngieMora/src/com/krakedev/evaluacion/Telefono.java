package com.krakedev.evaluacion;


	public class Telefono {
	    private String numero;
	    private String tipo;
	    private String estado;

	    // Constructor
	    public Telefono(String numero, String tipo) {
	        this.numero = numero;
	        this.tipo = tipo;

	        // Validaciones según el requerimiento
	        if (numero == null || tipo == null) {
	            this.estado = "E";
	        } else if (!tipo.equals("Movil") && !tipo.equals("Convencional")) {
	            this.estado = "E";
	        } else if (tipo.equals("Movil") && numero.length() == 10) {
	            this.estado = "C";
	        } else if (tipo.equals("Convencional") && numero.length() == 7) {
	            this.estado = "C";
	        } else {
	            this.estado = "E";
	        }
	    }

	    // Getters (no setters)
	    public String getNumero() {
	        return numero;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public String getEstado() {
	        return estado;
	    }
	}


