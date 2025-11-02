package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(2);
		
		double cuadrado1; 
		
		c1.setLado(12);
		
		cuadrado1 =c1.getLado();
		
		System.out.println("El area del cuadrado es :" +cuadrado1);
	}

}
