
public class LyyraCard {

    private double balance;

    // constructor, don't forget to add this, if there are variables in the class
    public LyyraCard(double balance) {
        this.balance = balance;
    }

    // what is this called? Is it another constructor?

    public double balance() {
        return this.balance;
    }

    // methods

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount) {
       // method checks if the balance of the card is at least amount given as parameter
       // if not, methods returns false meaning that the card could not be used for the payment
       // if the balance is enough, the given amount is taken from the balance and true is returned
        boolean canPay;

        if(balance() >= amount) {
            this.balance = balance - amount;
            canPay = true;
        }
        else {
            canPay = false;
        }

        return canPay;
    }
}
