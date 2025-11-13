package entidades;


	public class Random {

	    // Método estático que devuelve una posición aleatoria entre 0 y 51
	    public static int obtenerPosicion() {
	        // Math.random() devuelve un número entre 0.0 y 1.0 (1.0 excluido)
	        // Multiplicamos por 52 para obtener valores entre 0 y 51 inclusive
	        int posicion = (int) (Math.random() * 52);
	        return posicion;
	    }
	}



