/**
 * La clase {@code Trebol} representa gráficamente el palo de Trébol 
 * utilizando tres cuadrados negros dispuestos en forma característica.
 * <p>
 * El trébol se compone de:
 * <ul>
 *   <li>Un cuadrado superior centrado en la posición dada</li>
 *   <li>Dos cuadrados base desplazados horizontalmente para formar la parte inferior</li>
 * </ul>
 * Todos los componentes se dibujan automáticamente en color negro al crear la instancia.
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Trebol {
    /**
     * Construye un trébol en la posición especificada.
     * 
     * @param pos Posición central donde se ubicará el trébol
     */
    public Trebol(Posicion pos) {
        int x = pos.getX();
        int y = pos.getY();
        
        // Cuadrado superior (-15px en X para centrar cuadrado de 30px)
        Cuadrado top = new Cuadrado(new Posicion(x - 15, y - 30), 30);
        top.changeColor("black");
        top.makeVisible();

        // Cuadrado base izquierdo (-30px desde centro en X)
        Cuadrado base1 = new Cuadrado(new Posicion(x - 30, y), 30); 
        base1.changeColor("black");
        base1.makeVisible();

        // Cuadrado base derecho (centro en X)
        Cuadrado base2 = new Cuadrado(new Posicion(x, y), 30);
        base2.changeColor("black");
        base2.makeVisible();
    }
}