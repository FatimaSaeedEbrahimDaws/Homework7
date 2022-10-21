import java.util.ArrayList;

public class Q8_b {
    public class ChoisQuestions extends  Question{
        private ArrayList<String> choices;
        public ChoisQuestions() {
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

        @Override
        public String toString() {
            return "ChoisQuestions{" +
                    "choices=" + choices +
                    ", text='" + text + '\'' +
                    ", answer='" + answer + '\'' +
                    '}';
        }
    }


}
