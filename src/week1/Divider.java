import java.util.Scanner;

public class Divider {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a number: ");
    int toBeDivided = Integer.parseInt(reader.nextLine());
    System.out.print("Type another number: ");
    int divider = Integer.parseInt(reader.nextLine());
    System.out.println("Division: " + toBeDivided + " / " + divider + " = " + ((double)toBeDivided / divider));
  }
}
