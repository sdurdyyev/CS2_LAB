public class Account {

    private String name; // Name of account holder

    private int accountNumber; // Account number of user

    private double balance; // Total balance in account

    private static int numAccounts =0;

    // Constructor to initialize data members

    public Account(double balance, String name) {

        this.name = name;

        // Creates a 5 digit random account number

        this.accountNumber =(int)(Math.random()*((99999-10000)+1))+10000;

        this.balance = balance;

        // Increment numAccounts by 1

        numAccounts+=1;

    }

    // Withdraw method

    public void withdraw(double amount) {

        if(amount<=balance) {

            balance-=amount;

        }

    }

    // Deposit method

    public void deposit(double amount) {

        balance+=amount;

    }

    // Getter methods for data members

    public String getName() {

        return name;

    }

    public int getAccountNumber() {

        return accountNumber;

    }

    public double getBalance() {

        return balance;

    }

    public static int getNumAccounts() {

        return numAccounts;

    }

    // Close account, set balance to 0

    // Append close to name

    // Decrement numAccounts by 1

    public void close() {

        this.name+=" CLOSED";

        this.balance =0;

        numAccounts-=1;

    }

    public static Account consolidate(Account acct1, Account acct2) {

        // If name is same and account number is different

        // Add balance and create a 3rd account with name and newBalance as parameter

        // return new account

        // Else, print error message and return null

        if(acct1.name.equals(acct2.name) &&

                acct1.accountNumber != acct2.accountNumber) {

            double newBalance = acct1.balance + acct2.balance;

            Account acct3 = new Account(newBalance,acct1.name);

            // Close both accounts

            acct1.close();

            acct2.close();

            return acct3;

        }

        else {

            System.out.println("\nAccounts cannot be consolidated");

            return null;

        }

    }

    // Returns account details

    public String toString() {

        return name+", "+accountNumber+", "+balance;

    }

}