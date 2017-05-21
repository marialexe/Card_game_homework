import static org.junit.Assert.*;
import org.junit.*;

public class CardDeckTest {
  CardDeck cardsdeck;

  @Before
  public void before() {
    cardsdeck = new CardDeck();
  }

  @Test 
  public void canGetSize() {
    // cardsdeck.getDeck();
    assertEquals(52,cardsdeck.getDeckSize());
  }

  @Test
  public void canRemoveCard(){
    cardsdeck.removeCard();
    assertEquals(51,cardsdeck.getDeckSize());
  }
}