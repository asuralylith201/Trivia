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
			QuestionDealer.playerChoice();
			QuestionDealer.categories();
		}
	}
}
