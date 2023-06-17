import java.util.Scanner;

public class Bank {

    private String acc_no;
    private String acc_name;
    private String acc_type;
    private long balance;

    // constructor?=
    public Bank() {

    };

    Scanner sc = new Scanner(System.in);

    public void openAccount() {
        System.out.println("Enter Account No:");
        acc_no = sc.next();
        System.out.println("Enter Account type:");
        acc_type = sc.next();
        System.out.println("Enter Name:");
        acc_name = sc.next();
        System.out.println("Enter Balance:");
        balance = sc.nextLong();

    }

    public void showAccount() {
        System.out.println("Name of account holder:" + acc_name);
        System.out.println("Account No:" + acc_no);
        System.out.println("Account Type:" + acc_type);
        System.out.println("Account balance:" + balance);

    }

    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit");
        amt = sc.nextLong();
        balance = balance + amt;

    }

    public void widthdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal :" + balance);

        } else {
            System.out.println("You balance is less than " + amt + "\tTransaction failed!!");

        }

    }

    public boolean search(String acc) {
        if (acc_no.equals(acc)) {
            showAccount();
            return (true);
        }
        return (false);

    }
}
