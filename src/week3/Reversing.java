import java.util.Scanner;

public class Reversing {
  public static String reverse(String text) {
    String newText = "";
    for (int i = text.length() - 1; i >= 0; i--) newText += text.charAt(i);
    return newText;
  }

  public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type in your text: ");
    String text = reader.nextLine();
    System.out.println("In reverse order: " + reverse(text));
  }
}
