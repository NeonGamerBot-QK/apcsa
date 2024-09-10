/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {

  /**
   * Get a default greeting
   * @return a greeting
   */
  public String getGreeting() {
    return "Hello, let's talk.";
  }

  /**
   * Gives a response to a user statement
   *
   * @param statement
   *            the user statement
   * @return a response based on the rules given
   */
  public String getResponse(String statement) {
    String response = "";
    statement = statement.toLowerCase();
    // Your code goes here
    if (statement.contains("math") || statement.contains("science")) {
      response = "Is that your favorite class?";
    } else if (
      statement.toLowerCase().contains(("kcd")) ||
      statement.contains("kentucky country day")
    ) {
      // anything i said here cant be used against me
      response = "Wow KCD is the best!";
    } else if ("whoami".equals(statement)) {
      response = "Great question! IDK";
    } else if ("whoareu".equals(statement)) {
      response = "Im a non-ai chatbot!";
    } else if (statement.contains("mysite")) {
      response = "I dont have a site yet!";
    } else if (statement.contains("program")) {
      response = "I was programmed in java!";
    } else if (statement.contains("java")) {
      response =
        "Java is a great language! thats also the langauge i was made in";
    } else {
      response = getRandomResponse();
    }

    return response;
  }

  /**
   * Pick a default response to use if nothing else fits.
   * @return a non-committal string
   */
  private String getRandomResponse() {
    final int NUMBER_OF_RESPONSES = 4;
    double r = Math.random();
    int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
    String response = "";

    if (whichResponse == 0) {
      response = "Interesting, tell me more.";
    } else if (whichResponse == 1) {
      response = "Hmmm.";
    } else if (whichResponse == 2) {
      response = "Do you really think so?";
    } else if (whichResponse == 3) {
      response = "You don't say.";
    }

    // Your code goes here

    return response;
  }
}
