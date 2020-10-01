public class Least {
  public static int least(int num1, int num2) {
    return (num1 < num2) ? num1 : num2;
  }

  public static void main(String[] main) {
    int answer = least(2, 7);
    System.out.println("Least: " + answer);
  }
}
