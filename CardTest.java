import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {
  Card card1;
  Card card2;
  Card card3;

  @Before
  public void before(){
    card1 = new Card(Rank.JACK,Suit.HEARTS);
    card2 = new Card(Rank.TWO,Suit.CLUBS);
    card3 = new Card(Rank.ACE,Suit.SPADES);
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

  @Test
  public void canSetValue(){
    card3.setValue(11);
    assertEquals(11,card3.getValue().longValue());
  }

  @Test
  public void canGetInitPoint(){
    assertEquals(0,card3.getPoint().longValue());
  }

  @Test
  public void setPoint(){
    assertEquals(10,card1.setPoint());
  }

  @Test
  public void canGetUpdPoint(){
    card2.setPoint();
    assertEquals(2,card2.getPoint().longValue());
    card1.setPoint();
    assertEquals(10,card1.getPoint().longValue());

  }

}