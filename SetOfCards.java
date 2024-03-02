/********************************************
 * @author Ekamjot Singh
 * ID: #3167888
 * 
 * Description: SetOfCards is the class that is responsible for creating set of cards
 *          This class is superclass for Deck and Hand Class
 * 
 ********************************************/

import java.util.ArrayList;

public abstract class SetOfCards
{
    // creating required variables
    protected ArrayList<Card> cards;
    protected int max;
    
    // CONSTRUCTOSRS
    public SetOfCards()
    {
        cards = new ArrayList<>();
        
    } // end of no-arg constructor
    
    public SetOfCards(ArrayList<Card> cards)
    {
        this.cards= cards;
    } // end of full-arg constructor
    
    // GETTERS
    public ArrayList<Card> getCards()
    {
        return this.cards;
    } // end of getCards()
    
    // SETTERS
    public void setCards(ArrayList<Card> cards)
    {
        this.cards = cards;
    } // end of setCards()
    
    // UTILITY METHODS
    public void addCard(Card card)
    {
        assert cards.size() > 52 : "You have reached the maximum amount, cannot add more cards in the set.";
        
        cards.add(card);
        
        // if (cards.size() > 52 )
        // {
            // System.out.println("You have reached the maximum amount of cards");
        // } // end of if
        // else
        // {
            // cards.add(card);
        // } // end of else
        
    } // end of addCard()
    
    public abstract String evaluate();
    
    @Override
    public String toString()
    {
        // initializing a StringBuilder
        StringBuilder st = new StringBuilder();
        
        st.append("[");
        
        // using a for loop to get all the values
        for (int i = 0; i < cards.size(); i++)
        {
            st.append(cards.get(i) + " ");
        } // end of for loop
        
        st.append("]");
        
        return st.toString();
    } // end of toString()
    
} // end of class