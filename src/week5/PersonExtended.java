import java.util.Calendar;

public class PersonExtended {
  public static void main(String[] args) {
    Person tikk = new Person("Tikk", 8, 10, 2018);
    Person tana = new Person("Täna");

    System.out.println(tikk + " - age " + tikk.age() + " years");
    System.out.println(tana + " - age " + tana.age() + " years");

    System.out.println(tikk.getName() + " is older than " +  tana.getName() + ": " + tikk.olderThan(tana));
    System.out.println(tana.getName() + " is older than " +  tikk.getName() + ": " + tana.olderThan(tikk));
  }
}

class Person {
  private String name;
  private Calendar birthday = Calendar.getInstance();

  public Person(String name, int date, int month, int year) {
    this.name = name;
    birthday.set(year, month - 1, date);
  }

  public Person(String name) {
    this.name = name;
  }

  public int age() {
    Calendar today = Calendar.getInstance();
    int years = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    if (
      today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) ||
      today.get(Calendar.MONTH) <= birthday.get(Calendar.MONTH) && today.get(Calendar.DATE) < birthday.get(Calendar.DATE)
    ) years--;
    return years;
  }

  public boolean olderThan(Person compared) {
    if (getBirthYear() < compared.getBirthYear()) return true;
    else if (getBirthYear() > compared.getBirthYear()) return false;
    else if (getBirthMonth() < compared.getBirthMonth()) return true;
    else if (getBirthMonth() > compared.getBirthMonth()) return false;
    else if (getBirthDate() < compared.getBirthDate()) return true;
    else return false;
  }

  public String getName() {
    return name;
  }

  public int getBirthYear() {
    return birthday.get(Calendar.YEAR);
  }

  public int getBirthMonth() {
    return birthday.get(Calendar.MONTH) + 1;
  }

  public int getBirthDate() {
    return birthday.get(Calendar.DATE);
  }

  public String getBirthdayString() {
    return String.format("%04d-%02d-%02d", getBirthYear(), getBirthMonth(), getBirthDate());
  }

  public String toString() {
    return name + ", born " + getBirthdayString();
  }
}
