package com.cmc.evaluacion;

import com.cmc.entidades.Cliente;

public class Prestamo {
    private double monto;
    private double interes;
    private int plazo;
    private Cliente cliente;
    private Cuota[] cuotas;

    // 🔹 Constructor con cliente
    public Prestamo(double monto, double interes, int plazo, Cliente cliente) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
        this.cliente = cliente;
    }

    // 🔹 Constructor alternativo (sin cliente)
    public Prestamo(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
    }

    // 🔹 Getters
    public double getMonto() {
        return monto;
    }

    public double getInteres() {
        return interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cuota[] getCuotas() {
        return cuotas;
    }

    // 🔹 Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCuotas(Cuota[] cuotas) {
        this.cuotas = cuotas;
    }

    // 🔹 Mostrar información del préstamo
    public void mostrarPrestamo() {
        System.out.println("Monto: " + monto + " | Interés: " + interes + "% | Plazo: " + plazo + " meses");
        if (cuotas != null) {
            for (Cuota c : cuotas) {
                c.mostrarPrestamo();
            }
        } else {
            System.out.println("No tiene tabla generada.");
        }
    }
}
