// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Factory.BankAccount;
import Factory.BankAccountFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account type(current/saving/loan)");
        String accountType = sc.nextLine();

        System.out.println("Enter amount");
        double amount = sc.nextDouble();

        BankAccount account = BankAccountFactory.createAccount(accountType,amount);

        System.out.println("Interest for "+ accountType+" account "+account.intCalc());
        System.out.println("Available Balance: "+account.getBalance());


    }
}