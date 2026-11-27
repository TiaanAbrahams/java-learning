import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private Card card;
    private List<Card> deck;
    public Deck(){
        this.deck = createDeck();
    }

    public List<Card> createDeck(){
        List<Card> deck = new ArrayList<>(52);
        for(Card.Suit suit: Card.Suit.values()){
            for(int i = 2; i < 11; i++){
                deck.add(Card.getNumericCard(suit,i));
            }
            for(char c : new char[]{'J','Q','K','A'}){
                deck.add(Card.getFaceCard(suit,c));
            }
        }
        return deck;
    }

    public void printDeck(int rows){
        System.out.println("-".repeat(80));
        int cardsInRow = this.deck.size() / rows;

        for(int i = 0; i < rows; i++){
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            this.deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }

    public List<Card> shuffleDeck(){
        Collections.shuffle(deck);
        return deck;
    }

    public void removeCardFromDeck(Card selectedCard){
        if(!deck.isEmpty()){
            deck.remove(selectedCard);
        }else{
            System.out.println("This deck is empty");
        }
    }
}
