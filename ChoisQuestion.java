import java.util.ArrayList;

public class ChoisQuestion extends  Question{
    private ArrayList<String>choices;
    public ChoisQuestion() {
       choices=new ArrayList<>();

    }
public void addChoisce(String ch,boolean correct){
        choices.add(ch);
        if (correct==true)
            setAnswer(choices.size()+"");


}


    public void display() {
        super.display();
     for (int n=0;n<choices.size();n++)  {
         System.out.println(n+1+" -"+choices.get(n));

     }
    }
}
