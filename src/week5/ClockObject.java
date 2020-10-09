public class ClockObject {
  public static void main(String[] args) {
    Clock clock = new Clock(23, 59, 50);

    int i = 0;
    while( i < 20) {
      System.out.println( clock );
      clock.tick();
      i++;
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

class Clock {
  private BoundedCounter seconds = new BoundedCounter(59);
  private BoundedCounter minutes = new BoundedCounter(59);
  private BoundedCounter hours = new BoundedCounter(23);

  public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
    hours.setValue(hoursAtBeginning);
    minutes.setValue(minutesAtBeginning);
    seconds.setValue(secondsAtBeginning);
  }

  public void tick() {
    seconds.next();
    if (seconds.getValue() == 0) {
      minutes.next();
      if (minutes.getValue() == 0) hours.next();
    }
  }

  public String toString() {
    return hours + ":" + minutes + ":" + seconds;
  }
}
