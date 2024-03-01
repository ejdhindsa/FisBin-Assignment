import java.util.ArrayList;

public class Hand extends SetOfCards
{
    ArrayList<Card> cards;
    
    public Hand()
    {
        max = 10;
    } // end of no-arg constructor
    
    public Hand(ArrayList<Card> cardsAdded)
    {
        max = 10;
        
        // creating cards arraylist and checking for size
        assert cardsAdded.size() > 10 : "Hand cannot have more than 10 cards.";
        
        this.cards = cardsAdded;
    } // end of full-arg constructor
    
    // UTILITY Methods
    public String evaluate()
    {
        // variables
        int count = 0;
        
        // since 
        // First doing calculations for four for a kind, this can be done using a for loop
        for(int i = 0; i < cards.size(); i++)
        {
            
        }
        
        return "Check";
    } // end of evaluate()
    
} // end of class