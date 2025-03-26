public class Main {
    public static void main(String[] args) {
 
    // Carta con fondo blanco, texto negro (trébol)
    Carta carta1 = new Carta(Carta.ValorCarta.AS, Carta.Palo.TREBOLES);
    Visualizador.carta(carta1, new Posicion(50, 50));
    
       
    // Carta con fondo blanco, texto rojo (diamante)
   //Carta carta2 = new Carta(Carta.ValorCarta.REINA, Carta.Palo.DIAMANTES);
    //Visualizador.carta(carta2, new Posicion(150, 50));

 
    }
    
}
