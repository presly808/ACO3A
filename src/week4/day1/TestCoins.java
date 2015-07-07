package week4.day1;

import java.util.Comparator;

public class TestCoins {
  public static void main(String[] args) {
    Coin coin1 = new Coin(5, 4);
    Coin coin2 = new Coin(10, 2);

    System.out.println(coin1.compareTo(coin2));

    CoinSizeComparator comparator = new CoinSizeComparator();

    System.out.println(comparator.compare(coin1,coin2));



  }

  public static class CoinSizeComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin coin1, Coin coin2) {
      if (coin1.getCoinSize() > coin2.getCoinSize()) {
        return 1;
      } else if (coin1.getCoinSize() < coin2.getCoinSize()) {
        return -1;
      }
      return 0;
    }
  }

}
