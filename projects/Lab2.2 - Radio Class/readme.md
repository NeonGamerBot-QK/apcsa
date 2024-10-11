## Lab 2.2 Whole Class

## Instructions

You are going to write a class that contains state using instance variables.

You will write a class that represents an analogue radio like you would see in a car, or on a really cool boombox from the 90's.

Radios are tuned to a frequency, like 90.9 or 107.7 for FM.

When you turn the dial, you change the frequency by 0.2.

Radios that in on AM, when you turn the dial the frequency changes by 10

### Part 1: Write the class header

Write a class header in the Radio.java file.

Use the name of the file to determine what the name of the class should be.

### Part 2: Writing an Instance Variable

Declare an instance variable in the Radio class to represent the frequency that the radio is tuned into.

Decate an instance variable in the Radio class that represent if the radio is on AM or FM

- Don't for get to use the ```private``` keyword when declaring this variable!
- Do not assign an initial value to an instance variable!

### Part 3: Constructors
Write a default constructor
- make sure to set all instance variables

Write a constructor that takes in if the radio starts on AM or FM


Make sure your code compiles. You can't test it until you write the method from Part 4, but it should compile without any errors.

### Part 4: Writing a Getter Method

Write a method that takes no parameters and returns the current station

Write a method that takes in no parameters and returns AM or FM

Make sure your code compiles.

Test this code in the RadioTester.java file.


### Part 5: Writing a Setter Method

Write a method to set that station to a specific number.It takes one parameter and returns nothing.

Write a to set the station to AM or FM

Once you have written this method, make sure your code compiles.

Test this code in the RadioTester.java file.

### Part 6: Mutator Method
Write a mutator method that does not return anything but takes one parameter. The parameter should be the quanity you want to change the station by.  

For example if you are on 94.3 and I want to change it by 1.2 then the frequency would not by 95.5

Becarful only FM radios can have decimals but AM cannot.

Make sure your code compiles.

Test this code in the RadioTester.java file.


### Part 7: More Mutator Methods

Write two more mutator methods ```nextStation``` and ```prevStation```. 
These methods should add (or subtract) the value 0.2 from the instance variable if the radio is on FM 
but if the radio is on AM then it should add or subtract 10.

Test this code in the RadioTester.java file.

### Are you getting weird numbers in your output?
Watch this video: [https://www.youtube.com/watch?v=PZRI1IfStY0](https://www.youtube.com/watch?v=PZRI1IfStY0)
