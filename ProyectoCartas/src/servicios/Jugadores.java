package servicios;

import java.util.ArrayList;
import entidades.Carta;

public class Jugadores {
    private ArrayList<String> jugadores;

    // Constructor vacío
    public Jugadores() {
        jugadores = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    // 🔹 Método principal del juego
    public void jugar() {
        // Crear 3 jugadores
        jugadores.add("Jugador 1");
        jugadores.add("Jugador 2");
        jugadores.add("Jugador 3");

        // Crear un juego con estos jugadores
        Juego juego = new Juego(jugadores);

        // Entregar 5 cartas a cada jugador
        juego.entregarCartas(5);

        // Mostrar las cartas y el puntaje total de cada jugador
        System.out.println("=== RESULTADOS DEL JUEGO ===");
        for (int i = 0; i < jugadores.size(); i++) {
            ArrayList<Carta> cartasJugador = juego.getCartasJugadores().get(i);
            int total = 0;
            System.out.println(jugadores.get(i) + ":");

            for (Carta carta : cartasJugador) {
                carta.mostrarInfo();
                total += carta.getNumero().getValor();
            }
            System.out.println("Total de puntos: " + total);
            System.out.println("---------------------------");
        }

        // Determinar ganador
        int indiceGanador = juego.determinarGanador();
        if (indiceGanador != -1) {
            System.out.println("🏆 El ganador es: " + jugadores.get(indiceGanador) + " 🏆");
        }
    }
}

