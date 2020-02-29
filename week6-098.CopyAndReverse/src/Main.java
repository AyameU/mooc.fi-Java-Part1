import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] arrayCopy = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] arrayCopy = new int[array.length];

        // int i=3, j=0; 0<4; decrement i by 1, increment j by 1
        for(int i = array.length - 1, j = 0; j < array.length; i--, j++) {
            arrayCopy[i] = array[j];
        }
        return arrayCopy;
    }
}
