package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto(43, "javon", "rico olor  ", 3.44);
		
		
		p1.imprimir();
		
		p1.cambiarDescripcion("Muy rico ");
		p1.cambiarPeso(6.4);
		
		p1.imprimir();
		

	}

}
