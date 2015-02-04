import java.util.Scanner;
public class Player 
	{
	static String choice;
	public static void main(String[] args)
		{
		askName();
		rulesChoice();
		categoryChoice();
		}
	public static void askName()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println(" ");
		System.out.println("Welcome, " +name+ ", to Trivia Match!");
		}
	public static void rulesChoice()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Would you like to know the rules?");
		String choice = userInput.nextLine();
		System.out.println(" ");
		if (choice.equals ("yes") || choice.equals ("Yes"))
			{
			System.out.println("Alrighty then, here they are: ");
			System.out.println("  * There are five categories to choose from ");
			System.out.println("  * Science, General, History, Media, and Random.");
			System.out.println("  * You will be given a point for each question answered correctly");
			System.out.println("  * The game will end once you have answered three incorrectly");
			System.out.println("  * Good Luck!");
			}
		else if (choice.equals ("no") || choice.equals ("No"))
			{
			System.out.println("Good that, let's begin!");
			}
		}
	public static void categoryChoice()
		{
		System.out.println("  _______________________________________________");
		Scanner userInput = new Scanner(System.in);
		System.out.println("  What category do you want?");
		System.out.println("  (1) Science");
		System.out.println("  (2) General");
		System.out.println("  (3) History");
		System.out.println("  (4) Media");
		System.out.println("  (5) Random" );
		
		int category = userInput.nextInt();
		}

}