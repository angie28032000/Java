package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA= new Producto();
		productoB= new Producto();
		productoC= new Producto();
		
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Cura el dolor de cabeza";
		productoA.precio = 2.44;
		productoA.stockActual = 2 ;
		
		System.out.println("nombre :"+productoA.nombre);
		System.out.println("descripcion :"+productoA.descripcion);
		System.out.println("Precio :"+productoA.precio);
		System.out.println("Precio :"+productoA.stockActual);
		
		System.out.println("-----------------------------------");
		
		
		productoB.nombre = "Diclofenaco";
		productoB.descripcion = "Cura el dolor articular";
		productoB.precio = 7.44;
		productoB.stockActual = 8 ;
		
		
		System.out.println("nombre :"+productoB.nombre);
		System.out.println("descripcion :"+productoB.descripcion);
		System.out.println("Precio :"+productoB.precio);
		System.out.println("Precio :"+productoB.stockActual);
		
		System.out.println("-----------------------------------");
		
		
		productoC.nombre = "ACICLOVIR";
		productoC.descripcion = "INFECCIONES";
		productoC.precio = 10.44;
		productoC.stockActual = 1 ;
		
		
		System.out.println("nombre :"+productoC.nombre);
		System.out.println("descripcion :"+productoC.descripcion);
		System.out.println("Precio :"+productoC.precio);
		System.out.println("Precio :"+productoC.stockActual);
		
		System.out.println("-----------------------------------");
		

	}

}
