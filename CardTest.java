import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {
  Card card;

  @Before
  public void before(){
    card = new Card(Rank.JACK,Suit.HEARTS);
  }

  @Test
  public void canGetRank(){
    assertEquals(Rank.JACK, card.getRank());
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.HEARTS,card.getSuit());
  }

}