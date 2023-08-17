package Factory;

public abstract class BankAccount {

    double balance;
    double interestRate;
    public BankAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public abstract double intCalc();

    public double getBalance(){
        return balance;
    }

}
