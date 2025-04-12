package quizMain;
import java.util.Scanner;

	public class Question {
	    private String text;
	    private String answer;

	    public Question(String text, String answer) {
	        this.text = text;
	        this.answer = answer;
	    }

	    // Ask and return true if correct
	    
	    public boolean ask()
	    
	    {
	    	
	    	//read input
	        Scanner scanner = new Scanner(System.in);
	        System.out.println(text);
	        String response = scanner.nextLine();
	        return response.equalsIgnoreCase(answer);
	    }
	}

