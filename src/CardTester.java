/**
 * This is a class that tests the Card class.
 */
public class CardTester {
  
  /**
   * The main method in this class checks the Card operations for consistency.
   * @param args is not used.
   */
  public static void main(String[] args) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    Card a=new Card("5","clubs",5);
    Card b=new Card("ace","spades",1);
    Card c=new Card("king","hearts",13);
    System.out.println(a.rank());
    System.out.println(b.suit());
    System.out.println(c.pointValue());
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(c.toString());
  }
}
