public class Question {

    protected String text ,answer;

    public Question() {
        text = "";
        answer = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public  void display(){
        System.out.println(text);
    }
    public boolean chekAnswer(String studetAnswer){
   return answer.equals(studetAnswer);
    }
}
