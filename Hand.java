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
    
    /*
     * evaluate() will have multiple static methods
     * combinationChecker() will check if there are any combinations and return number of combinations for each
     *      face as well as the points that are to be awarded, this is done through returning an array of numbers
     */
    public String evaluate()
    {
        // copying the said arraylist and adding it to the new one
        ArrayList auxillaryArray = new ArrayList();
        
        for(Card c : cards)
        {
            auxillaryArray.add(c);
        } // end of for-each
        
        
        
        
        return "Check";
    } // end of evaluate()
    
} // end of class