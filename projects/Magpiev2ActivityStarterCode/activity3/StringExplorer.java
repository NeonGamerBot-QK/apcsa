/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public  static int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in
        // the line below 
        int psn = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
			System.out.println("psn: " + psn);
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
            }
			System.out.println("before: " + before);
			System.out.println("after: " + after);
            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) // before is not a letter
                && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal, psn + 1);
			
        }
        return -1;
    }

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		// //  Demonstrate the indexOf method.
		// int position = sample.indexOf("quick");
		// System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		// //  Demonstrate the toLowerCase method.
		// String lowerCase = sample.toLowerCase();
		// System.out.println ("sample.toLowerCase() = " + lowerCase);
		// System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		System.out.println(findKeyword("i like science", "science", 0));
		System.out.println("======================================");
		System.out.println(findKeyword("i have art second period today", "art", 0));
		System.out.println("======================================");
		System.out.println(findKeyword("This will be his first history class", "is", 0));
		System.out.println("======================================");
		System.out.println(findKeyword("They will sunbathe on their vacation", "the", 0));
	}

}
