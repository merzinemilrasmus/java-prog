import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    NumberStatistics stats = new NumberStatistics();
    System.out.println("Type numbers:");

    while (true) {
      int num = Integer.parseInt(reader.nextLine());
      if (num == -1) break;
      stats.addNumber(num);
    }

    System.out.println("\033[2maverage: " + stats.average() + "\033[m");
    System.out.println("sum: " + stats.sum());
    System.out.println("sum of even: " + stats.sumEven());
    System.out.println("sum of odd: " + stats.sumOdd());
  }
}

class NumberStatistics {
  private int amountOfNumbers = 0;
  private int sum = 0;
  private int sumEven = 0;
  private int sumOdd = 0;

  public void addNumber(int number) {
    this.sum += number;
    this.amountOfNumbers++;
    if (number % 2 == 0) this.sumEven += number;
    else this.sumOdd += number;
  }

  public int amountOfNumbers() {
    return this.amountOfNumbers;
  }

  public int sum() {
    return this.sum;
  }

  public int sumEven() {
    return this.sumEven;
  }

  public int sumOdd() {
    return this.sumOdd;
  }

  public double average() {
    return (double)this.sum / this.amountOfNumbers;
  }
}
