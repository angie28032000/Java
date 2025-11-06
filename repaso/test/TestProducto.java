package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Productos;

public class TestProducto {

	public static void main(String[] args) {
		
		 Productos producto1 = new Productos("Auriculares", -50);
	        producto1.imprimir(); // Debe mostrar precio positivo (50)
	        
	        System.out.println("----------------------");
	        
	        // Calcular el precio con descuento del 20%
	        double precioPromo = producto1.calcularPrecioPromo(20);
	        System.out.println("Precio con descuento del 20%: " + precioPromo);

	        System.out.println("----------------------");

	        // Crear otro producto con precio normal
	        Productos producto2 = new Productos("Mouse Gamer", 80);
	        producto2.imprimir();

	        // Aplicar descuento del 10%
	        double precioPromo2 = producto2.calcularPrecioPromo(10);
	        System.out.println("Precio con descuento del 10%: " + precioPromo2);
	    }
	}
		

	


