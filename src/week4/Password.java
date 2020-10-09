import java.util.Random;

public class Password {
  public static void main(String[] args) {
    PasswordRandomizer randomizer = new PasswordRandomizer(13);
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
    System.out.println("Password: " + randomizer.createPassword());
  }
}

class PasswordRandomizer {
  private int length;
  private String symbols = "abcdefghijklmnopqrstuvwxyz";
  private Random rand = new Random();

  public PasswordRandomizer(int length) {
    this.length = length;
  }

  public String createPassword() {
    String result = "";
    for (int i = 0; i < symbols.length(); i++) {
      result += symbols.charAt(this.rand.nextInt(symbols.length()));
    }
    return result;
  }
}
