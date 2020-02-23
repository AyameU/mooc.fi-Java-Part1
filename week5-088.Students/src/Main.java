
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        String name;
        String studentNumber;

        // User Input
        System.out.println("Enter a name");
        name = scanner.nextLine();

        if(!name.isEmpty()) {
            System.out.println("Enter a Student Number");
            studentNumber = scanner.nextLine();

            if(!name.isEmpty() && !studentNumber.isEmpty()) {
                list.add(new Student(name, studentNumber));
            }
        }
        else {
            System.out.println(list);
        }

        // loop until user doesn't enter a name
        while(!name.isEmpty()) {
            System.out.println("Enter a name");
            name = scanner.nextLine();

            if(!name.isEmpty()) {
                System.out.println("Enter a Student Number");
                studentNumber = scanner.nextLine();

                if(!studentNumber.isEmpty()) {
                    list.add(new Student(name, studentNumber));
                }
            }
            else {
                break;
            }
        }
        System.out.println(list);

        // Search through Array
        System.out.println("Give search term: ");
        String searchTerm = scanner.nextLine();

        System.out.println("Result: ");
        for(int i = 0; i < list.size(); i++) {
            // get the name of the object in the list, see if it contains the search term
            if(list.get(i).getName().contains(searchTerm)) {
                System.out.println(list.get(i));
            }
        }
    }
}
