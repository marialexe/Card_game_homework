import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {
  Card card1;
  Card card2;

  @Before
  public void before(){
    card1 = new Card(Rank.JACK,Suit.HEARTS);
    card2 = new Card(Rank.TWO,Suit.CLUBS);
  }

  @Test
  public void canGetRank(){
    assertEquals("Jack", card1.getRank());
  }

  @Test
  public void canGetSuit(){
    assertEquals("Hearts",card1.getSuit());
  }

  @Test 
  public void canCheckRank() {
    assertEquals("Two", card2.getRank());
  }

  @Test 
  public void canCheckSuit() {
    assertEquals("Clubs", card2.getSuit());
  }

  @Test
  public void canGetValue() {
    assertEquals(2,card2.getValue().longValue());
  }

  @Test
  public void canCheckValue() {
    assertEquals(11,card1.getValue().longValue());
  }


}