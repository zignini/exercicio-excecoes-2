package program;

import model.entities.Account;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            sc.nextLine();

            Account account = new Account(number,
                    holder, balance, withdrawLimit);

            System.out.print("Enter amount for " +
                    "withdrawal: ");
            double withdrawal = sc.nextDouble();

            account.withdraw(withdrawal);

        } catch (InputMismatchException e) {
            System.out.println("Invalid data!");
        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " +
                    e.getMessage());
        } finally {
        sc.close();

        }


    }
}
