import java.util.*;

public class Card {

  private Rank rank;
  private Suit suit;
  private int value;
  private int point;

  public Card(Rank rank, Suit suit) {
    this.suit = suit;
    this.rank = rank;
    this.value = rank.getValue();
    this.point = 0;
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

  public Integer getPoint(){
    return this.point;
  }

// Needed to switch the value of the Ace between 1 and 11.
  public void setValue(int otherValue) {
      this.value = otherValue;
    }

  public int setPoint() {
    if (getValue()<11) {
      this.point = this.value;
    } else {
      this.point = 10;
    }
    return this.point;
  }

}