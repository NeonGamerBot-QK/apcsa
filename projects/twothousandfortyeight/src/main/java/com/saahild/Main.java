package com.saahild;

import java.util.Scanner;

public class Main {

  private static final int SIZE = 4;
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] grid = new int[SIZE][SIZE];

    // Place two initial tiles
    placeRandomTile(grid);
    placeRandomTile(grid);

    while (true) {
      printGrid(grid);
      if (isGameOver(grid)) {
        System.out.println("Game Over!");
        break;
      }

      System.out.println(
        "Enter move (W - Up, A - Left, S - Down, D - Right): "
      );
      String move = scanner.nextLine().toUpperCase();

      if (
        move.equals("W") ||
        move.equals("A") ||
        move.equals("S") ||
        move.equals("D")
      ) {
        boolean moved = false;

        switch (move) {
          case "w":
          case "W":
            System.out.println("W");
            moved = moveUp(grid);
            break;
          case "a":
          case "A":
            System.out.println("A");

            moved = moveLeft(grid);
            break;
          case "s":
          case "S":
            System.out.println("S");

            moved = moveDown(grid);
            break;
          case "d":
          case "D":
            System.out.println("D");

            moved = moveRight(grid);
            break;
        }

        if (moved) {
          placeRandomTile(grid); // Place a new tile after move
        } else {
          System.out.println("Invalid move! Try again.");
        }
      } else {
        System.out.println("Invalid input! Use W, A, S, or D.");
      }
    }
  }

  private static boolean isGameOver(int[][] grid) {
    // Game Over if no empty cells and no valid moves
    if (countEmptyCells(grid) > 0) return false;

    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if (i < SIZE - 1 && grid[i][j] == grid[i + 1][j]) return false;
        if (j < SIZE - 1 && grid[i][j] == grid[i][j + 1]) return false;
      }
    }
    return true;
  }

  // Move tiles in one direction and combine them
  private static boolean moveLeft(int[][] grid) {
    boolean moved = false;
    for (int i = 0; i < SIZE; i++) {
      moved |= slideAndMerge(grid[i]);
    }
    return moved;
  }

  private static void reverseArray(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
  }

  private static boolean moveRight(int[][] grid) {
    boolean moved = false;
    for (int i = 0; i < SIZE; i++) {
      reverseArray(grid[i]);
      moved |= slideAndMerge(grid[i]);
      reverseArray(grid[i]);
    }
    return moved;
  }

  private static boolean slideAndMerge(int[] row) {
    boolean moved = false;
    // Slide all non-zero values to the left
    int[] newRow = new int[SIZE];
    int index = 0;
    for (int i = 0; i < SIZE; i++) {
      if (row[i] != 0) {
        newRow[index++] = row[i];
      }
    }
    // Merge adjacent identical tiles
    for (int i = 0; i < SIZE - 1; i++) {
      if (newRow[i] != 0 && newRow[i] == newRow[i + 1]) {
        newRow[i] *= 2;
        newRow[i + 1] = 0;
        moved = true;
      }
    }
    // Slide again after merge
    index = 0;
    for (int i = 0; i < SIZE; i++) {
      if (newRow[i] != 0) {
        row[index++] = newRow[i];
      }
    }
    // Fill the rest with zeros
    for (int i = index; i < SIZE; i++) {
      row[i] = 0;
    }
    return moved;
  }

  private static boolean moveUp(int[][] grid) {
    boolean moved = false;
    for (int j = 0; j < SIZE; j++) {
      int[] column = new int[SIZE];
      for (int i = 0; i < SIZE; i++) {
        column[i] = grid[i][j];
      }
      moved |= slideAndMerge(column);
      for (int i = 0; i < SIZE; i++) {
        grid[i][j] = column[i];
      }
    }
    return moved;
  }

  private static boolean moveDown(int[][] grid) {
    boolean moved = false;
    for (int j = 0; j < SIZE; j++) {
      int[] column = new int[SIZE];
      for (int i = 0; i < SIZE; i++) {
        column[i] = grid[i][j];
      }
      reverseArray(column);
      moved |= slideAndMerge(column);
      reverseArray(column);
      for (int i = 0; i < SIZE; i++) {
        grid[i][j] = column[i];
      }
    }
    return moved;
  }

  private static void placeRandomTile(int[][] grid) {
    int emptyCount = countEmptyCells(grid);
    if (emptyCount == 0) return; // No empty space left

    int randPosition = (int) (Math.random() * emptyCount);
    int value = (Math.random() < 0.5) ? 2 : 4; // 90% chance of 2, 10% chance of 4

    int count = 0;
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if (grid[i][j] == 0) {
          if (count == randPosition) {
            grid[i][j] = value;
            return;
          }
          count++;
        }
      }
    }
  }

  private static int countEmptyCells(int[][] grid) {
    int count = 0;
    for (int[] row : grid) {
      for (int cell : row) {
        if (cell == 0) count++;
      }
    }
    return count;
  }

  private static void printGrid(int[][] grid) {
    System.out.println("Current Grid:");
    for (int[] row : grid) {
      for (int cell : row) {
        System.out.printf("%4d", cell);
      }
      System.out.println();
    }
  }
}
