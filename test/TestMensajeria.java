package com.krakedev.test;

import com.krakedev.Mensajeria;

public class TestMensajeria {

	public static void main(String[] args) {
		Mensajeria m = new Mensajeria();
		m.setMensaje("hola soy yo ");
		System.out.println("Mensaje guardado :"+m.getMensaje());
	
	}

}
