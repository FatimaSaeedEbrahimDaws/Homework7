public class BankAccount {

protected double balance;

    /***
     * default constructor.
     */

        /***

         * @param initialBalance the initial balance
         */
         public BankAccount(double initialbalance){
        balance=initialbalance;}
    public BankAccount(){
     this(0);}
    public void mystery(BankAccount that,double amount)
    {this.balance=this.balance-amount;
    that.balance=that.balance+amount;
    }
    /***
     * depsite a spesific amountof mony to the current acount
     * @param amount the amoumt of deposit
     */

    public void  deposit(double balance){
   this. balance=this.balance+balance;

    }

    /**
     *
     * @param amount;
     */
    public void  withdraw(double amount){

balance=balance-amount;
    }

    /**
     * withdraw specific  amount of mony from the current account
     * @param amount
     * @return
     */


    public double  getbalance(){
return balance;
    }
    public  void addInsert(double rate)
    {
        balance=balance+balance*(rate/100);
    }
public  void deduct(int n)
{   if (n>5)
    balance=balance-n+5;}
}
