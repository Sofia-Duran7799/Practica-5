/**
 * La clase {@code Cuadrado} representa un cuadrado gráfico posicionable que hereda de {@code Square}.
 * <p>
 * Permite crear cuadrados de tamaño personalizado en coordenadas específicas, ajustando su posición
 * relativa respecto a la posición original de la clase base (310, 120).
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Cuadrado extends Square {
    /**
     * Construye un cuadrado en la posición y tamaño especificados.
     * <p>
     * La posición se calcula como un desplazamiento desde la posición por defecto de {@code Square}.
     * </p>
     * 
     * @param pos   Objeto {@code Posicion} con las coordenadas objetivo (x, y)
     * @param size  Tamaño del cuadrado en píxeles (lado x lado)
     */
    public Cuadrado(Posicion pos, int size) {
        super();
        changeSize(size);  // Heredado de Square - establece el tamaño
        int deltaX = pos.getX() - 310;  // Offset desde posición base X (310)
        int deltaY = pos.getY() - 120;  // Offset desde posición base Y (120)
        moveHorizontal(deltaX);         // Heredado de Square
        moveVertical(deltaY);           // Heredado de Square
    }
}