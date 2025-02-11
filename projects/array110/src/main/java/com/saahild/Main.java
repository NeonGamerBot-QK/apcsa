package com.saahild;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter the element at index " + i);
      arr[i] = sc.nextInt();
    }
    // get mean
    double mean = 0;
    for (int i = 0; i < 10; i++) {
      mean += arr[i];
    }
    mean = mean / 10;
    System.out.println("Mean is " + mean);
    sc.close();
  }
}
