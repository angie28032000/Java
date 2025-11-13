package servicios;

import entidades.Carta;
import entidades.Naipe;
import java.util.ArrayList;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<Carta> naipeBarajado;

    // 🔹 Constructor vacío
    public Juego() {
        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
        cartasJugadores = new ArrayList<>();
    }

    // 🔹 Constructor con lista de jugadores
    public Juego(ArrayList<String> jugadores) {
        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
        cartasJugadores = new ArrayList<>();

        // Crear un ArrayList de cartas por cada jugador
        for (int i = 0; i < jugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<Carta>());
        }
    }

    // Getter para cartasJugadores
    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    // 🔹 Método para entregar cartas a los jugadores
    public void entregarCartas(int cartasPorJugador) {
        int indiceCarta = 0;

        // repartir una por una
        for (int i = 0; i < cartasPorJugador; i++) {
            for (int j = 0; j < cartasJugadores.size(); j++) {
                if (indiceCarta < naipeBarajado.size()) {
                    Carta carta = naipeBarajado.get(indiceCarta);
                    cartasJugadores.get(j).add(carta);
                    indiceCarta++;
                }
            }
        }
    }
    public int devolverTotal(int indiceJugador) {
        int total = 0;
        ArrayList<Carta> cartasJugador = cartasJugadores.get(indiceJugador);

        for (Carta carta : cartasJugador) {
            total += carta.getNumero().getValor();
        }

        return total;
    }


    // 🔹 Método para determinar ganador (por mayor suma de valores)
    public int determinarGanador() {
        int mayorPuntaje = 0;
        int indiceGanador = -1;

        for (int i = 0; i < cartasJugadores.size(); i++) {
            int total = 0;
            for (Carta carta : cartasJugadores.get(i)) {
                total += carta.getNumero().getValor();
            }
            if (total > mayorPuntaje) {
                mayorPuntaje = total;
                indiceGanador = i;
            }
        }
        return indiceGanador;
    }
}

