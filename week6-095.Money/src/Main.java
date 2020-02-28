
public class Main {

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(3,0);
        Money c = new Money(5,0);

        System.out.println(a.less(b));  // false
        System.out.println(b.less(c));  // true

        Money r1 = new Money(1, 0);
        Money r2 = new Money(1, 5);
        Money r3 = new Money(-3, 5);
        Money r4 = new Money(2, 0);
        System.out.println(r2.less(r3));  // false
        System.out.println(r3.less(r1));  // true
        System.out.println(r1.less(r2));  // true
        System.out.println(r1.less(r4));  // true
    }
}
