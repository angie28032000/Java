package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo r3=new Rectangulo();
		
		int areaR1;
		int areaR2;
		double areaR3;
		
		r1.setBase(10);
		r1.setAltura(6);
		
		r2.setBase(7);
		r2.setAltura(3);
		
		r3.setBase(5);
		r3.setAltura(7);
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		areaR3 = r3.calcularPerimetro();
		
		System.out.println("Área de r1: " + areaR1);
		System.out.println("Área de r2: " + areaR2);
		System.out.println("Perímetro de r3: " + areaR3);
	}

}
