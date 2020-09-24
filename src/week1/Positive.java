import java.util.Scanner;

public class Positive {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a nuber: ");
    double num = Double.parseDouble(reader.nextLine());
    if (num > 0) System.out.println("The number is positive.");
    else System.out.println("The number is not positive.");
  }
}
