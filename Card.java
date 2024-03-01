public class Card
{
  // creating variables to be used
  private Face face;
  private Suit suit;

  /***************************************
   * 
   * Description - Constructor for Card
   * 
   * @param face - takes the value of face form the Enum
   * @param suit - takes value of suit from the Enum
   * 
   ***************************************/
  public Card(Suit suit, Face face)
  {
    this.suit = suit;
    this.face = face;
  } // end of full-arg construtor

  // GETTERS
  public Face getFace()
  {
    return this.face;
  } // end of getFace()

  public Suit getSuit()
  {
    return this.suit;
  } // end of getSuit()

  // SETTERS
  public void setFace(Face face)
  {
    this.face = face;
  } // end of setFace()

  public void setSuit(Suit suit)
  {
    this.suit = suit;
  } // end of setSuit()

  // UTILITY METHODS
  @Override
  public String toString()
  {
    return this.face.getDisplay() + this.suit.getUnicode();
  } // end of toString()
  
} // end of class