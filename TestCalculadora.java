package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {

		// Crear objeto Calculadora
		Calculadora calcu = new Calculadora(2,3,4.9);


		// Mostrar valores asignados
		System.out.println("Valor 1: " + calcu.getValor1());
		System.out.println("Valor 2: " + calcu.getValor2());
		System.out.println("Valor 3: " + calcu.getValor3());

		// Calcular y mostrar resultados
		System.out.println("Resultado suma: " + calcu.sumar());
		System.out.println("Resultado resta: " + calcu.restar());
		System.out.println("Resultado multiplicación: " + calcu.multiplicar());
		System.out.println("Resultado división: " + calcu.dividir());
		System.out.println("Resultado promedio: " + calcu.promediar());
	}
}
