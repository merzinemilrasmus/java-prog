import java.util.Scanner;

public class UpTo {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Up to what number? ");
    double in = Double.parseDouble(reader.nextLine());
    for (int i = 1; i <= in; i++) System.out.println(i);
  }
}
