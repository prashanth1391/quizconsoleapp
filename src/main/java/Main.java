public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.displayQuestions();
        System.out.println("Score is : "+ service.printScore());
    }
}
