// import statements
import java.util.Collections;
import java.util.ArrayList;

public class Fisbin
{
    public static void main(String[] args)
    {
        // creating an instance of deck that is to be used on later
        Deck deck = new Deck();
        //System.out.println(deck);
        
        // shuffling the deck to change the index positions of teh cards
        Collections.shuffle(deck.getCards());
        //System.out.println(deck);
        
        // creating four players that will play the game, thus four instances of hand
        Hand playerOne = new Hand(deckCreator(deck));
        Hand playerTwo = new Hand(deckCreator(deck));
        Hand playerThree = new Hand(deckCreator(deck));
        Hand playerFour = new Hand(deckCreator(deck));
        
        // printing the players
        System.out.println("Player 1:");
        System.out.println(playerOne);
        System.out.println("\nScore: " + playerOne.evaluate());
        
        
        
        // now creating a new arrayList of cards that will be added to the deck, this is done using a static method
        
    } // end of main
    
    public static ArrayList<Card> deckCreator(Deck deck)
    {
        // creating an ArrayList for hand which
        ArrayList<Card> hand = new ArrayList<>();
        
        // using a for loop to add cards to the deck
        for (int i = 0; i < 10; i++)
        {
            hand.add(deck.deal());
        } // end of for loop
        
        // returning the deck to main
        return hand;
        
    }
    
} // end of class