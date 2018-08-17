package exc05;

public class AskMe {
    static void answer(Answers result){
        switch(result){
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }
}
