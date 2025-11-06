package com.cmc.repaso.entidades;

	public class Productos {
	    // Atributos del producto
	    private String nombre;
	    private double precio;

	    // Constructor que recibe el nombre y el precio
	    public Productos (String nombre, double precio) {
	        this.nombre = nombre;
	        setPrecio(precio); // Se usa el método setPrecio para aplicar la validación
	    }

	    // Método para establecer el precio
	    public void setPrecio(double precio) {
	        // Validar que el valor sea positivo
	        // Si el valor es negativo, se multiplica por -1 para hacerlo positivo
	        if (precio < 0) {
	            this.precio = precio * -1;
	        } else {
	            this.precio = precio;
	        }
	    }

	    // Método que calcula el precio con descuento (promoción)
	    public double calcularPrecioPromo(double porcentajeDescuento) {
	        // El porcentaje de descuento se aplica sobre el precio
	        // Ejemplo: si el precio es 100 y el descuento es 10%, el precio final es 90
	        double descuento = (precio * porcentajeDescuento) / 100;
	        double precioFinal = precio - descuento;
	        return precioFinal;
	    }

	    // Método adicional para mostrar la información del producto
	    public void imprimir() {
	        System.out.println("Nombre del producto: " + nombre);
	        System.out.println("Precio actual: " + precio);
	    }
	}


