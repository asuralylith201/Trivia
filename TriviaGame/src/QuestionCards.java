import java.util.ArrayList;
import java.util.Scanner;
public class QuestionCards
	{
	String category;
	String question;  
	int answer;
	String choices;
	static ArrayList<QuestionCards> choice = new ArrayList<QuestionCards>();
	public QuestionCards (String ct, String qu, String ch, int a)
		{
		category = ct;
		question = qu;
		choices = ch;
		answer = a;
		}
	public static void main(String[] args) 
		{
		instantiateArray();
		displayCategoriesAndChoice();
		}
	public static void instantiateArray()
		{
		choice.add(new QuestionCards("Science", "What inventor created the lightbulb?", "(1) Edison (2) Tesla (3) Newton", 1));	
		choice.add(new QuestionCards("Science", "What charge does the nucleus of an atom have?", "(1) Negative (2) Positive (3) Neutral", 2));
		choice.add(new QuestionCards("Science", "The first vaccine created by Edward Jenner in 1796 protected people against what disease?", "(1) Measles (2) Influenza (3) Smallpox", 3));
		choice.add(new QuestionCards("General", "What is known as the 'Eternal City'?", "(1) Barcelona, Spain (2) Santonori, Greece (3) Rome, Italy", 3));
		choice.add(new QuestionCards("General", "Where can you find the Sea of Tranquillity?", "(1) The Moon (2) Pluto (3) Neptune", 1));
		choice.add(new QuestionCards("General", "What color would Coca Cola be if you removed the food coloring?", "(1) Blue (2) Green (3) Clear", 2));
		choice.add(new QuestionCards("History", "How long did World War II last?", "(1) 1939-1945 (2) 1941-1945 (3) 1940-1945", 1));
		choice.add(new QuestionCards("History", "What right is not stated in the first amendment of the Constitution?", "(1) Right to bear arms (2) Freedom of religion (3) To peacefully assemble", 1));
		choice.add(new QuestionCards("History", "What president was not shot or died in office?", "(1) Lincoln (2) Fillmore (3) McKinley", 2));
		choice.add(new QuestionCards("Media", "In Cinderella, what was turned into the horses?", "(1) The pumpkin (2) The dog (3) The mice", 3));
		choice.add(new QuestionCards("Media", "Who is the main character in the video game God of War?", "(1) Dante (2) Kratos (3) Ares", 2));
		choice.add(new QuestionCards("Media", "What was Disney's first sci-fi film?", "(1) Treasure Planet (2) Wall-E (3) Atlantis", 3));
		choice.add(new QuestionCards("Culture", "Before entering a home in Jpana, you must", "(1) Bow (2) Remove your shoes (3) Shake hands", 2));
		choice.add(new QuestionCards("Culture", "Among Arabs, the common headdress is called what?", "(1) Fez (2) Kaffiyeh (3) Hijab", 2)); 
		choice.add(new QuestionCards("Culture", "It is a tradition to put an artificial spider and web on your Christmas tree in which country?", "(1) Bulgaria (2) Russia (3) Ukraine",3));
		}				
	public static void displayCategoriesAndChoice()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which category do you want?");
		System.out.println("  (1) Science");
		System.out.println("  (2) General");
		System.out.println("  (3) History");
		System.out.println("  (4) Media");
		System.out.println("  (5) Culture");
		
		int selection = userInput.nextInt();
		if (selection == 1)
			{
			System.out.println("You have chosen the science cateogry!");
			for (QuestionCards s : choice)
				{
				System.out.println("Question: " +s.getQuestion());
				System.out.println(s.getChoices());
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
	public int getAnswer() 
		{
		return answer;
		}
	public void setAnswer(int answer) 
		{
		this.answer = answer;
		}
	public String getChoices() 
		{
		return choices;
		}
	public void setChoices(String choices) 
		{
		this.choices = choices;
		}
	public static ArrayList<QuestionCards> getChoice() 
		{
		return choice;
		}
	public static void setChoice(ArrayList<QuestionCards> choice) 
		{
		QuestionCards.choice = choice;
		}
}
