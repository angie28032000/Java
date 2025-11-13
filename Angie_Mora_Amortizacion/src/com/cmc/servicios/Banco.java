package com.cmc.servicios;

import java.util.ArrayList;
import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.Prestamo;
import com.cmc.evaluacion.CalculadoraAmortizacion;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Prestamo> prestamos;

    public Banco() {
        clientes = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() { return clientes; }
    public ArrayList<Prestamo> getPrestamos() { return prestamos; }

    public Cliente buscarCliente(String cedula) {
        for (Cliente c : clientes) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    public void registrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCedula()) == null) {
            clientes.add(cliente);
            System.out.println("✅ Cliente registrado: " + cliente.getNombre());
        } else {
            System.out.println("⚠️ El cliente con cédula " + cliente.getCedula() + " ya existe.");
        }
    }

    public void asignarPrestamo(String cedula, Prestamo prestamo) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            System.out.println("🚫 No es cliente del banco.");
        } else {
            prestamo.setCliente(cliente);
            prestamos.add(prestamo);
            CalculadoraAmortizacion.generarTabla(prestamo);
            System.out.println("💰 Préstamo asignado a " + cliente.getNombre());
        }
    }

    public ArrayList<Prestamo> buscarPrestamos(String cedula) {
        ArrayList<Prestamo> resultado = new ArrayList<>();
        for (Prestamo p : prestamos) {
            if (p.getCliente().getCedula().equals(cedula)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
