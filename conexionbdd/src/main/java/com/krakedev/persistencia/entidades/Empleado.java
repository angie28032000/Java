package com.krakedev.persistencia.entidades;

import java.sql.Date;

public class Empleado {
    private int codigo_empleado;
    private String nombre;
    private Date fecha;
    private Date hora;

    public Empleado() {
    }

    public Empleado(int codigo_empleado, String nombre, Date fecha, Date hora) {
        this.codigo_empleado = codigo_empleado;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Este constructor recibe Strings, pero NO convierte aún.
    public Empleado(int codigo_empleado, String nombre, String fechaStr, String horaStr) {
        this.codigo_empleado = codigo_empleado;
        this.nombre = nombre;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Empleado [codigo_empleado=" + codigo_empleado + ", nombre=" + nombre + ", fecha=" + fecha + ", hora="
                + hora + "]";
    }
}
