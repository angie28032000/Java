package com.krakedev;

public class Calculadora {

	public int sumar(int valor1, int valor2) {

		int resultado;

		resultado = valor1 + valor2;

		return resultado;

	}

	public int restar(int valor1, int valor2) {
		int resultado;

		resultado = valor1 - valor2;

		return resultado;
	}

	public double multiplicar(double valor1, double valor2) {
		double resultadoMultiplicacion;
		resultadoMultiplicacion = valor1 * valor2;
		return resultadoMultiplicacion;
	}
	
	public double divir (double valor1,double valor2) {
		double resultadoDividir;
		resultadoDividir = valor1/valor2;
		return resultadoDividir;
		
	}
	
	public double promediar (double valor1,double valor2,double valor3) {
		
		double resultadoPromedio ;
		double resultadoT;
		resultadoPromedio = valor1+valor2+valor3;
		resultadoT =resultadoPromedio / 3;
		
		return resultadoT;
	}
	
	

}


