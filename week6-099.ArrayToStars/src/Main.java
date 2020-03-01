
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // loops through the length of the array
        for(int i = 0; i < array.length; i++) {
            // prints stars based on each number in array
            for(int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            // after the stars, prints a line break
            System.out.println();
        }
    }
}
