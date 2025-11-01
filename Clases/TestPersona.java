package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {

		Persona p;// declaro un valariable llamda p de tipo persona
		Persona p2;
		p = new Persona();// instaciar un objeto Persona , referencia al objeto persona
		p2 = new Persona();

		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.65;

		System.out.println("nombre:" + p.nombre);// imprimir resultado,el p es el que contiene la informacion .
		System.out.println("edad:" + p.edad);
		System.out.println("estatura:" + p.estatura);

		p2.nombre = "Mora";
		p2.edad = 43;
		p2.estatura = 1.50;

		System.out.println("nombre:" + p2.nombre);// imprimir resultado,el p es el que contiene la informacion .
		System.out.println("edad:" + p2.edad);
		System.out.println("estatura:" + p2.estatura);

		

	}

}
