import java.util.Scanner;

public class TestAccounts1 {

    public static void main(String[] args) {

        Account acc1, acc2, acc3;

        Scanner scan = new Scanner(System.in);

        // Create 3 accounts, print them

        System.out.print("Enter name: ");

        String name = scan.nextLine();

        acc1 = new Account(100, name);

        System.out.println("\nCreated Account " + acc1);

        System.out.print("\nEnter name: ");

        name = scan.nextLine();

        acc2 = new Account(100, name);

        System.out.println("\nCreated Account " + acc2);

        System.out.print("\nEnter name: ");

        name = scan.nextLine();

        acc3 = new Account(100, name);

        System.out.println("\nCreated Account " + acc3);

        // Print number of accounts

        System.out.println("\nNow there are " + Account.getNumAccounts() + " accounts");

        // Close first account

        // Print it

        // Display number of accounts

        acc1.close();

        System.out.println("\nAccount Closed : " + acc1);

        System.out.println("\nNow there are " + Account.getNumAccounts() + " accounts");

        // Consolidates second and third account

        // If successful, print account

        Account acct4 = Account.consolidate(acc2, acc3);

        if (acct4 != null) {

            System.out.println("\nCreated Account " + acct4);

        }

        // Display number of accounts after consolidation

        System.out.println("\nNow there are " + Account.getNumAccounts() + " accounts");

    }

}
