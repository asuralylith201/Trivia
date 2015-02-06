import java.util.Scanner;
public class GameRunner 
	{
	static boolean gameOn = true;
	public static void main(String[] args) 
		{
		Player.askName();
		Player.rulesChoice();
		while (gameOn)
				{
				int counter = 0;
				counter = counter = 0;
			if (counter == 1)
				{
				System.out.println("You answered " +counter+ " right.");
				}
			else 
				{
				System.out.println("You answered " +counter+ " wrong. Game over.");
				//System.exit(0);
				}
				QuestionCards.instantiateArray();
				QuestionCards.displayCategoriesAndChoice();
	
	
			}
		}
	}
