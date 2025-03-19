import java.util.ArrayList;
import java.util.List;

public class Jugador {
    public String nombre;
    private List<Carta> mano = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    public Carta descartarCarta(int indice) {
        return (indice >= 0 && indice < mano.size()) ? mano.remove(indice) : null;
    }

    public int valorMano() {
        return mano.stream().mapToInt(Carta::getValorNumerico).sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(":\n");
        mano.forEach(carta -> sb.append(" - ").append(carta).append("\n"));
        sb.append("Valor total: ").append(valorMano());
        return sb.toString();
    }
}