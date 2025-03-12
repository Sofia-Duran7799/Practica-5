public class Carta {
    // Enums internos
    public enum Palo {
        CORAZONES, DIAMANTES, TREBOLES, PICAS
    }

    public enum ValorCarta {
        AS(1, "A"), DOS(2, "2"), TRES(3, "3"), CUATRO(4, "4"), CINCO(5, "5"),
        SEIS(6, "6"), SIETE(7, "7"), OCHO(8, "8"), NUEVE(9, "9"), DIEZ(10, "10"),
        JOTA(11, "J"), REINA(12, "Q"), REY(13, "K");

        private final int valorNumerico;
        private final String simbolo;

        ValorCarta(int valorNumerico, String simbolo) {
            this.valorNumerico = valorNumerico;
            this.simbolo = simbolo;
        }

        public int getValorNumerico() {
            return valorNumerico;
        }

        public String getSimbolo() {
            return simbolo;
        }
    }

    // Atributos de la carta
    private final ValorCarta valor;
    private final Palo palo;

    public Carta(ValorCarta valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValorNumerico() {
        return valor.getValorNumerico();
    }

    @Override
    public String toString() {
        return valor.getSimbolo() + " de " + palo.name().charAt(0) + 
               palo.name().substring(1).toLowerCase();
    }
}
   
