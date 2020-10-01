import java.util.ArrayList;

public class Greatest {
  public static int greatest(ArrayList<Integer> list) {
    int max = list.get(0);
    for (int i = 1; i < list.size(); i++)
      max = (list.get(i) > max) ? list.get(i) : max;
    return max;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The greatest number is: " + greatest(list));
  }
}
