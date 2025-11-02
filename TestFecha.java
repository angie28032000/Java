package com.krakedev;

public class TestFecha {
	public static void main (String[] args) {
		
		Fecha fecha1 = new Fecha();
		fecha1.setAño(200);
		fecha1.setMes(11);
		fecha1.setDia(2);;
		
		System.out.println(fecha1.getAño());
		System.out.println(fecha1.getMes());
		System.out.println(fecha1.getDia());
	} 

}
