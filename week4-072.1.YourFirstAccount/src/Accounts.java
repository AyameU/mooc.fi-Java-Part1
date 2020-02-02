
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account ayaAccount = new Account("Aya's Account", 100.00);

        System.out.println("Initial State");
        System.out.println(ayaAccount);

        ayaAccount.deposit(20);
        System.out.println("Aya's account balance is now: " + ayaAccount);

        System.out.println("Final State");
        System.out.println(ayaAccount);
    }

}
