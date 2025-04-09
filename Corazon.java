/**
 * La clase {@code Corazon} representa gráficamente el palo de Corazón 
 * utilizando tres cuadrados rojos dispuestos en forma de corazón.
 * <p>
 * El corazón se compone de:
 * <ul>
 *   <li>Un cuadrado superior centrado en la posición dada</li>
 *   <li>Dos cuadrados en la base, colocados simétricamente</li>
 * </ul>
 * Todos los componentes se dibujan automáticamente en color rojo al crear la instancia.
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Corazon {
    /**
     * Construye un corazón en la posición especificada.
     * 
     * @param pos Posición central donde se ubicará el corazón
     */
    public Corazon(Posicion pos) {
        int x = pos.getX();
        int y = pos.getY();
        
        // Cuadrado superior centrado (-15 en X para centrar el cuadrado de 30px)
        Cuadrado top = new Cuadrado(new Posicion(x - 15, y - 30), 30);
        top.changeColor("red");
        top.makeVisible();

        // Cuadrado base izquierdo (-30 en X desde el centro)
        Cuadrado base1 = new Cuadrado(new Posicion(x - 30, y), 30); 
        base1.changeColor("red");
        base1.makeVisible();

        // Cuadrado base derecho (alineado con el centro en X)
        Cuadrado base2 = new Cuadrado(new Posicion(x + 0, y), 30);
        base2.changeColor("red");
        base2.makeVisible();
    }
}