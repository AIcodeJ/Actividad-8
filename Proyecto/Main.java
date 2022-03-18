import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Instanciamos la clase Deck
        Deck mano = new Deck();
        // Accedemos al atributo Deck
        mano.Deck = new ArrayList <> ();

        String [] Palo = {"Diamonds", "Hearts", "Spades", "Clubs"};
        String [] Color = {"Red", "Black"};
        String [] Valor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // Preparamos las cartas correspondientes (Treboles y Picas - Negras)
        for (int i = 0; i < 2; i++) { //Se usa Palo[0] y Palo[1]
            for (String j : Valor) {
                mano.Deck.add(new Card(Palo[i], Color[0], j));
            }
        }

        // Preparamos las cartas correspondientes (Corazones y Diamantes - Rojas)
        for (int k = 2; k < 4; k++) { //Se usa Palo[2] y Palo[3]
            for (String l : Valor){
                mano.Deck.add(new Card(Palo[k], Color[1], l));
            }
        }

        // Llamamos los metodos de la clase Deck
        mano.Shuffle(mano.Deck);
        System.out.println(" ");
        mano.Head(mano.Deck);
        System.out.println(" ");
        mano.Pick(mano.Deck);
        System.out.println(" ");
        mano.Hand(mano.Deck);
    }
}
