import java.util.*;

public class Card {

  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.suit = suit;
    this.rank = rank;
  }

  public Rank getRank(){
    return this.rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

}