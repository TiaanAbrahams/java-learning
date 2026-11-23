import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Card card = new Card(Card.Suit.SPADES, "Jack",11);

        List<Card> deck = Card.standardDeck();
        Card.printDeck(deck);

        Card[] cardArray =new Card[13];

        Card aceOfHearts =Card.getFaceCard(Card.Suit.HEARTS, 'A');
        Arrays.fill(cardArray,aceOfHearts);

        Card.printDeck(Arrays.asList(cardArray), "Ace of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);//Looks a lot like Arrays.fill();

        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts =Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUBS, 'K');
        List<Card> kingsOfClubs =Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);
    }
}