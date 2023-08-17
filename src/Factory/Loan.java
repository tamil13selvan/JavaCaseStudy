package Factory;

public class Loan extends BankAccount{
    public Loan(double balance){
        super(balance, 0.10);
    }
    @Override
    public double intCalc(){
        return balance* interestRate;
    }
}
