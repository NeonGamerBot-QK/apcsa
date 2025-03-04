package com.saahild;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void insertionSort(ArrayList<Integer> list) {
    int n = list.size();
    for (int i = 1; i < n; i++) {
      int key = list.get(i);
      int j = i - 1;

      // Shift elements that are greater than key to one position ahead
      while (j >= 0 && list.get(j) > key) {
        list.set(j + 1, list.get(j));
        j--;
      }
      list.set(j + 1, key);
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(1, 9, 3, 4, 5, 6, 7, 8, 2, 10)
    );
    insertionSort(list);
    System.out.println(list);
  }
}
