import java.util.*;

public class Hand { 
  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }
  public ArrayList<Card> getCards() {
      return this.hand;
    }

  public void add(Card card) {
    hand.add(card);
  }

  public int handTotal() {
    int value = 0;
    for (Card card : hand) {
      value += card.getValue();
    }
    return value;
  }

  public boolean isBust() {
    return this.handTotal() > 21;
  }

  public void changeAceValues() {
    for (Card card : hand) {
      if (card.getValue() == 1) {
        card.setValue(11);
      }
    }
  }
}