import java.util.ArrayList;
import java.util.Collections;

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
        assert cardsAdded.size() < 11 : "Hand cannot have more than 10 cards.";
        
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
        
        // creating value of sum
        int sum = 0;
        
        for(Card c : cards)
        {
            auxillaryArray.add(c);
        } // end of for-each
        
        while(auxillaryArray.size() != 0)
        {
            sum += combinationChecker(auxillaryArray);
        } // end of while loop
        
        // nwo returning the sum as it is converted into an integer
        return Integer.toString(sum);
        
    } // end of evaluate()
    
    @Override
    public String toString()
    {
        // creating a StringBuilder to achieve same output
        StringBuilder st = new StringBuilder();
        
        for(int i = 0; i < 5; i++)
        {
            st.append(cards.get(i) + "\t");
        } // end of for loop
        
        st.append("\n");
        
        for(int i = 5; i < 10; i++)
        {
            st.append(cards.get(i) + "\t");
        } // end of for loop
        
        return st.toString();
    }
    
    public static int combinationChecker(ArrayList<Card> cards)
    {
        // making a variable out of the first card in the deck to check it against other values
        String faceValue = cards.get(0).getFace().getDisplay();
        
        // and since we have already selected a card, the count will be one
        int count = 1;
        
        // creating an int that will returned as the sum of all the pairs
        int sumPairs = 0;
        
        // first creating a count element to hold the amount of cards thata are in combinations
        // this is done by looking through the array
        for (int i = 1; i < cards.size(); i++)
        {
            if(faceValue.equals(cards.get(i).getFace().getDisplay()))
            {
                count++;                // increases the count by one
                cards.remove(i);        // removes the card so that it is not counted again
            } // end of if
            
        } // end of for loop
        
        // now if the value of the count is 2 or more, we perform the following operations
        if (count == 2)
        {
            sumPairs = cards.get(0).getFace().getPoints() * 4;
            sumPairs *= count;        // because there is that number of cards in the hand
            cards.remove(0);         // card remove so no actions performed on it again
            return sumPairs;
        } // end of if
        else if (count == 3)
        {
            sumPairs = cards.get(0).getFace().getPoints() * 7;
            sumPairs *= count;        // because there is that number of cards in the hand
            cards.remove(0);         // card remove so no actions performed on it again
            return sumPairs;
        } // end of else if
        else if (count == 4)
        {
            sumPairs = cards.get(0).getFace().getPoints() * 10;
            sumPairs *= count;        // because there is that number of cards in the hand
            cards.remove(0);         // card remove so no actions performed on it again
            return sumPairs;
        } // end of else if
        
        // now working in the general case where the sum pair would be 0 since there are no matching cards
        cards.remove(0);         // card remove so no actions performed on it again
        return sumPairs;
        
    } // end of combinationChecker()
    
} // end of class