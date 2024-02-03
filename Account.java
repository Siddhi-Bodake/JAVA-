import java.util.Arrays;

class Account {
    private int accno;
    private String accname;
    private double balance;

    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public String getAccname() {
        return accname;
    }

    public double getBalance() {
        return balance;
    }

    public static void sortAccount(Account[] accounts) {
        Arrays.sort(accounts, (acc1, acc2) -> Double.compare(acc1.getBalance(), acc2.getBalance()));
    }

    public String toString() {
        return "Account No: " + accno + ", Account Name: " + accname + ", Balance: " + balance;
    }
}

public class AccountSorting {
    public static void main(String[] args) {
        // Creating an array of 'n' Account objects
        Account[] accountArray = {
                new Account(101, "John", 1500.50),
                new Account(102, "Alice", 2500.25),
                new Account(103, "Bob", 1000.75),
                new Account(104, "Emily", 3500.00)
        };

        // Sorting the array of Account objects based on balance
        Account.sortAccount(accountArray);

        // Displaying account details in sorted order
        System.out.println("Account details sorted by balance:");
        for (Account acc : accountArray) {
            System.out.println(acc);
        }
    }
}
