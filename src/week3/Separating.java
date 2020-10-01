import java.util.Scanner;

public class Separating {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    String name = reader.nextLine();

    int amount = 3;
    if (name.length() >= amount) {
      for (int i = 0; i < amount; i++) {
        System.out.println((i + 1) + ". character: " + name.charAt(i));
      }
    }
  }
}
