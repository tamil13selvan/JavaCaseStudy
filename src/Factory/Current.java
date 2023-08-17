package Factory;

class Current extends BankAccount{
    public Current (double balance){
        super(balance,0.07);
    }
    @Override
    public double intCalc(){
        return balance * interestRate;
    }

}
