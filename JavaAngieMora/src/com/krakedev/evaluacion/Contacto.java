package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private ArrayList<Telefono> telefonos;

    // 🔹 Constructor con dirección
    public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefonos = new ArrayList<Telefono>(); // Inicializa la lista
    }

    // 🔹 Constructor sin dirección
    public Contacto(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = new ArrayList<Telefono>(); // Inicializa la lista
    }

    // 🔹 Agregar teléfono
    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    // 🔹 Mostrar teléfonos con estado "C"
    public void mostrarTelefonos() {
        System.out.println("Teléfonos del contacto " + nombre + " " + apellido + ":");
        for (Telefono tel : telefonos) {
            if (tel.getEstado().equals("C")) {
                System.out.println("Número: " + tel.getNumero() + ", Tipo: " + tel.getTipo());
            }
        }
    }

    // 🔹 Mostrar información completa
    public void imprimir() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        mostrarTelefonos();
    }
    
    public ArrayList<Telefono> recuperarIncorrectos() {
        ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();
        for (Telefono tel : telefonos) {
            if (tel.getEstado().equals("E")) {
                incorrectos.add(tel);
            }
        }
        return incorrectos;
    }


    // 🔹 Getters y setters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
}
