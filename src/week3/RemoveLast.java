import java.util.ArrayList;

public class RemoveLast {
  public static void removeLast(ArrayList<String> list) {
    list.remove(list.size() - 1);
  }

  public static void main(String[] args) {
    ArrayList<String> brothers = new ArrayList<String>();
    brothers.add("Dick");
    brothers.add("Henry");
    brothers.add("Michael");
    brothers.add("Bob");

    System.out.println("brothers:");
    System.out.println(brothers);

    removeLast(brothers);

    System.out.println(brothers);
  }
}
