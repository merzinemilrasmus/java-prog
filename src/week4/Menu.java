import java.util.ArrayList;

public class Menu {
  private ArrayList<String> meals = new ArrayList<String>();

  public void addMeal(String meal) {
    this.meals.add(meal);
  }

  public void printMeals() {
    System.out.println(String.join("\n", this.meals));
  }

  public void clearMenu() {
    this.meals.clear();
  }

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.addMeal("beese churger");
    menu.printMeals();
    menu.addMeal("lurger");
    menu.printMeals();
    menu.clearMenu();
    menu.printMeals();
  }
}
