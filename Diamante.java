/**
 * La clase {@code Diamante} representa gráficamente el palo de Diamante 
 * utilizando tres triángulos rojos dispuestos en forma de rombo.
 * <p>
 * El diamante se compone de:
 * <ul>
 *   <li>Un triángulo superior invertido centrado en la posición dada</li>
 *   <li>Dos triángulos base desplazados horizontalmente para formar la parte inferior</li>
 * </ul>
 * Todos los componentes se dibujan automáticamente en color rojo al crear la instancia.
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Diamante {
    /**
     * Construye un diamante en la posición especificada.
     * 
     * @param pos Posición central donde se ubicará el diamante
     */
    public Diamante(Posicion pos) {
        int x = pos.getX();
        int y = pos.getY();
        
        // Triángulo superior centrado (20px arriba del centro)
        Triangulo top = new Triangulo(new Posicion(x, y - 20));
        top.changeSize(30, 30);  // Altura: 30px, Ancho: 30px
        top.changeColor("red");
        top.makeVisible();

        // Triángulo base izquierdo (-15px en X desde el centro)
        Triangulo base1 = new Triangulo(new Posicion(x - 15, y + 10));
        base1.changeSize(30, 30);
        base1.changeColor("red");
        base1.makeVisible();

        // Triángulo base derecho (+15px en X desde el centro)
        Triangulo base2 = new Triangulo(new Posicion(x + 15, y + 10));
        base2.changeSize(30, 30);
        base2.changeColor("red");
        base2.makeVisible();
    }
}
