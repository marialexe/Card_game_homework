import java.util.*;

public class CardDeck {

  private ArrayList<Card> cardsdeck;
  
  public CardDeck() {
    this.cardsdeck = new ArrayList<Card>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suit);
        cardsdeck.add(card);
      }
    }
    Collections.shuffle(cardsdeck);
  }

  public ArrayList<Card> getDeck() {
    // System.out.println(cardsdeck);
    return this.cardsdeck;
  }

  public int getDeckSize(){
    return this.getDeck().size();
  }

  public Card removeCard() {
    if (getDeckSize()>0) {
      return this.cardsdeck.remove(0);
    } else {
      return null;
    }
  }

  public void shuffleDeck() {
    Collections.shuffle(cardsdeck);
  }

}