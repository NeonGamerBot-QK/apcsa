public class StudentFactory {

  public static void main(String[] args) {
    // instantiate a few Student objects and call methods on them

    // part1();
    part2();
  }

  public static void part1() {
    // part 1
    Student noNameAndNoGradeStudent = new Student();
    System.out.println(noNameAndNoGradeStudent.getName());
    int unkGrade = noNameAndNoGradeStudent.getGrade();
    System.out.println(unkGrade);
  }

  public static void part2() {
    // part 2
    Student bart = new Student("Bart", 10);
    String nameOfBart = bart.getName();
    System.out.println(nameOfBart);
    int gradeOfBart = bart.getGrade();
    System.out.println(gradeOfBart);
    // make grade for bart up to 11
    bart.nextGrade();
    int newGrade = bart.getGrade();
    System.out.print(newGrade);
    bart.setName("Im not bart");
    String newName = bart.getName();
    System.out.println(newName);
  }
}
