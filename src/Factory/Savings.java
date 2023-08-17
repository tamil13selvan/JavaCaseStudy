package Factory;

public class Savings extends BankAccount{
    public Savings(double balance){
        super(balance,0.06);
    }

    @Override
    public double intCalc(){
        return balance * interestRate;
    }
}
