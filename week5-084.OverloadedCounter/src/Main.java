public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(2, true);

        counter.decrease(4);
        System.out.println(counter.value());

    }
}
