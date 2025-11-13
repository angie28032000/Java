package entidades;

import java.util.ArrayList;

public class Naipe {
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;

    // Constructor vacío
    public Naipe() {
        numerosPosibles = new ArrayList<>();
        cartas = new ArrayList<>();

        // Agregar los 13 números del naipe con su valor correspondiente
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));

        // Crear las 52 cartas combinando cada número con cada palo
        Palos palos = new Palos();
        String[] listaPalos = {
            palos.getCorazonRojo(),
            palos.getCorazonNegro(),
            palos.getDiamante(),
            palos.getTrebol()
        };

        // Recorremos todos los números y todos los palos
        for (Numero numero : numerosPosibles) {
            for (String palo : listaPalos) {
                cartas.add(new Carta(numero, palo));
            }
        }
    }

    // Getter ÚNICO solicitado
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    // 🔁 Método para barajar las cartas
    public ArrayList<Carta> barajar1() {
        ArrayList<Carta> auxiliar = new ArrayList<>();

        // 100 iteraciones para intentar mezclar aleatoriamente
        for (int i = 0; i < 100; i++) {
            int pos = Random.obtenerPosicion();
            Carta carta = cartas.get(pos);

            // Solo se agrega si aún no ha sido copiada
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        // Agregar las cartas que no se agregaron en las 100 iteraciones
        for (Carta carta : cartas) {
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        // Retornar el mazo barajado
        return auxiliar;
    }
    
    // 🔹 Método para barajar las cartas
    public ArrayList<Carta> barajar() {
        ArrayList<Carta> auxiliar = new ArrayList<>();

        // Hacer 100 intentos de agregar cartas aleatorias
        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion();
            Carta carta = cartas.get(posicion);

            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        // Agregar las cartas que no fueron seleccionadas (estado N)
        for (Carta carta : cartas) {
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        return auxiliar;
    }

}
