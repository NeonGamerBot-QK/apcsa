public class StudentFactory {

  public static void main(String[] args) {
    // instantiate a few Student objects and call methods on them
    Student me = new Student("Saahil", 10);
    int myGrade = me.getGrade();
    System.out.println(
      "My name is " + me.getName() + " and I am in grade " + myGrade
    );
    me.nextGrade();
    myGrade = me.getGrade();
    System.out.println(
      "My name is " + me.getName() + " and I am in grade " + myGrade
    );
  }
}
