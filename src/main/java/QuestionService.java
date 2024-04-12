import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] userAnswers = new String[5];

    public QuestionService() {
        questions[0] = new Question(1,"question1","1","2","3","4","2");
        questions[1] = new Question(2,"question2","1","2","3","4","3");
        questions[2] = new Question(3,"question3","1","2","3","4","1");
        questions[3] = new Question(4,"question4","1","2","3","4","4");
        questions[4] = new Question(5,"question5","1","2","3","4","4");
    }

    public void displayQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getQuestion());
            System.out.println("Options : "+ questions[i].getOpt1()+","+questions[i].getOpt2()+","+questions[i].getOpt3()+","+questions[i].getOpt4());
            System.out.println("Enter answer for this question");
            Scanner scanner = new Scanner(System.in);
            userAnswers[i] = scanner.nextLine();
            System.out.println("Question " + (i+1) + " answered");
        }
    }
    public int printScore(){
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if(questions[i].getAnswer().equals(userAnswers[i]))
                score++;
        }
        return score;
    }
}
