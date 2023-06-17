import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of customer do you want to input?");
        int num = sc.nextInt();
        Bank newBank[] = new Bank[num];
        for (int i = 0; i < newBank.length; i++) {
            newBank[i] = new Bank();
            newBank[i].openAccount();
        }

        // Loop runs untill number 5 is not pressed to exit
        int ch;
        do {
            System.out.println("\n *** Banking System Application***");
            System.out.println(
                    " 1. Display all account detail \n 2. Search by Account number \n 3. Deposit the amount \n 4. Withdraw \n 5. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < newBank.length; i++) {
                        newBank[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.println("Enter account no.  you wnat to search 😀");
                    String acc_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < newBank.length; i++) {
                        newBank[i].search(acc_no);
                        if (found)
                            break;
                        else
                            System.out.println("Search failed, Acc doesnt exit");
                    }
                    break;

                case 3:
                    System.out.println("Enter account no");
                    acc_no = sc.next();
                    found = false;
                    for (int i = 0; i < newBank.length; i++) {
                        newBank[i].search(acc_no);
                        if (found) {
                            newBank[i].deposit();
                            break;
                        } else
                            System.out.println("Search failed, Acc doesnt exit");
                    }
                    break;

                case 4:
                    System.out.println("Enter account no");
                    acc_no = sc.next();
                    found = false;
                    for (int i = 0; i < newBank.length; i++) {
                        newBank[i].search(acc_no);
                        if (found) {
                            newBank[i].widthdrawal();
                            break;
                        } else
                            System.out.println("Search failed, Acc doesnt exit");
                    }
                    break;
                default:
                    System.out.println("See you soon!!!! ");

            }

        } while (ch != 5);

    }
}
