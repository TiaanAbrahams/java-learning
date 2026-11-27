import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerGame {
    private List<Card> river;
    private List<Card> activeDeck;
    private Player player;
    private Deck deck;
    private Card card;



    public PokerGame(){
        this.river = new ArrayList<>();
        this.deck = new Deck();
        this.activeDeck = createDeck();
    }

    public List<Card> createDeck(){
        return deck.shuffleDeck();
    }

    public void dealRiver(){
        for(int i = 0; i < 7; i++){
            if(i == 3 ||i == 5){
                continue;

            }else {
                river.add(activeDeck.get(i));
                System.out.println(activeDeck.get(i));

            }

        }
    }
}
