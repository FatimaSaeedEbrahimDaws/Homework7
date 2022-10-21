public class Q6 extends  ChoisQuestion{
    private  String allAnswer;

    public Q6() {
super();
    }

    @Override
    public void setAnswer(String correctResponse) {
        allAnswer=correctResponse+" "+allAnswer;
    }
    public boolean ceckAnswer(String reponse){
        return  allAnswer.contains(reponse);
    }

    @Override
    public void display() {
        super.display();
    }
}
