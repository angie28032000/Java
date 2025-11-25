package com.krakedev.persistencia.entidades;

import java.sql.Date;
import java.sql.Time;

public class Registro_empleado {
    private int codigo_registro;
    private String cedula;
    private Date fecha;
    private Time hora;
    private int codigoempleado;

    public Registro_empleado() {
    
    }

    public Registro_empleado(int codigo_registro, String cedula, int codigoempleado) {
        this.codigo_registro = codigo_registro;
        this.cedula = cedula;
        this.codigoempleado = codigoempleado;
    }

    public Registro_empleado(int codigo_registro, String cedula, Date fecha, Time hora, int codigoempleado) {
        this.codigo_registro = codigo_registro;
        this.cedula = cedula;
        this.fecha = fecha;
        this.hora = hora;
        this.codigoempleado = codigoempleado;
    }

    public int getCodigo_registro() {
        return codigo_registro;
    }

    public void setCodigo_registro(int codigo_registro) {
        this.codigo_registro = codigo_registro;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getCodigoempleado() {
        return codigoempleado;
    }

    public void setCodigoempleado(int codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    @Override
    public String toString() {
        return "Registro_empleado [codigo_registro=" + codigo_registro + ", cedula=" + cedula + ", fecha=" + fecha
                + ", hora=" + hora + ", codigoempleado=" + codigoempleado + "]";
    }
}
