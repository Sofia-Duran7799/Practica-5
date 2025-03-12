import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas = new ArrayList<>();

    public Mazo() {
        resetearMazo();
    }

    public void resetearMazo() {
        cartas.clear();
        for (Carta.Palo palo : Carta.Palo.values()) {
            for (Carta.ValorCarta valor : Carta.ValorCarta.values()) {
                cartas.add(new Carta(valor, palo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public List<List<Carta>> repartir(int numJugadores, int cartasPorJugador) {
        int totalNecesario = numJugadores * cartasPorJugador;
        if (totalNecesario > cartas.size()) {
            throw new IllegalStateException("Cartas insuficientes: Necesarias " + 
                                          totalNecesario + ", hay " + cartas.size());
        }

        List<List<Carta>> manos = new ArrayList<>();
        for (int i = 0; i < numJugadores; i++) {
            List<Carta> mano = new ArrayList<>();
            for (int j = 0; j < cartasPorJugador; j++) {
                mano.add(cartas.remove(0));
            }
            manos.add(mano);
        }
        return manos;
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public Carta quitarCarta() {
        return cartas.isEmpty() ? null : cartas.remove(0);
    }

    public int cartasRestantes() {
        return cartas.size();
    }
}
