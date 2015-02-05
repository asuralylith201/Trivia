import java.util.ArrayList;
import java.util.Scanner;
public class QuestionDealer 
	{
	String category;
	String question;  
	public QuestionDealer (String ct, String qu)
		{
		category = ct;
		question = qu;
		}
	public static void main(String[] args) 
		{
		playerChoice();
		categories();
		}
		ArrayList<QuestionDealer>choice = new ArrayList<QuestionDealer>();
	
	public static void playerChoice()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("  Which category do you want?");
		}
	public static void categories()
		{
		System.out.println("  (1) Science");
		System.out.println("  (2) General");
		System.out.println("  (3) History");
		System.out.println("  (4) Media");
		System.out.println("  (5) Random" );
		}

	public String getCategory() 
		{
		return category;
		}
	public void setCategory(String category) 
		{
		this.category = category;
		}
	public String getQuestion() 
		{
		return question;
		}
	public void setQuestion(String question) 
		{
		this.question = question;
		}
}
