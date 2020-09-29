import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    double avg = 0;
    int even = 0;
    int odd = 0;

    System.out.println("Type numbers:");
    while (true) {
      int i = Integer.parseInt(reader.nextLine());
      if (i == -1) break;

      if (count == 0) avg = i;
      else avg = (i + (avg * count)) / (count + 1);

      if (i % 2 == 0) even++;
      else odd++;

      sum += i;
      count += 1;
    }
    System.out.println("Thank you and see you later!");

    System.out.println("The sum is " + sum);
    System.out.println("How many numbers: " + count);
    System.out.println("Average: " + avg);
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
  }
}
