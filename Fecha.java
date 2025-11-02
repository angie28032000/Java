package com.krakedev;

public class Fecha {
	
	private int ano;
	private int mes;
	private int dia;
	
	public Fecha (int ano,int mes,int dia) {
		this.ano=ano;
		this.mes=mes;
		this.dia=dia;
		
		
	}
	
	public int getAño(int ano) {
		return ano;
	}
	public void setAño(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
}
