/**
 * Clase que representa un elemento de texto gráfico en el canvas.
 * Permite mostrar cadenas de texto en posiciones específicas con colores personalizables.
 */
public class Text {
    //La clase text tiene 4 atributos
    /**
     * Cadena de texto que se mostrará en el canvas.
     * Soporta caracteres Unicode como símbolos de cartas (♥♦♣♠).
     */
    private String text;
    
    /**
     * Coordenada horizontal (eje X) donde se dibujará el texto.
     * Valor en píxeles desde el borde izquierdo del canvas.
     */
    private int x;
    
    /**
     * Coordenada vertical (eje Y) donde se dibujará el texto.
     * Valor en píxeles desde el borde superior del canvas.
     */
    private int y;
    
    /**
     * Color del texto en formato String.
     * Valores típicos: "black", "red", "blue", etc.
     * Se corresponde con los colores soportados por la clase Canvas.
     */
    private String color;


    /**
     * Crea una instancia de texto en la posición especificada.
     * @param x Coordenada horizontal inicial (en píxeles)
     * @param y Coordenada vertical inicial (en píxeles)
     * @param text Contenido textual a mostrar
     */
    public Text(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
        this.color = "black"; // Color por defecto
    }


    /**
     * Cambia el color del texto.
     * @param newColor Nuevo color a aplicar (debe ser soportado por Canvas)
     */
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    /**
     * Hace visible el texto en el canvas usando la configuración actual
     * (posición, contenido y color).
     * Depende de la disponibilidad del objeto Canvas.
     */
    public void makeVisible() {
        Canvas canvas = Canvas.getCanvas();
        canvas.setForegroundColor(this.color);
        canvas.drawString(this.text, this.x, this.y);
    }
}