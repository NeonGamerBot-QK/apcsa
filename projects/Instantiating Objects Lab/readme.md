# Instantiating Objects Lab

## Instructions

You are going to write code that instantiates objects and calls some methods on those objects.
This starter code comes with two .java files.

- Student.java
- StudentFactory.java

You will only write code in the StudentFactory.java file, but the code you write will invoke methods that are defined in the Student.java file.

The Student.java file declares several different constructors. Each one takes a different set of arguments to instantiate an instance of a Student object. You will write code that instantiates Student objects using each of the constructors defined below.

```
Student(String name, int grade)
This constructor takes two arguments and uses them to initialize the name and grade of the student represented by this object.

Student(String name)
This constructor takes a single argument and uses it to initialize the name of the student. The student's grade is initialized to a default value.

Student(int grade)
This constructor takes a single argument and uses it to initialize the grade of the student. The student's name is initialized to a default value.

Student()
This constructor does not take any arguments and initializes both the student's name and grade to default values.
```

Remember, to initialize an instance of an object you need to use the `new` keyword and assign the object to a variable. The type of that variable should match the name of the class that was used to create the object.

```
Student luke = new Student();
```

This statement instantiates an instance of a Student object and assigns that object to the variable luke, which is declared as a Student-type variable. If you wanted to pass argument to the constructor, you would put those values inside the parentheses of `new Student( )`

### Part 1: No arguments

The student class has 4 different constructors, that each take a different set of arguments. You will initialize 4 different Student objects and invoke some of their methods.

1. In the main method of StudentFactory.java, write a statement that instantiates a Student object using the constructor with no parameters.
2. Assign that object to a variable (you can name the variable anything you want, but the type of this variable has to match the type of the object you are assigning to it... which is Student)
3. Then use dot-notation to call the getName method on that object and store the result in a variable (you can name the variable anything you want, but you have to declare the type of the variable correctly. What type of data is a Student's name?)
4. Use System.out.println to output the student's name (using the variable you just created) to the console.

Test your code. Make sure it compiles and look at what it outputs. The parameterless constructor assigns default values to the name and grade of the Student object. What is the default name of a student?

5. Call the getGrade method on the student object you created and store the value in a variable (you can name the variable anything you want, but you have to declare the type of the variable correctly. What type of data would store a student's grade (9, 10, 11, 12))
6. Use System.out.println to output the students grade.

Test your code. Make sure it compiles and look at what it outputs. What is the default grade of a student?

### Part 2: One Argument

Write the following code in the main method of StudentFactory.java, after the code from Part 1.

1. Write a statement that instantiates a Student object using the constructor that lets you specify the students name. Pass the argument "Bart" to the constructor by putting that string literal inside the parentheses.
2. Assign that object to a variable (you can name it anything you want, but you have to use a name that you haven't already used in the scope of the main method)
3. Call the getName method and assign it to a variable. Use dot-notation, and make sure you are calling this method on the student you just created.
4. Use System.out.println to output the student's name to the console.

Test your code. What value does the getName method return for this student? Why do you think it returns that value?

5. Call the getGrade method on this student and assign it to a variable.
6. Use System.out.println to output the student's grade to the console.

Test your code. What value does the getGrade method return for this student?

7. Write a statement that instantiates a Student object using the constructor that lets you specify the student's grade. Pass the argument 10 to the constructor by putting that int literal inside the parentheses.
8. Assign that object to a variable (this should be the 3rd Student variable you have created in this method)
9. Call the getName method on this student and use System.out.println to output the name to the console.
10. Call the getGrade method on this student and use System.out.println to output the grade to the console.

Test your code. What values are returned by the getName and getGrade methods for this student?

### Part 3: Two Arguments

Write this code in the main method of the StudentFactory.java file, after the code you wrote for Parts 1 and 2.

1. Write a statement that instantiates a Student object using the constructor that takes two arguments. This student's name should be "Lisa" and her grade should be 9.
2. Call the getName method on this object and use System.out.println to output its value
3. Call the getGrade method on this object and use System.out.println to output its value

Test your code!
Your program should output the name and grade of 4 different students. Each on it's own line.
