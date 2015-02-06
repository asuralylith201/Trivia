import java.util.ArrayList;
import java.util.Scanner;
public class QuestionCards
	{
	String category;
	String question;  
	String answer;
	static ArrayList<QuestionCards> choice = new ArrayList<QuestionCards>();
	public QuestionCards (String ct, String qu, String an)
		{
		category = ct;
		question = qu;
		answer = an;
		}
	public static void main(String[] args) 
		{
		instantiateArray();
		displayCategoriesAndChoice();
		}
	public static void instantiateArray()
		{
		choice.add(new QuestionCards("(1) Science", "What inventor created the lightbulb?", "(1) Edison (2) Tesla (3) Newton"));		
		}				
	public static void displayCategoriesAndChoice()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which category do you want?");
		System.out.println("  (1) Science");
		System.out.println("  (2) General");
		System.out.println("  (3) History");
		System.out.println("  (4) Media");
		System.out.println("  (5) Random" );
		
		int selection = userInput.nextInt();
		if (selection == 1)
			{
			System.out.println("You have chosen the science cateogry!");
			for (QuestionCards s : choice)
				{
				System.out.println("Question: " +s.getQuestion());
				System.out.println(s.getAnswer());
				int qAnswer = userInput.nextInt();
				}
			int qAnswer = 0;
			if (qAnswer == 1)
				{
				System.out.println("Very good, you have gotten a point!");
				}
			else
				{
				System.out.println("Wrong! End Game.");
				}
			}
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
	public String getAnswer() 
		{
		return answer;
		}
	public void setAnswer(String answer) 
		{
		this.answer = answer;
		}

}
