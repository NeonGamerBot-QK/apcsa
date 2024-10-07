import java.awt.Color;

public class MyProgram {

  public static void main(String[] args) {
    System.out.println("Hello World");
    // Create a Turtle object
    // import turtle.Turtle;
    Turtle turtle = new Turtle();
    turtle.penColor("red");
    turtle.hide();
    
    // draw your first initial
    turtle.towards(10, 10);
    turtle.backward(25);
    turtle.right(90);
    turtle.forward(25);
    turtle.left(90);
    turtle.forward(25);
    turtle.right(90);
    turtle.forward(25);
    turtle.right(90);
    turtle.forward(25);

    // draw a 5 pointed star
    turtle.up();
    turtle.forward(100);

    turtle.down();
    for (int i = 0; i < 5; i++) {
      turtle.down();
      turtle.setDirection(i * 144);
      turtle.forward(50);
      turtle.backward(50);
      turtle.up();
    }
    // draw a flower
    turtle.home();
    turtle.up();
    turtle.left(90);
    turtle.forward(50);
    turtle.down();
    turtle.forward(150);
    int tilt = 0;
    for (int i = 0; i < 36; i++) {
      turtle.penColor(Color.YELLOW);
      turtle.forward(50);
      turtle.backward(50);
      turtle.right(10);
      tilt += 10;
    }
    turtle.right(180 * tilt);
    turtle.shapeSize(50, 50);
    turtle.penColor(Color.darkGray);
    // turtle.forward(100);
    // Create something colorful
    turtle.up();
    turtle.home();
    turtle.right(180);
    turtle.forward(200);
    turtle.down();
    for(int i = 0; i< 50; i++) {
      for (int j = 0; j < 50; j++) {
        float midd = (float) (i + j) / 100;
        turtle.penColor(Color.getHSBColor((float) i / 5 , midd, (float) j / 20));
        turtle.setDirection(i * 8.5);
        turtle.forward(10);
        turtle.setDirection(j * 9);
        turtle.forward(10);
        turtle.setDirection((i + j) * 10);
        turtle.forward(10);
        turtle.setDirection((i - j) * 10);
        turtle.forward(10);
      }
    }
    turtle.show();
turtle.up();
turtle.home();
turtle.down();
while (1 != 0) {
  turtle.right(10);
}
  }
}
