import java.util.EnumMap;
import java.util.Set;
import java.util.Collection;

public class RankEnumMap {
    
    public enum Rank {
      ONE,
      TWO,
      THREE,
      FOUR,
      FIVE,
      SIX,
      SEVEN,
      EIGHT,
      NINE,
      TEN,
      JACK,
      QUEEN,
      KING,
      ACE
    }

  public static void main (String[] args) {
    EnumMap<Rank,Integer> cardrank = new EnumMap<>(Rank.class);
    cardrank.put(Rank.ONE,1);
    cardrank.put(Rank.TWO,2);
    cardrank.put(Rank.THREE,3);
    cardrank.put(Rank.FOUR,4);
    cardrank.put(Rank.FIVE,5);
    cardrank.put(Rank.SIX,6);
    cardrank.put(Rank.SEVEN,7);
    cardrank.put(Rank.EIGHT,8);
    cardrank.put(Rank.NINE,9);
    cardrank.put(Rank.TEN,10);
    cardrank.put(Rank.ACE,11);
    cardrank.put(Rank.JACK,12);
    cardrank.put(Rank.QUEEN,13);
    cardrank.put(Rank.KING,14);

    System.out.println(cardrank);
  }

}