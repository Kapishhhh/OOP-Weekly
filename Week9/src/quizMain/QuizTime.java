package quizMain;

public class QuizTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quiz quiz = new Quiz(); // create a new Quiz

		quiz.add(new Question("How many sides does a square have?", "4"));
        quiz.add(new Question("How many days are in a week??", "7"));
        quiz.add(new Question("How many letters are there in oop??", "3"));
        quiz.add(new Question("Is java is a progarmming language? ", "Yes"));
        quiz.add(new Question("Is Java case-sensitive?", "Yes"));
        
        // Run 
        quiz.giveQuiz();
	}

}
