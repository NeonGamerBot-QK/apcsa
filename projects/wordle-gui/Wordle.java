
public class Wordle {

    private String[] words = WordleDictionary.WORDS;
    private int[] result = new int[5];
    private static int tries = 0;
    private int index = 0;
    private String word;
    

    public Wordle() {
        //get a random word from the list
        word = "hoops";
        
        /* ***Delete this after you write checkGuess *** */
        result[0] = 2;
        result[1] = 2;
        result[2] = 2;
        result[3] = 2;
        result[4] = 2;
        /* ********************************************* */
        
    }

    public boolean checkIfWord(String guess) {
        //return true if the guess is a word
        //otherwise return false
        
        return (guess == null ? word == null : guess.equals(word));
    }

    public String[] getWords() {
        return words;
    }

    public String getWord() {
        return word;
    }
    
    public int[] getGuess(String guess) {
        //updates then returns result
        tries++;
        result = checkCorrect(guess);
        return result;
    }
    
    public int[] checkCorrect(String guess) {
        //returns a list of numbers that represent right or wrong 
        for(int i = 0; i < 5;i++) {
            if(word.charAt(i) == guess.charAt(i)) {
                result[i] = 1;
            } else if (word.indexOf(guess.charAt(i)) >= 0) {
                result[i] = 0;
            } else {
                result[i] = 2;
            }
        }
        return result;
    }


    public static int returnTries() {
        return tries;
    }
}