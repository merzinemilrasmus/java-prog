import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
  public static boolean palindrome(String text) {
    boolean res = true;
    int len = text.length();
    for (int i = 0; i < len / 2; i++) {
      if (text.charAt(i) != text.charAt(len - 1 - i)) {
        res = false;
        break;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a text: ");
    String text = reader.nextLine();
    if (palindrome(text)) System.out.println("The text is a palindrome!");
    else System.out.println("The text is not a palindrome!");
  }
}
