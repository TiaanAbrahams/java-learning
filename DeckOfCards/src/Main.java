import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Card card = new Card(Card.Suit.SPADES, "Jack",11);

        List<Card> deck = Card.standardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];

        Card aceOfHearts =Card.getFaceCard(Card.Suit.HEARTS, 'A');
        Arrays.fill(cardArray,aceOfHearts);

        Card.printDeck(Arrays.asList(cardArray), "Ace of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);//Looks a lot like Arrays.fill();

        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts); //new list
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUBS, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs); //new list
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collections with Aces added", 2);

        Collections.copy(cards,kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards,"List of copy Kings", 1);

        List<Card> deck2 = Card.standardDeck();

        Card.printDeck(deck2);
        Collections.shuffle(deck2);
        Card.printDeck(deck2, "Shuffeled Deck", 4);

        Collections.reverse(deck2);
        Card.printDeck(deck2, "Reversed Deck", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);

        Collections.sort(deck2, sortingAlgorithm);
        Card.printDeck(deck2, "Sorted Deck", 13);

        Collections.reverse(deck2);
        Card.printDeck(deck2, "Sorted by rank, suit reversed", 13);

        List<Card> kings = new ArrayList<>(deck2.subList(4, 8));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck2.subList(16, 20));
        Card.printDeck(tens, "Tens in deck", 1);


        int subListIndex = Collections.indexOfSubList(deck2,tens);
        System.out.println("Sublist index of tens " + subListIndex);
        System.out.println("Contains = " + deck2.containsAll(tens));

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("Kings & tens disjoint = " + disjoint2);

        Collections.sort(deck2, sortingAlgorithm);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEARTS,10);
        int foundIndex = Collections.binarySearch(deck2, tenOfHearts, sortingAlgorithm);
        System.out.println("Found index = " + foundIndex);
        System.out.println(deck2.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUBS, 10);
        Collections.replaceAll(deck2, tenOfHearts, tenOfClubs);
        Card.printDeck(deck2.subList(32, 36), "Tens row", 1);
    }
}