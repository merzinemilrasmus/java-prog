public class Lyyra {
  public static void main(String[] args) {
    LyyraCard cardPekka = new LyyraCard(20);
    LyyraCard cardBrian = new LyyraCard(30);

    cardPekka.payGourmet();
    cardBrian.payEconomical();

    System.out.println("Pekka: " + cardPekka);
    System.out.println("Brian: " + cardBrian);

    cardPekka.loadMoney(20);
    cardBrian.payGourmet();

    System.out.println("Pekka: " + cardPekka);
    System.out.println("Brian: " + cardBrian);

    cardPekka.payEconomical();
    cardPekka.payEconomical();
    cardBrian.loadMoney(50);

    System.out.println("Pekka: " + cardPekka);
    System.out.println("Brian: " + cardBrian);
  }
}

class LyyraCard {
  private double balance;

  public LyyraCard(double balanceAtStart) {
    this.balance = balanceAtStart;
  }

  public String toString() {
    return "The card has " + balance + " euros";
  }

  private void pay(double cost) {
    if (this.balance >= cost) this.balance -= cost;
  }

  public void payEconomical() {
    this.pay(2.5);
  }

  public void payGourmet() {
    this.pay(4);
  }

  public void loadMoney(double amount) {
    if (amount > 0) this.balance = Math.min(this.balance + amount, 150);
  }
}
