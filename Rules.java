import java.util.*;

public class Rules {
  private Card card;
  private int value;
  private int point;

  public Rules(){
    this.card = card;
    this.value = card.getValue();
    this.point = card.getPoint();
  }

// Needed to switch the value of the Ace between 1 and 11.
  // public Card setValue(int otherValue) {
  //   card.value = otherValue;
  //   return this.card;
  //   }

  // public Card setPoint() {
  //   if (getValue()<11) {
  //     card.point = card.value;
  //   } else {
  //     card.point = 10;
  //   }
  //   return this.card;
  // }
}