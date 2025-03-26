/**
 * Representa una posición en un espacio 2D con coordenadas (X,Y).
 * Se utiliza para ubicar elementos gráficos en el canvas.
 */
public class Posicion {
    // La clase posicion tiene 2 atributos
    private int posicionX; // Coordenada horizontal (píxeles desde el borde izquierdo)
    private int posicionY; // Coordenada vertical (píxeles desde el borde superior)

    /**
     * Constructor que inicializa una posición con coordenadas específicas.
     * @param posicionX Valor horizontal (debe ser >= 0)
     * @param posicionY Valor vertical (debe ser >= 0)
     * @throws IllegalArgumentException Si las coordenadas son negativas
     */
    public Posicion(int posicionX, int posicionY) {
        if (posicionX < 0 || posicionY < 0) {
            throw new IllegalArgumentException("Las coordenadas no pueden ser negativas");
        }
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    /**
     * @return La coordenada horizontal actual
     */
    public int getPosicionX() { 
        return posicionX;
    }

    /**
     * Establece una nueva coordenada horizontal.
     * @param posicionX Nuevo valor (debe ser >= 0)
     */
    public void setPosicionX(int posicionX) {
        if (posicionX < 0) {
            throw new IllegalArgumentException("La coordenada X no puede ser negativa");
        }
        this.posicionX = posicionX;
    }

    /**
     * @return La coordenada vertical actual
     */
    public int getPosicionY() { 
        return posicionY; 
    }

    /**
     * Establece una nueva coordenada vertical.
     * @param posicionY Nuevo valor (debe ser >= 0)
     */
    public void setPosicionY(int posicionY) {
        if (posicionY < 0) {
            throw new IllegalArgumentException("La coordenada Y no puede ser negativa");
        }
        this.posicionY = posicionY;
    }

    /**
     * Representación textual de la posición.
     * @return String en formato "Posicion en X: [valor], Posicion en Y: [valor]"
     */
    @Override
    public String toString() { 
        return String.format("Posición → X: %d, Y: %d", posicionX, posicionY);
    }
    
}


