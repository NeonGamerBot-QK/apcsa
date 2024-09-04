package com.saahild;

public class Spinner {
    int balance = 0;
    public Spinner() {
        balance = 0;
    }
    public int spin(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public void playRound() {
      int pNumber = spin(1, 10);
      int pcNumber = spin(2, 8);
      if(pNumber > pcNumber) {
        System.out.println("You win! +"+ (pNumber - pcNumber));
      } else if(pNumber < pcNumber) {
        System.out.println("You lose! -" + (pcNumber - pNumber));
      } else {
        System.out.println("It's a tie!");
        int pNumbe2 = spin(1, 10);
      int pcNumbe2 = spin(2, 8);
      if((pNumber + pNumbe2) > (pcNumber + pcNumbe2)) {
        System.out.println("You win! +1 ");
      } else if((pNumber + pNumbe2) < (pcNumber + pcNumbe2)) {
        System.out.println("You lose! -1");
      } else {
        System.out.println("It's an Actual tie 0 points!");
      }
    }
    }
}
