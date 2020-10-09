import java.util.Scanner;

public class Clock {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    BoundedCounter seconds = new BoundedCounter(59);
    BoundedCounter minutes = new BoundedCounter(59);
    BoundedCounter hours = new BoundedCounter(23);

    System.out.print("seconds: ");
    int s = Integer.parseInt(reader.nextLine());
    System.out.print("minutes: ");
    int m = Integer.parseInt(reader.nextLine());
    System.out.print("hours: ");
    int h = Integer.parseInt(reader.nextLine());

    seconds.setValue(s);
    minutes.setValue(m);
    hours.setValue(h);

    for (int i = 0; i < 121; i++) {
      System.out.println(hours + ":" + minutes + ":" + seconds);
      seconds.next();
      if (seconds.getValue() == 0) {
        minutes.next();
        if (minutes.getValue() == 0) hours.next();
      }
    }
  }
}

class BoundedCounter {
  private int value = 0;
  private int upperLimit;

  public BoundedCounter(int upperLimit) {
    this.upperLimit = upperLimit;
  }

  public void next() {
    this.value++;
    this.value %= this.upperLimit +1;
  }

  public String toString() {
    return String.format("%1$2s", this.value).replace(' ', '0');
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int num) {
    this.value = num;
  }
}
