import java.util.Scanner;

public class Password {
  private static String password = "carrot";
  private static String secret = "jryy qbar";

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    while (true) {
      System.out.print("Type the password: ");
      if (reader.nextLine().equals(Password.password)) {
        System.out.println("Right!\nThe secret is: " + Password.secret);
        break;
      } else System.out.println("Wrong!");
    }
  }
}
