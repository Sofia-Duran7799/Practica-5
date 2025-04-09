/**
 * La clase {@code Triangulo} representa un triángulo gráfico posicionable que hereda de {@code Triangle}.
 * <p>
 * Esta clase permite ubicar un triángulo en coordenadas específicas del canvas, ajustando su posición
 * relativa respecto a la posición original de la clase base (210, 140).
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Triangulo extends Triangle {
    /**
     * Construye un triángulo en la posición especificada.
     * <p>
     * Calcula el desplazamiento necesario desde la posición por defecto de {@code Triangle} (210, 140)
     * para ubicarlo en las coordenadas deseadas.
     * </p>
     * 
     * @param pos Objeto {@code Posicion} que indica las coordenadas (x, y) donde se dibujará el triángulo
     */
    public Triangulo(Posicion pos) {
        super();
        int deltaX = pos.getX() - 210;  // Desplazamiento horizontal desde posición base (210)
        int deltaY = pos.getY() - 140;  // Desplazamiento vertical desde posición base (140)
        moveHorizontal(deltaX);
        moveVertical(deltaY);
    }
}