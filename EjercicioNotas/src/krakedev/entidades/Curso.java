package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    // 🔹 Constructor vacío (para tu test)
    public Curso() {
        this.nombre = "Sin nombre";
        this.estudiantes = new ArrayList<Estudiante>();
    }

    // 🔹 Constructor con nombre opcional
    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }

    // 🔹 Método para buscar estudiante por cédula
    public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
        	if (e.getCedula().equals(estudiante.getCedula()))  {
                System.out.println("El estudiante con cédula " + estudiante.getCedula() + " ya está registrado.");
                return e;
            }
        }
        return null;
    }

    // 🔹 Método para matricular estudiantes
    public void matricularEstudiante(Estudiante estudiante) {
        Estudiante encontrado = buscarEstudiantePorCedula(estudiante);
        if (encontrado == null) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante " + estudiante.getNombre() + " matriculado correctamente.");
        }
    }

    // 🔹 Calcular promedio general del curso
    public double calcularPromedioCurso() {
        if (estudiantes.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.calcularPromedioNotasEstudiante();
        }

        return suma / estudiantes.size();
    }

    // 🔹 Mostrar información del curso
    public void mostrar() {
        System.out.println("Curso [nombre=" + nombre + "]");
        System.out.println("Lista de estudiantes:");

        for (Estudiante e : estudiantes) {
            e.mostrar();
            System.out.println("----------------------------");
        }

        System.out.println("Promedio general del curso: " + calcularPromedioCurso());
    }

    // 🔹 Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    // 🔹 Método para buscar estudiantes hombres
    public ArrayList<Estudiante> buscarHombre() {
        ArrayList<Estudiante> hombres = new ArrayList<Estudiante>();
        
        for (Estudiante e : estudiantes) {
            if (e.getGenero() == 'M' || e.getGenero() == 'm') {
                hombres.add(e);
            }
        }
        
        return hombres;
    }
}
