import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {
  Player player1;
  Player player2;

  @Before
  public void before() {
    player1 = new Player("Phillip");
    player2 = new Player("Andrew");
  }

  @Test
  public void canGetName() {
    assertEquals ("Andrew",player2.getName());
  }
}