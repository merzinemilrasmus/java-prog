public class Average {
  public static double average(double num1, double num2, double num3, double num4) {
    return (num1 + num2 + num3 + num4) /4;
  }

  public static void main(String[] main) {
    double answer = average(4, 3, 6, 1);
    System.out.println("Average: " + answer);
  }
}
