package concepts.polymorphism;

abstract class Type{

    abstract void evaluateAnswer(String answer);
}
class MCQ extends Type{

    private String answer;

    @Override
    void evaluateAnswer(String answer) {
        this.answer = answer;
        System.out.println("Answer evaluated using MCQ " + answer);
    }
}
class Coding extends Type{
    private String answer;

    @Override
    void evaluateAnswer(String answer) {
        this.answer = answer;
        System.out.println("Answer evaluated using Coding " + answer);
    }
}
class Essay extends Type{
    private String answer;
    @Override
    void evaluateAnswer(String answer) {
        this.answer = answer;
        System.out.println("Answer evaluated using Essay " + answer);
    }
}
public class OnineExamGrader {
    static void evaluation(Type type, String answer){
        type.evaluateAnswer(answer);
    }

    public static void main(String[] args) {
        MCQ mcq = new MCQ();
        Coding coding = new Coding();
        Essay essay = new Essay();
        evaluation(mcq, "answer1");
        evaluation(coding, "answer2");
        evaluation(essay, "answer3");
    }
}
