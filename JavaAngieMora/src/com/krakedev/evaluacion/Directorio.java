package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Directorio {
    private ArrayList<Contacto> contactos;
    private ArrayList<Contacto> correctos;
    private ArrayList<Contacto> incorrectos;
    private Date ultimaModificacion;

    // ✅ Constructor
    public Directorio() {
        contactos = new ArrayList<>();
        correctos = new ArrayList<>();
        incorrectos = new ArrayList<>();
        ultimaModificacion = null;
    }

    // ✅ Agregar contacto (sin duplicar cédulas)
    public boolean agregarContacto(Contacto contacto) {
        Contacto existente = buscarPorCedula(contacto.getCedula());

        if (existente == null) {
            contactos.add(contacto);
            ultimaModificacion = new Date(); // se actualiza la fecha al agregar
            return true;
        } else {
            System.out.println("⚠️ Ya existe un contacto con la cédula: " + contacto.getCedula());
            return false;
        }
    }

    // ✅ Buscar contacto por cédula
    public Contacto buscarPorCedula(String cedula) {
        for (Contacto c : contactos) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    // ✅ Consultar fecha de última modificación
    public String consultarUltimaModificacion() {
        if (ultimaModificacion == null) {
            return "Aún no se han realizado modificaciones.";
        }
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formato.format(ultimaModificacion);
    }

    // ✅ Mostrar todos los contactos
    public void mostrarContactos() {
        for (Contacto c : contactos) {
            c.imprimir();
            System.out.println("-----------------------");
        }
    }

    // ✅ Contar contactos sin dirección
    public int contarContactosSinDireccion() {
        int contador = 0;
        for (Contacto c : contactos) {
            if (c.getDireccion() == null) {
                contador++;
            }
        }
        return contador;
    }

    // ✅ Contar contactos con teléfono convencional y estado "C"
    public int contarFijos() {
        int contador = 0;
        for (Contacto c : contactos) {
            if (c.getTelefono() != null &&
                c.getTelefono().isConvencional() &&
                c.getTelefono().getEstado() == 'C') {
                contador++;
            }
        }
        return contador;
    }

    // ✅ Nuevo método: Depurar contactos
    public void depurar() {
        correctos.clear();
        incorrectos.clear();

        for (Contacto c : contactos) {
            if (c.getDireccion() != null) {
                correctos.add(c);
            } else {
                incorrectos.add(c);
            }
        }

        contactos.clear(); // vacía la lista principal
        ultimaModificacion = new Date(); // registra el momento de depuración
    }

    // ✅ Getters para verificar resultados en tests
    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }

    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
}
