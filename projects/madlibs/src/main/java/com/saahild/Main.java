package com.saahild;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           try (Scanner user = new Scanner(System.in)) {
            System.out.println("Choose a good year: ");
            int bYear = user.nextInt();
            System.out.println("Choose a bad year: ");
            int baYear = user.nextInt();
            System.out.println("Choose a  # 1-100: ");
            int spPer = user.nextInt();
            System.out.println("Choose a  # 1-100: ");
            int dspPer = user.nextInt();
            System.out.println("Choose a  name: ");
            String name = user.next();
            System.out.println("Choose a  city: ");
            String city = user.next();
            System.out.println("Choose a light color: ");
            String light = user.next();
            System.out.println("Choose a dark color: ");
            String dark = user.next();
            System.out.println("Choose a  good word: ");
            String goodWord = user.next();
            System.out.println("Choose a bad word: ");
            String badWord = user.next();
        clearScreen();
        System.out.println("\n\n");
        String madLibs = makeMadLib(bYear, baYear, spPer, dspPer, name, city, light, dark, goodWord, badWord);
        System.out.println(madLibs);
        // Runtime.getRuntime().exec()
try {
                try (FileWriter myWriter = new FileWriter("out-madlibs.txt")) {
                    myWriter.write(madLibs);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                }
} catch (IOException e) {
e.printStackTrace();
}
    }
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    private static  String intToStr(int i) {
return i+"";
    }
    private static  String makeMadLib(int bYear, int baYear,int spPer, int dspPer, String name, String city, String light,String  dark, String coolword, String badword) {
        // @source https://stackoverflow.com/questions/878573/does-java-have-support-for-multiline-strings
        return new StringBuilder()
        .append("It was the best of times in {b-year}, it was the worst of times in {ba-year},\n")
        .append("it was the age of wisdom for {name}, it was the age of foolishness in {city},\n")
        .append("it was the epoch of {cool-word}, it was the epoch of {bad-word},\n")
        .append("it was the season of {light}, it was the season of {dark},\n")
        .append("it was the spring of with a {sp-per}% chance of hope, it was the winter of despair with a {dsp-per}% chance.\n")
        .append("we had everything before us, we had nothing before us - bye {name}")
        .toString()
        .replace("{b-year}", intToStr(bYear)).replace("{ba-year}", intToStr(baYear)).replace("{sp-per}", intToStr(spPer)).replace("{dsp-per}", intToStr(dspPer))
        .replace("{name}", name).replace("{city}",city).replace("{light}", light).replace("{dark}", dark).replace("{cool-word}", coolword).replace("{bad-word}", badword) .replace("{name}", name);
        }
}