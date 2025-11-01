package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		
		double cuadrado1; 
		
		c1.lado = 12;
		
		cuadrado1 =c1.calcularArea();
		
		System.out.println("El area del cuadrado es :" +cuadrado1);
	}

}
