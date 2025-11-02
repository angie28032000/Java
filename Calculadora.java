package com.krakedev;

public class Calculadora {

	// ---------- ATRIBUTOS PRIVADOS ----------
	private int valor1;
	private int valor2;
	private double valor3;
	
	
	public Calculadora(int valor1,int valor2,double valor3) {
		this.valor1=valor1;
		this.valor2=valor2;
		this.valor3=valor3;
		
	}
	
	// ---------- MÉTODOS SET ----------
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}

	// ---------- MÉTODOS GET ----------
	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public double getValor3() {
		return valor3;
	}

	// ---------- MÉTODOS DE CÁLCULO ----------
	public int sumar() {
		int resultado = valor1 + valor2;
		return resultado;
	}

	public int restar() {
		int resultado = valor1 - valor2;
		return resultado;
	}

	public double multiplicar() {
		double resultadoMultiplicacion = valor1 * valor2;
		return resultadoMultiplicacion;
	}

	public double dividir() {
		double resultadoDivision = (double) valor1 / valor2;
		return resultadoDivision;
	}

	public double promediar() {
		double resultadoPromedio = (valor1 + valor2 + valor3) / 3;
		return resultadoPromedio;
	}
}


