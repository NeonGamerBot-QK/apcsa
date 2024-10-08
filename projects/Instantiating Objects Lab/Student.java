public class Student
{
  private String name;
  private int grade;
  
  public Student()
  {
    name = "Unknown";
    grade = -1;
  }
  
  public Student(String name)
  {
    this.name = name;
    grade = -1;
  }

  public Student(int grade)
  {
    name = "Unknown";
    this.grade = grade;
  }
  
  public Student(String name, int grade)
  {
    this.name = name;
    this.grade = grade;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getGrade()
  {
    return grade;
  }
  
  public void setName(String newName)
  {
    name = newName;
  }
  
  public void nextGrade()
  {
    grade++;
  }
}