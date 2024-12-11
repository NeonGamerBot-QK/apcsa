public class Word {

  private Letter[] word = new Letter[5];

  public Word() {
    // fill the array word with a new letter in each slot
    word[0] = new Letter();
    word[1] = new Letter();
    word[2] = new Letter();
    word[3] = new Letter();
    word[4] = new Letter();
  }

  public Letter[] getWord() {
    return this.word;
  }
}
