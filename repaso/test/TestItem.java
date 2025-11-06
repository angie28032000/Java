package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

    public static void main(String[] args) {

        // Crear el primer producto
        Item item1 = new Item("Camiseta");
        item1.setProductosActuales(20);

        System.out.println("📦 Estado inicial del producto 1:");
        item1.imprimir();

        // Vender 5 camisetas
        System.out.println("➡️ Vendiendo 5 camisetas...");
        item1.vender(5);
        item1.imprimir();

        // Devolver 2 camisetas
        System.out.println("↩️ Devolviendo 2 camisetas...");
        item1.devolver(2);
        item1.imprimir();

        // Crear otro producto
        Item item2 = new Item("Zapatos");
        item2.setProductosActuales(15);

        System.out.println("📦 Estado inicial del producto 2:");
        item2.imprimir();

        // Vender y devolver con el segundo producto
        System.out.println("➡️ Vendiendo 4 pares de zapatos...");
        item2.vender(4);
        item2.imprimir();

        System.out.println("↩️ Devolviendo 1 par de zapatos...");
        item2.devolver(1);
        item2.imprimir();
    }
}
