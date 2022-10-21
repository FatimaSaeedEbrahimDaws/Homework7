import java.util.Scanner;

public class Q4  extends Question {
    public Q4() {
    }

    @Override
    public void setText(String questionText) {
        Scanner parser=new Scanner(questionText);
        parser.useDelimiter("_");
        String question=parser.next();
        String answer=parser.next();
        question+="_____"+parser.next();
        parser.close();
        super.setText(questionText);
        super.setAnswer(answer);
    }
}
