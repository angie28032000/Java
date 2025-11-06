package com.cmc.repaso.entidades;

public class Item {
    // Atributos del producto
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    // Constructor con el nombre
    public Item(String nombre) {
        this.nombre = nombre;
    }

    // Setter para establecer la cantidad de productos actuales
    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }

    // Método imprimir: muestra los valores actuales de todos los atributos
    public void imprimir() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Productos actuales: " + productosActuales);
        System.out.println("Productos vendidos: " + productosVendidos);
        System.out.println("Productos devueltos: " + productosDevueltos);
        System.out.println("--------------------------------");
    }

    // Método vender: recibe cantidadVendida y actualiza los valores
    public void vender(int cantidadVendida) {
        // Disminuye productos actuales y aumenta los vendidos
        productosActuales -= cantidadVendida;
        productosVendidos += cantidadVendida;
    }

    // Método devolver: recibe cantidadDevuelta y actualiza los valores
    public void devolver(int cantidadDevuelta) {
        // Incrementa productos actuales, incrementa productos devueltos
        // y disminuye los productos vendidos
        productosActuales += cantidadDevuelta;
        productosDevueltos += cantidadDevuelta;
        productosVendidos -= cantidadDevuelta;
    }
}
