import java.util.ArrayList;

public class Average {
  public static int sum(ArrayList<Integer> list) {
    int res = 0;
    for (int i : list) res += i;
    return res;
  }

  public static double average(ArrayList<Integer> list) {
    return (double)sum(list) / list.size();
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The average is: " + average(list));
  }
}
