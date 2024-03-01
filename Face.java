/********************************************
 * @author Ekamjot Singh
 * ID: #3167888
 * 
 * Description: Enum class that sets the value of Faces in the set of cards
 * 
 ********************************************/

public enum Face
{
  // creating enum values
  ACE("A", 1),
  TWO ("2", 2),
  THREE("3",  3),
  FOUR("4", 4),
  FIVE("5", 5),
  SIX("6", 6),
  SEVEN("7", 7),
  EIGHT("8", 8),
  NINE("9", 9),
  TEN("10", 10),
  JACK("J", 10),
  QUEEN("Q", 10),
  KING("K", 12);

  // creating enum variables
  private String display;
  private int points;
  
  /***************************************
   * 
   * Description - Constructor for Face Enum
   * 
   * @param display - shows the friendly/dislpay value of the card
   * @param points - shows points that each card has
   * 
   ***************************************/
  private Face(String display, int points)
  {
      this.display = display;
      this.points = points;
  } // end of full-arg constructor
  
  // Getters
  public String getDisplay()
  {
      return this.display;
  } // end of getDisplay
  
  public int getPoints()
  {
      return this.points;
  } // end of getPoints()
  
}