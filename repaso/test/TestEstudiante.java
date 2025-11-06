package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Carlos");
        estudiante1.calificar(6);
        estudiante1.imprimir();
        
    }
}
