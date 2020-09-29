public class Drawing {
  public static void printStars(int amount) {
    for (int i = 0; i < amount; i++) System.out.print("*");
    System.out.println();
  }

  public static void printSquare(int size) {
    for (int l = 0; l < size; l++) {
      for (int i = 0; i < size; i++) System.out.print("*");
      System.out.println();
    }
  }

  public static void printRectangle(int width, int height) {
    for (int l = 0; l < height; l++) {
      for (int i = 0; i < width; i++) System.out.print("*");
      System.out.println();
    }
  }

  public static void printTriangle(int size) {
    for (int l = 0; l < size; l++) {
      for (int i = 0; i <= l; i++) System.out.print("*");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printStars(10);
    System.out.println();
    printSquare(4);
    System.out.println();
    printRectangle(17, 3);
    System.out.println();
    printTriangle(5);
  }
}
