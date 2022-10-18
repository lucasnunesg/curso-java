package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char initial_deposit = sc.next().charAt(0);

        if (initial_deposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initial_value = sc.nextDouble();
            account = new BankAccount(number, name, initial_value);
        }
        else {
            account = new BankAccount(number, name);
        }
        System.out.println("Account data");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.makeDeposit(deposit);

        System.out.println("Updated account data");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.makeWithdraw(withdraw);

        System.out.println("Updated account data");
        System.out.println(account);

        sc.close();
    }
}
