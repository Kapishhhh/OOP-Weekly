package quizMain;


public class Quiz {

	private Question[] questions;
    private int count;

    public Quiz() {
        questions = new Question[25];
        count = 0;
    }

    // Add question 
    public void add(Question q) {
        if (count < 25) {
            questions[count++] = q;
        }
    }

    // Ask questions and counts marks
    public void giveQuiz() {
        int correct = 0;
        for (int i = 0; i < count; i++) {
            if (questions[i].ask()) correct++;
        }
        
        System.out.println("");
        System.out.println(" Congrats!, you got " + correct + " out of " + count + " correct answers.");
    }

}


