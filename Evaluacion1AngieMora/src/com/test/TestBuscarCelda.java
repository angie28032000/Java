package com.test;

import com.clearmins.MaquinaDulces;
import com.clearmins.componentes.Celda;

public class TestBuscarCelda {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));
		Celda celda=maquina.buscarCelda("C");
		System.out.println("Celda Encontrada: "+celda.getCodigo());
		Celda celda2=maquina.buscarCelda("F");
		if(celda2==null){
			System.out.println("No existe la celda buscada");
		}
	}

	
}
