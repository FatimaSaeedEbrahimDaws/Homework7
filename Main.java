public class Main {
    public static void main(String[] args) {
        BankAccount ac=new Q1(4000);
                double balance=ac.getbalance();
        ac.withdraw(3000);
        balance=ac.getbalance();
        ac.withdraw(2000);
        balance=ac.getbalance();
      //  System.out.println(balance);
    }
}
