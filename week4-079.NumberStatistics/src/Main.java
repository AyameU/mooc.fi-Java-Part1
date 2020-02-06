import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics sumNums = new NumberStatistics();
        NumberStatistics evenNums = new NumberStatistics();
        NumberStatistics oddNums = new NumberStatistics();

        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        while (true) {
            int num = reader.nextInt();
            if(num == -1) {
                System.out.println("sum: " + sumNums.sum());
                System.out.println("sum of even: " + evenNums.sum());
                System.out.println("sum of odd: " + oddNums.sum());
                break;
            }
            else {
                sumNums.addNumber(num);
                if(num % 2 == 0) {
                    evenNums.addNumber(num);
                }
                else {
                    oddNums.addNumber(num);
                }

            }
        }
    }
}