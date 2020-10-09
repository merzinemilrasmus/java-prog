public class OverloadedCounter {
  public static void main(String[] args) {
    Counter counter = new Counter();
    System.out.println(counter.value());
    counter.increase();
    System.out.println(counter.value());
    counter.increase(5);
    System.out.println(counter.value());
    counter.decrease();
    System.out.println(counter.value());
    counter.decrease(8);
    System.out.println(counter.value());
  }
}

class Counter {
  int value = 0;
  boolean check = false;

  public Counter() {}

  public Counter(int startingValue, boolean check) {
    value = startingValue;
    this.check = check;
  }

  public Counter(int startingValue) {
    value = startingValue;
  }

  public Counter(boolean check) {
    this.check = check;
  }

  public int value() {
    return value;
  }

  public void increase() {
    value++;
  }

  public void decrease() {
    if (!check || value > 0) value--;
  }

  public void increase(int amount) {
    if (amount < 0) return;
    value += amount;
  }

  public void decrease(int amount) {
    if (amount < 0) return;
    if (!check || value >= amount) value -= amount;
    else value = 0;
  }
}
