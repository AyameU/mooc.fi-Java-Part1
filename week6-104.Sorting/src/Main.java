import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // indexes:     0  1  2  3  4  5  6   7  8
        int[] values = {3, 5, 6, 2, 7, 1, -1, 8, 5};
        System.out.println("smallest: " + smallest(values));

        // indexes:       0    1  2  3  4  5  6  7  8
        int[] values2 = {-17, -5, 6, 1, 7, 1, 3, 7, 5};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values2) + ",  smallest: " + smallest(values2));

        // indexes:       0  1  2  3   4
        int[] values3 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values3, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values3, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values3, 4));

        // indexes:       0  1  2  3  4  5  6  7  8
        int[] values4 = {-1, 3, 1, 7, 4, 5, 2, 4, 3};
        System.out.println("smallest: " + smallest(values4, 6) +  ", Index of the smallest Starting From: " + indexOfTheSmallestStartingFrom(values4, 6));

        int[] values5 = {3, 2, 5, 4, 8};
        System.out.println( Arrays.toString(values5) );
        swap(values5, 1, 0);
        System.out.println( Arrays.toString(values5) );
        swap(values5, 0, 3);
        System.out.println( Arrays.toString(values5) );
    }

    public static int smallest(int[] array) {

        // set smallest as the first index in the array right off the bat, saves a step
        // this works because the first index will always be the smallest until we start comparing
        int smallest = array[0];

        // this counter will be used to iterate through the indices being compared against
        int j = 1;

        // okiedokie, loop through each array index
        for(int i = 0; i < array.length; i++) {

            // if on the array index, compare smallest to the last index
            // if smallest is smallest, break out of the loop
            // else the last index is now smallest, and break the loop
            if(i == array.length - 1) {
                if(smallest < array[array.length - 1]) {
                    break;
                }
                else {
                    smallest = array[array.length - 1];
                    break;
                }
            }

            // check if smallest is less than the index next to it
            // if it is lesser, iterate j by 1 to check the next array
            if(smallest < array[j]) {
                j++;
            }

            // else check if smallest is greater than the index next to it
            // if it is, iterate j by 1 to check the next array
            else if(smallest > array[j]) {
                smallest = array[j];
                j++;
            }
            // loop starts again, until all indices are checked
        }
        return smallest;
    }

    // overloaded smallest method, takes int as a starting index parameter
    public static int smallest(int[] array, int index) {

        // set smallest as index parameter
        int smallest = array[index];

        // use "array.length - index" to get length of the range
        int length = array.length - index;

        // if parameter is last index in array, last index is smallest
        if(index == array.length - 1) {
            smallest = array[index];
        }
        else {
            // set j to "index + 1", the number next to the starting parameter
            int j = index + 1;

            for(int i = 0; i < length; i++) {

                // compare smallest to the last index
                // if smallest is smallest, break out of the loop
                // else the last index is now smallest, and break the loop
                if(i == length - 1) {
                    if(smallest < array[array.length - 1]) {
                        break;
                    }
                    else {
                        smallest = array[array.length - 1];
                        break;
                    }
                }
                if(smallest < array[j]) {
                    j++;
                }
                else if(smallest > array[j]) {
                    smallest = array[j];
                    j++;
                }
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
        int smallest = smallest(array, index);

        int indexOfTheSmallest = 0;
        for(int i = index; i <array.length; i++) {
            if(array[i] == smallest) {
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
}