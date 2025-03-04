package com.saahild;

import java.util.Scanner;

public class TicTacToe {

    private String[][] board = new String[3][3];
    private String currentUser = "X";
    public TicTacToe() {
        populateBoard();
    }
    public String getCurrentTurn() {
        return currentUser;
    }
    public String getBoard() {
        String str = "";
        for (int i = 0; i < 3; i++) {
            str += board[i][0] + "|" + board[i][1] + "|" + board[i][2] + "\n";
        }
        return str;
    }
    private void populateBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "-";
            }
        }
    }
    public void moveNextTurn() {
        if (currentUser.equals("X")) {
            currentUser = "O";
        } else {
            currentUser = "X";
        }
    }

    public void playOn(int row, int col) {
        if (board[row][col].equals(" ")) {
            board[row][col] = getCurrentTurn();
        } else {
            System.out.println("Invalid move");
        }
    }

    public Boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (
                board[i][0].equals(board[i][1]) &&
                board[i][1].equals(board[i][2]) &&
                !board[i][0].equals(" ")
            ) {
                return true;
            }
            if (
                board[0][i].equals(board[1][i]) &&
                board[1][i].equals(board[2][i]) &&
                !board[0][i].equals(" ")
            ) {
                return true;
            }
        }
        if (
            board[0][0].equals(board[1][1]) &&
            board[1][1].equals(board[2][2]) &&
            !board[0][0].equals(" ")
        ) {
            return true;
        }
        if (
            board[0][2].equals(board[1][1]) &&
            board[1][1].equals(board[2][0]) &&
            !board[0][2].equals(" ")
        ) {
            return true;
        }
        return false;
    }

    public void playGame() {
        // assuming we are using stdout
        System.out.println("Starting game");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(getCurrentTurn() + " turn"); 
            System.out.println(getBoard());
            System.out.println("Enter row then column");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            playOn(row, col);
            moveNextTurn();
            if (checkWin()) {
                System.out.println("Win");
                break;
            }
        }
    }
}
