package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		auto1 = new Auto();
		auto2 = new Auto ();
		
		auto1.marca = "Mazda";
		auto1.anio=2021;
		auto1.precio=2323.6;
		
		System.out.println("Marca:"+auto1.marca);
		System.out.println("Anio:"+auto1.anio);
		System.out.println("Precio:"+auto1.precio);
		
		System.out.println("------------------------------");
		
		
		auto2.marca = "Toyota";
		auto2.anio=2023;
		auto2.precio=5323.6;
		
		
		System.out.println("Marca:"+auto2.marca);
		System.out.println("Anio:"+auto2.anio);
		System.out.println("Precio:"+auto2.precio);
		
	
		
		
				
		
		
	
		
		
		
		

	}

}
