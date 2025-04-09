/**
 * La clase {@code Visualizador} proporciona métodos estáticos para representar gráficamente cartas en un canvas.
 * <p>
 * Esta clase permite dibujar cartas con su valor numérico y símbolo de palo correspondiente en una posición específica.
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Visualizador {
    
    /**
     * Dibuja una carta en la posición especificada con los siguientes elementos:
     * <ul>
     *   <li>Un fondo blanco cuadrado</li>
     *   <li>Pequeños círculos negros representando el valor numérico</li>
     *   <li>Símbolo gráfico del palo en el centro</li>
     * </ul>
     * 
     * @param c Carta a visualizar
     * @param p Posición de la esquina superior izquierda del fondo de la carta
     */
    public static void carta(Carta c, Posicion p) {
        // ========== FONDO DE LA CARTA ========== //
        Cuadrado fondo = new Cuadrado(p, 100);  // Cuadrado de 100x100 píxeles
        fondo.changeColor("white");
        fondo.makeVisible();

        // ========== REPRESENTACIÓN DEL VALOR ========== //
        int valor = c.getValor();
        int startX = p.getX() + 10;  // Offset horizontal desde el borde
        int startY = p.getY() + 10;  // Offset vertical desde el borde
        
        // Distribuye los círculos en 2 columnas
        for (int i = 0; i < valor; i++) {
            int x = startX + (i % 2) * 20;  // Alterna entre columnas cada 20px
            int y = startY + (i / 2) * 20;  // Nueva fila cada 2 círculos
            Circulo punto = new Circulo(new Posicion(x, y));
            punto.changeSize(5);          // Diámetro de 5px
            punto.changeColor("black");
            punto.makeVisible();
        }

        // ========== SÍMBOLO DEL PALO ========== //
        Posicion centro = new Posicion(
            p.getX() + 50,  // Centro horizontal (100px de ancho/2)
            p.getY() + 50   // Centro vertical (100px de alto/2)
        );
        
        switch (c.getPalo()) {
            case "Trebol":
                new Trebol(centro);  // Crea trébol en el centro
                break;
            case "Diamante":
                new Diamante(centro); // Crea diamante en el centro
                break;
            case "Pica":
                new Pica(centro);     // Crea pica en el centro
                break;
            case "Corazon":
                new Corazon(centro);  // Crea corazón en el centro
                break;
        }
    }
}