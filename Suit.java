/********************************************
 * @author Ekamjot Singh
 * ID: #3167888
 * 
 * Description: Enum class that sets the value of Suits in the set of cards
 * 
 ********************************************/

public enum Suit
{
  // creating enum values
  CLUBS("Clubs", "\u2663"),
  SPADES("Spades", "\u2660"),
  HEARTS("Hearts", "\u2665"),
  DIAMONDS("Diamonds", "\u2666");

  // creating variables the enum
  private String display;
  private String unicode;

  /***************************************
   * 
   * Description - Constructor for Suit Enum
   * 
   * @param display - shows the unicode value of suit of a card
   * 
   ***************************************/
  private Suit(String display, String unicode)
  {
    this.display = display;
    this.unicode = unicode;
  } // end of full-arg constructor
  
  // GETTERS
  public String getDisplay()
  {
      return this.display;
  } // end of getDisplay
  
  public String getUnicode()
  {
      return this.unicode;
  } // end of getDisplay

} // end of enum