package com.saahild;

import java.util.Scanner;

public class Main {
    private  static  void CheckIfNoCountIsAboveRequestedLimit(int n) {
     if(n >= 5) {
        System.out.println("I have lost because n is over 5");
        System.out.println("Goodbye");
System.exit(0);
     }
    }
// i was forced to dumb this down.
    public static void main(String[] args) {
    try (Scanner user = new Scanner(System.in)) {
        int noCount = 0;
       System.out.println("Think of something thats in a classroom...");
       System.out.println("Is your thing red?: ");
       String pr1 = user.next();
        if("y".equals(pr1)) {
System.out.println("Is your thing rubbery.");
String pr2_y = user.next();
if("y".equals(pr2_y)) {
    System.out.println("Is your thing used on a pencil?");
String pr3_y = user.next();
if( "y".equals(pr3_y)) {
System.out.println("I win");
} else {
    noCount++;
    CheckIfNoCountIsAboveRequestedLimit(noCount);
    System.out.println("Im Out");
}
} else {
    noCount++;
    CheckIfNoCountIsAboveRequestedLimit(noCount);
    System.out.println("Is your thing an eraser?");
String pr3_n = user.next();
if( "y".equals(pr3_n)) {
    System.out.println("I win");
} else {
    System.out.println("Dang i lost");
}
}
}  else if("n".equals(pr1)) {
            noCount++;
CheckIfNoCountIsAboveRequestedLimit(noCount);
System.out.println("Is your thing blue.");
String pr2_n = user.next();
if("y".equals(pr2_n)) {
    System.out.println("Is your thing used on a laptop case?");
String pr3_y = user.next();
if( "y".equals(pr3_y)) {
System.out.println("I win");
} else {
    noCount++;
    CheckIfNoCountIsAboveRequestedLimit(noCount);
    System.out.println("Im Out");
}
} else {
    noCount++;
    CheckIfNoCountIsAboveRequestedLimit(noCount);
    System.out.println("Is your thing multi-color?");
String pr3_n = user.next();
if( "y".equals(pr3_n)) {
    System.out.println("Is your thing a water bottle");
    String pr4_n = user.next();
    if( "y".equals(pr4_n)) {
        System.out.println("I win");
    } else {
        System.out.println("Dang i lost");
    }
} else {
    noCount++;
     CheckIfNoCountIsAboveRequestedLimit(noCount);
    System.out.println("Is your thing solid. ");
    String pr4_n = user.next();
    if("y".equals(pr4_n)) {
        System.out.println("Is your thing water. ");
        String pr5_n = user.next();
        if("y".equals(pr5_n)) {
            System.out.println("I win");
        } else {
            noCount++;
            CheckIfNoCountIsAboveRequestedLimit(noCount);
            System.out.println("I lose");
        }
    } else {
        noCount++;
        CheckIfNoCountIsAboveRequestedLimit(noCount);
        System.out.println("Is your thing a table. ");
        String pr6_n = user.next();
        if("y".equals(pr6_n)) {
            System.out.println("I win");
        } else {
            noCount++;
            CheckIfNoCountIsAboveRequestedLimit(noCount);
            System.out.println("I lose");
        }
    }
}
}
        } else {
System.err.println("Maybe use (y/n)");
        } 
    }       
    }
}