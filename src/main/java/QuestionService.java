public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1,"question1","1","2","3","4","2");
        questions[1] = new Question(2,"question2","1","2","3","4","3");
        questions[2] = new Question(3,"question3","1","2","3","4","1");
        questions[3] = new Question(4,"question4","1","2","3","4","4");
    }

    public void displayQuestions() {
        for(Question question: questions){
            System.out.println(question);
        }
    }
}
