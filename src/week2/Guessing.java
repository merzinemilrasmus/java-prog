import java.util.Scanner;

public class Guessing {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int answer = (int)Math.round(Math.random() * 100);
    int count = 0;
    while (true) {
      System.out.print("Guess a number: ");
      int guess = Integer.parseInt(reader.nextLine());
      if (guess == answer) {
        System.out.println("Congratulations, your guess is correct!");
        break;
      } else {
        count++;
        if (answer > guess) System.out.println("The number is greater, guesses made: " + count);
        else System.out.println("The number is lesser, guesses made: " + count);
      }
    }
  }
}
