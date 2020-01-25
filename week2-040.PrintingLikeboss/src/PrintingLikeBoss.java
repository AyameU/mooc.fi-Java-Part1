public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0; //counter
        while(i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        int i = 0; // counter
        while(i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1; //counter
        int num = 1;
        while(i <= size) {
            num = size - i;
            printWhitespaces(num);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1; // star counter
        int j = 1; // whitespace counter
        int num = 1;
        while(j <= height) {
            num = height - j;
            printWhitespaces(num);
            printStars(i);
            i = i + 1;
            i++;
            j++;
        }
        // Printing tree stand
        printWhitespaces(j - 3); // width of last row minus width of stand
        printStars(3);
        printWhitespaces(j - 3);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(11);
        System.out.println("---");
        xmasTree(23);
    }
}
