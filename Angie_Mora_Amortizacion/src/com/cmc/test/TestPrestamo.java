package com.cmc.test;

import java.util.ArrayList;
import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.servicios.Banco;

public class TestPrestamo {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("1234567890", "Juan", "Perez");
        Cliente cliente2 = new Cliente("0987654321", "Maria", "Lopez");

        banco.registrarCliente(cliente1);
        banco.registrarCliente(cliente2);

        Prestamo prestamo1 = new Prestamo(4000, 12, 16, cliente1);
        banco.asignarPrestamo("1234567890", prestamo1);

        Prestamo prestamo2 = new Prestamo(50000, 10, 11, cliente1);
        banco.asignarPrestamo("1234567890", prestamo2);

        Prestamo prestamo3 = new Prestamo(2000, 8, 14, cliente2);
        banco.asignarPrestamo("0987654321", prestamo3);

        ArrayList<Prestamo> prestamosCliente1 = banco.buscarPrestamos("1234567890");
        System.out.println("\n📋 Préstamos de Juan Perez:");
        for (Prestamo prestamo : prestamosCliente1) {
            CalculadoraAmortizacion.mostrarTabla(prestamo);
        }

        ArrayList<Prestamo> prestamosCliente2 = banco.buscarPrestamos("0987654321");
        System.out.println("\n📋 Préstamos de Maria Lopez:");
        for (Prestamo prestamo : prestamosCliente2) {
            CalculadoraAmortizacion.mostrarTabla(prestamo);
        }
    }
}
