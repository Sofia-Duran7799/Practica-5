// Posicion.java
/**
 * La clase {@code Posicion} representa una ubicación en un espacio bidimensional, 
 * utilizando coordenadas cartesianas (x, y).
 * <p>
 * Esta clase se utiliza para posicionar elementos gráficos en un canvas o superficie de dibujo.
 * Las coordenadas (0,0) corresponden típicamente a la esquina superior izquierda del área de trabajo.
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Posicion {
    /** Coordenada horizontal (eje X) */
    private int x;
    
    /** Coordenada vertical (eje Y) */
    private int y;

    /**
     * Construye una posición con las coordenadas especificadas.
     * 
     * @param x Coordenada horizontal (valor entero)
     * @param y Coordenada vertical (valor entero)
     */
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene la coordenada X de la posición.
     * 
     * @return Valor entero que representa la posición en el eje horizontal
     */
    public int getX() {
        return x;
    }

    /**
     * Obtiene la coordenada Y de la posición.
     * 
     * @return Valor entero que representa la posición en el eje vertical
     */
    public int getY() {
        return y;
    }
}
