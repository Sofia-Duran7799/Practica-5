/**
 * La clase {@code Circulo} representa un círculo gráfico posicionable que hereda de {@code Circle}.
 * <p>
 * Esta clase permite ubicar un círculo en coordenadas específicas del canvas, ajustando su posición
 * relativa respecto a la posición original de la clase base (230, 90).
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Circulo extends Circle {
    /**
     * Construye un círculo en la posición especificada.
     * <p>
     * Calcula el desplazamiento necesario desde la posición por defecto de {@code Circle} (230, 90)
     * para ubicarlo en las coordenadas deseadas.
     * </p>
     * 
     * @param pos Objeto {@code Posicion} que indica las coordenadas (x, y) donde se dibujará el círculo
     */
    public Circulo(Posicion pos) {
        super();
        int deltaX = pos.getX() - 230;  // Desplazamiento horizontal desde posición base (230)
        int deltaY = pos.getY() - 90;   // Desplazamiento vertical desde posición base (90)
        moveHorizontal(deltaX);
        moveVertical(deltaY);
    }
}
