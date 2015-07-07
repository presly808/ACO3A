package week4.day1;

public class Coin implements Comparable<Coin> {
  private int nominal;
  private int coinSize;

  public Coin(int nominal, int coinSize) {
    this.nominal = nominal;
    this.coinSize = coinSize;
  }

  public int getNominal() {
    return nominal;
  }

  public int getCoinSize() {
    return coinSize;
  }

  public int compareTo(Coin coin) {
    if (this.nominal > coin.nominal) {
      return 1;
    } else if (this.nominal < coin.nominal) {
      return -1;
    }
    return 0;
  }

}
