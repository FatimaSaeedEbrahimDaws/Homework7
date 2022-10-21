public class MultiChoiceQuestionEx7 extends ChoisQuestion{
    public MultiChoiceQuestionEx7()
    {
        super();
    }
    public void setAnswer(String answer)
    {
        String newAnswer=getAnswer();
        newAnswer+=answer+" ";
        super.setAnswer(newAnswer);
    }public void addChoisce(String choice,boolean correct)
    {
        super.addChoisce(choice,correct);
        if (correct)
            setAnswer(choice);

    }
    private  String allAnswer;

    @Override
    public void setAnswer(String correctResponse) {
        allAnswer=correctResponse+" "+allAnswer;
    }
    public boolean ceckAnswer(String reponse){
        return  allAnswer.contains(reponse);

        public void display()
    {
        super.display();
        System.out.println("provid all correct answer \n if threr are more then ome ,provide them each separated by spaces");
    }
}}
