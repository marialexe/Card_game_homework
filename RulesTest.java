import static org.junit.Assert.*;
import org.junit.*;

public class RulesTest{
  Card card1;
  Card card2;
  Card card3;

  @Before
  public void before(){
    card1 = new Card(Rank.JACK,Suit.HEARTS);
    card2 = new Card(Rank.TWO,Suit.CLUBS);
    card3 = new Card(Rank.ACE,Suit.SPADES);
  }
}

// @Test
// public void canSetValue(){
//   card3.setValue(11);
//   assertEquals(11,card3.getValue().longValue());
// }

// @Test
// public void cansetPoint(){
//   assertEquals(10,card1.setPoint());
// }