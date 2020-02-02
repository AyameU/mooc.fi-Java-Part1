
public class Accounts {

    public static void main(String[] args) {
        Account aAccount = new Account("A", 100.00);
        Account bAccount = new Account("B", 0.0);
        Account cAccount = new Account("C", 0.0);

        transfer(aAccount, bAccount, 50.00 );
        transfer(bAccount, cAccount, 25.0);

        System.out.println("A's account balance is now: " + aAccount);
        System.out.println("B's account balance is now: " + bAccount);
        System.out.println("C's account balance is now: " + cAccount);

    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }


}
