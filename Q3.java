public class Q3 extends Question {

    private  double answer;
    public  void setAnswer (double correctAesponse)
    {answer=correctAesponse;}
    public boolean ceckAnswer(String  response){
        double responseDouble=Double.parseDouble(response);
        return Math.abs(responseDouble-answer)<=0.01;
    }

}
