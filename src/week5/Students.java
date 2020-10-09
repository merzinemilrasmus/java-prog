import java.util.ArrayList;
import java.util.Scanner;

public class Students {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<Student>();

    while (true) {
      System.out.print("name: ");
      String name = reader.nextLine();
      if (name.isEmpty()) break;
      System.out.print("studentnumber: ");
      String studentNumber = reader.nextLine();
      list.add(new Student(name, studentNumber));
    }

    System.out.println();
    for (Student student : list) System.out.println(student);

    System.out.print("\nGive search term: ");
    String term = reader.nextLine();
    System.out.println("Result:");

    for (Student student : list) {
      if (student.toString().contains(term)) System.out.println(student);
    }
  }
}

class Student {
  String name;
  String studentNumber;

  public Student(String name, String studentNumber) {
    this.name = name;
    this.studentNumber = studentNumber;
  }

  public String getName() {
    return name;
  }

  public String getStudentNumber() {
    return studentNumber;
  }

  public String toString() {
    return name + " (" + studentNumber + ")";
  }
}
