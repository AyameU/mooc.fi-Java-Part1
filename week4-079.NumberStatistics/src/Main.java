import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        while (true) {
            int num = reader.nextInt();
            if(num == -1) {
                System.out.println("sum: " + stats.sum());
                break;
            }
            else {
                stats.addNumber(num);
            }
        }
    }
}