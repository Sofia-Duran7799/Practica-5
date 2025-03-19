import java.util.List;

public class Juego {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.barajar();

        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");

        // Repartir 3 cartas a cada jugador
        List<List<Carta>> manos = mazo.repartir(2, 3);
        manos.get(0).forEach(jugador1::recibirCarta);
        manos.get(1).forEach(jugador2::recibirCarta);

        System.out.println("=== Cartas repartidas ===");
        System.out.println(jugador1 + "\n");
        System.out.println(jugador2 + "\n");
        System.out.println("Cartas en mazo: " + mazo.cartasRestantes());

        // Devolver cartas al mazo
        mazo.agregarCarta(jugador1.descartarCarta(0));
        mazo.agregarCarta(jugador2.descartarCarta(0));
        System.out.println("\nCartas devueltas. Nuevo tamaño del mazo: " + mazo.cartasRestantes());
    }
}