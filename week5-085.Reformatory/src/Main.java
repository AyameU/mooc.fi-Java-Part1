
public class Main {

    public static void main(String[] args) {
        Reformatory winnipegReformatory = new Reformatory();

        Person bob = new Person("Bob", 25, 160, 85);
        Person meg = new Person("Meg", 30, 120, 47);

        System.out.println("total weights measured " + winnipegReformatory.totalWeightsMeasured());

        winnipegReformatory.weight(bob);
        winnipegReformatory.weight(meg);

        System.out.println("total weights measured " + winnipegReformatory.totalWeightsMeasured());

        winnipegReformatory.weight(bob);
        winnipegReformatory.weight(bob);
        winnipegReformatory.weight(bob);
        winnipegReformatory.weight(bob);

        System.out.println("total weights measured " + winnipegReformatory.totalWeightsMeasured());
    }
}
