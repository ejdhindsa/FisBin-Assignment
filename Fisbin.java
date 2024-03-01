// import statements
import java.util.Collections;

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
        
    } // end of main
    
} // end of class