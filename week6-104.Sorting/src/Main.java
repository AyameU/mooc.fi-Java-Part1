import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] values7 = {3, -3, 15, 6, 11, -1, 4, 16, 1, 12, 19, 19, 6, 5, 3, 14, 20, 10, 20, 16, -2, -6, 20, 17, -4, 12};
        System.out.println(smallest(values7));
        sort(values7);
    }

    public static int smallest(int[] array) {

        // set smallest as the first index in the array right off the bat, saves a step
        // this works because the first index will always be the smallest until we start comparing
        int smallest = array[0];

        // trying a for-each loop
        for(int num : array) {
            // if the index is smaller than what its being compared against
            // that number becomes
            if(num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexOfTheSmallest = 0;
        for(int i = 0; i <array.length; i++) {
            if(array[i] == smallest(array)) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    // overloaded method for indexOfTheSmallestStartingFrom
    public static int indexOfTheSmallest(int[] array, int index) {

        int indexOfTheSmallest = index;

        // loop through the array starting at the index parameter given
        for(int i = indexOfTheSmallest + 1; i <array.length; i++) {

            // checking the number next to the parameter index
            // if i is less than the parameter, i becomes the smallest index
            if(array[i] < array[indexOfTheSmallest]) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        return indexOfTheSmallest(array, index);
    }

    public static void swap(int[] array, int index1, int index2) {

        int swapNum1 = array[index1];
        int swapNum2 = array[index2];

        array[index1] = swapNum2;
        array[index2] = swapNum1;
    }

    // method to implement selection sorting
    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            if(i < array.length - 1) {
                swap(array,i,indexOfTheSmallestStartingFrom(array, i));
                System.out.println(Arrays.toString(array));
            }
        }
    }
}