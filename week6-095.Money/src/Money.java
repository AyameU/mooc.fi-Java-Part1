
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money plus = new Money(euros() + added.euros(), cents() + added.cents());
        return plus;
    }

    public boolean less(Money compared) {

        // Wow talk about over thinking this one. We only need to start by comparing
        // the euros. Cents are literally change that doesn't equal one euro.
        // You know like our local currency. That is what was tripping me up.
        // You only need to check the cents() if euros() equals compared.euros().
        // If euros() is lesser or greater than compared, the cents don't matter.
        if(euros() < compared.euros()) {
            return true;
        }
        else if(euros() == compared.euros()) {
            if(cents() < compared.cents()) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decremented) {
        int newEuros;
        int newCents;
        Money minus;

        if((euros() - decremented.euros()) >= 0) {
            newEuros = euros() - decremented.euros();
            if(cents() - decremented.cents() >= 0) {
                newCents = cents() - decremented.cents();
                return minus = new Money(newEuros, newCents);
            }
            if(cents() - decremented.cents() < 0) {
                // here we are are figuring out the cents if it goes below zero
                newCents = (100 + cents()) - decremented.cents();
                // it also affects the euro amount
                newEuros--;
                return minus = new Money(newEuros, newCents);
            }
        }
        else if((euros() - decremented.euros()) < 0) {
            return minus = new Money(0, 0);
        }
        return null;
    }
}
