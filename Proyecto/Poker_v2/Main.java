import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        menu();
    }

    // Metodo Menu
    private static void menu(){
        // Instanciamos la clase Deck y Scanner
        Deck mano = new Deck();
        Scanner sn = new Scanner(System.in);
        // Accedemos al atributo Deck
        mano.Deck = new ArrayList <> ();

        // Variables
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
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
        // Hacemos un menu interactivo con Do While y agregamos una excepción para evitar errores en el menu
        do{
            System.out.println("¡Bienvenido al juego de Poker! \n" +
                    "Selecciona una opción: \n");
            System.out.println("1. Mezclar Deck");
            System.out.println("2. Sacar una carta");
            System.out.println("3. Carta al azar");
            System.out.println("4. Generar una mano de 5 cartas");
            System.out.println("0. Salir \n");
            try {
                System.out.println("Escribe una de las opciones \n");
                opcion = sn.nextInt();
                // Con lo que dijite el usuario se aplicara el caso con Switch
                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        mano.Shuffle(mano.Deck);
                        break;
                    case 2:
                        mano.Head(mano.Deck);
                        break;
                    case 3:
                        mano.Pick(mano.Deck);
                        break;
                    case 4:
                        mano.Hand(mano.Deck);
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4 \n");
                }
            } catch (InputMismatchException e) { //Este es el tipo de error que puede salir
                System.out.println("Opción no valida, debes insertar un número \n");
                sn.next();
            }
        }
        while (!salir);
    }
}
