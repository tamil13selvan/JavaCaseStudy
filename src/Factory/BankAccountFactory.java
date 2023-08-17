package Factory;

    public class BankAccountFactory{
          public static  BankAccount createAccount(String type, double balance){

             if("current".equalsIgnoreCase(type)){
                 return new Current(balance);
          }else if ("saving".equalsIgnoreCase(type)) {
                 return new Savings(balance);
             }else if("loan".equalsIgnoreCase(type)){
                 return new Loan(balance);
             }else {
                 throw new IllegalArgumentException("Invalid account type "+type);
             }
    }
}
