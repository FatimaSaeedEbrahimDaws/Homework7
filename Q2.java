public class Q2 extends  BankAccount{
    public Q2(double initialbalance) {
        super(initialbalance);
    }

    public Q2() {
    }
    public  void  withdraw(double amount) {
        if (amount > 0 && this.balance - amount >= 0) {
            //  balance= super.getbalance();
            balance -= amount;

        } else if (amount < 0) {
            System.out.println("error:aounmt entered negative");

        } else {
            System.out.println("Erorr: Withdraw amount exceeds available unds.");
            System.out.println("your hane been pulled 30$ out of your account to be overcome");
            balance-=30;
        }
    }
}

