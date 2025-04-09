/**
 * La clase {@code Main} es la clase principal que demuestra el uso del visualizador de cartas.
 * <p>
 * Esta clase crea un conjunto de cartas de diferentes palos y valores, y las despliega gráficamente
 * en posiciones horizontales sucesivas dentro del canvas.
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Main {
    /**
     * Punto de entrada principal del programa.
     * <p>
     * Crea 4 cartas de prueba con diferentes palos y valores, y las visualiza en el canvas
     * con un espaciado horizontal de 115px entre cada carta.
     * </p>
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en esta implementación)
     */
    public static void main(String[] args) {
        // Crear arreglo de cartas de demostración
        Carta[] cartas = {
            new Carta(2, "Trebol"),    // Trebol con valor 2
            new Carta(3, "Diamante"),  // Diamante con valor 3
            new Carta(1, "Pica"),      // Pica con valor 1 (As)
            new Carta(4, "Corazon")    // Corazón con valor 4
        };

        // Posicionar cartas horizontalmente
        int x = 50;  // Coordenada X inicial
        for (Carta c : cartas) {
            Visualizador.carta(c, new Posicion(x, 50));  // Mostrar carta en (x, 50)
            x += 115;  // Espaciado horizontal entre cartas
        }
    }
}