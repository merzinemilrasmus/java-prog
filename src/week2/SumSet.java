import java.util.Scanner;

public class SumSet {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Until what? ");
    int n = Integer.parseInt(reader.nextLine());
    int sum = 0;
    for (int i = 1; i <= n; i++) sum += i;
    System.out.println("Sum is " + sum);
  }
}
