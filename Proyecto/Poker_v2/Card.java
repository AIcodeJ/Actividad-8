public class Card {

    // Attributes
    private final String Palo;
    private final String Color;
    private final String Valor;

    // Methods
    public Card(String Palo, String Color, String Valor){
        this.Palo = Palo;
        this.Color = Color;
        this.Valor = Valor;
    }
    
    @Override
    public String toString() {
        return "Palo: " + Palo + ", Color: " + Color + ", Valor: " + Valor;
    }

}
