
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {

        System.out.println("Type the radius: ");
        Scanner reader = new Scanner(System.in);
        int radius = reader.nextInt();

        float circumference = (float) (2.0 * Math.PI * radius);

        System.out.println("Circumference of the circle: " + circumference);
    }
}
