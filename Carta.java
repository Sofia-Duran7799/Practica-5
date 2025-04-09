/**
 * La clase {@code Carta} representa una carta de una baraja estándar, 
 * con un valor numérico y un palo específico.
 * <p>
 * Esta clase permite crear objetos que modelan cartas individuales, 
 * donde cada carta tiene un valor (como 1 para As, 13 para Rey) 
 * y un palo válido (Trebol, Diamante, Pica, Corazon).
 * </p>
 * 
 * @author Aileen Sofia Duran Bello
 * @version 1.0
 */
public class Carta {
    /** 
     * Palo de la carta (Trebol, Diamante, Pica, Corazon).
     */
    private String palo;
    
    /** 
     * Valor numérico de la carta (rango típico: 1-13).
     */
    private int valor;

    /**
     * Construye una nueva carta con el valor y palo especificados.
     * 
     * @param valor Valor numérico de la carta (ej: 1 para As, 13 para Rey).
     * @param palo  Palo de la carta. Debe ser uno de: Trebol, Diamante, Pica, Corazon.
     */
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Obtiene el valor numérico de la carta.
     * 
     * @return El valor de la carta (entero).
     */
    public int getValor() { 
        return valor; 
    }

    /**
     * Obtiene el palo de la carta.
     * 
     * @return El palo de la carta como cadena (ej: "Trebol").
     */
    public String getPalo() { 
        return palo; 
    }
}
