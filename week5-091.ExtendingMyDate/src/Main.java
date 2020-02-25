
public class Main {

    public static void main(String[] args) {
        // test your code here
        MyDate myDate = new MyDate(29,12,1980);

        myDate.advance();
        System.out.println(myDate);

        myDate.advance();
        System.out.println(myDate);

        myDate.advance(3);
        System.out.println(myDate);
    }
}
