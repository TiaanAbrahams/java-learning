import java.sql.SQLOutput;
import java.util.Scanner;

/*
* Poker
* Deck needs to be shuffled before each game
* Deal cards
* -Deals 2 cards to each player
* -3 Cards are displayed in the river
* -Players could opt out or stay in the game
* -another card is displayed on the river
* -Players could opt out or stay in the game
* -Last card displayed on the river
* -One player wins the game
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        boolean whileLoopValue = true;



        while (whileLoopValue){
            System.out.println("Please enter Start to Start a game or Exit to Exit the game");
            String value = scanner.next();
            value = value.toUpperCase();

            switch (value){
                case "EXIT" -> {
                    whileLoopValue = false;
                    System.out.println("Exiting the game!");
                    break;
                }
                case "START" ->{
                    PokerGame newGame = new PokerGame();
                    newGame.dealRiver();
                    break;
                }
            }
        }

    }


}