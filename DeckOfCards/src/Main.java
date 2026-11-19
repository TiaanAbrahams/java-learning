import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Card card = new Card(Card.Suit.SPADES, "Jack",11);

        System.out.println("JQKA".indexOf("Q"));

        List<Card> deck = Card.standardDeck();

        Card.printDeck(deck);
    }
}