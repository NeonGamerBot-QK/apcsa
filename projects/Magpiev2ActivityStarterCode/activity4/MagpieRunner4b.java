import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White & Travis Burton
 * @version August 2024
 */
public class MagpieRunner4b
{
	static String response;
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4b maggie = new Magpie4b();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			response = maggie.getResponse(statement);
			System.out.println(response);
			statement = in.nextLine();
		}
	}

}
