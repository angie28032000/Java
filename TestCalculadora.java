package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		mostrarResultado result;
		
		int resultado;
		int resultado1;
		double resultadoMultiplicacion;
		double resultadoDividir;
		double resultadoPromedio;
		
		calcu = new Calculadora();
		result = new mostrarResultado();
		
		resultado=calcu.sumar(5, 3);
		resultado1=calcu.restar(10, 8);
		resultadoMultiplicacion = calcu.multiplicar(3,7);
		resultadoDividir = calcu.divir(10,5);
		resultadoPromedio=calcu.promediar(6,9,10);
		
		
		
		System.out.println("resultado suma:"+resultado);
		System.out.println("resultado resta :"+resultado1);
		System.out.println("resultado multiplicacion : "+resultadoMultiplicacion);
		System.out.println("resyultado divir : "+resultadoDividir);
		System.out.println("resultado promedio : "+resultadoPromedio);
		
		
		
		result.saludar();
		

	}
	
}
