package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularArea() {
		int area=base*altura;
		return area;
	}
	
	public double calcularPerimetro () {
		double sumaBase = base+base;
		double sumaAltura= altura+altura;
		double perimetro = sumaBase+sumaAltura;
		return perimetro;
		
	}
	
	
}


