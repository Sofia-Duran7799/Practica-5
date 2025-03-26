/**
 * Clase responsable de mostrar gráficamente una carta en una posición específica del canvas.
 * Utiliza figuras básicas (cuadrados) y texto para representar el valor y palo de la carta.
 */
public class Visualizador {
    // Coordenadas iniciales del cuadrado en BlueJ (posición por defecto)
    //La clase visualizador tiene 2 atributos
    private static final int SQUARE_INIT_X = 310;
    private static final int SQUARE_INIT_Y = 120;

    /**
     * Método principal que dibuja una carta completa en la posición especificada.
     * @param c Carta a visualizar
     * @param p Posición donde dibujar la carta (coordenadas X,Y)
     */
    public static void carta(Carta c, Posicion p) {
        dibujarFondo(p);
        dibujarContenido(c, p);
    }

    /**
     * Dibuja el fondo de la carta como un cuadrado blanco con borde.
     * @param p Posición base para el fondo de la carta
     */
    private static void dibujarFondo(Posicion p) {
        // Cuadrado de borde (ligeramente más grande para cubrir artefactos visuales)
        Square borde = new Square();
        moverForma(borde, SQUARE_INIT_X, SQUARE_INIT_Y, p.getPosicionX() - 2, p.getPosicionY() - 2);
        borde.changeColor("white");
        borde.changeSize(84); // 80px (tamaño base) + 4px (borde)
        borde.makeVisible();
        
        // Cuadrado principal de la carta
        Square fondo = new Square();
        moverForma(fondo, SQUARE_INIT_X, SQUARE_INIT_Y, p.getPosicionX(), p.getPosicionY());
        fondo.changeColor("white");
        fondo.changeSize(80);
        fondo.makeVisible();
    }

    /**
     * Dibuja el contenido de la carta (valor y símbolo del palo).
     * @param c Carta con la información a mostrar
     * @param p Posición base para el contenido
     */
    private static void dibujarContenido(Carta c, Posicion p) {
        // Ajuste de posición para el texto
        int x = p.getPosicionX() + 20;  // Margen izquierdo
        int y = p.getPosicionY() + 45;  // Margen superior
        
        // Determina color según el palo
        String color = obtenerColorPalo(c.getPalo());
        
        // Dibuja el valor de la carta (ej: "A", "10")
        Text textoValor = new Text(x, y, c.getValor().getSimbolo());
        textoValor.changeColor(color);
        textoValor.makeVisible();
        
        // Dibuja el símbolo del palo (ej: "♥", "♠")
        Text textoPalo = new Text(x + 35, y - 5, obtenerSimboloPalo(c.getPalo()));
        textoPalo.changeColor(color);
        textoPalo.makeVisible();
    }

    /**
     * Obtiene el símbolo Unicode correspondiente a cada palo.
     * @param palo Palo de la carta
     * @return Símbolo gráfico del palo
     */
    private static String obtenerSimboloPalo(Carta.Palo palo) {
        switch(palo) {
            case CORAZONES: return "♥";  // U+2665
            case DIAMANTES: return "♦";  // U+2666
            case TREBOLES: return "♣";  // U+2663
            case PICAS: return "♠";     // U+2660
            default: return "";
        }
    }

    /**
     * Determina el color a usar según el estándar de naipes.
     * @param palo Palo de la carta
     * @return "red" para corazones/diamantes, "black" para tréboles/picas
     */
    private static String obtenerColorPalo(Carta.Palo palo) {
        return (palo == Carta.Palo.CORAZONES || palo == Carta.Palo.DIAMANTES) ? "red" : "black";
    }

    /**
     * Mueve una forma desde su posición inicial a la posición objetivo.
     * @param forma Objeto Square a mover
     * @param initX Posición X inicial en BlueJ
     * @param initY Posición Y inicial en BlueJ
     * @param destX Posición X objetivo
     * @param destY Posición Y objetivo
     */
    private static void moverForma(Square forma, int initX, int initY, int destX, int destY) {
        forma.moveHorizontal(destX - initX);
        forma.moveVertical(destY - initY);
    }
}
