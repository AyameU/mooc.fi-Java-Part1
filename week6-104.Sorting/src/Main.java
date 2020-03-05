import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
                      // 0  1  2  3   4   5   6  7  8   9  10  11 12
        int[] values7 = {3, -3, 15, 6, 11, -1, 4, 16, 1, 12, 19, 19, 6, 5, 3, 14, 20, 10, 20, 16, -2, -6, 20, 17, -4, 12};
        System.out.println(smallest(values7));
        sort(values7);
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