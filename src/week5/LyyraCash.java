public class LyyraCash {
  public static void main(String[] args) {
    CashRegister unicafeExactum = new CashRegister();
    System.out.println( unicafeExactum );

    LyyraCard cardOfJim = new LyyraCard(2);

    System.out.println("the card balance " + cardOfJim.balance() + " euros");

    boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded);

    unicafeExactum.loadMoneyToCard(cardOfJim, 100);

    succeeded = unicafeExactum.payGourmet(cardOfJim);
    System.out.println("payment success: " + succeeded);

    System.out.println("the card balance " + cardOfJim.balance() + " euros");

    System.out.println( unicafeExactum );
  }
}

class LyyraCard {
  private double balance;

  public LyyraCard(double balance) {
    this.balance = balance;
  }

  public double balance() {
    return balance;
  }

  public void loadMoney(double amount) {
    if (amount > 0) balance += amount;
  }

  public boolean pay(double amount){
    if (balance < amount) return false;
    else balance -= amount;
    return true;
  }
}

class CashRegister {
  private double cashInRegister = 1000;
  private int economicalSold;
  private int gourmetSold;

  public double payCash(double cashGiven, double price) {
    if (cashGiven < price) return cashGiven;
    else {
      cashInRegister += price;
      return cashGiven - price;
    }
  }

  public double payEconomical(double cashGiven) {
    double cashBack = payCash(cashGiven, 2.5);
    if (cashBack != cashGiven) economicalSold++;
    return cashBack;
  }

  public double payGourmet(double cashGiven) {
    double cashBack = payCash(cashGiven, 4);
    if (cashBack != cashGiven) gourmetSold++;
    return cashBack;
  }

  public boolean payEconomical(LyyraCard card) {
    boolean paid = card.pay(4);
    if (paid) economicalSold++;
    return paid;
  }

  public boolean payGourmet(LyyraCard card) {
    boolean paid = card.pay(4);
    if (paid) gourmetSold++;
    return paid;
  }

  public void loadMoneyToCard(LyyraCard card, double sum) {
    if (sum > 0) {
      cashInRegister += sum;
      card.loadMoney(sum);
    }
  }

  public String toString() {
    return "money in register " + cashInRegister + "\neconomical lunches sold: " + economicalSold + "\ngourmet lunches sold: " + gourmetSold;
  }
}
