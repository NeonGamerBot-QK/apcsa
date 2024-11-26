package com.saahild;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class t {
    private static final String Reset = "\u001B[0m";
    private static final String Bright = "\u001B[1m";
    private static final String Dim = "\u001B[2m";
    private static final String Underscore = "\u001B[4m";
    private static final String Blink = "\u001B[5m";
    private static final String Reverse = "\u001B[7m";
    private static final String Hidden = "\u001B[8m";

    private static final String FgBlack = "\u001B[30m";
    private static final String FgRed = "\u001B[31m";
    private static final String FgGreen = "\u001B[32m";
    private static final String FgYellow = "\u001B[33m";
    private static final String FgBlue = "\u001B[34m";
    private static final String FgMagenta = "\u001B[35m";
    private static final String FgCyan = "\u001B[36m";
    private static final String FgWhite = "\u001B[37m";
    private static final String FgGray = "\u001B[90m";

    private static final String BgBlack = "\u001B[40m";
    private static final String BgRed = "\u001B[41m";
    private static final String BgGreen = "\u001B[42m";
    private static final String BgYellow = "\u001B[43m";
    private static final String BgBlue = "\u001B[44m";
    private static final String BgMagenta = "\u001B[45m";
    private static final String BgCyan = "\u001B[46m";
    private static final String BgWhite = "\u001B[47m";
    private static final String BgGray = "\u001B[100m";

    public static void main(String[] args) throws IOException {
        // if (!System.getenv("TERM").contains("kitty")) {
        //     System.out.println("Use Kitty Terminal app for better performance");
        //     System.exit(1);
        // }
        playWordle();
    }

    private static List<String> getWordList() {
        List<String> words = Arrays.asList("Tasco", "Scalp", "Tress", "Folks");
        Collections.shuffle(words);
        List<String> lowerCaseWords = new ArrayList<>();
        for (String word : words) {
            lowerCaseWords.add(word.toLowerCase().trim());
        }
        return lowerCaseWords;
    }

    private static String pickRandomWord(List<String> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    private static String colorLetter(String letter, String color) {
        return color + letter + Reset;
    }

    private static List<String> evaluateGuess(String guess, String secretWord) {
        List<String> words = new ArrayList<>();
        for (char letter : guess.toCharArray()) {
            int lIndex = secretWord.indexOf(letter);
            if (lIndex >= 0) {
                if (lIndex == guess.indexOf(letter)) {
                    words.add(colorLetter(String.valueOf(letter), FgGreen));
                } else {
                    words.add(colorLetter(String.valueOf(letter), FgYellow));
                }
            } else {
                words.add(colorLetter(String.valueOf(letter), FgGray));
            }
        }
        return words;
    }

    private static void playWordle() throws IOException {
        System.out.println("Starting wordle...");
        String word = pickRandomWord(getWordList());
        if (System.getenv("REVEAL_WORD") != null) {
            System.out.println("Cheater: " + word);
        }
        List<List<String>> board = new ArrayList<>();
        run(board, word);
    }

    private static void run(List<List<String>> board, String word) throws IOException {
        System.out.println(new String(new char[40]).replace("\0", "="));
        if (!board.isEmpty()) {
            for (List<String> row : board) {
                System.out.println(String.join(" ", row));
            }
        } else {
            System.out.println("<empty board>");
        }
        System.out.println(new String(new char[40]).replace("\0", "="));

        String input = ""; // Initialize the input variable
        System.out.print("Enter your guess: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        input = reader.readLine().replaceAll("[^a-zA-Z]+", "").substring(0, Math.min(5, input.length()));

        if (input.length() < 5) {
            System.out.println("Make sure your guess is 5 Characters!");
            run(board, word);
            return;
        }

        List<String> newRow = evaluateGuess(input, word);
        if (board.size() >= 5) {
            if (input.equals(word)) {
                System.out.println(FgGreen + "You won??" + Reset);
                System.exit(1);
            } else {
                System.out.println(FgRed + "You Lost!" + Reset);
                System.exit(1);
            }
        } else {
            if (input.equals(word)) {
                System.out.println(FgGreen + "You won??" + Reset);
                System.exit(1);
            } else {
                board.add(newRow);
                run(board, word);
            }
        }
    }
}

