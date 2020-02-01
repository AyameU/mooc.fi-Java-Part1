import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        int counter = 0;

        // loops through all [i] of list2
        while(counter < list2.size()) {
            // if list1 does not contain list2 ith
            if(!list1.contains(list2.get(counter))) {
                // add list2 ith to list1
                list1.add(list2.get(counter));
            }
            counter++;
        }
    }
}
