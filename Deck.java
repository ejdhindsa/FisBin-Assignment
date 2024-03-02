// importing values
import java.util.ArrayList;
import java.util.Collections;

public class Deck extends SetOfCards
{
    // FIELDS
    ArrayList<Card> cards;
    
    // CONSTRUCTOR
    public Deck()
    {
        max = 52;
        createCards();
        
    } // end of Deck()
    
    // GETTER
    public ArrayList<Card> getCards()
    {
        return this.cards;
    } // end of getCards()
    
    // UTILITY METHODS
    public void createCards()
    {
        // decalring the ArrayList
        cards = new ArrayList<>();
        
        // creating arrays of the Enum values so that they can be added to the deck
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();
        
        // Variables that are responsible for running the loop
        // Usage of size() in the arraylist was not working, therefore this implementation
        // This also ensures there are only 52 Cards in the Deck: 4 x 13 = 52
        final int MAX_SUITS = 4;         // Since max suits are 4
        final int MAX_FACES = 13;        // Since max faces are 13
        
        // using nested for loop to add in the value of cards to the Cards ArrayList
        for (int i = 0; i < MAX_SUITS; i++)
        {
            for (int j = 0; j < MAX_FACES; j++)
            {
                cards.add(new Card(suits[i], faces[j]));
                
            } // end of inner for loopx
            
        } // end of outer for loop
        
    } // end of createCards()
    
    public void shuffle(ArrayList<Card> cards)
    {
        Collections.shuffle(this.cards);
    } // end of shuffle()
    
    public Card deal()
    {
        Card removedCard = cards.remove(0);
        
        return removedCard;
    } // end of deal()
    
    public String evaluate()
    {
        return Integer.toString(cards.size());
    } // end of evaluate()
    
    @Override
    public String toString()
    {
        // creating a StringBuilder
        StringBuilder st = new StringBuilder();
        
        for(int i = 0; i < cards.size(); i++)
        {
            st.append(cards.get(i) + ", ");
        } // end of for loop
        
        return st.toString();
    } // end of toString()
    
} // end of class