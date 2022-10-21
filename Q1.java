public class Q1 extends  BankAccount{
    public Q1(double initialbalance) {
        super(initialbalance);
    }

    public Q1() {
    }
   public  void  withdraw(double amount)
   {
       if (amount>0&& this.balance-amount>=0) {
        //  balance= super.getbalance();
          balance-=amount;

       } else  if(amount<0){
           System.out.println("error:aounmt entered negative");

       }
       else System.out.println("Erorr: Withdraw amount exceeds available unds.");
   }

}
