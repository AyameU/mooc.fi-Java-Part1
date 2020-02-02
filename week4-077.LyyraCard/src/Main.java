
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20.00);
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50.00);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}