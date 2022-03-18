import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    //Atributos
    ArrayList <Card> Deck;

    //Metodos para jugar Poker
    public void Shuffle(ArrayList <Card> Deck){
        Collections.shuffle(Deck);
        System.out.println("Vamos a revolver el Deck \n");
        for (Card j : Deck) {
            System.out.println(j + " ");
        }
        System.out.println("\nSe mezcló el Deck. \n");
    }
    public void Head(ArrayList<Card> Deck){
        System.out.println(Deck.get(0));
        Deck.remove(0);
        System.out.println("Quedan " + Deck.size() + " cartas del deck");
    }
    public void Pick(ArrayList<Card> Deck){
        Random random = new Random();
        System.out.println(Deck.get(random.nextInt(Deck.size())));
        Deck.remove(random.nextInt(Deck.size()));
        System.out.println("Quedan " + Deck.size() + " cartas del deck");
    }
    public void Hand(ArrayList<Card> Deck){
        for(int i = 0; i < 5; i++){
            System.out.println(Deck.get(i));
        }
        for(int j = 0; j < 5; j++){
            Deck.remove(j);
        }
        System.out.println("Quedan " + Deck.size()+ " cartas del deck");
    }
}
