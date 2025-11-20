package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String Cedula;
	private char genero; // 'M' para masculino, 'F' para femenino
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
	    this.Cedula = cedula;
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.notas = new ArrayList<Nota>(); // ✅ aquí se inicializa
	}
	
	public Estudiante(String cedula, String nombre, String apellido, char genero) {
	    this.Cedula = cedula;
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.genero = genero;
	    this.notas = new ArrayList<Nota>();
	}
	
	public void agregarNota(Nota nuevaNota) {
		// Verificar que la calificación esté en el rango válido
		if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
			System.out.println(" Error: la calificación debe estar entre 0 y 10.");
			return;
		}

		// Verificar que no exista una nota con el mismo código de materia
		for (Nota n : notas) {
			if (n.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
				System.out.println(
						" Error: ya existe una nota para la materia con código " + nuevaNota.getMateria().getCodigo());
				return;
			}
		}

		// Si pasa las verificaciones, se agrega la nota
		notas.add(nuevaNota);
		System.out.println(" Nota agregada correctamente para la materia: " + nuevaNota.getMateria().getNombre());
	}

	public void modificarNota(String codigo, double nuevaNota) {
		if (nuevaNota < 0 || nuevaNota > 10) {
			System.out.println(" Error: la calificación debe estar entre 0 y 10.");
			return;
		}

		boolean encontrada = false;
		for (Nota n : notas) {
			if (n.getMateria().getCodigo().equals(codigo)) {
				n.setCalificacion(nuevaNota);
				System.out.println(" Nota modificada para la materia con código: " + codigo);
				encontrada = true;
				break;
			}
		}

		if (!encontrada) {
			System.out.println(" No se encontró ninguna materia con el código: " + codigo);
		}
	}
	
	
	
    public double calcularPromedioNotasEstudiante() {
        if (notas.isEmpty()) {
            System.out.println(" No hay notas registradas para calcular el promedio.");
            return 0;
        }

        double suma = 0;
        for (Nota n : notas) {
            suma += n.getCalificacion();
        }

        double promedio = suma / notas.size();
        return promedio;
    }
	
    
    public void mostrar() {
        String info = "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + Cedula + "]";
        System.out.println(info);
        for (Nota n : notas) {
            n.mostrar();
        }
        System.out.println("Promedio: " + calcularPromedioNotasEstudiante());
    }
    
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

}
