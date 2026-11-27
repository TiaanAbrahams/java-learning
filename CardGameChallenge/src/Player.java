import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private boolean result;

    public Player(String name){
        this.name = name;
    }

    public void addCardToHand(Card card){
        if(hand.size() < 3){
            hand.add(card);
        }else {
            System.out.println("Player already has 2 cards");
        }
    }
}
