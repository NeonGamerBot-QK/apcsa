import com.saahild.Radio;

public class RadioTester {

  public static void main(String[] args) {
    Radio radio = new Radio();
    radio.setFrequency(100);
    radio.setOnAM(true);
    System.out.println(radio.getFrequency());
    System.out.println(radio.isOnAM());
    radio.turnDial(10);
  }
}
