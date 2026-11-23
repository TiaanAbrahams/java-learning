import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Card(Suit suit, String face, int rank) {
    public enum Suit{
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS;

        public char getImage(){
            return (new char[] {9829, 9830, 9824, 9827})[this.ordinal()];
        }
    }

    @Override
    public String toString() {
        int index = face.equals("10")? 2 : 1;
        String faceSubstring = face.substring(0, index);
        return "%s%c(%d)".formatted(faceSubstring, suit.getImage(), rank);
    }

    public static Card getNumericCard(Suit suit, int cardNumber){
        if(cardNumber > 1 && cardNumber < 11){
            return new Card(suit, String.valueOf(cardNumber), cardNumber -2);
        }
        System.out.println("Invalid Card number selected");
        return null;
    }

    public static Card getFaceCard(Suit suit, char abbrev){
        int charIndex = "JQKA".indexOf(abbrev);
        if(charIndex > -1){
            return new Card(suit, "" + abbrev, charIndex + 9);
        }
        System.out.println("Invalid Face Card Was Passed");
        return null;
    }

    public static List<Card> standardDeck(){
        List<Card> deck = new ArrayList<>(52);
        for(Suit suit: Suit.values()){
            for(int i = 2; i < 11; i++){
                deck.add(getNumericCard(suit,i));
            }
            for(char c : new char[]{'J','Q','K','A'}){
                deck.add(getFaceCard(suit,c));
            }
        }
        return deck;
    }

    public static void printDeck(List<Card> deck, String description, int rows){
        System.out.println("-".repeat(80));
        if(description != null){
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;

        for(int i = 0; i < rows; i++){
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }

    public static void printDeck(List<Card> deck){
        printDeck(deck, "Current Deck", 4);
    }

}
