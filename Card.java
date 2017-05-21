import java.util.*;

public class Card {

  private Rank rank;
  private Suit suit;
  private int value;

  public Card(Rank rank, Suit suit) {
    this.suit = suit;
    this.rank = rank;
    this.value = rank.getValue();
  }

  public String getRank(){
    return this.rank.getName();
  }

  public String getSuit(){
    return this.suit.getName();
  }

  public Integer getValue(){
   return this.value;
  }

}