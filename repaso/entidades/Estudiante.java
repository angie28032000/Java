package com.cmc.repaso.entidades;

public class Estudiante {
    private String nombre;
    private double nota;
    private String resultado;
    
    // Constructor con parámetro
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    // Constructor vacío (opcional, para crear sin nombre)
    public Estudiante() {
    }
    
    public void calificar(double nota) {
        this.nota = nota;
        
        if (nota < 8) {
            resultado = "F";
        } else {
            resultado = "A";
        }
    }
    
    // Método para mostrar el resultado
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Resultado: " + resultado);
    }
}